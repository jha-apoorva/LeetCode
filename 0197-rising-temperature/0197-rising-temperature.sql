# Write your MySQL query statement below
Select curr.id from Weather as curr where exists (Select 1 from Weather as prev where curr.temperature > prev.temperature and curr.recordDate = prev.recordDate + INTERVAL 1 DAY);
