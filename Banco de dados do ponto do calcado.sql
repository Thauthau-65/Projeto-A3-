-- ===============================
-- PARTE 1: Criação do Banco de Dados
-- ===============================

CREATE DATABASE Ponto_Do_Calcado;

-- ===============================
-- PARTE 2: Selecionar o Banco de Dados
-- ===============================

USE Ponto_Do_Calcado;

-- ===============================
-- PARTE 3: Criar Tabela Usuario
-- ===============================

CREATE TABLE USUARIO (
nome_usuario VARCHAR(50) NOT NULL,
id_usuario INTEGER PRIMARY KEY AUTO_INCREMENT,
email VARCHAR(50) NOT NULL,
senha VARCHAR(10) NOT NULL
);

USE USUARIO; 

-- ===============================
-- PARTE 3: Criar Tabela Pedido
-- ===============================

CREATE TABLE PEDIDO (
id_pedido INTEGER PRIMARY KEY AUTO_INCREMENT,
data DATETIME,
status VARCHAR(50) NOT NULL,
total_pedido DECIMAL(10,2),
FOREIGN KEY(id_usuario) REFERENCES USUARIO (id_usuario)
);

USE PEDIDO;

-- ===============================
-- PARTE 3: Criar Tabela Produto
-- ===============================

CREATE TABLE PRODUTO (
nome_produto VARCHAR(10) NOT NULL,
quantidade_saida INTEGER,
preco DECIMAL(10,2),
quantidade_entrada INTEGER,
id_produto INTEGER PRIMARY KEY AUTO_INCREMENT,
FOREIGN KEY(id_categoria) REFERENCES CATEGORIA (id_categoria)
);

USE PRODUTO;

-- ===============================
-- PARTE 3: Criar Tabela Itens Pedido
-- =============================== 

CREATE TABLE ITEM_PEDIDO (
id_item_pedido INTEGER PRIMARY KEY AUTO_INCREMENT,
quantidade INTEGER,
FOREIGN KEY(id_produto) REFERENCES PRODUTO (id_produto),
FOREIGN KEY(id_pedido) REFERENCES PEDIDO (id_pedido)
);

USE ITEM_PEDIDO;

CREATE TABLE Possuir (
id_produto INTEGER,
id_categoria INTEGER,
FOREIGN KEY(id_produto) REFERENCES PRODUTO (id_produto),
FOREIGN KEY(id_categoria) REFERENCES CATEGORIA (id_categoria)
);

USE Possuir;

CREATE TABLE Comprar (
id_produto INTEGER,
id_usuario INTEGER,
FOREIGN KEY(id_produto) REFERENCES PRODUTO (id_produto),
FOREIGN KEY(id_usuario) REFERENCES USUARIO (id_usuario)
);

USE Comprar;

CREATE TABLE Faz(
id_pedido INTEGER,
id_usuario INTEGER,
FOREIGN KEY(id_pedido) REFERENCES PEDIDO (id_pedido),
FOREIGN KEY(id_usuario) REFERENCES USUARIO (id_usuario)
);

USE Faz;

CREATE TABLE Conter (
id_item_pedido INTEGER,
id_pedido INTEGER,
FOREIGN KEY(id_item_pedido) REFERENCES ITEM_PEDIDO (id_item_pedido),
FOREIGN KEY(id_pedido) REFERENCES PEDIDO (id_pedido)
);

USE Conter;

CREATE TABLE Referese (
id_produto INTEGER,
id_item_pedido INTEGER,
FOREIGN KEY(id_produto) REFERENCES PRODUTO (id_produto),
FOREIGN KEY(id_item_pedido) REFERENCES ITEM_PEDIDO (id_item_pedido)
);

USE Referese;

-- ===============================
-- PARTE 4: Resultado dos Dados
-- =============================== 

SELECT * FROM Usuario;
SELECT * FROM Categoria;
SELECT * FROM Produto;
SELECT * FROM Pedido;
SELECT * FROM Item_Pedido;

-- ===============================
-- PARTE 5: Teste de Conexão
-- =============================== 

-- Buscar todos os pedidos de um usuário específico
SELECT * FROM PEDIDO WHERE id_usuario = 1;

-- Listar todos os produtos de uma categoria
SELECT * FROM PRODUTO WHERE id_categoria = 1; -- Maquiagem

-- Ver todos os itens de um pedido
SELECT * FROM ITEM_PEDIDO WHERE id_pedido = 1;

