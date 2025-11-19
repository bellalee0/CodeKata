-- https://school.programmers.co.kr/learn/courses/30/lessons/131117
-- FOOD_PRODUCT와 FOOD_ORDER 테이블에서 생산일자가 2022년 5월인 식품들의 식품 ID, 식품 이름, 총매출을 조회하는 SQL문을 작성해주세요. 이때 결과는 총매출을 기준으로 내림차순 정렬해주시고 총매출이 같다면 식품 ID를 기준으로 오름차순 정렬해주세요.

select o.product_id, product_name, sum(price * amount)
from food_order o join food_product p on o.product_id = p.product_id
where date_format(produce_date, '%Y-%m') = '2022-05'
group by 1
order by 3 desc, 1