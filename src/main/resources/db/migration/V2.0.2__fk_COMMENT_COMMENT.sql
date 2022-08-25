alter table COMMENT
    add column post_id bigint;

alter table COMMENT
    add foreign key(post_id) references POST (id);
