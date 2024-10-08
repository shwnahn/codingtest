-- 코드를 작성해주세요
SELECT COUNT(GENOTYPE) AS COUNT
FROM ECOLI_DATA
WHERE 
    BIN(GENOTYPE) = "1"
    OR (SUBSTRING(BIN(GENOTYPE), -2, 1) = '0'
        AND (SUBSTRING(BIN(GENOTYPE), -3, 1) = '1'
            OR SUBSTRING(BIN(GENOTYPE), -1, 1) = '1')
       )