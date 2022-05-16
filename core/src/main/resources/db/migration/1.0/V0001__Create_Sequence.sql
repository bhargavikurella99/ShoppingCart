-- Leave a large ID space reserved for master-data and test-data
CREATE SEQUENCE HIBERNATE_SEQUENCE START WITH 1000000;

CREATE TABLE Customer (
  id BIGINT NOT NULL AUTO_INCREMENT,
  modificationCounter INTEGER NOT NULL,
  name VARCHAR(255) NOT NULL,
  email VARCHAR(255) NOT NULL,
  gender VARCHAR(255) NOT NULL,
  mobileNumber BIGINT NOT NULL,
  CONSTRAINT PK_Customer PRIMARY KEY(id)
  );

CREATE TABLE Product(
  id BIGINT NOT NULL AUTO_INCREMENT,
  modificationCounter INTEGER NOT NULL,  
  productName VARCHAR(255) NOT NULL,
  quantity INTEGER NOT NULL,
  price INTEGER NOT NULL,
  idCustomer BIGINT,
  CONSTRAINT PK_Product PRIMARY KEY(id),
  CONSTRAINT FK_Product_idCustomer  FOREIGN KEY(idCustomer) REFERENCES Customer(id)
);





