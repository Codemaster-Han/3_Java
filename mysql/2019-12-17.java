/*
mysql数据库学习
*/

//1：打开数据库
连接数据库服务：
mysql -u root -p
show databases;
use java_14_db;
select database();


//2：创建一个表----（字段+类型）
create table student( 
	name varchar(20),
	sn int,//学号
	mysql int,//成绩
	englinsh double(5,2),
	java smallint            //短整形
);

//进行部分插入
insert into student(name)  values('lily');
insert into student(name)  values('lilong');
insert into student(name)  values('tianwa');
insert into student(name,sn)  values('lily',20092020);

//批量插入
insert into student(mysql ,englinsh,java)   
                    values(99,40,79),
						  (93,50,78),
						  (94,60,75),
						  (96,70,76),
						  (97,80,73),
						  (99,90,72);
						  
insert into student(mysql ,englinsh,java)   
                    values(30,21,78),
						  (53,93,32),
						  (74,60,56),
						  (96,33,93),
						  (67,54,23),
						  (39,67,65);

select *from student;//显示所有的数据


//进行全部插入
insert into student values('jiwen4', 20190006, 100, 100.00, 32);

//查看表结构--全部
select * from student;

//部分查询
select mysql, englinsh, java from student;
//求总分
select  name,sn, mysql+englinsh+java 总分 from student;

//修改列表名字----别名（重命名）
select sn as 学号 from student;
select sn 学号 from student;//as可以省略写
select 1+1 as sn from student;//将整个sn列 变成表达式 1+1=2 的值

//去掉这一列中 重复的数据 
select distinct java from student;


//排序
 select * from student order by englinsh desc;//  desc 是降序排列   asc 是升序排列
 select * from student order by mysql asc;
 select * from student order by java;//默认是升序


//总分合计以后再排序
select  name,sn, mysql+englinsh+java 总分 from student  order by 总分 desc ;

//查询成绩范围内的---------where 条件查询
select * from student where mysql=99&&java>65;
select * from student where name like 'l%';//模糊查询  查询以l开头的姓名
select * from student where java between 20 and 75;//查询 java成绩在20-75之间的
select * from student where englinsh is null && name like 'l%';
select name,java from student where java in(77,32);//查询java成绩是77,32 的 name列
select mysql+english+java as total from student order by total;//查询求和并排序
//分页查询  
select * from student  limit 0,4;//从第0行开始，筛选4行数据  


//修改
update student set name='jiwu',sn=17042102  where englinsh>80;
update student set name='czx',sn=1802324  where mysql>20 and englinsh>70;
update student set name='abs',sn=1908724  where name <=>null ;
update student set mysql=40,java=77  where mysql >90 || java is NULL;     //注意：null+34=null   null加任何数字还是null


//删除
delete from  student where name='lilong';  //删除了 名字为lilong这一行

update student set mysql=mysql+30 order by mysql+english+java limit 3;
delete from student where english+java+mysql <=> 180; //修改并删除

/**
总结

主要内容 CRUD 增删查改

RUD

查询：
1.全列查询
2.指定列查询
3.去重 distinct
4.排序，order by, 默认 asc，desc
5.条件查询
a. 表达式,between and
b. in
c. and,or,not,&&, ||, !
d. like %，_
e. limit s,n

U -> update tablename set col=xxx,col=yyy where condition order by limit s,n;
D -> delete from tablename where condition order limit;

*/
