CREATE TABLE seedshop.product
(
    pid INT NOT NULL PRIMARY KEY,
    item_name VARCHAR(45) NOT NULL,
    pcom VARCHAR(45) NOT NULL,
    qty INT,
    purchase_price INT,
    sell_price INT
);