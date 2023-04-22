
select * from emp001;
update emp001 set ename='cha' where empno=7839;
desc emp;
rollback;

insert into emp001 values(8888, 'sss', 'st', 7839, sysdate, 3000, 500, 10);
commit;


delete from emp001 where deptno=10 and ename='sim'; 

select * from dept;

insert into dept values(80, 'st', 'inchon');

update dept set dname='sim', loc='seoul' where deptno=70;