drop table if exists nonprofit_organization;
create table nonprofit_organization(
  id bigint not null auto_increment,
  cnpj bigint not null,
  numberOfVacancies bigint not null,
  address varchar(50),
  linkPage varchar(50),
  primary key(id)
);