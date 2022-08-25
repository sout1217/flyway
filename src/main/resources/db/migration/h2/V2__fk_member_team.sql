create table TEAM
(
    id   bigint auto_increment,
    name varchar(255),
    primary key (id)
);

alter table MEMBER
    add column team_id bigint;

alter table MEMBER
    add constraint fk_MEMBER_TEAM
        foreign key (team_id) references TEAM (id);

