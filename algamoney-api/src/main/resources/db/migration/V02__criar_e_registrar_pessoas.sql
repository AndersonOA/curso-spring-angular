CREATE TABLE pessoa (
  codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
  nome VARCHAR(100) NOT NULL,
  ativo BOOLEAN NOT NULL,
  logradouro VARCHAR(100),
  numero VARCHAR(10),
  complemento VARCHAR(50),
  bairro VARCHAR(80),
  cep VARCHAR(10),
  cidade VARCHAR(100),
  estado VARCHAR(2)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ("Anderson O. Aristides", true, "Rua Eduardo Carlos Pereira", "4125", "Apto 22 BL 11A", "Portão", "81.020-235", "Curitiba", "PR");
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ("Luzia Aristides", false, "Rua Eduardo Carlos Pereira", "4125", "Apto 22 BL 11A", "Portão", "81.020-235", "Curitiba", "PR");
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ("Luciana Aristides", true, "Rua Domingos Ferreira de Quadros", "412", "Casa", "86.480-000", "Centro", "Conselheiro Mairinck", "PR");
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ("Rondineli Lima", false, "Av. Deputado José Afonso", "1112", "Casa", "86.480-000",  "Centro", "Conselheiro Mairinck", "PR");
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ("Rafael Fernando Machado", false, "Rua Figueira", "3342", "Casa", "84.900-000",  "Amorinha", "Figueira", "PR");
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ("Filipe Prestes", true, "Rua Academia XV", "93", "Apto 32", "81.480-000",  "Portão", "Curitiba", "PR");
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ("Edmilson Alves dos Reis", true, "Rua Das Carmelitas", "24", "Casa", "81.320-000",  "Boqueirão", "Curitiba", "PR");
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ("Osvaldo Berg Junior", true, "Rua 7 de Setembro", "100", "Casa", "81.970-000",  "Novo Mundo", "Curitiba", "PR");
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ("Luizinho", true, "Rua 7 de Setembro", "100", "Casa", "81.970-430",  "Novo Mundo", "Curitiba", "PR");
INSERT INTO pessoa (nome, ativo, logradouro, numero, complemento, bairro, cep, cidade, estado) VALUES ("Cesar Daniel", true, "Rua Das Abobrinhas", "1200", "Casa", "81.230-000",  "Novo Mundo", "Curitiba", "PR");
