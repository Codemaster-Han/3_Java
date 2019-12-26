//日期时间格式？
datetime  timestamp

//创建表timetest
create table timetest(
	id int,
	datetimefield datetime,
	timestampfield timestamp
);

//插入
insert into timetest values(1,'2019-12-24 08:00:00','2019-12-23 09:00:00');
insert into timetest(id,datetimefield) values (2,'2019-12-22 08:00:00');
insert into timetest(id,timestampfield) values (3,'2019-12-21 08:00:00');


select * from timetest;//显示表所有成员
desc timetest;//描述查看表结构

show variables;
show variables like 'char%';
show variables like 'coll%';


======================================================================================================
//数据库约束
数据库完整性
1：实体完整性  primary key（主键）
2：参照完整性
3：用户自定义完整性 unique ,NULL,NOT NULL

//创建表StuConstraint
create table StuConstraint(
	id int  primary key,
	studentsNumber int unique,
	name varchar(20) not null
);

insert into StuConstraint values(1,20190811,'xixi');
insert into StuConstraint values(1,20190812,'xixi2');
insert into StuConstraint values(null,20190813,'xix3');
insert into StuConstraint values(NULL,20190814,'xix4');


select * from StuConstraint;

drop table  StuConstraint;//删除整个表

属性（java）==字段（SQL)==列
===============================
//数据库设计
实现一个学生的选课系统
学生学期开始选择自己的课程，期末考试老师要录入成绩
要求指明学生所在的班级

1.分析（需求分析）
概念模型（schema）->转换成 **关系模型**
1.1 识别实体（entity）：学生（student）、课程（course）、老师（teacher）；
1.2 识别关系（relational）：成绩（score）
1.3 ER图 （Entity-Relation)//实体关系图--------entity 用“矩形图”表示    relation用“菱形图”表示  attribute属性用“椭圆”
1.4 确定主键---概念模型转关系模型

a) 1 对 1
b) 1 对 M
c) M 对 N


#老师（teacher）；---工号+姓名
create table teacher(
	teacher_id  int  primary key,
	name varchar(20)
);


#学生（student）；---学号+姓名
create table student(
	student_id  int  primary key,
	name varchar(20)
);


#课程（course）；---编号+课程名+学分
create table course(
	course_id  int  primary key,
	name varchar(20),
	credit int 
);

#班级（class）；---编号+名称
create table student(
	class_id  int  primary key,
	name varchar(20)
);


关系：
#教室
