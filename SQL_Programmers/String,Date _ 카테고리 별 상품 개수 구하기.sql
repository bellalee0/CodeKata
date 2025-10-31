-- https://school.programmers.co.kr/learn/courses/30/lessons/131529
-- PRODUCT 테이블에서 상품 카테고리 코드(PRODUCT_CODE 앞 2자리) 별 상품 개수를 출력하는 SQL문을 작성해주세요. 결과는 상품 카테고리 코드를 기준으로 오름차순 정렬해주세요.

select substr(product_code, 1, 2) category, count(1) products
from product
group by 1
order by 1