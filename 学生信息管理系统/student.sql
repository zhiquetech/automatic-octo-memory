#--�����mysql���ݿ��п���ʹ�õ�����utf8���룬�Ҳ�֪���ڱ�����ݿ��кò���ʹ��
#--�������Ǹ�use <���ݿ�>���÷���
#--����--------------------------���µĴ������ݵ���������ÿ�����ݿⶼ��ʹ��
#--���ⲻҪд�ĸ��ֵ����֣���Ȼ��ӡ���������ݾͶԲ����ˡ������뵽��һ�ֽ���ķ��������޸�TAB�Ʊ�λ������ٶȡ�
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

insert into student values('201401','����',18,'Ů','�������','�༶һ');
insert into student values('201402','�ҵ�',30,'��','������ҩ','�༶��');
insert into student values('201403','���ݿ�',21,'Ů','��������','�༶��');
insert into student values('201404','����',20,'Ů','�˹�����','�༶��');
insert into student values('201405','��',34,'��','������','�༶��');
insert into student values('201406','���',63,'��','�Ƽ���','�༶��');
insert into student values('201407','���뼴',24,'Ů','������','�༶��');
insert into student values('201408','��',27,'Ů','���������','�༶��');