create table match(
   id bigint not null auto_increment,
   animalId bigint not null,
   typeOfVacancyId bigint not null,
   matchStatus varchar(50),
   primary key(id),
   foreign key(animalId) references animal(id)
)