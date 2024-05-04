CREATE TABLE pessoa_juridica
(
    id serial NOT NULL,
    nome_contato character varying(80),
    email character varying(150),
    telefone character varying(20),
    cnpj character varying(15),
    inscricao_estadual character varying(40),
	inscricao_municipal character varying(40),
	nome_fantasia character varying(100),
	razao_social character varying(150),
	categoria character varying(40),
		
    CONSTRAINT pk_id_pessoa_juridica PRIMARY KEY (id)
)