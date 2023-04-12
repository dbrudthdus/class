select * from book;
select * from customer;
select * from orders;

-- 3. 박지성의 총 구매액(박지성의 고객번호는 1번으로 놓고 작성)
select custid, to_char(sum(saleprice))
from orders;