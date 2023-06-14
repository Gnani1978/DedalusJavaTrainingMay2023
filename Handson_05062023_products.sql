CREATE TABLE Orders(orderNumber number(5) NOT NULL,paymentState VARCHAR(12),creationTime DATE,totalAmount number(5),PRIMARY KEY (orderNumber)
);
CREATE TABLE Customers(custId number(5)NOT NULL,cname VARCHAR(20),phone VARCHAR(20),PRIMARY KEY(custId));


CREATE TABLE Products(prodId number(5) NOT NULL,pname VARCHAR(20),price number(5),PRIMARY KEY(prodId));


CREATE TABLE OrderDetail(orderNumber number(5) NOT NULL,prodId number(5) NOT NULL,
			FOREIGN KEY(orderNumber) REFERENCES Orders(orderNumber),
			FOREIGN KEY(prodId) REFERENCES Products(prodId));
            
insert into Products values(101,'A',2000);
insert into Products values(102,'B',40000);
insert into Products values(103,'C',8000);
insert into Products values(104,'D',1000);
insert into Products values(105,'E',1500);

select * from Products;

insert into Customers values(11,'1',9000000001);
insert into Customers values(12,'2',9000000002);
insert into Customers values(13,'3',9000000003);
insert into Customers values(14,'4',9000000004);
insert into Customers values(15,'5',9000000005);
select * from Customers;

insert into Orders values(1,'Success','2022-05-15',2000);
insert into Orders values(2,'Success','2023-01-15',40000);
insert into Orders values(3,'Failed','2022-07-11',5000);
insert into Orders values(4,'Failed','2022-09-07',6000);
insert into Orders values(5,'Success','2021-03-21',4000);
select * from Orders;



alter table Orders add custId number(5) NOT NULL;


alter table Orders add constraint fk_cust_orders FOREIGN KEY(custId) REFERENCES Customer(custId);
desc Orders;
alter table Orders drop column custId;
truncate table Orders;
drop table OrderDetail;

alter table Orders add custId number(5) NOT NULL;
alter table Orders add constraint fk_cust_orders FOREIGN KEY(custId) REFERENCES Customer(custId);
/*insert into orders table now*/
insert into Orders values(1,'Success','15-May-2015',2000,11);
insert into Orders values(2,'Success','23-Jun-2025',40000,11);
insert into Orders values(3,'Failed','12-Nov-2011',5000,12);
insert into Orders values(4,'Failed','04-Sep-2007',6000,14);
insert into Orders values(5,'Success','13-Mar-2021',4000,15);

select * from Orders;

/*Create Order Details table*/
drop table OrderDetails;
CREATE TABLE OrderDetails(orderNumber number(5) NOT NULL,prodId number(5) NOT NULL,
			FOREIGN KEY(orderNumber) REFERENCES Orders(orderNumber),
			FOREIGN KEY(prodId) REFERENCES Products(prodId));
insert into OrderDetails values(1,101);
insert into OrderDetails values(1,102);
insert into OrderDetails values(2,101);
insert into OrderDetails values(3,102);
insert into OrderDetails values(4,104);
insert into OrderDetails values(5,105);

select * from OrderDetails;