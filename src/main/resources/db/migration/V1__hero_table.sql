create table HERO
(
    ID BIGSERIAL primary key,
    NAME varchar(100) not null,
    LIFE int not null,
    ATTACK INT not null,
    DEFENSE INT not null,
    MANA INT not null,
    unique (name)
);