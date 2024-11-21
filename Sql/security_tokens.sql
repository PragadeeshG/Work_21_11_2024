create table if not exists security_tokens(
token_code Integer not null,
token_type varchar(255) null,
token_name varchar(255) null,
token_description varchar(255) null,
authorizer_id bigint null,
owner varchar(255) null,
token_definition varchar(255) null,
secure_score bigint null,
creation_date varchar(255) null,
modified_date varchar(255) null,
constraint security_tokens_pk primary key(token_code));