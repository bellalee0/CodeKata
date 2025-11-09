-- https://school.programmers.co.kr/learn/courses/30/lessons/131533
-- PRODUCT 테이블과 OFFLINE_SALE 테이블에서 상품코드 별 매출액(판매가 * 판매량) 합계를 출력하는 SQL문을 작성해주세요. 결과는 매출액을 기준으로 내림차순 정렬해주시고 매출액이 같다면 상품코드를 기준으로 오름차순 정렬해주세요.

select product_code, sum(price * sales_amount) sales
from offline_sale o left join product p on o.product_id = p.product_id
group by 1
order by 2 desc, 1