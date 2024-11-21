create table if not exists platform_agnostic_tokens(
token_code Integer not null,
base_app_id Integer null,
platform_name varchar(255) null,
algorithm varchar(255) null,
agitlity varchar(255) null,
error_code bigint null,
error_severity varchar(255) null,
version_protocol varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint platform_agnostic_tokens_pk primary key(token_code));