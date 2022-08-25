/**
* App 실행 전, flyway.MEMBER 테이블이 이미 존재해야 합니다
*/

create table if not exists BOARD
(
    id   bigint auto_increment,
    name varchar(255),
    primary key (id)
);
