create table OOP1_CUSTOMER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(100),
    --
    NAME varchar(50),
    PHONE integer,
    EMAIL varchar(50),
    WORK_SHOP_ID varchar(36),
    --
    -- from oop1_Individual
    PASSPORT_NO integer,
    --
    -- from oop1_Company
    INN integer,
    --
    primary key (ID)
);