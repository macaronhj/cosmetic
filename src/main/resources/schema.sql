create table COSMETIC(
     SEQ NUMBER(10) constraint C_CODE_PK primary key,
     NAME VARCHAR2(14) constraint CNAME_NN not null,
     COUNT NUMBER(4) constraint C_COUNT_NN not null,
     COMPANY  VARCHAR2(14) constraint MCOM_NN not null,
     SALE NUMBER(10)constraint MSALE_NN not null
);


create sequence SEQ increment by 1 start with 1 nocache;

insert into cosmetic values(SEQ.NEXTVAL,'튤립',30,'아모레',12000);
insert into cosmetic values(SEQ.NEXTVAL,'ROSE',48,'아모레',24000);
insert into cosmetic values(SEQ.NEXTVAL,'SKY',491,'LG',32000);
insert into cosmetic values(SEQ.NEXTVAL,'PPIPPI',30,'COCO',9800);
insert into cosmetic values(SEQ.NEXTVAL,'DAISY',20,'아모레',51000);
insert into cosmetic values(SEQ.NEXTVAL,'SUNFLOWER',50,'LG',30000);
insert into cosmetic values(SEQ.NEXTVAL,'KOOKOO',0,'COCO',43000);
insert into cosmetic values(SEQ.NEXTVAL,'CHU',1,'LG',54000);
insert into cosmetic values(SEQ.NEXTVAL,'RURU',8,'KOSMO',18000);
insert into cosmetic values(SEQ.NEXTVAL,'LILY',320,'아모레',21000);
