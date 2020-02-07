-- begin OOP1_EMPLOYEE
create table OOP1_EMPLOYEE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FIRST_NAME varchar(30) not null,
    LAST_NAME varchar(30) not null,
    BIRTH_DATE date,
    EMAIL varchar(30),
    SALARY decimal(19, 2) not null,
    WORK_SHOP_ID varchar(36),
    --
    primary key (ID)
)^
-- end OOP1_EMPLOYEE
-- begin OOP1_CITY
create table OOP1_CITY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(50) not null,
    PHONE_CODE integer,
    --
    primary key (ID)
)^
-- end OOP1_CITY
-- begin OOP1_SERVICE
create table OOP1_SERVICE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DESCRIPTION varchar(255) not null,
    Employee_ID varchar(36),
    --
    primary key (ID)
)^
-- end OOP1_SERVICE
-- begin OOP1_WORK_SHOP
create table OOP1_WORK_SHOP (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(30) not null,
    PHONE_NUMBER integer not null,
    CITY_ID varchar(36),
    ADDRESS varchar(255),
    SERVICE_ID varchar(36),
    WORK_SHOP_ID varchar(36),
    --
    primary key (ID)
)^
-- end OOP1_WORK_SHOP
-- begin OOP1_INDIVIDUAL
create table OOP1_INDIVIDUAL (
    ID varchar(36) not null,
    --
    PASSPORT_NO integer,
    --
    primary key (ID)
)^
-- end OOP1_INDIVIDUAL
-- begin OOP1_COMPANY
create table OOP1_COMPANY (
    ID varchar(36) not null,
    --
    INN integer,
    --
    primary key (ID)
)^
-- end OOP1_COMPANY
-- begin OOP1_CUSTOMER
create table OOP1_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(31),
    --
    NAME varchar(50),
    PHONE integer,
    EMAIL varchar(50),
    WORK_SHOP_ID varchar(36),
    --
    primary key (ID)
)^
-- end OOP1_CUSTOMER
