CREATE TABLE USERS (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    is_active BIT NOT NULL,
    drive_license boolean  NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE PRODUCTS (
    id INT PRIMARY KEY,
    product_id INT NOT NULL,
    FOREIGN KEY (product_id) REFERENCES (USERS.ID)
);