# SELECT P.PRODUCT_CODE,
#     SUM(SALES_AMOUNT) * P.PRICE AS SALES
# FROM PRODUCT P
# INNER JOIN OFFLINE_SALE OS ON P.PRODUCT_ID = OS.PRODUCT_ID
# GROUP BY P.PRODUCT_CODE
# ORDER BY SALES DESC, PRODUCT_CODE ASC;

# SELECT P.PRODUCT_CODE, SUM(SALES_AMOUNT) * P.PRICE AS SALES
# FROM PRODUCT P JOIN OFFLINE_SALE OS ON P.PRODUCT_ID = OS.PRODUCT_ID
# GROUP BY P.PRODUCT_CODE
# ORDER BY SALES DESC, PRODUCT_CODE;

SELECT A.PRODUCT_CODE, SUM(B.SALES_AMOUNT*A.PRICE) AS SALES
FROM PRODUCT A JOIN OFFLINE_SALE B ON A.PRODUCT_ID = B.PRODUCT_ID
GROUP BY A.PRODUCT_CODE
ORDER BY SALES DESC, A.PRODUCT_CODE ASC;