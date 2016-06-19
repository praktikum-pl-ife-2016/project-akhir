-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2016 at 04:03 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.6.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `databuku`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `Judul` varchar(30) NOT NULL,
  `Pengarang` varchar(30) NOT NULL,
  `Penerbit` varchar(20) NOT NULL,
  `Tahun Terbit` varchar(5) NOT NULL,
  `Katagori` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`Judul`, `Pengarang`, `Penerbit`, `Tahun Terbit`, `Katagori`) VALUES
('Anatomi Manusia', 'dr. Abraham', 'Terbit Terang ', '2008', 'IPA'),
('Biologi', 'Denny', 'Gramedia', '2014', 'IPA'),
('Cerita Anak Kancil', '', '', '1997', 'Umum'),
('Comic X-Men : The Apocolype', 'Marvel', 'Marvel', '2014', 'Umum'),
('Comp. Organizatio & Architec', 'William Stallings', 'Prentice Hall', '2013', 'IPA'),
('English For IT', 'Maja Olejniczak', 'PEARSON', '2013', 'Umum'),
('Ilmu Administasi Publik', 'Marinta, SAP, M.M', 'Erlangga', '2010', 'IPS'),
('Ilmu Akuntansi', 'Ngesthi Makarti S.Pd, S.E', 'Ganesa', '2013', 'IPS'),
('Ilmu Perbankan', 'Susi Suharti S.E', 'Ganesha', '2014', 'IPS'),
('Matematika Komputasi Lanjut', 'Linguard S.T, M.T', 'Gramedia Indonesia', '2010', 'IPA'),
('Pemrograman Java', 'Y. Daniel Liang', 'Pearson', '2014', 'IPA');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD UNIQUE KEY `Judul Buku` (`Judul`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
