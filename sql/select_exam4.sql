select * from book;
select * from customer;
select * from orders;

-- 1. 박지성의 총 구매액(박지성의 고객번호는 1번으로 놓고 작성)
select custid, sum(saleprice)
from orders
where custid = 1
group by custid;


select sum(saleprice)
from orders
where custid=1
;


-- 2. 박지성이 구매한 도서의 수(박지성의 고객번호는 1번으로 놓고 작성)
select custid, count(*)
from orders
where custid = 1
group by custid;


select count(*)
from orders
where custid = 1
;



-- 3. 마당서점 도서의 총 개수
select count(bookid)
from book;


select count(*)
from book
;



-- 4. 마당서점에 도서를 출고하는 출판사의 총 개수
select distinct publisher
from book
where publisher = publisher
order by publisher;


select count(distinct publisher)
from book
order by publisher
;




