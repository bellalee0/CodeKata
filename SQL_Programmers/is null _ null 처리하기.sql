-- https://school.programmers.co.kr/learn/courses/30/lessons/59410
-- 동물의 생물 종, 이름, 성별 및 중성화 여부를 아이디 순으로 조회하는 SQL문을 작성해주세요. 이때 이름이 없는 동물의 이름은 "No name"으로 표시해 주세요.

select animal_type, coalesce(name, "no name") name, sex_upon_intake
from animal_ins
order by animal_id