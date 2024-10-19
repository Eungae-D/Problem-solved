# SELECT D.DEPT_ID, D.DEPT_NAME_EN, ROUND(AVG(E.SAL)) AS AVG_SAL
# FROM HR_DEPARTMENT D
#     INNER JOIN HR_EMPLOYEES E ON D.DEPT_ID = E.DEPT_ID
# GROUP BY D.DEPT_ID
# ORDER BY AVG_SAL DESC;


SELECT A.DEPT_ID, A.DEPT_NAME_EN, ROUND(AVG(B.SAL),0) AS AVG_SAL
FROM HR_DEPARTMENT A JOIN HR_EMPLOYEES B ON A.DEPT_ID = B.DEPT_ID
GROUP BY A.DEPT_ID
ORDER BY AVG_SAL DESC;