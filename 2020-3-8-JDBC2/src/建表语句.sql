create table grade(
	g_id int,
	g_Name varchar(100)
);

create table student(
	s_id int,
	s_number int unique,
	s_gradeId int,
	s_studentName varchar(100)
);

create table teacher(
	t_id int,
	t_name varchar(100)
);

create table course(
	c_id int,
	c_coursename varchar(100)
);

create table schedule(
	sc_id int,
	sc_time varchar(100),
	sc_courseId  int,
	sc_teacherId int,
	sc_gradeId int
);

create table score(
	sco_id int,
	sco_studentId int,
	sco_courId int,
	sco_score double(5,2)
);