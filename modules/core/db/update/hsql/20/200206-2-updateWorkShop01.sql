alter table OOP1_WORK_SHOP add constraint FK_OOP1_WORK_SHOP_ON_WORK_SHOP foreign key (WORK_SHOP_ID) references OOP1_WORK_SHOP(ID);
create index IDX_OOP1_WORK_SHOP_ON_WORK_SHOP on OOP1_WORK_SHOP (WORK_SHOP_ID);
