# SELECT
#     CONCAT('/home/grep/src/', FILE.BOARD_ID, '/', FILE_ID, FILE_NAME, FILE_EXT) AS FILE_PATH
# FROM USED_GOODS_FILE AS FILE
# LEFT JOIN USED_GOODS_BOARD AS BOARD
# ON FILE.BOARD_ID = BOARD.BOARD_ID
# WHERE VIEWS = (SELECT MAX(VIEWS) FROM USED_GOODS_BOARD)
# ORDER BY FILE_ID DESC

SELECT CONCAT('/home/grep/src/',A.BOARD_ID,'/',A.FILE_ID,A.FILE_NAME,A.FILE_EXT) AS FILE_PATH
FROM USED_GOODS_FILE A JOIN USED_GOODS_BOARD B ON A.BOARD_ID = B.BOARD_ID
WHERE B.VIEWS = (SELECT MAX(VIEWS)
                FROM USED_GOODS_BOARD)
ORDER BY FILE_ID DESC