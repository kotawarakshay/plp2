CREATE TABLE policycreation(
Business_segment varchar2(20),
Question varchar2(50),
Answer1 varchar2(80),
Ans1_weightage number(5),
Answer2 varchar2(80),
Ans2_weightage number(5),
Answer3 varchar2(80),
Ans3_weightage number(5));


insert into policycreation values('Restaurant','Restaurant type','only dining',200,'Dining with bar',400,'dining with bar and entertainment',600);

insert into policycreation values('Restaurant','Restaurant sq.ft','less than 1500 sq.ft',200,'from 1500 to 5000 sq ft ',400,'more than 5000 sq.ft',600);

insert into policycreation values('Restaurant','No. of sprinklers','up to 20',200,'21 to 40',400,'more than 40',600);

insert into policycreation values('Restaurant','No.of cylinders in kitchen','up to 5',200,'6 to 15 ',400,'more than 15',600);


insert into policycreation values('Restaurant','Fine Arts','5000 to 15000',200,'15000-30000',400,'more than 30000',600);


insert into policycreation values('Restaurant','Property Damage','up to 500000',200,'from 500000 to 1500000',400,'more than 1500000',600);


insert into policycreation values('Restaurant','Equipment Breakdown','up to 50000',200,'from 50000 to 200000',400,'more than 200000',600);


insert into policycreation values('Restaurant','Liability Coverage','10000-15000',200,'from 15001 to 30000',400,'more than 30000',600);


insert into policycreation values('Restaurant','Bodily Injury','up to 25000',200,'25001 to 50000',400,'more than 50000',600);


insert into policycreation values('Apartment','Apartment Sq.ft','up to 1500 Sq.ft',200,'from 1500 to 5000sq.ft',400,'more than 5000',600);

insert into policycreation values('Apartment','No. of sprinklers','up to 5',200,'from 6 to 10',400,'more than 10',600);

insert into policycreation values('Apartment','Build year','before 2000',200,'2000 to 2010',400,'after 2010',600);

insert into policycreation values('Apartment','Property Damage','up to 500000',200,'from 500000 to 1500000',400,'more than 1500000',600);

insert into policycreation values('Apartment','Body injury limit','50000-100000',200,'100001-300000',400,'more than 300000',600);

insert into policycreation values('Apartment','No. of floors','less than 10',200,'10-30',400,'more than 30',600);

insert into policycreation values('Apartment','Number of fire exits','1',200,'2-3',400,'more than 3',600);

insert into policycreation values('Apartment','Asset Theft Limit','up to 50000',200,'50000-100000',400,'100001-200000',600);
