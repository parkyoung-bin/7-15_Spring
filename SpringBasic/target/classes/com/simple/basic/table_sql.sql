create table score (

    num number(10,0),
    name varchar2(50),
    kor varchar2(50),
    eng varchar2(50),
    math varchar(50)

);

alter table score add CONSTRAINT score_pk primary key (num);

create SEQUENCE score_req INCREMENT by 1 start with 1;