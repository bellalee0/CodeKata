-- https://school.programmers.co.kr/learn/courses/30/lessons/144856
-- 2022년 1월의 도서 판매 데이터를 기준으로 저자 별, 카테고리 별 매출액(TOTAL_SALES = 판매량 * 판매가) 을 구하여, 저자 ID(AUTHOR_ID), 저자명(AUTHOR_NAME), 카테고리(CATEGORY), 매출액(SALES) 리스트를 출력하는 SQL문을 작성해주세요.
-- 결과는 저자 ID를 오름차순으로, 저자 ID가 같다면 카테고리를 내림차순 정렬해주세요.

select b.author_id, a.author_name, b.category, sum(price * sales) sales
from book b left join author a on b.author_id = a.author_id
            left join book_sales s on b.book_id = s.book_id
where date_format(sales_date, '%Y-%m') = '2022-01'
group by b.author_id, b.category
order by 1, 3 desc