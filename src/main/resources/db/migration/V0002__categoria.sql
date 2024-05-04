CREATE TABLE public.categoria
(
    id serial NOT NULL,
    descricao character varying(80) NOT NULL,
    CONSTRAINT pk_id_categoria PRIMARY KEY (id)
);