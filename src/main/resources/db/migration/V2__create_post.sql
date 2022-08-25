/**
 * flyway_schema_history 메타데이터 테이블에 아래의 데이터가 존재하는 상태에서 실행해야 합니다
 * 1,2,create post,SQL,V2__create_post.sql,-323980089,root,2022-08-25 13:31:51,22,1
 */
create table if not exists POST
(
    id   bigint auto_increment,
    title varchar(255),
    primary key (id)
);
