alter table OOP1_COMPANY add constraint FK_OOP1_COMPANY_ON_ID foreign key (ID) references OOP1_CUSTOMER(ID) on delete CASCADE;
