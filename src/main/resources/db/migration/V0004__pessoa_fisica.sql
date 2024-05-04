CREATE TABLE pessoa_fisica
(
    id serial NOT NULL,
    nome_contato character varying(80),
    email character varying(150),
    telefone character varying(20),
    cpf character varying(15),
    data_nascimento date,
    CONSTRAINT pk_id_pessoa_fisica PRIMARY KEY (id)
)