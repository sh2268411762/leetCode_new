create table country(id int primary key, name varchar(100));
create table people(id int primary key, name varchar(100), age int, c_id int, constraint p_c_id foreign key(c_id) references country(id)) ;
