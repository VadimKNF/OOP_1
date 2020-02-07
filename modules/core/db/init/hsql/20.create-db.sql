-- begin OOP1_EMPLOYEE
alter table OOP1_EMPLOYEE add constraint FK_OOP1_EMPLOYEE_ON_WORK_SHOP foreign key (WORK_SHOP_ID) references OOP1_WORK_SHOP(ID)^
create index IDX_OOP1_EMPLOYEE_ON_WORK_SHOP on OOP1_EMPLOYEE (WORK_SHOP_ID)^
-- end OOP1_EMPLOYEE
-- begin OOP1_SERVICE
alter table OOP1_SERVICE add constraint FK_OOP1_SERVICE_ON_EMPLOYEE foreign key (EMPLOYEE_ID) references OOP1_EMPLOYEE(ID)^
create index IDX_OOP1_SERVICE_ON_EMPLOYEE on OOP1_SERVICE (EMPLOYEE_ID)^
-- end OOP1_SERVICE
-- begin OOP1_WORK_SHOP
alter table OOP1_WORK_SHOP add constraint FK_OOP1_WORK_SHOP_ON_CITY foreign key (CITY_ID) references OOP1_CITY(ID)^
alter table OOP1_WORK_SHOP add constraint FK_OOP1_WORK_SHOP_ON_SERVICE foreign key (SERVICE_ID) references OOP1_SERVICE(ID)^
alter table OOP1_WORK_SHOP add constraint FK_OOP1_WORK_SHOP_ON_WORK_SHOP foreign key (WORK_SHOP_ID) references OOP1_WORK_SHOP(ID)^
create index IDX_OOP1_WORK_SHOP_ON_CITY on OOP1_WORK_SHOP (CITY_ID)^
create index IDX_OOP1_WORK_SHOP_ON_SERVICE on OOP1_WORK_SHOP (SERVICE_ID)^
create index IDX_OOP1_WORK_SHOP_ON_WORK_SHOP on OOP1_WORK_SHOP (WORK_SHOP_ID)^
-- end OOP1_WORK_SHOP
-- begin OOP1_CUSTOMER
alter table OOP1_CUSTOMER add constraint FK_OOP1_CUSTOMER_ON_WORK_SHOP foreign key (WORK_SHOP_ID) references OOP1_WORK_SHOP(ID)^
create index IDX_OOP1_CUSTOMER_ON_WORK_SHOP on OOP1_CUSTOMER (WORK_SHOP_ID)^
-- end OOP1_CUSTOMER
-- begin OOP1_COMPANY
alter table OOP1_COMPANY add constraint FK_OOP1_COMPANY_ON_ID foreign key (ID) references OOP1_CUSTOMER(ID) on delete CASCADE^
-- end OOP1_COMPANY
-- begin OOP1_INDIVIDUAL
alter table OOP1_INDIVIDUAL add constraint FK_OOP1_INDIVIDUAL_ON_ID foreign key (ID) references OOP1_CUSTOMER(ID) on delete CASCADE^
-- end OOP1_INDIVIDUAL
