-- select example2

select * from tab;

select * from Book;
select * from Customer;
select * from Orders;

-- 1. 도서번호가 1인 도서의 이름
select bookname from book where bookid=1;

-- 2. 가격이 20,000원 이상인 도서의 이름
select bookname from book where price >=20000;

-- 3. 모든 고객의 이름, 주소
select name, address from customer;

-- 4. 2014년7월4일~7월7일 사이에 주문받은 도서의 주문번호
select orderid from orders where orderdate between '14/07/04' and '14/07/07';

-- 5. 2014년7월4일~7월7일 사이에 주문받은 도서를 제외한 도서의 주문번호
select orderid from orders where orderdate not between  '14/07/04' and '14/07/07';

-- 6. 성이 ‘김’씨인 고객의 이름과 주소
select name, address from customer where name like '김%';

-- 7. 성이 ‘김’씨이고 이름이 ‘아’로 끝나는 고객의 이름과 주소
select name, address from customer where name like '김%' and name like '%아;

