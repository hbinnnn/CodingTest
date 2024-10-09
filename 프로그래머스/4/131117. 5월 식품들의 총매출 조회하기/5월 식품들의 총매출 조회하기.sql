-- 코드를 입력하세요
SELECT A.PRODUCT_ID
     , A.PRODUCT_NAME	
     , A.PRICE * SUM(B.AMOUNT) TOTAL_SALES
FROM FOOD_PRODUCT A
    , FOOD_ORDER B
WHERE A.PRODUCT_ID = B.PRODUCT_ID
    AND TO_CHAR(B.PRODUCE_DATE, 'YYYYMM') = '202205'
GROUP BY A.PRODUCT_ID, A.PRODUCT_NAME, A.PRICE
ORDER BY TOTAL_SALES DESC, A.PRODUCT_ID; 