-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 25-Jun-2024 às 22:26
-- Versão do servidor: 10.4.22-MariaDB
-- versão do PHP: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `guilbert`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `guilberts`
--

CREATE TABLE `guilberts` (
  `id` int(11) NOT NULL,
  `nome` varchar(40) DEFAULT NULL,
  `cpf` varchar(40) DEFAULT NULL,
  `idade` int(11) DEFAULT NULL,
  `altura` int(11) DEFAULT NULL,
  `turma` varchar(40) DEFAULT NULL,
  `dataCadastro` date DEFAULT NULL,
  `telefone` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `guilberts`
--

INSERT INTO `guilberts` (`id`, `nome`, `cpf`, `idade`, `altura`, `turma`, `dataCadastro`, `telefone`) VALUES
(1, 'Arthur', '12345678910', 18, 182, '3°D', '2024-06-25', 123456789),
(2, 'Arthur', '12345678910', 18, 182, '3°D', '2024-06-25', 123456789),
(3, 'Arthur', '12345678910', 18, 182, '3°D', '2024-06-25', 123456789),
(4, 'Flavio Guilbert', '12345678910', 18, 182, '3°D', '2024-06-25', 123456789),
(5, 'MARCOS', '12345678910', 18, 182, '3°D', '2024-06-25', 123456789),
(6, 'MARCOS', '12345678910', 18, 182, '3°D', '2024-06-25', 123456789),
(7, 'MARCOS', '12345678910', 18, 182, '3°D', '2024-06-25', 123456789),
(8, 'MARCOS', '12345678910', 18, 182, '3°D', '2024-06-25', 123456789),
(9, 'MARCOS', '12345678910', 18, 182, '3°D', '2024-06-25', 123456789),
(10, 'MARCOS', '12345678910', 18, 182, '3°D', '2024-06-25', 123456789);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `guilberts`
--
ALTER TABLE `guilberts`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `guilberts`
--
ALTER TABLE `guilberts`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
