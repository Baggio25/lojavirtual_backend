CREATE TABLE public.acesso
(
    id serial NOT NULL,
    descricao character varying(80) NOT NULL,
    CONSTRAINT pk_id_acesso PRIMARY KEY (id)
);