SELECT YEAR(SALES_DATE) AS YEAR, MONTH(SALES_DATE) AS MONTH, GENDER, COUNT(DISTINCT ONLINE_SALE.USER_ID) AS USERS
FROM ONLINE_SALE
INNER JOIN USER_INFO ON USER_INFO.USER_ID = ONLINE_SALE.USER_ID
WHERE GENDER IS NOT NULL
GROUP BY YEAR, MONTH, GENDER
ORDER BY YEAR, MONTH, GENDER;