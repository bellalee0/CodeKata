-- https://school.programmers.co.kr/learn/courses/30/lessons/59412
-- 보호소에서는 몇 시에 입양이 가장 활발하게 일어나는지 알아보려 합니다. 09:00부터 19:59까지, 각 시간대별로 입양이 몇 건이나 발생했는지 조회하는 SQL문을 작성해주세요. 이때 결과는 시간대 순으로 정렬해야 합니다.

select date_format(datetime, '%H') hour, count(1) count
from animal_outs
where date_format(datetime, '%H') between 09 and 19
group by 1
order by 1