# Write your MySQL query statement below
select name as customers from customers
where id not in 
(Select  customerId from orders);