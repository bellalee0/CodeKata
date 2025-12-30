-- https://leetcode.com/problems/big-countries/description/
-- A country is big if:
-- 1. it has an area of at least three million (i.e., 3000000 km2), or
-- 2. it has a population of at least twenty-five million (i.e., 25000000).
-- Write a solution to find the name, population, and area of the big countries. Return the result table in any order. The result format is in the following example.

select name, population, area
from world
where area >= 3000000 or population >= 25000000