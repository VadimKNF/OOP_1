alter table OOP1_INDIVIDUAL add constraint FK_OOP1_INDIVIDUAL_ON_ID foreign key (ID) references OOP1_CUSTOMER(ID) on delete CASCADE;
