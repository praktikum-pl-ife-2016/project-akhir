-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2016 at 11:39 AM
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
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `Nama` varchar(40) NOT NULL,
  `NIM` varchar(30) NOT NULL,
  `Jenis Kelamin` varchar(20) NOT NULL,
  `Fakultas` varchar(30) NOT NULL,
  `Jurusan` varchar(30) NOT NULL,
  `Angkatan` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`Nama`, `NIM`, `Jenis Kelamin`, `Fakultas`, `Jurusan`, `Angkatan`) VALUES
('Lionel Messi', '135120709887099', 'Laki-Laki', 'Fakultas Kedokteran', 'Pendidikan Dokter', '2013'),
('Paulina Vengeful', '145140555089777', 'Perempuan', 'Fakultas Ilmu Adsministrasi', 'Administrasi Perbankan', '2014'),
('Gede Ari Mahendra Mardaningrat', '155150200111055', 'Laki-Laki', 'Fakultas Ilmu Komputer', 'Teknik Informatika', '2015'),
('Muhammad Ridwan', '155150200111057', 'Laki-Laki', 'Fakultas Ilmu Komputer ', 'Informatika', '2015'),
('Christiano Ronaldo', '155150200111097', 'Laki-Laki', 'Fakultas Ilmu Komputer', 'Teknik Informatika', '2015'),
('Rasio Ganang Atmaja', '155150201111083', 'Laki Laki', 'Ilmu Komputer', 'Teknik Informatika', '2015');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`NIM`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
