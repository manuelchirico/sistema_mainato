-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 08, 2023 at 12:41 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mainato`
--

-- --------------------------------------------------------

--
-- Table structure for table `calcado`
--

CREATE TABLE `calcado` (
  `ID` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Para` varchar(50) NOT NULL,
  `Tamanho` float NOT NULL,
  `Preco` float NOT NULL,
  `Quantidade` int(30) NOT NULL,
  `ValorVenda` float DEFAULT 0,
  `Venda` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `calcado`
--

INSERT INTO `calcado` (`ID`, `Nome`, `Para`, `Tamanho`, `Preco`, `Quantidade`, `ValorVenda`, `Venda`) VALUES
(1, 'jordan', 'Femenino ', 12, 13, 74, 247, '2023-05-08'),
(5, 'nike', 'Masculino', 12, 1200, 10, 0, NULL),
(6, 'rock', 'Masculino', 45, 300, 203, 0, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `ID` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Senha` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`ID`, `Nome`, `Senha`) VALUES
(1, 'mainato', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `calcado`
--
ALTER TABLE `calcado`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `Para` (`Nome`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `calcado`
--
ALTER TABLE `calcado`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
