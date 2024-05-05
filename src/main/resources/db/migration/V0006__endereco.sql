CREATE TABLE public.endereco
(
    id serial NOT NULL,
    rua_logradouro character varying(80) NOT NULL,
	cep character varying(12) NOT NULL,
	numero character varying(20) NOT NULL,
	complemento character varying(180),
	bairro character varying(180) NOT NULL,
	uf character varying(80) NOT NULL,
	cidade character varying(80) NOT NULL,
	tipo_endereco character varying(20) NOT NULL,
	pessoa_id integer not null,
	
    CONSTRAINT pk_id_endereco PRIMARY KEY (id),
	CONSTRAINT fk_endereco_pessoa FOREIGN KEY (pessoa_id) REFERENCES pessoa_fisica(id)
);