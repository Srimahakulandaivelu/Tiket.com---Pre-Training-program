alter table student
    add column graduated boolean;

update student
set graduated = FALSE;