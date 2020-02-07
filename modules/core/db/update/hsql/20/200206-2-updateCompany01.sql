alter table OOP1_COMPANY alter column VERSION rename to VERSION__U01902 ^
alter table OOP1_COMPANY alter column VERSION__U01902 set null ;
alter table OOP1_COMPANY alter column CREATE_TS rename to CREATE_TS__U91919 ^
alter table OOP1_COMPANY alter column CREATED_BY rename to CREATED_BY__U29145 ^
alter table OOP1_COMPANY alter column UPDATED_BY rename to UPDATED_BY__U54051 ^
alter table OOP1_COMPANY alter column DELETE_TS rename to DELETE_TS__U86887 ^
alter table OOP1_COMPANY alter column UPDATE_TS rename to UPDATE_TS__U85987 ^
alter table OOP1_COMPANY alter column DELETED_BY rename to DELETED_BY__U29289 ^
alter table OOP1_COMPANY add column PHONE integer ;
alter table OOP1_COMPANY add column WORK_SHOP_ID varchar(36) ;
alter table OOP1_COMPANY add column DELETED_BY varchar(50) ;
alter table OOP1_COMPANY add column UPDATE_TS timestamp ;
alter table OOP1_COMPANY add column ID varchar(36) not null ^
update OOP1_COMPANY set ID = '00000000-0000-0000-0000-000000000000' where ID is null ;
alter table OOP1_COMPANY alter column ID set not null ;
alter table OOP1_COMPANY add column VERSION integer ^
update OOP1_COMPANY set VERSION = 0 where VERSION is null ;
alter table OOP1_COMPANY alter column VERSION set not null ;
alter table OOP1_COMPANY add column CREATE_TS timestamp ;
alter table OOP1_COMPANY add column EMAIL varchar(50) ;
alter table OOP1_COMPANY add column UPDATED_BY varchar(50) ;
alter table OOP1_COMPANY add column DELETE_TS timestamp ;
alter table OOP1_COMPANY add column NAME varchar(50) ;
alter table OOP1_COMPANY add column CREATED_BY varchar(50) ;
