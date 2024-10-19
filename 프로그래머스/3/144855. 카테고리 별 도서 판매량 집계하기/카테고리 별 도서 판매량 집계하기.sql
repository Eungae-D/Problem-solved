# SELECT b.CATEGORY, COUNT(bs.SALES) AS TOTAL_SALES
# FROM BOOK b JOIN BOOK_SALES bs ON b.BOOK_ID = bs.BOOK_ID
# WHERE bs.SALES_DATE LIKE '2022-01%'
# GROUP BY b.CATEGORY
# ORDER BY b.CATEGORY


SELECT A.CATEGORY, SUM(B.SALES) AS TOTAL_SALES
FROM BOOK A JOIN BOOK_SALES B ON A.BOOK_ID = B.BOOK_ID
WHERE B.SALES_DATE LIKE '2022-01%'
GROUP BY A.CATEGORY
ORDER BY A.CATEGORY