#Task1

CREATE DATABASE ListExpenses;
USE ListExpenses ;
CREATE TABLE expenses(
num int,
paydate date,
receiver int,
value dec,
PRIMARY KEY(num),
FOREIGN KEY(receiver),
REFERENCES receivers(num));
CREATE TABLE receivers(num int,
name varchar(255),
PRIMARY KEY (num));
SHOW TABLES;
INSERT INTO receivers VALUES(1, 'major Vasgen');
INSERT INTO receivers VALUES(2, 'Hypermarket "OldCity"');
INSERT INTO receivers VALUES(3, 'Velcom');
SELECT * FROM receivers;
INSERT INTO expenses VALUES(1, '2011-5-10', 1, 2000.0);
INSERT INTO expenses VALUES(2, '2011-5-10', 2, 94200.0);
INSERT INTO expenses VALUES(3, '2011-5-11', 3, 54000.0);
INSERT INTO expenses VALUES(4, '2011-5-11', 2, 123950.0);
SELECT * FROM expenses;

#Task2

SELECT expenses.num, paydate, value, name FROM expenses, receivers WHERE receiver=receivers.num AND value > 10000;

#Task3

DELETE FROM expenses WHERE value < 3000;
