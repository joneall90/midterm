create table products (
    product_id int not null,
    product_name varchar(100) not null
);

create table comments (
    comment_id int not null,
    review_id int not null,
    comment varchar(500) not null
);

create table reviews (
    review_id int not null,
    product_id int not null,
    review varchar(500)
);