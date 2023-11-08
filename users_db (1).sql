-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 07, 2023 at 12:42 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `users_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `crud`
--

CREATE TABLE `crud` (
  `id` int(11) NOT NULL,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `username` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `phoneno` int(50) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `manager` varchar(100) NOT NULL,
  `project` varchar(50) NOT NULL,
  `due` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `crud`
--

INSERT INTO `crud` (`id`, `firstname`, `lastname`, `username`, `email`, `phoneno`, `gender`, `manager`, `project`, `due`) VALUES
(1, 'Jaydee', 'Victorino', 'AL4k4Z4M', 'al4k4z4m@web.net', 223325776, 'Male', 'Unknown', 'Tyrant virus', '2023-12-31'),
(2, 'Jazrel', 'Mendoza', 'Jazz', 'jazrelmendoza69@gmail.com', 987654321, 'Male', 'Michael V.', 'Parallax Web', '2024-01-31'),
(3, 'Fernando', 'Santiago', 'Juanito', 'jazrelmendoza69@gmail.com', 987654321, 'Male', 'Bill Gates', 'Microsoft', '2023-12-30'),
(4, 'John', 'Wick', 'Babayaga', 'boogeyman@gmail.com', 223443776, 'Male', 'Winston', 'Project X', '2023-11-01'),
(5, 'Jeydee', 'Dash', 'Alakazam', 'alakazam@yahoo.com', 905873624, 'Male', 'Myself', 'Unknown', '3000-11-06'),
(6, 'Zoro', 'Roronoa', 'KingofHell', 'zoroGotLost@gmail.com', 472838357, 'Male', 'Luffy', 'Defeat Kaido', '2023-11-22'),
(7, 'Reigne', 'Rage', 'Rain Rage\r\n', 'RainRageTheft@gmal.com\r\n', 222444555, 'Female', 'Unknown', 'Theft v2', '2023-11-30'),
(8, 'Liam', 'Miller', 'Limbo', 'Limbomiller@gmail.com', 777668345, 'Male', 'Charlie', 'Kidnap', '2023-12-01'),
(9, 'Louise', 'Adams', 'CL4W', 'andale@aol.com ', 643456834, 'Female', 'Al4k4Z4M', 'Drug trafficking', '2023-12-25'),
(10, 'Harry', 'Manson', 'L364CY', 'uncle@sbcglobal.net ', 996462345, 'Male', 'AL4K4Z4M', 'Murder', '2023-12-31'),
(11, 'Mike', 'Bailey', '7R1N17Y', 'lamky@hotmail.com ', 623466984, 'Male', 'C0MPL3X', 'Donation', '2023-12-31'),
(12, 'Lexi', 'Winston', 'L3X', 'l3x_heiser66@yahoo.com ', 623684568, 'Female', 'Shade ', 'Clothing', '2023-11-10'),
(13, 'Sasha', 'Carter', '70RP3D0', 'kerem_rahn@hotmail.com  ', 362458124, 'Female', '4N0NYM0U5', 'Fund Raising', '2023-11-17');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(50) NOT NULL,
  `address` varchar(100) NOT NULL,
  `gender` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `firstname`, `lastname`, `email`, `username`, `password`, `address`, `gender`) VALUES
(2, '123', '123', '123', '123', '123', '123', 'Male'),
(3, 'Dylan', 'Bernal', 'dylanbernal08@gmail.com', 'Sooyaa', 'sooya123', 'Brgy. Tramo Naic, Cavite', 'Male'),
(4, 'Emman', 'Ybarola', 'emman123@gmail.com', 'Emman', '12345', 'bastadyanlang', 'Male'),
(5, 'John Dave', 'Victorino', 'alakazam06@gmail.com', 'Jeydee', 'alakazam06', 'Uknown', 'Male'),
(6, 'Naruto', 'Uzumaki', 'kyubi9@gmail.com', 'Hokage07', 'thisismyninjaway', 'Leaf Village', 'Male');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `crud`
--
ALTER TABLE `crud`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `crud`
--
ALTER TABLE `crud`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
