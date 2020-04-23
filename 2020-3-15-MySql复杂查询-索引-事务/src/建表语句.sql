//登录mysql   mysql -u root -p
//创建数据库  create database java_14_db;
//设置这个库为默认的库 use java_14_db;
//创建表  create table 表名称；
create table students (id int, name varchar(20), class_name varchar(20));
insert into students (id, name, class_name) values
  (1, '宋江', '水浒'),
  (2, '卢俊义', '水浒'),
  (3, '公孙胜', '水浒'),
  (4, '吴用', '水浒'),
  (5, '呼延灼', '水浒'),
  (6, '林冲', '水浒'),
  (7, '武松', '水浒'),
  (8, '鲁智深', '水浒'),
  (9, '唐三藏', '西游'),
  (10, '孙悟空', '西游'),
  (11, '猪悟能', '西游'),
  (12, '沙悟净', '西游'),
  (13, '刘备', '三国'),
  (14, '关羽', '三国'),
  (15, '张飞', '三国'),
  (16, '贾宝玉', '红楼'),
  (17, '林黛玉', '红楼');
select  count(*) from  students;//查询表中有多少行数据
select  count(*) from  students where class_name='三国';//查询表中,三国班有多少行数据
select  class_name, count(*) from  students group by class_name;// 聚合查询，分组查询显示结果，然后按班级进行分班


create table students_gender (id int, name varchar(20), class_name varchar(20), gender varchar(10));
insert into students_gender (id, name, class_name, gender) values
  (1, '宋江', '水浒', '女'),
  (2, '卢俊义', '水浒', '女'),
  (3, '公孙胜', '水浒', '男'),
  (4, '吴用', '水浒', '保密'),
  (5, '呼延灼', '水浒', '男'),
  (6, '林冲', '水浒', '保密'),
  (7, '武松', '水浒', '保密'),
  (8, '鲁智深', '水浒', '女'),
  (9, '唐三藏', '西游', '男'),
  (10, '孙悟空', '西游', '男'),
  (11, '猪悟能', '西游', '女'),
  (12, '沙悟净', '西游', '男'),
  (13, '刘备', '三国', '女'),
  (14, '关羽', '三国', '女'),
  (15, '张飞', '三国', '女'),
  (16, '贾宝玉', '红楼', '男'),
  (17, '林黛玉', '红楼', '女');

//聚合函数count(*)   max()  min() avg() sum()
//分组查询 group by
select  class_name,gender,count(*) from  students_gender group by class_name,gender;
select  count(nullif(gender,'男')) from  students_gender;//将'男'用“null”代替，然后统计不是男生的人数；

//对比：where  是分组前进行筛选：having 是分组后进行筛选；
//在聚合结果中进一步筛选 having 语句
select  class_name,gender,count(*) from  students_gender group by class_name,gender having count(*)=3;


//联合查询  --多表查询
create table cls (id int, name varchar(20), adviser varchar(20));
insert into cls (id, name, adviser) values
    (1, '水浒', '汤老湿'),
    (2, '三国', '老周'),
    (3, '红楼', '老陈'),
    (4, '西游', '胥姐');

create table stu (id int, name varchar(20), class_id int, gender varchar(10));
insert into stu (id, name, class_id, gender) values
  (1, '宋江', 1, '女'),
  (2, '卢俊义', 1, '女'),
  (3, '公孙胜', 1, '男'),
  (4, '吴用', 1, '保密'),
  (5, '呼延灼', 1, '男'),
  (6, '林冲', 1, '保密'),
  (7, '武松', 1, '保密'),
  (8, '鲁智深', 1, '女'),
  (9, '唐三藏', 4, '男'),
  (10, '孙悟空', 4, '男'),
  (11, '猪悟能', 4, '女'),
  (12, '沙悟净', 4, '男'),
  (13, '刘备', 2, '女'),
  (14, '关羽', 2, '女'),
  (15, '张飞', 2, '女'),
  (16, '贾宝玉', 3, '男'),
  (17, '林黛玉', 3, '女');

  select  count(*) from  stu;//17行
  select  count(*) from  cls;//4行
  select * from  cls,stu;//68行=17*4
  select * from  cls,stu where class_id=cls.id;//正确

//简化
  select
      stu.id,
      stu.name,
      cls.name as class_name,
      gender
  from
      stu,
      cls
  where
      cls.id=class_id;

  //内联
  //外联--左连接+右连接
create table cls2 (id int, name varchar(20), adviser varchar(20));
insert into cls2 (id, name, adviser) values
    (1, '水浒', '汤老湿'),
    (2, '三国', '老周'),
    (3, '红楼', '老陈'),
    (4, '西游', '胥姐'),
    (5, '哈利波特', '老徐');  -- 没有学生的班级

create table stu2 (id int, name varchar(20), class_id int, gender varchar(10));
insert into stu2 (id, name, class_id, gender) values
  (1, '宋江', 1, '女'),
  (2, '卢俊义', 1, '女'),
  (3, '公孙胜', 1, '男'),
  (4, '吴用', 1, '保密'),
  (5, '呼延灼', 1, '男'),
  (6, '林冲', 1, '保密'),
  (7, '武松', 1, '保密'),
  (8, '鲁智深', 1, '女'),
  (9, '唐三藏', 4, '男'),
  (10, '孙悟空', 4, '男'),
  (11, '猪悟能', 4, '女'),
  (12, '沙悟净', 4, '男'),
  (13, '刘备', 2, '女'),
  (14, '关羽', 2, '女'),
  (15, '张飞', 2, '女'),
  (16, '贾宝玉', 3, '男'),
  (17, '林黛玉', 3, '女'),
  (18, '白起', 100, '男'); -- 没有对应班级的同学

select stu2.id,stu2.name,cls2.name as class_name  from  stu2,cls2 where  stu2.class_id=cls2.id;//内联
select stu2.id,stu2.name,cls2.name as class_name  from  stu2 left join cls2 on stu2.class_id=cls2.id;//左联
select stu2.id,stu2.name,cls2.name as class_name  from  stu2 right join cls2 on  stu2.class_id=cls2.id;//右联


create table stu3 (id int, name varchar(20), monitor_id int);
insert into stu3 (id, name, monitor_id) values
    (1, '宋江', 1),
    (2, '吴用', 1),
    (3, '李逵', 1),
    (4, '唐僧', 4),
    (5, '孙悟空', 4);



//复杂查询
