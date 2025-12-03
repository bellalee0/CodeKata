-- https://school.programmers.co.kr/learn/courses/30/lessons/151138
-- CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블에서 대여 시작일이 2022년 9월에 속하는 대여 기록에 대해서 대여 기간이 30일 이상이면 '장기 대여' 그렇지 않으면 '단기 대여' 로 표시하는 컬럼(컬럼명: RENT_TYPE)을 추가하여 대여기록을 출력하는 SQL문을 작성해주세요.
-- 결과는 대여 기록 ID를 기준으로 내림차순 정렬해주세요.

select history_id, car_id, date_format(start_date, '%Y-%m-%d') start_date, date_format(end_date, '%Y-%m-%d') end_date,
       case when datediff(end_date, start_date) >= 29 then '장기 대여'
            else '단기 대여'
           end as rent_type
from car_rental_company_rental_history
where month(start_date) = '09'
order by 1 desc