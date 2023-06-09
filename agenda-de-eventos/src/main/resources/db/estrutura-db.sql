-- CRIAÇÃO DO BANCO DE DADOS
CREATE DATABASE agenda_eventos_db
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

-- CRIAÇÃO DAS TABELAS

-- Tabela Usuários
CREATE TABLE USUARIOS (
  ID SERIAL PRIMARY KEY,
  NOME VARCHAR(50) NOT NULL,
  EMAIL VARCHAR(100) NOT NULL UNIQUE,
  TELEFONE VARCHAR(14) NOT NULL UNIQUE,
  CPF VARCHAR(11) NOT NULL UNIQUE
);

-- Tabela Endereco
CREATE TABLE ENDERECO (
  ID SERIAL PRIMARY KEY,
  ESTADO VARCHAR(20) NOT NULL,
  CIDADE VARCHAR(50) NOT NULL,
  RUA VARCHAR(150) NOT NULL,
  NUMERO VARCHAR(5) NOT NULL,
  PONTO_DE_REFERENCIA VARCHAR(255)
);

-- Tabela Bandas
CREATE TABLE BANDAS (
  ID SERIAL PRIMARY KEY,
  NOME VARCHAR(50) NOT NULL,
  EMAIL VARCHAR(100) NOT NULL UNIQUE,
  DESCRICAO VARCHAR(255),
  TELEFONE VARCHAR(14) NOT NULL UNIQUE,
  CPF_CNPJ VARCHAR(18) NOT NULL UNIQUE
);

-- Tabela Agenda
CREATE TABLE AGENDA (
  ID SERIAL PRIMARY KEY,
  BANDA_ID INT NOT NULL,
  DATA DATE,
  HORARIO_INICIO TIMESTAMP WITH TIME ZONE,
  HORARIO_TERMINO TIMESTAMP WITH TIME ZONE
);

-- Tabela Eventos
CREATE TABLE EVENTOS (
  ID SERIAL PRIMARY KEY,
  BANDA_ID INT NOT NULL,
  DATA DATE,
  HORARIO_INICIO TIMESTAMP WITH TIME ZONE,
  HORARIO_TERMINO TIMESTAMP WITH TIME ZONE
);

-- ADICIOANNDO RELACIONAMENTO

-- Adicionar coluna ENDERECO_ID na tabela Usuarios
ALTER TABLE USUARIOS
ADD COLUMN ENDERECO_ID INT NOT NULL,
ADD FOREIGN KEY (ENDERECO_ID) REFERENCES ENDERECO(ID);

-- Adicionar coluna ENDERECO_ID na tabela Eventos
ALTER TABLE EVENTOS
ADD COLUMN ENDERECO_ID INT NOT NULL,
ADD FOREIGN KEY (ENDERECO_ID) REFERENCES ENDERECO(ID);

-- Adicionar coluna Banda_ID na tabela Agenda
ALTER TABLE AGENDA
ADD FOREIGN KEY (BANDA_ID) REFERENCES BANDAS(ID);

-- Adicionar coluna Banda_ID na tabela Eventos
ALTER TABLE EVENTOS
ADD FOREIGN KEY (BANDA_ID) REFERENCES BANDAS(ID);





