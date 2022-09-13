use akash;
drop table employee_table;
drop table department_table;

#creating department table
create table department_table(
department_id int primary key unique,
department_name varchar(20),
department_head varchar(20),
department_description varchar(20)
); 
#creating employee table
create table employee_table(
employee_id int primary key unique,
employee_name varchar(20),
employee_salary numeric(10,2) check (employee_salary>=1000 and employee_salary<=1000000),
employee_contactNo bigint unique,
employee_address varchar(20),
dept_id int, foreign key employee_table(dept_id) references department_table(department_id) 
);

select * from employee_table;

select employee_id, employee_name, employee_contactNo, employee_salary, count(department_id) from employee_table,department_table where department_id=99;
select employee_id, employee_name, employee_contactNo, employee_address, department_name, department_head, count(department_id) from employee_table,department_table;
