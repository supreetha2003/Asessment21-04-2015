

create table students1(
stu_id int primary key,
stu_name varchar(20),
email varchar(30) unique,
age int,
marks decimal
);
select * from students1
insert into students1 values(1011,'supreetha','suprithaur@gmail.com','20','70');
insert into students1 values(1022,'sahana','sahana@gmail.com','15','75');
insert into students1 values(1033,'pallu','pallu@gmail.com','17','80');

---Q2: Fetch student details where age > 21.---
select * from students1 where age<21;
---Q3: Update the email of the student with id = 5 to 
'rahul@gmail.com'. ---
update students1 set stu_id=1022,email='rahul@gmail.com';--

---Q4: Delete all students with age < 18.--
delete from students1 where age < 18;
rollback
----Q5: Find the second highest score student details.--
select marks from students1 where marks=75;


create table course(
course_id int,
student_id int,
course_name varchar(30)
);
select * from course;
insert into course values(101,1,'java');
insert into course values(102,2,'python');
insert into course values(103,1,'sql');
---Q6: Write a query to display student names and their enrolled course 
select  e.s student_id ,c.s course_id  where e=e.s and c.s from course;














