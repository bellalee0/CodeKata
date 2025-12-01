-- https://school.programmers.co.kr/learn/courses/30/lessons/131532
-- USER_INFO 테이블과 ONLINE_SALE 테이블에서 년, 월, 성별 별로 상품을 구매한 회원수를 집계하는 SQL문을 작성해주세요.
-- 결과는 년, 월, 성별을 기준으로 오름차순 정렬해주세요. 이때, 성별 정보가 없는 경우 결과에서 제외해주세요.

select year(sales_date), month(sales_date), gender, count(distinct s.user_id) users
from online_sale s left join user_info u on s.user_id = u.user_id
where gender is not null
group by 1, 2, 3
order by 1, 2, 3