/**
 * 시작 전, MEMBER 테이블과 POST 테이블이 이미 존재해야 하며,
 * flyway_schema_history 테이블은 존재하고, 데이터는 없어야 합니다
 */

create table if not exists COMMENT
(
    id   bigint auto_increment,
    content varchar(255),
    primary key (id)
);