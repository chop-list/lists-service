CREATE TABLE ChList
(id IDENTITY PRIMARY KEY AUTO_INCREMENT,
 name VARCHAR(30) NOT NULL,
 description VARCHAR(250),
 last_updated TIMESTAMP AS CURRENT_TIMESTAMP(),
 created TIMESTAMP);

COMMIT;