CREATE TABLE FORM (
	FORM_ID SERIAL PRIMARY KEY,
	OWNER VARCHAR(16) NOT NULL,
	TITLE VARCHAR(64) NOT NULL,
	DATE DATE NOT NULL
);

CREATE TABLE PROMPT (
        PROMPT_ID SERIAL PRIMARY KEY,
        FORM_ID INT NOT NULL,
        PROMPT VARCHAR(128) NOT NULL,
        
        CONSTRAINT FORM_ID_FK FOREIGN KEY(FORM_ID) REFERENCES FORM(FORM_ID)
);

