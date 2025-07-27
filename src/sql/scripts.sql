CREATE TABLE request(
	id 				UUID 			PRIMARY KEY,
	request_date 	DATE 			NOT  NULL,
	client_name 	VARCHAR(100) 	NOT NULL,
	request_value 	NUMERIC(10,2) 	NOT NULL,
	description 	TEXT 			NOT NULL,
	status 			VARCHAR(20) 	NOT NULL

);

INSERT INTO request(id, request_date, 
client_name, request_value, description
, status) VALUES
(gen_random_uuid(), '2025-07-26', 'Ana Marie', 1000.00, 'Workspace material shopping', 'SENT');

SELECT * FROM request
ORDER BY request_date;
