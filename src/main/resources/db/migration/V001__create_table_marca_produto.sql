CREATE SEQUENCE SEQ_MARCA_PRODUTO
  START WITH 1
  INCREMENT BY 1
  NO MINVALUE
  NO MAXVALUE
  CACHE 1;

CREATE TABLE MARCA_PRODUTO (
    id INTEGER DEFAULT nextval('SEQ_MARCA_PRODUTO'),
    DESCRICAO VARCHAR(60) NOT NULL,

    CONSTRAINT PK_MARCA_PRODUTO PRIMARY KEY (ID)
);
