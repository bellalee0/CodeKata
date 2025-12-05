-- https://school.programmers.co.kr/learn/courses/30/lessons/77487
-- 이 서비스에서는 공간을 둘 이상 등록한 사람을 "헤비 유저"라고 부릅니다. 헤비 유저가 등록한 공간의 정보를 아이디 순으로 조회하는 SQL문을 작성해주세요.

select *
from places
where host_id in (select host_id
                  from places
                  group by host_id
                  having count(host_id) >= 2)
order by 1