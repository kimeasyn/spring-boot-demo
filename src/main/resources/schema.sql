create table test_user
(
    idx        integer
        constraint test_user_pk
            primary key,
    first_name varchar,
    last_name  varchar
);