alter table OOP1_COMPANY add constraint FK_OOP1_COMPANY_ON_WORK_SHOP foreign key (WORK_SHOP_ID) references OOP1_WORK_SHOP(ID);
create index IDX_OOP1_COMPANY_ON_WORK_SHOP on OOP1_COMPANY (WORK_SHOP_ID);
