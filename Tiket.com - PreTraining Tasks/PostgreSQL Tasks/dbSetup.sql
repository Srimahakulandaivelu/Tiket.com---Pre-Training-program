CREATE TABLE student (
                         id int primary key,
                         name varchar(100),
                         email varchar(100),
                         phone varchar(15)
);

CREATE TABLE address(
                        student_id int primary key,
                        street varchar(100),
                        city varchar(50),
                        state varchar(50),
                        foreign key (student_id) references student(id) on delete cascade
);

CREATE TABLE course(
                       id int primary key,
                       name varchar(100),
                       description varchar(255)
);

CREATE TABLE enrollment(
                           student_id int,
                           course_id int,
                           primary key(student_id, course_id),
                           foreign key(student_id) references student(id) on delete cascade,
                           foreign key(course_id) references course(id) on delete cascade
);

CREATE TABLE marks(
                      student_id int,
                      course_id int,
                      score int,
                      primary key(student_id, course_id),
                      foreign key(student_id) references student(id) on delete cascade,
                      foreign key(course_id) references course(id) on delete cascade
);

INSERT INTO student VALUES
                        (1,'Arun','arun@gmail.com','9876543210'),
                        (2,'Priya','priya@gmail.com','9123456789'),
                        (3,'Rahul','rahul@gmail.com','9988776655');

INSERT INTO address VALUES
                        (1,'MG Road','Chennai','Tamil Nadu'),
                        (2,'Anna Nagar','Chennai','Tamil Nadu'),
                        (3,'Park Street','Coimbatore','Tamil Nadu');

INSERT INTO course VALUES
                       (101,'MongoDB','NoSQL Database'),
                       (102,'Java','Programming Language'),
                       (103,'Python','Programming Language');

INSERT INTO eCREATE TABLE student (
  id int primary key,
  name varchar(100),
  email varchar(100),
  phone varchar(15)
);

CREATE TABLE address(
                        student_id int primary key,
                        street varchar(100),
                        city varchar(50),
                        state varchar(50),
                        foreign key (student_id) references student(id) on delete cascade
);

CREATE TABLE course(
                       id int primary key,
                       name varchar(100),
                       description varchar(255)
);

CREATE TABLE enrollment(
                           student_id int,
                           course_id int,
                           primary key(student_id, course_id),
                           foreign key(student_id) references student(id) on delete cascade,
                           foreign key(course_id) references course(id) on delete cascade
);

CREATE TABLE marks(
                      student_id int,
                      course_id int,
                      score int,
                      primary key(student_id, course_id),
                      foreign key(student_id) references student(id) on delete cascade,
                      foreign key(course_id) references course(id) on delete cascade
);

INSERT INTO student VALUES
                        (1,'Arun','arun@gmail.com','9876543210'),
                        (2,'Priya','priya@gmail.com','9123456789'),
                        (3,'Rahul','rahul@gmail.com','9988776655');

INSERT INTO address VALUES
                        (1,'MG Road','Chennai','Tamil Nadu'),
                        (2,'Anna Nagar','Chennai','Tamil Nadu'),
                        (3,'Park Street','Coimbatore','Tamil Nadu');

INSERT INTO course VALUES
                       (101,'MongoDB','NoSQL Database'),
                       (102,'Java','Programming Language'),
                       (103,'Python','Programming Language');

INSERT INTO enrollment VALUES
                           (1,101),
                           (1,102),
                           (2,101);

INSERT INTO marks VALUES
                      (1,101,95),
                      (1,102,88),
                      (2,101,91);nrollment VALUES
                           (1,101),
                           (1,102),
                           (2,101);

INSERT INTO marks VALUES
                      (1,101,95),
                      (1,102,88),
                      (2,101,91);