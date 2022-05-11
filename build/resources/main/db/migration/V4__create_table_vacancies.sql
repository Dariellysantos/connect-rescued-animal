drop table if exists vacancies;
create table vacancies(
    id bigint not null auto_increment,
    typeAnimal varchar(50),
    quantity bigint not null,
    nonprofit_organizationId bigint not null,
    primary key(id),
    foreign key(nonprofit_organizationId) references nonprofit_organization(id)
);