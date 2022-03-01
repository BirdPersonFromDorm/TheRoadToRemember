drop
database theroadtoremember;
create
database theroadtoremember;

use
theroadtoremember;

create table user
(
    user_id  int not null auto_increment,
    email    varchar(40) UNIQUE,
    password varchar(40),
    primary key (user_id)
);

create table role
(
    role_id int not null auto_increment,
    name    varchar(40) UNIQUE,
    primary key (role_id)
);

create table user_role
(
    user_id int,
    role_id int
);

create table en_word
(
    en_word_id int not null auto_increment,
    meaning    varchar(150) UNIQUE,
    primary key (en_word_id)
);

create table ru_word
(
    ru_word_id int not null auto_increment,
    meaning    varchar(150) UNIQUE,
    primary key (ru_word_id)
);

create table card
(
    card_id    int not null auto_increment,
    rating     int,
    ru_word_id int,
    en_word_id int,
    image_id   int,
    primary key (card_id)
);

create table image
(
    image_id          int not null auto_increment,
    name              varchar(45),
    original_filename varchar(45),
    content_type      varchar(45),
    size              bigint(20),
    bytes             longblob,
    primary key (image_id)
);

alter table card
    Add constraint
        FK_card_ru_word_id foreign key (ru_word_id)
            references ru_word (ru_word_id)
            ON UPdate cascade
            ON delete set null;

alter table card
    Add constraint
        FK_card_en_word_id foreign key (en_word_id)
            references en_word (en_word_id)
            ON UPdate cascade
            ON delete set null;

alter table user_role
    Add constraint
        FK_user_role_role foreign key (role_id)
            references role (role_id)
            ON UPdate cascade
            ON delete set null;

alter table user_role
    Add constraint
        FK_user_role_User foreign key (user_id)
            references user (user_id)
            ON UPdate cascade
            ON delete set null;

alter table card
    Add constraint
        FK_card_image_id foreign key (image_id)
            references image (image_id)
            ON UPdate cascade
            ON delete set null;

INSERT INTO user
    (email, password)
VALUES ("rmelinevskiy@gmail.com", "12345"),
       ("miha@gmail.com", "12345");

INSERT INTO role
    (name)
VALUES ("USER"),
       ("MANAGER"),
       ("ADMIN");

INSERT INTO user_role
    (user_id, role_id)
VALUES (1, 1),
       (2, 3);

INSERT INTO en_word
    (meaning)
VALUES ("some"),
       ("something");

INSERT INTO ru_word
    (meaning)
VALUES ("что-то"),
       ("что-то вещественное");

INSERT INTO card
    (rating, ru_word_id, en_word_id)
VALUES (11, 1, 1),
       (20, 2, 2);



