CREATE TABLE mytable(  
    ID INT NOT NULL,   
    username VARCHAR(16) NOT NULL,  
    UNIQUE [indexName] (username(length))  
);  
