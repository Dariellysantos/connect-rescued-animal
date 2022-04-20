create table protectress(
   id bigint not null auto_increment,
   name varchar(50),
   address varchar(50),
   cpf bigint not null,
   description varchar(50),
   historic bigint not null,
   email varchar(50),
   primary key(id)
)