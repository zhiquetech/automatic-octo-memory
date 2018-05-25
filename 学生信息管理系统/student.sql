#--这个是mysql数据库中可以使用的数据utf8编码，我不知道在别的数据库中好不好使。
#--尤其是那个use <数据库>的用法。
#--反正--------------------------以下的创建数据的语句基本上每个数据库都好使。
#--另外不要写四个字的名字，不然打印出来的数据就对不齐了。我能想到的一种解决的方法就是修改TAB制表位。具体百度。
create database wtf;

use wtf;
#-------------------------------
drop table if exists student;
create table student(
   sno varchar(20) primary key,
   sname varchar(40) not NULL,
   sage int,
   ssex varchar(10),
   smajor varchar(50),
   sclass varchar(50)  
);

insert into student values('201401','这是',18,'女','软件工程','班级一');
insert into student values('201402','我的',30,'男','生物制药','班级儿');
insert into student values('201403','数据库',21,'女','动漫制作','班级三');
insert into student values('201404','创建',20,'女','人工智能','班级五');
insert into student values('201405','的',34,'男','大数据','班级六');
insert into student values('201406','语句',63,'男','云计算','班级七');
insert into student values('201407','导入即',24,'女','物联网','班级八');
insert into student values('201408','可',27,'女','计算机网络','班级九');