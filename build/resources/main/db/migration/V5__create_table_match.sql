drop table if exists match_vacancies;
create table match_vacancies(
   id bigint not null auto_increment,
   animal_id bigint not null,
   type_of_vacancy_id bigint not null,
   matchStatus varchar(50),
   primary key(id),
   foreign key(animal_id) references animal(id)
);