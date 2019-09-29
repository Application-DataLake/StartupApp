CREATE TABLE user_info
(
user_id varchar(45) NOT NULL,
user_type varchar(1) NOT NULL,
first_name varchar(45) NOT NULL,
middle_name varchar(45),
last_name varchar(45) NOT NULL,
email varchar(320) NOT NULL,
phone varchar(10),
phone_country_code varchar(10),
address varchar(225),
preferred_city varchar(10) NOT NULL,
CONSTRAINT pk_user PRIMARY KEY (user_id,user_type),
CONSTRAINT phone_countrycode_constraint CHECK  
(
    CASE
        WHEN phone IS NOT NULL AND phone_country_code IS NOT NULL THEN 1
        ELSE 0
    END = 1
),
FOREIGN KEY (user_id) REFERENCES user_accounts(user_id)
);
_____________________________________
insert into user_info
(
user_id,
user_type,
first_name,
middle_name,
last_name,
email,
phone,
phone_country_code,
address,
preferred_city)
values (
'sankalp1',
'L',
'sankalp',
'JaiSurya',
'bhatt',
'sankalpbhatt123@gmail.com',
'7354960616',
'+91',
'DB OZONE',
'Mumbai')