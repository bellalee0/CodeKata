-- https://school.programmers.co.kr/learn/courses/30/lessons/131116
-- FOOD_PRODUCT 테이블에서 식품분류별로 가격이 제일 비싼 식품의 분류, 가격, 이름을 조회하는 SQL문을 작성해주세요. 이때 식품분류가 '과자', '국', '김치', '식용유'인 경우만 출력시켜 주시고 결과는 식품 가격을 기준으로 내림차순 정렬해주세요.

select category, price, product_name
from food_product p1
where category in ('과자', '국', '김치', '식용유')
  and price = (select max(price)
               from food_product p2
               where p1.category = p2.category)
order by price desc