create table vacancies(
    id bigint not null auto_increment,
    typeAnimal varchar(50),
    quantity bigint not null,
    nonprofitOrganizationId bigint not null,
    primary key(id),
    foreign key(nonprofitOrganizationId) references nonprofitOrganization(id)
)