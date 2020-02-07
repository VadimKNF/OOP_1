alter table OOP1_INDIVIDUAL alter column VERSION rename to VERSION__U61422 ^
alter table OOP1_INDIVIDUAL alter column VERSION__U61422 set null ;
alter table OOP1_INDIVIDUAL alter column CREATE_TS rename to CREATE_TS__U29582 ^
alter table OOP1_INDIVIDUAL alter column CREATED_BY rename to CREATED_BY__U58652 ^
alter table OOP1_INDIVIDUAL alter column UPDATED_BY rename to UPDATED_BY__U34858 ^
alter table OOP1_INDIVIDUAL alter column DELETE_TS rename to DELETE_TS__U27023 ^
alter table OOP1_INDIVIDUAL alter column UPDATE_TS rename to UPDATE_TS__U79949 ^
alter table OOP1_INDIVIDUAL alter column DELETED_BY rename to DELETED_BY__U79038 ^
alter table OOP1_INDIVIDUAL add column PHONE integer ;
alter table OOP1_INDIVIDUAL add column WORK_SHOP_ID varchar(36) ;
alter table OOP1_INDIVIDUAL add column DELETED_BY varchar(50) ;
alter table OOP1_INDIVIDUAL add column UPDATE_TS timestamp ;
alter table OOP1_INDIVIDUAL add column ID varchar(36) not null ^
update OOP1_INDIVIDUAL set ID = '00000000-0000-0000-0000-000000000000' where ID is null ;
alter table OOP1_INDIVIDUAL alter column ID set not null ;
alter table OOP1_INDIVIDUAL add column VERSION integer ^
update OOP1_INDIVIDUAL set VERSION = 0 where VERSION is null ;
alter table OOP1_INDIVIDUAL alter column VERSION set not null ;
alter table OOP1_INDIVIDUAL add column CREATE_TS timestamp ;
alter table OOP1_INDIVIDUAL add column EMAIL varchar(50) ;
alter table OOP1_INDIVIDUAL add column UPDATED_BY varchar(50) ;
alter table OOP1_INDIVIDUAL add column DELETE_TS timestamp ;
alter table OOP1_INDIVIDUAL add column NAME varchar(50) ;
alter table OOP1_INDIVIDUAL add column CREATED_BY varchar(50) ;
