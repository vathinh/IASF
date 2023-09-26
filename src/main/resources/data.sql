-- Insert data into the 'departments' table
INSERT INTO departments (name, description) VALUES
                                                ('HR', 'Human Resources Department'),
                                                ('IT', 'Information Technology Department'),
                                                ('Finance', 'Finance and Accounting Department');


-- Insert data into the 'staffs' table
INSERT INTO staffs (name, password, onboard, salary, isAdmin, departmentId) VALUES
                                                                                ('John Doe', 'password123', '2023-09-25', 5000.00, true, 1),
                                                                                ('Alice Smith', 'pass@word456', '2023-09-26', 5500.00, false, 2),
                                                                                ('Bob Johnson', 'securePwd', '2023-09-27', 4800.00, false, 1),
                                                                                ('Eve Davis', '12345678', '2023-09-28', 6000.00, true, 3);
