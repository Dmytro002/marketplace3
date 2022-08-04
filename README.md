Код для створення таблиць:
Таблиця товарів:
CREATE TABLE Product(
id int primary key generated always as identity,

name varchar(100) not null,

price float not null check ( price >= 0 ),

userId int references "user"(id) on delete cascade

);
Таблиця зареєстрованих користувачів:
CREATE TABLE "user" (
id int primary key generated always as identity,

firstName varchar(100) not null,

secondName varchar(100) not null,

amountOfMoney float not null

);
