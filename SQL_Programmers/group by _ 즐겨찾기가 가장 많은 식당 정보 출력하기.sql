-- https://school.programmers.co.kr/learn/courses/30/lessons/131123
-- REST_INFO 테이블에서 음식종류별로 즐겨찾기수가 가장 많은 식당의 음식 종류, ID, 식당 이름, 즐겨찾기수를 조회하는 SQL문을 작성해주세요. 이때 결과는 음식 종류를 기준으로 내림차순 정렬해주세요.

select food_type, rest_id, rest_name, favorites
from rest_info i1
where favorites = (select max(favorites)
                   from rest_info i2
                   where i1.food_type = i2.food_type)
order by 1 desc