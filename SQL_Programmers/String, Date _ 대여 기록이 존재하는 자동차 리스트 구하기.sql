-- https://school.programmers.co.kr/learn/courses/30/lessons/157341
-- CAR_RENTAL_COMPANY_CAR 테이블과 CAR_RENTAL_COMPANY_RENTAL_HISTORY 테이블에서 자동차 종류가 '세단'인 자동차들 중 10월에 대여를 시작한 기록이 있는 자동차 ID 리스트를 출력하는 SQL문을 작성해주세요.
-- 자동차 ID 리스트는 중복이 없어야 하며, 자동차 ID를 기준으로 내림차순 정렬해주세요.

select distinct h.car_id
from car_rental_company_rental_history h left join car_rental_company_car c on h.car_id = c.car_id
where month(start_date) = '10' and car_type = '세단'
order by 1 desc