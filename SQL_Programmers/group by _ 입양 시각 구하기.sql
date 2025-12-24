-- https://school.programmers.co.kr/learn/courses/30/lessons/59413
-- 보호소에서는 몇 시에 입양이 가장 활발하게 일어나는지 알아보려 합니다. 0시부터 23시까지, 각 시간대별로 입양이 몇 건이나 발생했는지 조회하는 SQL문을 작성해주세요. 이때 결과는 시간대 순으로 정렬해야 합니다.

set @hour = -1;
select @hour := @hour +1 as hour,
    (select count(1)
     from animal_outs
     where hour(datetime) = @hour) as count
from animal_outs
where @hour < 23


WITH TMP1 AS (
    SELECT 0 AS HOUR UNION
    SELECT 1 AS HOUR UNION
    SELECT 2 AS HOUR UNION
    SELECT 3 AS HOUR UNION
    SELECT 4 AS HOUR UNION
    SELECT 5 AS HOUR UNION
    SELECT 6 AS HOUR UNION
    SELECT 7 AS HOUR UNION
    SELECT 8 AS HOUR UNION
    SELECT 9 AS HOUR UNION
    SELECT 10 AS HOUR UNION
    SELECT 11 AS HOUR UNION
    SELECT 12 AS HOUR UNION
    SELECT 13 AS HOUR UNION
    SELECT 14 AS HOUR UNION
    SELECT 15 AS HOUR UNION
    SELECT 16 AS HOUR UNION
    SELECT 17 AS HOUR UNION
    SELECT 18 AS HOUR UNION
    SELECT 19 AS HOUR UNION
    SELECT 20 AS HOUR UNION
    SELECT 21 AS HOUR UNION
    SELECT 22 AS HOUR UNION
    SELECT 23 AS HOUR
    )

SELECT TMP1.HOUR, IFNULL(TMP2.COUNT, 0) COUNT
FROM TMP1
    LEFT JOIN (
    SELECT HOUR(DATETIME) AS HOUR, COUNT(DATETIME) AS COUNT
    FROM ANIMAL_OUTS A
    GROUP BY HOUR(DATETIME)
    ORDER BY HOUR
    ) AS TMP2 ON TMP1.HOUR = TMP2.HOUR