# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table bug (
  bugname                   varchar(255) not null,
  description               varchar(255),
  status                    varchar(255),
  constraint pk_bug primary key (bugname))
;

create table contract (
  project                   varchar(255) not null,
  provider                  varchar(255),
  user                      varchar(255),
  content                   varchar(255),
  constraint pk_contract primary key (project))
;

create table file (
  id                        bigint auto_increment not null,
  sender                    varchar(255),
  receiver                  varchar(255),
  file_name                 varchar(255),
  constraint pk_file primary key (id))
;

create table projects (
  id                        bigint auto_increment not null,
  project_name              varchar(255),
  publisher                 varchar(255),
  provider                  varchar(255),
  status                    varchar(255),
  projectDescription        varchar(255),
  requiredExpertise         varchar(255),
  begintime                 varchar(255),
  endtime                   varchar(255),
  price                     varchar(255),
  constraint pk_projects primary key (id))
;

create table rates (
  project                   varchar(255),
  user                      varchar(255),
  provider                  varchar(255),
  projectrate               integer,
  providerrate              integer,
  comment                   varchar(255))
;

create table service_provider (
  username                  varchar(255) not null,
  credential                varchar(255),
  researchAreas             varchar(255),
  publications              varchar(255),
  professionalServices      varchar(255),
  keyword                   varchar(255),
  email                     varchar(255),
  university                varchar(255),
  constraint pk_service_provider primary key (username))
;

create table service_user (
  username                  varchar(255) not null,
  keywords                  varchar(255),
  email                     varchar(255),
  constraint pk_service_user primary key (username))
;

create table user (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  password                  varchar(255),
  email                     varchar(255),
  secureQuestion            varchar(255),
  secureAnswer              varchar(255),
  anonymous                 varchar(255),
  constraint pk_user primary key (id))
;

create table chat_message (
  id                        bigint auto_increment not null,
  sender                    varchar(255),
  receiver                  varchar(255),
  message                   varchar(255),
  constraint pk_chat_message primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table bug;

drop table contract;

drop table file;

drop table projects;

drop table rates;

drop table service_provider;

drop table service_user;

drop table user;

drop table chat_message;

SET FOREIGN_KEY_CHECKS=1;

