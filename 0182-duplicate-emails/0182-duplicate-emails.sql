SELECT Email
FROM Person
GROUP BY Email
having COUNT(Email) > 1;
