/**
 * App 실행하기 전, MEMBER 테이블이 존재하고 있어야 하며, flyway_schema_history 테이블은 없어야 한다
 */

create table if not exists REVIEW
(
    id   bigint auto_increment,
    content varchar(255),
    reviewer bigint not null,
    primary key (id),
    foreign key (reviewer) references MEMBER(id)
);

