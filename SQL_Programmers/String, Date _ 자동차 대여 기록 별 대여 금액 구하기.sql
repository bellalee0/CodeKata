-- https://school.programmers.co.kr/learn/courses/30/lessons/151141
-- CAR_RENTAL_COMPANY_CAR 테이블과 CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블과 CAR_RENTAL_COMPANY_DISCOUNT_PLAN 테이블에서 자동차 종류가 '트럭'인 자동차의 대여 기록에 대해서 대여 기록 별로 대여 금액(컬럼명: FEE)을 구하여 대여 기록 ID와 대여 금액 리스트를 출력하는 SQL문을 작성해주세요.
-- 결과는 대여 금액을 기준으로 내림차순 정렬하고, 대여 금액이 같은 경우 대여 기록 ID를 기준으로 내림차순 정렬해주세요.

select history_id,
       floor(daily_fee * (datediff(end_date, start_date) + 1) * (1 - coalesce(d.discount_rate, 0)/100)) as fee
from car_rental_company_rental_history r left join car_rental_company_car c on r.car_id = c.car_id
                                         left join car_rental_company_discount_plan d on c.car_type = d.car_type
    and (case when datediff(end_date, start_date) + 1 between 7 and 29 then '7일 이상'
              when datediff(end_date, start_date) + 1 between 30 and 89 then '30일 이상'
              when datediff(end_date, start_date) + 1 >= 90 then '90일 이상'
              else null
        end) = d.duration_type
where c.car_type = '트럭'
order by 2 desc, 1 desc