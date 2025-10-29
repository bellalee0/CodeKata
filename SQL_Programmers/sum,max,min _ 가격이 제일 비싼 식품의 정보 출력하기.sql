-- https://school.programmers.co.kr/learn/courses/30/lessons/131115
-- FOOD_PRODUCT 테이블에서 가격이 제일 비싼 식품의 식품 ID, 식품 이름, 식품 코드, 식품분류, 식품 가격을 조회하는 SQL문을 작성해주세요.

select *
from food_product
where price = (select max(price) from food_product)