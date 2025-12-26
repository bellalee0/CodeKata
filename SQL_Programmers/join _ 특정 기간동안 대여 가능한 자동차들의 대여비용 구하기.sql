-- https://school.programmers.co.kr/learn/courses/30/lessons/157339
-- CAR_RENTAL_COMPANY_CAR 테이블과 CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블과 CAR_RENTAL_COMPANY_DISCOUNT_PLAN 테이블에서 자동차 종류가 '세단' 또는 'SUV' 인 자동차 중 2022년 11월 1일부터 2022년 11월 30일까지 대여 가능하고 30일간의 대여 금액이 50만원 이상 200만원 미만인 자동차에 대해서 자동차 ID, 자동차 종류, 대여 금액(컬럼명: FEE) 리스트를 출력하는 SQL문을 작성해주세요.
-- 결과는 대여 금액을 기준으로 내림차순 정렬하고, 대여 금액이 같은 경우 자동차 종류를 기준으로 오름차순 정렬, 자동차 종류까지 같은 경우 자동차 ID를 기준으로 내림차순 정렬해주세요.

select c.car_id, c.car_type, floor(c.daily_fee * 30 * (1 - d.discount_rate/100)) as fee
from car_rental_company_car c left join car_rental_company_discount_plan d on c.car_type = d.car_type
where c.car_type in ('세단', 'SUV') and d.duration_type = '30일 이상'
  and c.car_id not in (
    select car_id
    from car_rental_company_rental_history
    where start_date <= '2022-11-30' and end_date >= '2022-11-01'
)
  and floor(c.daily_fee * 30 * (1 - d.discount_rate/100)) >= 500000
  and floor(c.daily_fee * 30 * (1 - d.discount_rate/100)) < 2000000
order by 3 desc, 2, 1 desc;