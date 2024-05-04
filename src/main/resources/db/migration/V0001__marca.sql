CREATE TABLE public.marca
(
    id serial NOT NULL,
    descricao character varying(80) NOT NULL,
    CONSTRAINT pk_id_marca PRIMARY KEY (id)
);