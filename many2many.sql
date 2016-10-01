CREATE TABLE project (
	proid INT PRIMARY KEY,
	proname VARCHAR(20) NOT NULL
);

CREATE TABLE employee (
	empid INT PRIMARY KEY,
	empname VARCHAR(20)
);

CREATE TABLE proemp (
	rproid INT, 
	rempid INT
);

ALTER TABLE proemp ADD CONSTRAINT fk_rproid FOREIGN KEY (rproid) REFERENCES project(proid);
ALTER TABLE proemp ADD CONSTRAINT fk_rempid FOREIGN KEY (rempid) REFERENCES employee(empid);