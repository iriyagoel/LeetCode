SELECT p.product_name, sum(o.unit) as unit 
FROM products AS p 
JOIN orders AS o 
ON p.product_id = o.product_id 
WHERE o.order_date BETWEEN '2020-02-01' AND '2020-02-29' 
GROUP BY p.product_id having unit >= 100 ;
