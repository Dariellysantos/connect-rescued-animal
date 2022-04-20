create table nonprofitOrganization(
  id bigint not null auto_increment,
  cnpj bigint not null,
  numberOfVacancies bigint not null,
  address varchar(50),
  linkPage varchar(50),
  primary key(id)
)