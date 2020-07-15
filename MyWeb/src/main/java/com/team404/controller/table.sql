create table freeboard(
    bno number(10, 0),
    title varchar2(300) not null,
    writer varchar2(50) not null,
    content varchar2(2000) not null,
    regdate date default sysdate,
    updatedate date default sysdate
);
alter table freeboard add constraint freeboard_pk primary key (bno);
create sequence freeboard_seq increment by 1 start with 1 nocache;