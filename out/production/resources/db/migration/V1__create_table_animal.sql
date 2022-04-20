create table animal(
   id bigint not null auto_increment,
   genre varchar(50),
   breed varchar(50),
   type varchar(50),
   status varchar(50),
   protectress bigint not null,
   primary key (id)
   )