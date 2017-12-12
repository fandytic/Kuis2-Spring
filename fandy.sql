-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 12 Des 2017 pada 15.40
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fandy`
--
CREATE DATABASE IF NOT EXISTS `fandy` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `fandy`;

-- --------------------------------------------------------

--
-- Struktur dari tabel `cv_1025`
--

CREATE TABLE `cv_1025` (
  `id` bigint(20) NOT NULL,
  `name` varchar(100) NOT NULL,
  `nilai` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Struktur dari tabel `nilai_1025`
--

CREATE TABLE `nilai_1025` (
  `id` bigint(20) NOT NULL,
  `matkul` varchar(150) NOT NULL,
  `name` varchar(150) NOT NULL,
  `nilai_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cv_1025`
--
ALTER TABLE `cv_1025`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_lxggjjg8eo846rlbdt7w8ehr8` (`name`);

--
-- Indexes for table `nilai_1025`
--
ALTER TABLE `nilai_1025`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKqg280gfe89krd6lpy50mjxef2` (`nilai_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cv_1025`
--
ALTER TABLE `cv_1025`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `nilai_1025`
--
ALTER TABLE `nilai_1025`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `nilai_1025`
--
ALTER TABLE `nilai_1025`
  ADD CONSTRAINT `FKqg280gfe89krd6lpy50mjxef2` FOREIGN KEY (`nilai_id`) REFERENCES `cv_1025` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
