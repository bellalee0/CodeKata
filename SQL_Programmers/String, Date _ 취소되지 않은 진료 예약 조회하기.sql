-- https://school.programmers.co.kr/learn/courses/30/lessons/132204
-- PATIENT, DOCTOR 그리고 APPOINTMENT 테이블에서 2022년 4월 13일 취소되지 않은 흉부외과(CS) 진료 예약 내역을 조회하는 SQL문을 작성해주세요. 진료예약번호, 환자이름, 환자번호, 진료과코드, 의사이름, 진료예약일시 항목이 출력되도록 작성해주세요. 결과는 진료예약일시를 기준으로 오름차순 정렬해주세요.

select a.apnt_no, p.pt_name, a.pt_no, a.mcdp_cd, d.dr_name, a.apnt_ymd
from appointment a join patient p on a.pt_no = p.pt_no
                   join doctor d on a.mddr_id = d.dr_id
where a.mcdp_cd = 'CS' and apnt_cncl_yn = 'N' and date(apnt_ymd) = '2022-04-13'
order by a.apnt_ymd