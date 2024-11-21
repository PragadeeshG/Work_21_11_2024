create table if not exists platform_tokens(
token_code Integer not null,
base_app_id Integer null,
platform_name varchar(255) null,
os_name varchar(255) null,
virtual_env_available varchar(255) null,
virtual_machine_type varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint platform_tokens_pk primary key(token_code));