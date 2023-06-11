create table ITEM
(
    ID BIGSERIAL primary key,
    NAME varchar(100) not null,
    ATTACK INT not null,
    DEFENSE INT not null,
    unique (name)
);