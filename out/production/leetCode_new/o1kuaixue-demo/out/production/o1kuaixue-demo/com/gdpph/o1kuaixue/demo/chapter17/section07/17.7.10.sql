create table column_collate(
    c1 varchar(10) charset utf8 collate utf8_romanian_ci not null,
    c2 varchar(10) charset utf8 collate utf8_spanish_ci
)engine=innodb;
