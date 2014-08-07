# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table turma (
  id                        integer not null,
  nome                      varchar(255),
  periodo                   varchar(255),
  constraint pk_turma primary key (id))
;

create sequence turma_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists turma;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists turma_seq;

