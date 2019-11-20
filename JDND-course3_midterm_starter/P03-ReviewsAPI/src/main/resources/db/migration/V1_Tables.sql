create table products (
    product_id int not null,
    product_name varchar(100) not null
    PRIMARY KEY (product_id)
);

create table comments (
    comment_id int not null,
    review_id int not null,
    comment varchar(500) not null
    PRIMARY KEY (comment_id)
);

create table reviews (
    review_id int not null,
    product_id int not null,
    review varchar(500)
    PRIMARY KEY (review_id)
);