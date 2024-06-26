-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 26, 2024 at 12:27 PM
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
-- Database: `hospital_management_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `login_infor`
--

CREATE TABLE `login_infor` (
  `User_id` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `User` varchar(50) DEFAULT NULL,
  `Date_time` varchar(50) DEFAULT NULL,
  `login_and_logout` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login_infor`
--

INSERT INTO `login_infor` (`User_id`, `Password`, `User`, `Date_time`, `login_and_logout`) VALUES
('5', '2', 'Doctor', '24-05-2024 20:15:08', 'Login'),
('2525', '2525', 'Doctor', '24-05-2024 20:16:14', 'Login'),
('2525', '2525', 'Doctor', '24-05-2024 20:46:28', 'Login'),
('2525', '2525', 'Doctor', '24-05-2024 21:01:12', 'Login'),
('2525', '2525', 'Doctor', '25-05-2024 18:52:29', 'Login'),
('2525', '2525', 'Doctor', '25-05-2024 18:54:14', 'Login'),
('2525', '2525', 'Doctor', '25-05-2024 18:56:46', 'Login'),
('2525', '2525', 'Doctor', '25-05-2024 19:00:36', 'Login'),
('2525', '2525', 'Doctor', '25-05-2024 19:05:47', 'Login'),
('2525', '2525', 'Doctor', '25-05-2024 19:06:41', 'Login'),
('2525', '2525', 'Doctor', '25-05-2024 19:11:17', 'Login'),
('2525', '2525', 'Doctor', '25-05-2024 19:12:19', 'Login'),
('2525', '2525', 'Doctor', '26-05-2024 10:31:47', 'Login'),
('2525', '2525', 'Doctor', '26-05-2024 11:40:14', 'Login'),
('2525', '2525', 'Doctor', '26-05-2024 22:17:40', 'Login'),
('2525', '2525', 'Doctor', '26-05-2024 22:20:51', 'Login'),
('2525', '2525', 'Doctor', '26-05-2024 22:26:03', 'Login'),
('2525', '2525', 'Doctor', '26-05-2024 22:27:29', 'Login'),
('2525', '2525', 'Doctor', '26-05-2024 22:36:51', 'Login'),
('2525', '2525', 'Doctor', '27-05-2024 09:31:41', 'Login'),
('2525', '2525', 'Doctor', '27-05-2024 10:57:44', 'Login'),
('2525', '2525', 'Doctor', '27-05-2024 11:01:59', 'Login'),
('2525', '2525', 'Doctor', '27-05-2024 11:30:26', 'Login'),
('2525', '2020', 'Doctor', '30-05-2024 15:32:07', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 15:32:16', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 15:37:08', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 15:49:46', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 15:51:58', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 15:53:10', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 15:53:41', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 15:56:00', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 15:57:06', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 15:58:16', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 15:59:04', 'Login'),
(NULL, '', 'Doctor', '30-05-2024 16:27:15', 'Logout'),
('2525', '2525', 'Doctor', '30-05-2024 16:28:46', 'Login'),
(NULL, '', 'Doctor', '30-05-2024 16:30:05', 'Logout'),
('2525', '2525', 'Doctor', '30-05-2024 16:30:11', 'Login'),
(NULL, '', 'Doctor', '30-05-2024 16:30:56', 'Logout'),
('2525', '2525', 'Doctor', '30-05-2024 16:31:02', 'Login'),
(NULL, '', 'Doctor', '30-05-2024 16:32:07', 'Logout'),
('2525', '2525', 'Doctor', '30-05-2024 16:32:11', 'Login'),
(NULL, '', 'Doctor', '30-05-2024 16:33:36', 'Logout'),
('2525', '2525', 'Doctor', '30-05-2024 16:33:40', 'Login'),
(NULL, '', 'Doctor', '30-05-2024 16:34:35', 'Logout'),
('2525', '2525', 'Doctor', '30-05-2024 16:34:41', 'Login'),
(NULL, '', 'Doctor', '30-05-2024 16:36:39', 'Logout'),
('2525', '2525', 'Doctor', '30-05-2024 16:36:44', 'Login'),
(NULL, '', 'Doctor', '30-05-2024 16:37:28', 'Logout'),
('2525', '2525', 'Doctor', '30-05-2024 16:37:33', 'Login'),
(NULL, '', 'Doctor', '30-05-2024 16:38:56', 'Logout'),
('2525', '2525', 'Doctor', '30-05-2024 16:39:02', 'Login'),
(NULL, '', 'Doctor', '30-05-2024 16:39:44', 'Logout'),
('2525', '2525', 'Doctor', '30-05-2024 16:39:49', 'Login'),
(NULL, '', 'Doctor', '30-05-2024 16:40:39', 'Logout'),
('2525', '2525', 'Doctor', '30-05-2024 16:40:46', 'Login'),
(NULL, '', 'Doctor', '30-05-2024 18:42:29', 'Logout'),
('2525', '2525', 'Doctor', '30-05-2024 18:42:36', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 18:44:10', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 18:45:56', 'Login'),
(NULL, '', 'Doctor', '30-05-2024 18:48:36', 'Logout'),
('2525', '2525', 'Doctor', '30-05-2024 18:48:40', 'Login'),
(NULL, '', 'Doctor', '30-05-2024 18:53:58', 'Logout'),
('2525', '2525', 'Doctor', '30-05-2024 18:54:05', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 21:32:49', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 21:33:55', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 21:35:08', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 21:36:20', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 21:38:09', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 21:41:07', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 21:50:16', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 22:10:34', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 22:11:14', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 22:11:49', 'Login'),
('2525', '2525', 'Doctor', '30-05-2024 22:12:39', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 00:05:31', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 01:08:48', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 01:09:14', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 01:11:16', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 01:11:52', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 01:18:42', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 01:20:00', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 01:20:59', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 01:21:39', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 01:22:59', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 01:23:29', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 01:24:14', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 01:30:15', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 01:40:10', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 01:52:21', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 01:52:59', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 01:54:41', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 01:55:42', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 01:57:10', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 01:57:55', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 02:00:08', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 02:06:50', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 02:07:38', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 02:14:46', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 02:20:03', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 02:22:32', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 02:25:22', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 02:26:28', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 02:29:55', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 02:32:40', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 02:34:17', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 02:35:57', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 02:40:22', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 02:41:41', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 02:42:39', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 02:46:03', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 02:49:15', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 02:50:59', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 02:53:14', 'Login'),
('2525', '', 'Doctor', '31-05-2024 02:53:45', 'Logout'),
('5050', '5050', 'Doctor', '31-05-2024 12:24:11', 'Login'),
('5050', '5050', 'Sister', '31-05-2024 12:24:20', 'Login'),
('5050', '', 'Doctor', '31-05-2024 12:24:55', 'Logout'),
('2525', '2525', 'Doctor', '31-05-2024 12:25:00', 'Login'),
('5050', '5050', 'Sister', '31-05-2024 12:29:03', 'Login'),
('5050', '5050', 'Sister', '31-05-2024 12:30:46', 'Login'),
('5050', '5050', 'Sister', '31-05-2024 12:36:58', 'Login'),
('5050', '5050', 'Sister', '31-05-2024 12:53:24', 'Login'),
('2525', '2525', 'Doctor', '31-05-2024 13:00:46', 'Login'),
('2525', '2525', 'Doctor', '02-06-2024 03:52:14', 'Login'),
('2525', '', 'Doctor', '02-06-2024 03:52:49', 'Logout'),
('5050', '5050', 'Sister', '02-06-2024 03:53:01', 'Login'),
('2525', '2525', 'Doctor', '02-06-2024 04:04:06', 'Login'),
(NULL, '', 'Sister', '02-06-2024 04:31:52', 'Logout'),
('5050', '5050', 'Sister', '02-06-2024 04:32:02', 'Login'),
(NULL, '', 'Sister', '02-06-2024 04:32:38', 'Logout'),
('5050', '5050', 'Sister', '02-06-2024 04:32:45', 'Login'),
(NULL, '', 'Sister', '02-06-2024 04:53:33', 'Logout'),
('5050', '5050', 'Sister', '02-06-2024 04:53:42', 'Login'),
('5050', '5050', 'Sister', '02-06-2024 04:55:37', 'Login'),
('5050', '5050', 'Sister', '02-06-2024 04:56:23', 'Login'),
('5050', '5050', 'Sister', '02-06-2024 04:59:28', 'Login'),
('5050', '5050', 'Sister', '02-06-2024 05:11:44', 'Login'),
(NULL, '', 'Sister', '02-06-2024 20:56:04', 'Logout'),
('2525', '2525', 'Doctor', '02-06-2024 20:56:10', 'Login'),
('2525', '', 'Doctor', '02-06-2024 20:56:27', 'Logout'),
(NULL, '', 'Sister', '02-06-2024 21:31:10', 'Logout'),
('2525', '2525', 'Doctor', '02-06-2024 21:31:15', 'Login'),
(NULL, '', 'Sister', '02-06-2024 21:36:40', 'Logout'),
('5050', '5050', 'Sister', '02-06-2024 21:36:48', 'Login'),
(NULL, '', 'Sister', '02-06-2024 21:57:26', 'Logout'),
('2525', '2525', 'Doctor', '02-06-2024 21:57:32', 'Login'),
('2525', '', 'Doctor', '02-06-2024 21:57:40', 'Logout'),
('5050', '5050', 'Sister', '02-06-2024 21:57:48', 'Login'),
(NULL, '', 'Sister', '02-06-2024 22:13:30', 'Logout'),
('5050', '5050', 'Sister', '02-06-2024 22:13:37', 'Login'),
(NULL, '', 'Sister', '02-06-2024 22:15:18', 'Logout'),
('5050', '5050', 'Sister', '02-06-2024 22:15:26', 'Login'),
('5050', '', 'Sister', '02-06-2024 22:16:38', 'Logout'),
(NULL, '', 'Sister', '03-06-2024 07:13:37', 'Logout'),
('5050', '5050', 'Sister', '03-06-2024 07:13:45', 'Login'),
('5050', '5050', 'Sister', '03-06-2024 07:31:18', 'Login'),
('5050', '5050', 'Sister', '03-06-2024 07:43:36', 'Login'),
('5050', '5050', 'Sister', '03-06-2024 07:46:03', 'Login'),
('5050', '5050', 'Sister', '03-06-2024 08:00:38', 'Login'),
('5050', '5050', 'Sister', '03-06-2024 08:01:12', 'Login'),
('5050', '5050', 'Sister', '03-06-2024 08:03:22', 'Login'),
('5050', '', 'Sister', '03-06-2024 08:03:40', 'Logout'),
('2525', '2525', 'Doctor', '03-06-2024 08:03:44', 'Login'),
('2525', '', 'Doctor', '03-06-2024 08:04:03', 'Logout'),
('2525', '2525', 'Doctor', '03-06-2024 08:43:13', 'Login'),
('2525', '2525', 'Doctor', '03-06-2024 08:49:42', 'Login'),
('100', '100', 'Pharmacy', '03-06-2024 11:04:10', 'Login'),
('100', '100', 'Pharmacy', '03-06-2024 11:05:01', 'Login'),
('100', '100', 'Pharmacy', '03-06-2024 11:09:41', 'Login'),
('100', '100', 'Pharmacy', '03-06-2024 11:10:01', 'Login'),
('2525', '2525', 'Doctor', '04-06-2024 07:58:15', 'Login'),
('2525', '', 'Doctor', '04-06-2024 07:58:35', 'Logout'),
('100', '100', 'Pharmacy', '04-06-2024 07:59:37', 'Login'),
('100', '100', 'Doctor', '04-06-2024 08:10:00', 'Login'),
('100', '100', 'Pharmacy', '04-06-2024 08:10:07', 'Login'),
('100', '100', 'Pharmacy', '04-06-2024 08:12:14', 'Login'),
('100', '100', 'Pharmacy', '04-06-2024 08:18:43', 'Login'),
('5050', '5050', 'Sister', '04-06-2024 08:21:28', 'Login'),
('5050', '5050', 'Sister', '04-06-2024 08:23:35', 'Login'),
('100', '100', 'Pharmacy', '04-06-2024 17:34:58', 'Login'),
('2525', '2525', 'Doctor', '04-06-2024 17:54:43', 'Login'),
('5050', '5050', 'Sister', '04-06-2024 18:22:56', 'Login'),
('5050', '5050', 'Sister', '04-06-2024 18:24:40', 'Login'),
('5050', '5050', 'Sister', '04-06-2024 18:25:14', 'Login'),
('5050', '5050', 'Sister', '04-06-2024 18:25:44', 'Login'),
('5050', '5050', 'Sister', '04-06-2024 19:02:39', 'Login'),
('5050', '5050', 'Sister', '04-06-2024 19:04:12', 'Login'),
('2525', '2525', 'Doctor', '04-06-2024 21:17:53', 'Login'),
('2525', '2525', 'Doctor', '04-06-2024 21:19:50', 'Login'),
('2525', '', 'Doctor', '04-06-2024 21:20:07', 'Logout'),
('5050', '5050', 'Sister', '04-06-2024 21:20:18', 'Login'),
('5050', '', 'Sister', '04-06-2024 21:20:33', 'Logout'),
('2525', '2525', 'Doctor', '04-06-2024 21:22:13', 'Login'),
('2525', '', 'Doctor', '04-06-2024 21:22:34', 'Logout'),
('2525', '2525', 'Doctor', '04-06-2024 21:24:51', 'Login'),
('2525', '', 'Doctor', '04-06-2024 21:25:00', 'Logout'),
('5050', '5050', 'Sister', '04-06-2024 21:25:08', 'Login'),
('5050', '5050', 'Sister', '04-06-2024 21:26:02', 'Login'),
('5050', '', 'Sister', '04-06-2024 21:26:19', 'Logout'),
('100', '100', 'Pharmacy', '04-06-2024 21:26:28', 'Login'),
('100', '100', 'Pharmacy', '04-06-2024 21:27:34', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 11:28:17', 'Login'),
('5050', '5050', 'Sister', '05-06-2024 11:29:16', 'Login'),
('100', '100', 'Pharmacy', '05-06-2024 11:30:31', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 11:51:26', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 11:56:02', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 11:56:50', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 11:58:52', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 12:01:00', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 12:01:40', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 12:02:30', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 12:03:22', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 12:04:27', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 12:05:32', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 12:06:34', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 12:10:07', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 12:12:59', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 12:16:16', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 12:20:34', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 12:22:25', 'Login'),
('5050', '5050', 'Sister', '05-06-2024 12:23:59', 'Login'),
('5050', '5050', 'Sister', '05-06-2024 12:26:28', 'Login'),
('5050', '5050', 'Sister', '05-06-2024 12:27:55', 'Login'),
('5050', '5050', 'Sister', '05-06-2024 12:29:54', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 13:33:44', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 13:34:33', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 13:36:43', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 13:54:50', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 14:02:10', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 14:03:13', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 14:04:42', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 14:05:26', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 14:07:09', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 14:07:39', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 14:08:34', 'Login'),
('2525', '2525', 'Doctor', '05-06-2024 14:09:28', 'Login'),
('5050', '5050', 'Sister', '05-06-2024 14:19:34', 'Login'),
('5050', '5050', 'Sister', '05-06-2024 14:20:34', 'Login'),
('5050', '5050', 'Sister', '05-06-2024 14:23:52', 'Login'),
('5050', '5050', 'Sister', '05-06-2024 14:28:12', 'Login'),
('5050', '5050', 'Sister', '05-06-2024 14:29:28', 'Login'),
('5050', '5050', 'Sister', '05-06-2024 14:31:48', 'Login'),
('100', '100', 'Pharmacy', '05-06-2024 15:14:38', 'Login'),
('100', '100', 'Pharmacy', '05-06-2024 15:16:54', 'Login'),
('100', '100', 'Pharmacy', '05-06-2024 15:17:38', 'Login'),
('100', '100', 'Pharmacy', '05-06-2024 15:25:14', 'Login'),
('100', '100', 'Pharmacy', '05-06-2024 15:28:32', 'Login'),
('100', '100', 'Pharmacy', '05-06-2024 15:30:24', 'Login'),
('100', '100', 'Pharmacy', '05-06-2024 15:31:51', 'Login'),
('100', '', 'Pharmacy', '05-06-2024 15:32:35', 'Logout'),
('2525', '2525', 'Doctor', '06-06-2024 14:00:08', 'Login'),
('100', '100', 'Pharmacy', '06-06-2024 16:23:51', 'Login'),
('100', '150', 'Pharmacy', '06-06-2024 16:24:00', 'Login'),
('100', '', 'Pharmacy', '06-06-2024 16:24:15', 'Logout'),
('2525', '2525', 'Doctor', '07-06-2024 19:17:30', 'Login'),
('2525', '2525', 'Doctor', '07-06-2024 19:54:40', 'Login'),
('2525', '2525', 'Doctor', '07-06-2024 19:57:06', 'Login'),
('2525', '2525', 'Doctor', '07-06-2024 20:02:24', 'Login'),
('2525', '2525', 'Doctor', '07-06-2024 20:04:03', 'Login'),
('2525', '2525', 'Doctor', '07-06-2024 20:07:11', 'Login'),
('2525', '2525', 'Doctor', '07-06-2024 20:22:41', 'Login'),
('2525', '2525', 'Doctor', '07-06-2024 20:29:21', 'Login'),
('2525', '2525', 'Doctor', '07-06-2024 20:30:17', 'Login'),
('2525', '2525', 'Doctor', '07-06-2024 20:30:43', 'Login'),
('2525', '', 'Doctor', '07-06-2024 20:31:43', 'Logout'),
('5050', '5050', 'Sister', '07-06-2024 20:31:57', 'Login'),
('2525', '2525', 'Doctor', '07-06-2024 20:37:34', 'Login'),
('2525', '', 'Doctor', '07-06-2024 20:37:39', 'Logout'),
('5050', '5050', 'Sister', '07-06-2024 20:37:48', 'Login'),
('2525', '2525', 'Doctor', '07-06-2024 20:43:43', 'Login'),
('2525', '', 'Doctor', '07-06-2024 20:44:00', 'Logout'),
('5050', '5050', 'Sister', '07-06-2024 20:44:07', 'Login'),
('5050', '', 'Sister', '07-06-2024 20:44:24', 'Logout'),
('100', '100', 'Pharmacy', '07-06-2024 20:44:30', 'Login'),
('100', '150', 'Pharmacy', '07-06-2024 20:44:39', 'Login'),
('100', '150', 'Pharmacy', '07-06-2024 20:48:19', 'Login'),
('2525', '2525', 'Doctor', '07-06-2024 20:50:31', 'Login'),
('2525', '', 'Doctor', '07-06-2024 20:50:46', 'Logout'),
('5050', '5050', 'Sister', '07-06-2024 20:50:54', 'Login'),
('5050', '', 'Doctor', '07-06-2024 20:51:17', 'Logout'),
('100', '150', 'Pharmacy', '07-06-2024 20:51:24', 'Login'),
('100', '', 'Doctor', '07-06-2024 20:51:40', 'Logout'),
('2525', '2525', 'Doctor', '07-06-2024 20:52:24', 'Login'),
('2525', '2525', 'Doctor', '08-06-2024 19:56:28', 'Login'),
('2525', '2525', 'Doctor', '08-06-2024 20:24:13', 'Login'),
('2525', '2525', 'Doctor', '08-06-2024 20:25:39', 'Login'),
('2525', '2525', 'Doctor', '08-06-2024 20:27:49', 'Login'),
('2525', '2525', 'Doctor', '08-06-2024 21:08:54', 'Login'),
('2525', '2525', 'Doctor', '08-06-2024 21:10:08', 'Login'),
('2525', '2525', 'Doctor', '08-06-2024 21:18:13', 'Login'),
('2525', '2525', 'Doctor', '08-06-2024 21:20:23', 'Login'),
('2525', '2525', 'Doctor', '15-06-2024 20:28:56', 'Login'),
('2525', '2525', 'Doctor', '15-06-2024 20:36:20', 'Login'),
('2525', '2525', 'Doctor', '15-06-2024 20:40:09', 'Login'),
('2525', '2525', 'Doctor', '15-06-2024 20:41:33', 'Login'),
('2525', '', 'Doctor', '15-06-2024 20:43:41', 'Logout'),
('5050', '5050', 'Sister', '15-06-2024 20:43:50', 'Login'),
('5050', '', 'Sister', '15-06-2024 20:44:13', 'Logout'),
('2525', '2525', 'Doctor', '15-06-2024 20:44:19', 'Login'),
('2525', '2525', 'Doctor', '15-06-2024 20:47:06', 'Login'),
('2525', '2525', 'Doctor', '15-06-2024 20:48:35', 'Login'),
('2525', '2525', 'Doctor', '15-06-2024 20:52:44', 'Login'),
('2525', '2525', 'Doctor', '15-06-2024 20:54:53', 'Login'),
('2525', '2525', 'Doctor', '16-06-2024 02:08:25', 'Login'),
('2525', '2525', 'Doctor', '16-06-2024 02:23:06', 'Login'),
('2525', '2525', 'Doctor', '16-06-2024 02:37:22', 'Login'),
('2525', '2525', 'Doctor', '16-06-2024 02:38:32', 'Login'),
('2525', '2525', 'Doctor', '16-06-2024 02:42:26', 'Login'),
('2525', '', 'Doctor', '16-06-2024 02:43:06', 'Logout'),
('5050', '5050', 'Sister', '16-06-2024 02:43:18', 'Login'),
('5050', '', 'Sister', '16-06-2024 02:43:45', 'Logout'),
('100', '150', 'Pharmacy', '16-06-2024 02:44:11', 'Login'),
('100', '', 'Pharmacy', '16-06-2024 02:44:23', 'Logout'),
('2525', '2525', 'Doctor', '18-06-2024 13:50:55', 'Login'),
('2525', '2525', 'Doctor', '18-06-2024 13:52:15', 'Login'),
('2525', '', 'Doctor', '18-06-2024 13:52:22', 'Logout'),
('5050', '5050', 'Sister', '18-06-2024 13:52:28', 'Login'),
('5050', '', 'Sister', '18-06-2024 13:52:59', 'Logout'),
('100', '150', 'Pharmacy', '18-06-2024 13:53:09', 'Login'),
('2525', '2525', 'Doctor', '18-06-2024 14:33:05', 'Login'),
('2525', '', 'Doctor', '18-06-2024 14:33:19', 'Logout'),
('100', '150', 'Pharmacy', '18-06-2024 14:33:33', 'Login'),
('100', '', 'Pharmacy', '18-06-2024 14:34:07', 'Logout'),
('100', '150', 'Pharmacy', '18-06-2024 14:34:16', 'Login'),
('100', '', 'Pharmacy', '18-06-2024 14:34:23', 'Logout'),
('100', '150', 'Pharmacy', '18-06-2024 14:34:29', 'Login'),
('100', '', 'Pharmacy', '18-06-2024 14:34:46', 'Logout'),
('5050', '5050', 'Sister', '18-06-2024 14:34:59', 'Login'),
('2525', '2525', 'Doctor', '18-06-2024 14:42:23', 'Login'),
('2525', '', 'Doctor', '18-06-2024 14:42:46', 'Logout'),
('2525', '2525', 'Doctor', '18-06-2024 14:42:56', 'Login'),
('2525', '', 'Doctor', '18-06-2024 14:43:14', 'Logout'),
('2525', '2525', 'Doctor', '18-06-2024 14:43:19', 'Login'),
('2525', '', 'Doctor', '18-06-2024 14:43:34', 'Logout'),
('5050', '5050', 'Sister', '18-06-2024 14:43:40', 'Login'),
('5050', '', 'Sister', '18-06-2024 14:46:35', 'Logout'),
('100', '150', 'Pharmacy', '18-06-2024 14:46:44', 'Login'),
('100', '', 'Pharmacy', '18-06-2024 14:47:03', 'Logout'),
('2525', '2525', 'Doctor', '18-06-2024 14:47:07', 'Login'),
('2525', '', 'Doctor', '18-06-2024 14:49:33', 'Logout'),
('5050', '5050', 'Sister', '18-06-2024 14:49:42', 'Login'),
('5050', '', 'Sister', '18-06-2024 14:50:14', 'Logout'),
('2525', '2525', 'Doctor', '18-06-2024 14:56:07', 'Login'),
('2525', '2525', 'Doctor', '18-06-2024 15:05:04', 'Login'),
('2525', '2525', 'Doctor', '18-06-2024 15:10:29', 'Login'),
('5050', '5050', 'Sister', '18-06-2024 16:15:44', 'Login'),
('5050', '', 'Sister', '18-06-2024 16:22:00', 'Logout'),
('2525', '2525', 'Doctor', '18-06-2024 16:22:05', 'Login'),
('2525', '', 'Doctor', '18-06-2024 16:22:57', 'Logout'),
('100', '150', 'Pharmacy', '20-06-2024 13:21:11', 'Login'),
('100', '150', 'Pharmacy', '20-06-2024 13:24:41', 'Login'),
('100', '150', 'Pharmacy', '20-06-2024 13:25:19', 'Login'),
('100', '', 'Pharmacy', '20-06-2024 13:26:12', 'Logout'),
('2525', '2525', 'Doctor', '20-06-2024 13:26:21', 'Login'),
('2525', '', 'Doctor', '20-06-2024 13:28:29', 'Logout'),
('5050', '5050', 'Sister', '20-06-2024 13:28:37', 'Login'),
('5050', '', 'Sister', '20-06-2024 13:31:14', 'Logout'),
('2525', '2525', 'Doctor', '20-06-2024 13:31:21', 'Login'),
('2525', '', 'Doctor', '20-06-2024 13:31:33', 'Logout'),
('5050', '5050', 'Sister', '20-06-2024 13:31:39', 'Login'),
('5050', '', 'Sister', '20-06-2024 13:31:59', 'Logout'),
('100', '150', 'Pharmacy', '20-06-2024 13:32:13', 'Login'),
('100', '', 'Pharmacy', '20-06-2024 13:32:35', 'Logout'),
('5050', '5050', 'Sister', '21-06-2024 11:44:00', 'Login'),
('2525', '2525', 'Doctor', '21-06-2024 11:47:58', 'Login'),
('2525', '2525', 'Doctor', '21-06-2024 11:48:53', 'Login'),
('2525', '2525', 'Doctor', '21-06-2024 11:49:37', 'Login'),
('2525', '2525', 'Doctor', '21-06-2024 12:04:58', 'Login'),
('2525', '', 'Doctor', '21-06-2024 12:05:33', 'Logout'),
('5050', '5050', 'Sister', '21-06-2024 12:05:41', 'Login'),
('5050', '', 'Doctor', '21-06-2024 12:06:02', 'Logout'),
('100', '150', 'Pharmacy', '21-06-2024 12:06:13', 'Login'),
('100', '', 'Doctor', '21-06-2024 12:06:38', 'Logout'),
('2525', '2525', 'Doctor', '21-06-2024 12:06:49', 'Login'),
('2525', '', 'Doctor', '21-06-2024 12:06:56', 'Logout'),
('2525', '2525', 'Sister', '21-06-2024 12:07:06', 'Login'),
('2525', '2525', 'Pharmacy', '21-06-2024 12:07:13', 'Login'),
('5050', '5050', 'Sister', '21-06-2024 12:07:22', 'Login'),
('5050', '', 'Sister', '21-06-2024 12:07:29', 'Logout'),
('100', '150', 'Pharmacy', '21-06-2024 12:07:38', 'Login'),
('100', '', 'Pharmacy', '21-06-2024 12:07:54', 'Logout'),
('100', '150', 'Doctor', '21-06-2024 12:08:00', 'Login'),
('2525', '2525', 'Doctor', '26-06-2024 13:35:08', 'Login'),
('5050', '5050', 'Sister', '26-06-2024 13:39:22', 'Login'),
('5050', '', 'Sister', '26-06-2024 13:40:08', 'Logout'),
('2525', '2525', 'Doctor', '26-06-2024 13:40:13', 'Login'),
('2525', '2525', 'Doctor', '26-06-2024 14:48:57', 'Login'),
('2525', '2525', 'Doctor', '26-06-2024 14:53:54', 'Login'),
('2525', '2525', 'Doctor', '26-06-2024 14:59:20', 'Login'),
('5050', '5050', 'Sister', '26-06-2024 15:01:54', 'Login'),
('2525', '2525', 'Doctor', '26-06-2024 15:03:55', 'Login'),
('2525', '', 'Doctor', '26-06-2024 15:04:13', 'Logout'),
('2525', '2525', 'Doctor', '26-06-2024 15:04:25', 'Login'),
('2525', '', 'Doctor', '26-06-2024 15:04:38', 'Logout'),
('5050', '5050', 'Doctor', '26-06-2024 15:04:46', 'Login'),
('5050', '5050', 'Sister', '26-06-2024 15:04:54', 'Login'),
('5050', '', 'Sister', '26-06-2024 15:05:15', 'Logout'),
('100', '150', 'Pharmacy', '26-06-2024 15:05:22', 'Login'),
('100', '', 'Pharmacy', '26-06-2024 15:05:41', 'Logout'),
('2525', '2525', 'Doctor', '26-06-2024 15:14:16', 'Login'),
('5050', '5050', 'Sister', '26-06-2024 15:18:45', 'Login'),
('2525', '2525', 'Doctor', '26-06-2024 15:24:50', 'Login'),
('2525', '2525', 'Doctor', '26-06-2024 15:29:34', 'Login'),
('2525', '2525', 'Doctor', '26-06-2024 15:31:01', 'Login'),
('2525', '2525', 'Doctor', '26-06-2024 15:31:51', 'Login'),
('2525', '2525', 'Doctor', '26-06-2024 15:32:37', 'Login'),
('2525', '2525', 'Doctor', '26-06-2024 15:33:20', 'Login'),
('2525', '2525', 'Doctor', '26-06-2024 15:34:52', 'Login'),
('2525', '2525', 'Doctor', '26-06-2024 15:36:17', 'Login'),
('2525', '2525', 'Doctor', '26-06-2024 15:37:07', 'Login'),
('2525', '2525', 'Doctor', '26-06-2024 15:38:26', 'Login'),
('2525', '2525', 'Doctor', '26-06-2024 15:43:19', 'Login'),
('2525', '2525', 'Doctor', '26-06-2024 15:44:29', 'Login'),
('2525', '2525', 'Doctor', '26-06-2024 15:47:09', 'Login'),
('5050', '5050', 'Sister', '26-06-2024 15:48:42', 'Login'),
('100', '150', 'Pharmacy', '26-06-2024 15:50:31', 'Login'),
('100', '150', 'Pharmacy', '26-06-2024 15:51:14', 'Login'),
('100', '150', 'Doctor', '26-06-2024 15:52:23', 'Login'),
('100', '150', 'Pharmacy', '26-06-2024 15:52:29', 'Login'),
('100', '150', 'Pharmacy', '26-06-2024 15:53:11', 'Login'),
('2525', '2525', 'Doctor', '26-06-2024 15:55:51', 'Login');

-- --------------------------------------------------------

--
-- Table structure for table `medicine_history`
--

CREATE TABLE `medicine_history` (
  `Medicine_id` varchar(50) DEFAULT NULL,
  `Medicine_name` varchar(50) DEFAULT NULL,
  `Stock` varchar(50) DEFAULT NULL,
  `Ex_date` varchar(50) DEFAULT NULL,
  `Last_update` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `medicine_history`
--

INSERT INTO `medicine_history` (`Medicine_id`, `Medicine_name`, `Stock`, `Ex_date`, `Last_update`) VALUES
('100', 'Vitamin c', '1000', '21/06/2024', '20-06-2024 13:23:24'),
('200', 'Panadol', '20', '30/06/2025', '03-06-2024 11:05:33'),
('500', 'Hydrocodone', '950', '30/06/2025', '03-06-2024 11:05:33');

-- --------------------------------------------------------

--
-- Table structure for table `patient_register`
--

CREATE TABLE `patient_register` (
  `NIC_Number` varchar(50) DEFAULT NULL,
  `First_Name` varchar(50) DEFAULT NULL,
  `Last_Name` varchar(50) DEFAULT NULL,
  `Gender` varchar(500) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `Telephone_Numbers` varchar(50) DEFAULT NULL,
  `Date_of_birth` varchar(50) DEFAULT NULL,
  `Type` varchar(50) DEFAULT NULL,
  `Note` varchar(500) DEFAULT NULL,
  `Date` varchar(500) DEFAULT NULL,
  `Time` varchar(500) DEFAULT NULL,
  `Doctor_id` varchar(50) DEFAULT NULL,
  `Appointment_status` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `patient_register`
--

INSERT INTO `patient_register` (`NIC_Number`, `First_Name`, `Last_Name`, `Gender`, `Address`, `Telephone_Numbers`, `Date_of_birth`, `Type`, `Note`, `Date`, `Time`, `Doctor_id`, `Appointment_status`) VALUES
('1000', 'A', 'B', 'M', 'AS', '021', '20/06/2020', 'Vehicle Accident', 'hi', '10/06/2024', '21:31:03', '2525', 'not available'),
('1001', 's', 'd', 'f', 'hj', '024', '20/06/1966', 'Vehicle Accident', 'jk', '11/06/2024', '21:31:03', '2525', 'not available'),
('2001', 'fgh', 'rty', 'Male', 'we', '455658', '20/06/2000', 'Vehicle Accident', 'fff', '21/06/2024', '21:31:03', '2525', 'not available'),
('200427400580', 'Ashen ', 'Wadugodapitiya', 'Male', 'Anuradhapura srilanka', '070362055', '30/09/2004', 'Vehicle Accident', 'ERD', '18-06-2024', '14:45:10', '2525', 'not available'),
('200', 'Asheb', 'Nyte', 'Male', 'city', '014528', '02/06/2024', 'Accident', 'e', '20-06-2024', '13:30:10', '2525', 'available'),
('45646', 'ffafasf', 'asfsaf', 'Female', 'asfasfsaf', '45436546', '10/06/2024', 'Vehicle Accident', 'add', '21-06-2024', '11:44:27', '2525', 'available'),
('20', 'WDD', 'PCP', 'Male', 'ASD', '0415', '01/06/2004', 'Clinic', 'as', '26/06/2024', '13:40:01', '2525', 'not available');

-- --------------------------------------------------------

--
-- Table structure for table `patient_update`
--

CREATE TABLE `patient_update` (
  `NIC_Number` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `Date` varchar(50) DEFAULT NULL,
  `Time` varchar(50) DEFAULT NULL,
  `ward_no` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `patient_update`
--

INSERT INTO `patient_update` (`NIC_Number`, `status`, `Date`, `Time`, `ward_no`) VALUES
('1000', 'Ward', '05-06-2024', '12:17:10', '01'),
('1001', 'Ward', '05-06-2024', '14:03:30', '01'),
('2001', 'Ward', '05-06-2024', '14:10:03', '01'),
('200427400580', 'Ward', '20-06-2024', '13:27:18', '01'),
('20', 'Ward', '26-06-2024', '13:40:31', '01');

-- --------------------------------------------------------

--
-- Table structure for table `prescription_history`
--

CREATE TABLE `prescription_history` (
  `Prescription_id` varchar(50) DEFAULT NULL,
  `Medicine_id` varchar(50) DEFAULT NULL,
  `count` varchar(50) DEFAULT NULL,
  `Date` varchar(50) DEFAULT NULL,
  `Time` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `prescription_history`
--

INSERT INTO `prescription_history` (`Prescription_id`, `Medicine_id`, `count`, `Date`, `Time`) VALUES
('5001', '100', '2', '04-06-2024', '18'),
('5002', '100', '5', '04-06-2024', '18'),
('5002', '100', '6', '04-06-2024', '18'),
('5003', '200', '5', '04-06-2024', NULL),
('5004', '300', '6', '04-06-2024', NULL),
('5005', '200', '5', '04-06-2024', NULL),
('5006', '500', '5', '04-06-2024', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `user_images`
--

CREATE TABLE `user_images` (
  `UID` varchar(255) NOT NULL,
  `imageName` varchar(255) NOT NULL,
  `imageData` longblob DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user_images`
--

INSERT INTO `user_images` (`UID`, `imageName`, `imageData`) VALUES
('100', 'pp.jpg', 0xffd8ffe000104a46494600010101006000600000ffdb0043000302020302020303030304030304050805050404050a070706080c0a0c0c0b0a0b0b0d0e12100d0e110e0b0b1016101113141515150c0f171816141812141514ffdb00430103040405040509050509140d0b0d1414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414ffc00011080071007303012200021101031101ffc4001f0000010501010101010100000000000000000102030405060708090a0bffc400b5100002010303020403050504040000017d01020300041105122131410613516107227114328191a1082342b1c11552d1f02433627282090a161718191a25262728292a3435363738393a434445464748494a535455565758595a636465666768696a737475767778797a838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae1e2e3e4e5e6e7e8e9eaf1f2f3f4f5f6f7f8f9faffc4001f0100030101010101010101010000000000000102030405060708090a0bffc400b51100020102040403040705040400010277000102031104052131061241510761711322328108144291a1b1c109233352f0156272d10a162434e125f11718191a262728292a35363738393a434445464748494a535455565758595a636465666768696a737475767778797a82838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae2e3e4e5e6e7e8e9eaf2f3f4f5f6f7f8f9faffda000c03010002110311003f00f7ef875e24f877f0ff00469acacfc4d6523bced2bac9700b0627906bad87e2af84e563b35db16c8ed2d784f893e02e97a1f83af75f8a7b87ba1fbdd8d8da493935c2e8fa68f97e523f0af9c552a534a3b1ea4ad7bd8fb234df17785934adb1ebf665f9214ca33cd51b1f116830c972e355818cc79f9863a62bc0749d3d7cb5c0fd2b7edf4efc0575c66dd9be860d9ea5613687625826bb184662edb88c0c9cd4971e2ef0f58b0f2758b79bd76935e6f0e9e075e7f0a824d1918e42d6d656d08e7773b2f107c4af0df85b4bd4f5dbbd4564b6b3b669a448f1b8aa8248192013ed9e78af963c63ff00052ef07e9de26b3b2d33c3d7daa694261e75eb4a2162b81ca21041c1c83923a75ae3ff00696d1f5bf8a5f12b4af867a35c35bd84163fdaba9c80901572d82c3f8b6aa0c0fef4833d888fc37fb117836fb410ed7339b8e8d33302ce7e98c0fc057356c550c2d955576fb1ea6170388c6a73a6d24bb9f557c39fda73c05f1674bbcb9d0754c34242cb6f751b472460e7071e8707fce33b0de32d1159717168d2703790727f1af80f50f84d77f07b5c9fc59e0cbc9ae46831f9fa869f707779967bf1280dd87cd9fccf615f5b5ae971dfdac1711ab18e68d5d770e70c011fceb8e753db4555a12f75857c3cf0753d96222ae8ef3fe124b0b3d32eede3bcb6944ced20dafcf2738ae63c6d69a47c4eb1b5d3750bb361042e241244c32580c639acf6f0cbdbaf9888ccc3b2ae4d665db1b69155d1919586430c1ade961e534a5297c8e0a98a51f7630337e337867c096fa678323f182df4f6568254b59aca428d9c0e4edf6ae33fb07f67fbe4093aebb22f5c35d4bf9e33d6b43f6cef1243e16f06f82a692069c3b48005207f0835f2a43f12af6eece4bdb3f0dde5c5a403f79327dd5fd2bbe187a96bc764734ebc13e57bd8f70d5f49f81967a94f0dbf863c5f770a1c2cd04ac51b8ea096a2bc323f8f4aa800d31c0ffaeb45757d56bf67f79c9f59a5fccbee3f5ca1d2adf56f0c5bdadd4626b799955e36e8c33d2a6b7f85de195bec2e91005d99db8e3ad59d2a0dba1d90da72acac79f735beb71b3520c064797ebef5953841c5732ec77ca4efa1cdb7c3ed0a1d3aede2b08d1d77618678ae7ffe1018b4db8d2da6ba69e2b890232631d4135def9e5ac2f50ff1b377f5ac8d79a56934010c4ce23b952f8e70369e4d370a7d113ef166c7c1fa54574f1fd91648ce3fd673567c49f0f74ebdbcb582da316030cc4c2a39c55e8e66fb736131b80c56fdf1dfa85bc84642a11d7d6baa30872bba21b7d0f8afe20f8760f0e789fe24f88347df71a89d220d2a2bb10798cb289e449405ef8daab9ed8cf22bc73e1afc44f8871cfaa4125a9b9d362b496ea092fad638e4de83fd58319c1ce38fa8ce0d7d39f15ed6e3e1febde2ad723b266d3f584312b4a57cb4baeabb475f995a773db207735f2ce93f18be21f8cf5ebcd4bc2ba3595d436f13477306b52887cc8f2c14c5b8afca7073b739c75535f298c8d4a951c5c57f4ff53ee72e742952e68c9dbb77d15fee65af847ac7887c79e28f11c1e24f2a14d4347bbb66d2934fc19fcc89b6c6b206f9481f36e6c8e00ea735f71693e0ed1d6d2dc595baadb496e86377192aa546d383ed8af913f675f1f6a5e2cf126a9a36bb631c32d9593db43f630eb079f2e625488b0dc554ef039238e188afb9265fb34e8891e2358c2003a60715e8e0e9bf66d4a2959f43c4cd27175538c9bbaebf91c668fa258e993dfbdcc9be5b6976093a2e0807a7e35993783f42d73569b50b83f6b121d9e57f0023b8ad9d36e8dbeadae7da63d9135caed671c11b16a95e5cc09a8048a40abe612e14718c75e2bba1caf4478724ed76789fed67e0bd1f56d3fc2f0ddd843736f6ad23451ccc405f940af1bf04eafe1ebdf1c693e1658ec238a49d6392c63e32bdf3eb5f42fc73d0e5d72d3c330346b7369894dcbb49b0aa70320fe55e04bfb3f37857e2c59f8a3c3ec6f44216630b5c28e7fe047d2b9e4a5cf24dbb74f52d38592ebfa1efd27ece7f0b2491d9fc1ba696dc727ece3d68ae664f895f10448de4f824cb1672ae2fe2e47af5a29fb49f717b3a7fcbf8115b7ed09e3f9efeeed6cf48b29a182e9add64d8d8e1ca8cfbd7a5cde22f8a367a3bdf5d697a746889bdb0c4902b3fe147c3dfb3e87e201a84be55e5cea2f7091c83e644126578f7c7eb5ed1ad430ea3e1e9ecd265569a2f28363a1231584684649c9bd7d4e9e69e9647cd70fc7ef145e3e0c16607b2b57d33f0eaf2f756f02e9da95ddbb19e68965710d9a4a082662707cc0c38541c8e0e319ddc7c9bf153c3b63f08becd17f6bc3a85f3c8a1edfcb3f229ff007724b1e381d0727b06edbe05fc69bcf1c5ddce813d87872eac2d2ca5682eace18ee67c2c2d1ae4656476f9f6ed1ce378fe215780952a788e49af79af535c4e1b11530dede3f0af91e8dad7c44d5ec753b882016dba2da066174f9b6827e463b979cfca791d0f4ac09be2df8a8c9b49b51cff00cf33fe35eb371e15b5d41dd3c854774dad32c6495e3af3cfe6699e17f84da668da935edc4c75392321a359100456ebbb1dcfd78aee9d17565aa3823374e3a33cbfe23e95e2bf1f7c33d6ec75fd3d7ec1f668ae952042273f3828ca0127236938c7406bf3ab53f123f85c368a2d6e6facc3b1b696daf5e161b8e4e4861919ec78f435fadfe3e66d3a43a9c970b0d83c0229da43854d85d8313ee19b9f61eb5f9c1fb51789b4b8bc791ddc3e01b8b6b59c2cd15ccb71f66fed6cb7cd2f9414b2024e3aab9cee6009ad2ae5f52bb52a7afaff0099dd84c7c30e9c6a5d79ad7e4d1e99fb2bf83f56d5efaf7c5b6ab1df6ab631461627632aab0ca00581da6501f850490324e3233eff0071f1135f666499614954e0c6d19539f43e94df827716ba9687a0daf87f4d93c330030cb73a54d17952d9842b2344c31ce48037ff0016e073cd7b76a1a05a6b0af24d0a1b9db8f34a827f1f5ab9615d38a845ea70d4afedaa39b3e7fd57c71aa6b9fe87756b6d121eac84e688b54bbb358d63f2ce4e3e615ed3e2ef05e9da8e9682d6ce2b795400d22c7cafbd78bdf695756b24f220f32dad64f9a6e31815c52c3c633e792d7b8bdacedc917a1e63fb5c7899bc2fe14f0c2bdafdad2e4c8248d65319e80f515f305f78c8ead6ba6476da78b28ed036ddd3b484ee39c64f6f6afb3fe37f81b43f89767e178b53bb686d238de51246fb739da3afe35f1cfc42f05c5e1ff8d11784749ba11d9fd937c724cd9de4f439ac255fd8ce528bb5b5fc0e98e1638a8aa5357e6d0c991b5492467b6d466b2818e56de1958227b0f6a2bd434ff0ce9b67630c1782292ea35c48d83c9a2bc9fed68df67f71eeac8656e9f89f5a7c23b09b5c6d73c577a257bfbcb9780b6e3b047131540abd0703b75cd76efe20bffed086ce5b1f2eda4936899948e319cf4acff03eada3f87743fec983508a548e49097690641672483f89ae8350f16e9ba842b147710b01dc302735ed3a91715efd9adfccf1a8fbb74e17baefb799f107ed15a6dc5afc4af105b5e7882486789ccb2cbfebee1a164591003c6c50a5470085da060f5af6dfd863c29a7eb9a5ea1e24bb8a2beb8b79f16ba9cd64b0de46a502babbaffac07b138e878e2bc93e3d7c5cf0aeb1f15b49d4f4b9daf26b68e7d275305418d92299e3c019eccb2727a86535f59fc0796d347f83fa04be12821bed2755b58b500d082a7f78aac07cc00e3a60918e6b2c2e1ffdaa72e8bf53d4c6629bc1421b376fc3fcff0053d45e56cf96c31b09181504d189664fdf4d100320452940dec71fe79accd235a3a9cd70ae9e5ca986c608eb91d0f3dbf5ad099b08187f09cfe15f436b1f2e2a258ea769269b756ff2c99dd6d75f397c1cee0493b864039ce4719c1afce5fdbbb58bdf0f7c71d0a15817ccd0f4d8efad249e3dcb239b82f9c1eabfba40707b37bd7e8e324577118a650e87e653d0a91d083d8fb8af06fdac3f67b93e37786f487b365fed9d32ed522bc638716b2baacf1bff0078018753d731edfe32d5d386a91a751396c63562e51b23b6f80be24b3f187c2fd1fc7b35ac5a636ab6a8ecae3062456219371e597786c1ee029ef5ddd9b437de6dc2c375045239285e7910c83a96d81be504e783cfb0e958de15f0ac5a7699a75abc2b069ba65bc76da7e9c9feaede2450a83fda60a00dc7f0c5742dbb0b9539ea6b093bb6cd56c4d26a42de6001f9c2873ed93c5737e34f0ce9daa7856f6e52d5625b87225f2ce039da4e48fa81d3d6b02f7c6d6f71aef8834e47ff0049b36b6560a7242b82403e87e56e3d083dc575be1fbafedfb5bcd0279044b716e638d8f6930083f98acea536e2ee86a5adcf95fe2b78724f11786fc236826861b6b8b575b8569447b9094c85e6bcff00c63f056c753f1f586b10dda59d869ba5794646f9f7e1b8c313d40fe75ed1e3df833e15f1ee9de18d2fc55a84f63169b0388f65c98598e403920f354353f803f0fb52d1ecf48b8f16ea1269d6abb2385752238f4620e5bf1af9da9454ee9bb5cf529579d3b496e8f9f35ef873716fab5c25b4f25e4190c932dd280c0807a7e3457b27fc325fc266e9ae5f63fec28dfe34571ff6753e93febef3d759e62d69fd7e460c31241af6a7c004ddcddbfdb35ee5f07fc17a56aba3dd5fc90996ea190bae188c6d191c7e1517c3ff00857a56b9712eb372d248df6c98980e361c48c306bd756c6d3c376b1c3a7da476f1dcdcc51bac4b8e0b027f901f8d7ad84a2e569b5a1f313d3447c05e22fd99f45d4be275f6af14970da5eaf37da7fb2612544d3c84b310e0e446fb83155e72cd8651b40fb8fe19d88f0f7c3dd2f4c91ade386cfcd40b0911c51832336c40070ab9da3a700702b859234d3f539d8c71c72c4cc9f2a018ea31903a5757e14d5a58ec7c94655691ced7238dd93c1f7e38cf1db2335ef350d79236bee439ce49293bdb62ddf6ad6b078b2d64b69636f3e178e4f2dc302c08604e3be37735d2dade25d295cf24579e6b8ba9c7af58cf75790dc5ac61db09b41048c00403f5eb5b90b3cd1efb76db22f200ef44a3a220ea2291a3247f121e86ac4cc1e3dc8db092010067bd73f63af2cee22b91e45c8e327a356f2a865423d466b268a2280b4092e6579999f1ba4c71cf418029f7774230557e62dc0e7354b53ba10c90c29d5a4dc6a09d8288d9989efd792680380f146b1241e25d37ed002c7773c76e88a738641339cfe35d5e8b7b047a9442edcda65879772a7856edbbd3eb5c7f89e28f5ebfb6be64310b3945c22e7f88e50ffe866b434fd52db50c5bdcb88a55fb923e4237b37a574ee8ccf33fdb8bc372b6a1e1d791446b70b2cc193ee963b7763ea4e7fe042be7fd17c322354c9c8c57dabf123c0b1f8fbe1f5a5b5e6e371a2dc7da611bb24c0ff2c811bb8fbac47a2f15e19e2af07697e19d674db58321268cb10c73debe4b1b4e54eab7d0f528c94a16ea70d6fe1e8bc95e28af414d26c6350a1940fad15c9cacb3dcfe15a793e18f31dc8df3ccdb4f18fde35753ad332daf9cac19102b9c750548607f3503f1af9a757f8e061d72e6c2cd2ead20b791e1745c60b062091f5aedf4cf88d33d94320595b7004863c1c73d2bd2a38b717c9ecdd975d35fc4f365cee4d728dd6f51f3b5ebb20616698b803b64e7fad6c697745a385217059a657645ea154724fb741f81ae4eeafa0b9bbdd0c7245230c8de0305c71f8d36dfc4d1e8d6f2c71a3b4d2366498e3247a0af66589a718392d5f61fb29bd91e9967e097d5669aec28711a34acce79edd2b1e1f11c5a75d056738ce30bc9ae83e1bf8a9750f0bebf346ecd24767b3e63fc4c703fa9fc2a8d96829a2695fdab7518f3663b60561cb7a9fa5561e729c39a6b5629ef64ac6a5c5ee99796e8f3b85de32adfc42b5b49bc682c4979bcf8139572a55be873d6b9cd2ec4237daaebf793bf215ba2d74363279d1939cf240ad25e4499fad5db3b44c0142fc8f61c77a8b52bf956d8b332b32af4db8dd9e319cd3bc44db9d4e72c16b2b5ab8f2e28173c7df3f80ffeb8aa8a132adbd9c9ae5cdc051e5ba0558f6aee5054e7073dbafe75a70cd776608bd1a5c11af196839fd07f5acdd06e3508351b1b6b331aadd12d7024524b20c1207a1e715dd5ae94966cb2b5ccc4f68e498845f6009a717cada637aa437c31a8db6a0cf6d0d9c92dbc8ac922a5b031be4609183b8719e715f1f59f8bfe2c695e33d4adb58f87675ab58677b6b7bc8caae6347203e0b7f1000fe35f636bbe20b2f03687a96bb2cbf6982daca4b9fb334a4481d41d9e59fe2cb0031efed5f1b7853f6acf1a78ab489b58b7d034e8f4cb690432cb25c30c391d3eefd3f3ae0c53836ae8d2927ab4cb5ab6a7e3fbed4679e3f87b711a48d90bbd38e3eb457a159f8f7e25ea5690dddbe85a6982641221f3db904647f0515c56a7fcbf99ad9f73cee3f06dc788bc6ba9dad8a299deea67f9ce07df35ea5a4fc3dd6a38c412c70c6635ecd9cd73ff000e6f0ffc2dabb451cf9d3ffe866bdbef2e9e3d49cac648f2fa13ef5cf4629abbee694e32670173e05d5e087ce8d21930a7237106b8fd5bc33a8c6df33c2a5874dd5ee51cc7ec706f8c90c7079ed5e09f15175cd335bfb7c71f93a2f9a12362dc9cd55697b38f3a4d9ea60e92ab3f65295afb1eadfb2f68d7b6b0f8b24d56c56e23965b68ade3277210ab2173ff008fad759e36bf179e217fb49558ed8797144a30ab8f4aa9f0035e65f85fa85d3a20913516877a2ee2542467f9b5666a9629abdd4fa85e2dc884b1fde48fb50fb018feb5eb6166aa528cd6ccf231746587c44e94b74ec4cda847247f2386c9c0c1cd6c68ee16dc80790d5cb471c16677244614c6e5562791eb8278ad1f0bdc35fa5e6d7c6d2a436718ce7a706badec720ff11ca61b88e43fead8609f4acbbe56d4b56b5b3894cd37901822725b248fe9fa56f6b4af1c601f2e56d9d59783ee6bc9be2c7c12bbf8a5a3c13697e27b9f0f6a91797e5ac6ed1a3ec6728048843a72e72413d00c7a9cdcb1bd8a8c54a566ec7bb68ba3af87eccf9c435c3f2ede9fec8f6a86e6f1ef26586205ddce02edc8fc6bc27e04f8ebe20db5c4fe00f8956321d6ed58ff00666b45c4a9a842412a37af0cc30c3276b01b370dcd5ebfaf2dee9ba7cb058dc470eaf3420fce72615271b88f7c301ee0fa54737bbcf214bdd7cab539cf8c5e2486eb57d0bc360c69a7db59cd248fc0f3df207e437363dcfd2bc9f42f08f83f4ef847f648ac17ec17d7dbe4b5671b9d8c98cd705fb6d6a5716f75e1cb7b4bb6b4ba92d252ac8fb09f997b8af02b4b9bebcd13c143fb7a353673c46e627bd39e1c12587d2bc3a9294a7267d0e130946a51539cedff0003fccfd35b3934fd36ceded609e18a18635444dc3e5000c0a2be1cf116a515deb575343e2fb311bb02a3fb4718e076c515a7b697f29d51cab0ad26f12bfaf99edbf0a7fe4b2ea1ff005d6e7ff43af7ebaff90849ff005ce8a2b1c2ff000fe67871dc7b7fc7a43f5af1bf8f9ff224c3ff005f43f9d1456b88fe04fd0efc17fbd53ff12fccf48fd99bfe493dcffd8565ff00d020adef8a1ff1fba6ff00babfccd1457565bfeed4fd0e7cdffdfeb7ab392f137de93fdcfeb527807fe3ceebeabffb351457a5f64f27a9b9e20ff551ff00ba6aac5ff20bb5ff0074d1452e82ea66dc7fc8d9a67fd754ff00d1b1d4d75ff2527c51ff005ca0ff00d04d1456588f821ea4af899f0f7fc146bfe466f05ffd794fff00a12d7c7363ff001fc94515cb0d99a4be2435fefb7d4d14515d2647ffd9),
('2525', 'dr .jpg', 0xffd8ffe000104a46494600010101006000600000ffdb0043000302020302020303030304030304050805050404050a070706080c0a0c0c0b0a0b0b0d0e12100d0e110e0b0b1016101113141515150c0f171816141812141514ffdb00430103040405040509050509140d0b0d1414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414ffc00011080073007303012200021101031101ffc4001f0000010501010101010100000000000000000102030405060708090a0bffc400b5100002010303020403050504040000017d01020300041105122131410613516107227114328191a1082342b1c11552d1f02433627282090a161718191a25262728292a3435363738393a434445464748494a535455565758595a636465666768696a737475767778797a838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae1e2e3e4e5e6e7e8e9eaf1f2f3f4f5f6f7f8f9faffc4001f0100030101010101010101010000000000000102030405060708090a0bffc400b51100020102040403040705040400010277000102031104052131061241510761711322328108144291a1b1c109233352f0156272d10a162434e125f11718191a262728292a35363738393a434445464748494a535455565758595a636465666768696a737475767778797a82838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae2e3e4e5e6e7e8e9eaf2f3f4f5f6f7f8f9faffda000c03010002110311003f00fd53a28a2800a28a2800a28a2800a2be59fdafbf6ba97e1015f09f8316df52f1b4eaad36f5322e9f1b7dc2cbd0bb72429230304f55cfc9569f11fe3f7882e3cfd57c5daa4163312ccbf6a16e7cbc74f2d48f5e7031ef512928ee5c62e4ec91fab7457c3ffb3cfed2babe87ac43a2789f57bad4ad0809baec19195b939590e0e383c357dafa6ea10ead616f796ee1e0990488c0e782288c94b614a2e2eccb3451455921451450014514500145145001451450014d660aa49e0019a75721f182fee74bf855e2fbcb392486eadf49ba963921fbea444c72befe9532972c5cbb174e3cf351bdae7e6ffc56ba8b56f1a78cfc5f716cd736f753a0f31ad8cce2424b6d2807f0a945e7b103ae2ba0f851ab786758f0cb5f5b6ad6d7b6d6fc5d47751f92222012772301b71f4ef58fa9f87ec354f85ba1c9797f2e9b6da95bcda84a51cec32b4ac5830e0f0bb40e4118aadf067e1b697aa7843c76b2eb2b136b88a05d2cc1dd3018fcabb8b6ef972cb9ddc1cd7c8e32aaad3766d1f7397e1e5460ae93fcf43dabc416de13d7bc3b1de68b26977890c681ae34c9924456dc319299c73c608afa67f67cf347815d2462e8976eb1367e529b53040ed9393f527d6be5df09fc37bdf02fc16d4e38f56835068f4e905b5d4bb3cb5e4957e14614123ef16385192715f55fc00797fe155e8f05caa8bcb6125b5cc8982b2ca8ecaee08ea0915ebe02a4758df73c5cda94f49db45a37e6cf44a28a2bd93e7428a28a0028a28a0028a28a0028a28a002a2bab586fad66b6b88927b7990c72472282aea460823b822a5aa3ad6b763e1dd3a5bfd4aea3b4b48f1ba590e0649c003d4924000724900501b6a7e7bffc1437e18b68f65656da146fa7e9770b14114366302225ba8ff78e47be6bc63e01fc3b568f51bcd32fae345d63ecfb20bdf38336ec603988a804023aeecf515f48fedcbe3ad5478b3c376f6d60973e1cd42d258e2b9c6733472112a37a70d1b2e7fdaf438f9e3e19f84efae359b99edee26b640d8f2937118277120b703927a578188a94e9d4704ec7d3e0e9d5a90552d7febfaf33ebaf803e02bdf1c7c3b3a2ea176503da4497526dca96f94b85008e0f207d7a76afaab41d16d7c3ba45ae9d651f976d6e9b54773dc93ea49249f735e1dfb2deb3047a3eb968bba7fb14c90c92c6a580709bcc631d582b21c0fef8ef5ed3e19f1768be32d3fedda1ea96baada06d8d25acaae1187556c7dd61dd4e08af470b461187b48adffccf2b1d5eaca6e8cde8bf3b1af45145771e685145140051451400514514005417979158c7be56da09c01dc9f4a9890a093c0ae03c67e2250f846f9639a14fc4b86fe4a680376f3c4d2c71968a1551eac735f3af88fc537df10be3cff67dd5dc92691e11b34bc36abfea9efae03ac6597a131c619867a1901ec2bd7bc51a9ae9f25ec25b01610cb8383926bc47e05d8c7a9b6bfe2b94f9c7c41aa4d3ab9c7cd0464410fe05220dff0003ab51d1b4449ea9177c7f0d87897458fc33751ab4525dc93248c0b3c328442aea7d7f78d91dc161debe63f1b8d7bc17e227f097879c5d6b57ceb15b0518fbe06d6e7d8e7db1ed5f6678e7c3d6567f699638763fd8e3bc8d864e2412156fc0aaa83f4a6e95f0774dfed6b1f16dcdbc23c529666182f2e94caeb1ed902a004edc8120cb0018f4271d3c5c4e09579a7d7f43dfc1e60f0b070e8ff33a8fd9f7c0163f0e3e16e81a3595daea2cb11b9bad4003fe9373231696439e796c819e400076aa7f1024b1f06fc49f04dfe916d1596b1ad5f4d69a835ba043776a2de590f9b81f3149046cac7919600e1db39be17f165c7c2df80baa6af7ea2ea7d245c08a376ff5b2190ec4c8ec5dc0e3b579bfc44f0af8bbc17af783fe276abe257d6efde7b7d2ef34296d5638225b8215cdb6c2086525bef6edd8e7dbdfc353f755f45b7e1b1e0579b726f77b9f594378dbb63f26ae2387191593b4fdb81ec12a6b3baf963cff0011358d8b34a8a407232296a4028a28a0028a2a1bab85b588bb50063f8bb5a5d2ac638f7625b97112fe27935e17ad6be66d412191b99350f33f02323f435d17c48f1235e6b503c6fba2b7208c7af5cd795ea17ff6ad5626072cb730b7e01803fa66a24c66a7c6cf1e43a6e9fadde35f5bd9cab6ee96c6e2758849308c9440cc40c96c54ff0003e6864f05e8963032b47650c70ee4e8cb8f95bf98ff0080e7bd795fc48baf145ac675df0de9965ac6a16f04b125b5e2afcb23346c1958ba95388d867279c02b83b92efecb6baa782acb4e87c422de096e645496dadc011dba944400638c8281891d496f5c9da32f77d4cb791f4c78dad0bea5a75bf1fe95612db7cdd32781fab56e1be136a12d94abb0f961b6f6fc3dab95f8b7a90b1d52c0c6dfbe86de4755f71c83fa0a7fc44d721d36dae26899a2bcb1b612c1328f7c329e30722b37b9b2d8bbe1fb3b1d4bc15a5d85d5b4377677176d398e640e85518c80e0f07954fceae78afc0b6ff12e4f0e5eadd7fa268f7a2fe281586c965552a9bc152481b8918239c75e95c57c30935ed03e1de816ba95e47e27d46280813430adb4af0c982bb9325770014960403cfca33c75be0bf1f6a1617f6de1cbaf05eb904315a99c6b1881ed5cef3f265642c1b9e847e7d6b6578ecccdd9ee751e17d2357d2ac6f06b1a8b6a73b4ef2c72bc291148c8184c2920807760f5c1156acdb71841ec18fe39abd0eb56ba84332c6645755e56585e33ce7fbc067f0ac5b3bc06e9c29c8572a47a7268bb95db1ad343a6b79372e3d2a6aa10c9f30c75abca770cd663168a28a401585e36ba82cfc397524f379000f95b3d5bb0f7addaf1cf8e56da9dc5d41e412f6ab0821172db58939240e79e39f6a8937157434aecf2df126ac5e79406c303cad70b26a4f1ea11cbce370dded8354bc7126a902c3e73cc12321964b367dcbeccbc823d88aecbf66dd22c3c79aec969acc7f6c102994aedd81f1d03a9fd40fd3a573f3f33b753571b6a402ea3fb14d1e71bae36fe7fe4d73f6f74cb705075dd8a8b52ba6b58af232c7292a367f3155f4f98dc6b1144bf7a49828fc4e2b68b323d9fc59ad49a978d2e524fde35bbdadae01c92cde597e3ea48aea7e274b06a3e0fd7668be654b407745cff00106071f873f8d788e8fe26b8f137c46bfbe876da47717d23c52480952039d8c7f002bda9fc49a2c97ff64bf75b5b9bf8825c2804c72703767eb93cf19cf3e95a6ecbb59167c3f6e93f817c33a946c4016112b107baa05fe95dc69374ad636ae5bac79ff3f9d713f0e631ff000aae1d2a49e19a7b292e2d7cd8dc146db2b1520fa152a7f115bde1abaf33c36bb87cd1a9520fe55bc758a327b9d25a5e1b852d8c0ea0d71ba6ea4d0dfcc4838decdf99ae9f4b252d51474000feb5ce78f6c56cb5962c4c56d2207516c997079cf7a1c94412b9da59ea31bc3e62e649319dabd4d6d5b3092047008dc01c1ae0749d1a492186fad65962971b7f7800de074c8fcebb8d36e1e7b71e626c75e081d2b26516e8a28a420af39f8b5a3ddde3e9f71668a772c96f333b85015b1b7193d739c57a3555d4b4f8754b392de741246c3a3763d8fd41a4d5d01f1b7c40b3b5ba84ad8cdb76aee94a13bc9000c018e8307a7ad73df01fe215e7827e255859cd7820d22e64db732df46b1c60118cef237023b76fe62d78fb4bbcd1f5692cee2378e65959195b20923ffad5e7fad68371f68b4bb5ff008f78ee2392e194821d1581283be383f5ae193d6e6f1d158ded6b524bf9ae658db724e77023d37647e955ed2ee6b2bc6bd840696d435ca86e84a02f8fd2b92f0feac2ef4dd370dd515181ea08f948fcc1af43f0659da5d5c5e8be7f2a0689a30c47019be504fb73cd7443532b6a6df80a0935df17e9d2880ac4d6df6975c64064521973f529ff007d0af50f1678724d5b473aa5aaa477890c8221b719ce0a9cf7c6dfd6bcb7e0ceb502fc429ed6687ce10da5c092151c22ef8c7e3d3f5af7f86e2d265b18edc08a1dcccd193c2fb7e75ac753491e6dfb25eb13ea3e15f12e9170e45d59dda5ca0ce082e85481ff007ebf5af5af0f93f65bf83a1de4e3ea6bc2fe19de2fc3cfda5b54d2090967aca3246a785cb0122e3df72951fef57d051d91b5d52ec271e60ced3d41cd6f4dfbb6329ef735ec719881e0161fceb9af1c5f69f36a931b8bbfb240c066e18906361c647a8fafbd2f88355d461d4ac2c74ab34bcdd286bb691f608a100f43fde240c0f63f5a9e5bcbfd3ec6e6e9604bb28cd2491c84abbaf5dc31c67ae463a8344b7088df08dd4e607b18b51b7b9420496d34322b2b8ee31d4763f9d779a2472a45219892e4e3e6af35b2fec7332cc342bcb33310fe6daa1d858f7c8c007f0af57b48cc76f1a924b051927a9fad657064d45145020a28a2803c7bf68bd1ac64f0dc77ed6d19bc12243e763e6d85d723fcfbd7ce3e2c8921bcbe89176c6ae42af61d68a2b8ab6e6b03c234f636fe21b98633b225d43e541d064231fcd989fc6bdb4a2c3e0b49106d91ae8ee61d4e15b14515d14452f88e5fc0b712d9fc40d46582468a4fb013b94f3f7e3ff015e816daf6a11ebb668b772056ea33d7e723f9514538fc46af6327e235d4a9f17bc137cae56ed8db3994752448b835f62ea4a166b67030e4904fb6334515d14f76613e866697fbc994b725d5598fa9ff002056baf0c94514ba8335b4cb78d2e08540aaaa0851c0073e95b145152c90a28a2901ffd9),
('5050', 'ss.jpg', 0xffd8ffe000104a46494600010101006000600000ffdb0043000302020302020303030304030304050805050404050a070706080c0a0c0c0b0a0b0b0d0e12100d0e110e0b0b1016101113141515150c0f171816141812141514ffdb00430103040405040509050509140d0b0d1414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414141414ffc00011080073007303012200021101031101ffc4001f0000010501010101010100000000000000000102030405060708090a0bffc400b5100002010303020403050504040000017d01020300041105122131410613516107227114328191a1082342b1c11552d1f02433627282090a161718191a25262728292a3435363738393a434445464748494a535455565758595a636465666768696a737475767778797a838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae1e2e3e4e5e6e7e8e9eaf1f2f3f4f5f6f7f8f9faffc4001f0100030101010101010101010000000000000102030405060708090a0bffc400b51100020102040403040705040400010277000102031104052131061241510761711322328108144291a1b1c109233352f0156272d10a162434e125f11718191a262728292a35363738393a434445464748494a535455565758595a636465666768696a737475767778797a82838485868788898a92939495969798999aa2a3a4a5a6a7a8a9aab2b3b4b5b6b7b8b9bac2c3c4c5c6c7c8c9cad2d3d4d5d6d7d8d9dae2e3e4e5e6e7e8e9eaf2f3f4f5f6f7f8f9faffda000c03010002110311003f00fb9e4d489612486366190ac873f2f7e7ea3f4af8c7e2446bf10bf6a9f867a21f9e25d66e35d9cf5c259c44c59f62e5457d3da3ea57be208e631a4714910c16c9c0241c1dbe991eb5e73e01f8037fe17f8c971e3dd5b58b7bf7fec53a45b5a416cd188b74cb23c992ed927681dba579346a46b25523aa67b725ec14e12f8b45fa9eb571f78d71be34ff00907dcffd726fe46bb2b8ef5c678d3fe41f71ff005cdbf95188fe1cbd0e4a5f1a3c6f4f90a301d3200aeb74e6fdd823aedc0ae3ec9c79ca198e47d2bacd3f8e37b7a0e95f92517a1fa0c8d1d435cd3fc37a2dc6a9ab5e43a769f6a9be5b8b870a883dc9ff003cd789e9ff00b747c2ed5b5e874eb7bcbf58de510fdb66b609064900725b207b902bc6bf6e4d735ff1b7c42f08fc2cd0da79a3ba845fcf6d00c99a466654040ea15518ff00c0b35d54dff04df8ec7e1689ceaf29d6cc22468762ec5603a0afbac160687b08d4aedde5d1763e7ead6af3a8e3412b2eafb9f5c685771dfea90cb03ef85e02eac3b8e2babccebfbc836f9a8c92286e01dae18a93db38c67debe72fd9c2fb58f0f787b4bf0ceb45d35bb3b22855c7cdb525d8a48238ca32607fb04d7bb59dddfc919f9f07a1f956b86a51785aee17d9dd7e874464eb5353b7a9a774da9de7f6ade288e3ba9e6f32de3cf454440aac7d49427db777a358fed4d7ac35fb88a036d75345b2ca29986eca47f2eec1206589efd2abfdaafced2b21ea7f817fc2ac4179a81e4ca71d3ee2ff008577c2bcf5bf57708fb96692d3fe07f91a51ea93f883527bc92ca7b08d218e254b803716e4b9e0f404e33df1575b2d7316067ef73d2b14cda8bc9febd87d234ff0a92396f54c63ed0cc4b119d89c704fa7b569393a92751adffe01ced25a474474d1aaaa007834562eed47b5d3e3feb9a7f8515a737918f2b29fc39bc864fed0457f9cec60bdf0370cfea3f3aeba6e14d719f0e6d618e4d42444fde008a1ba9c12c48fd07e55d74cdf29cd77e59cbf54872edafe6cf3b1d7fac4afe5f9142e1fef5715e347034fb9ff00ae6dfc8d75f70dd6b8af1a36ed36e7fdc3fcabab13fc297a1cd457be8f19b6917cc563ea48ae92c66724331ee315c95ac9fbe00d7456727eed1bd4ff005afc7693b1fa23389ff853adae7ed25278a92e4c17573a19b2b299f3886e03039e3b15247e2d5ea7ac7c3ff1837c3597c37378cfcef1109fcd69a5b83c839da817392a3232bd38ae47c51e24d5fc3bab68f7ba6d99be8a2bd8fed10ab619a37568fe5f5219837e1ef5d56a56ba75f78820d76efc45aa594aa4b3e9e4138217a0e3a57de61710fd8c14ba58e3861e9547269db7e8ddd91ea3e185f0af8e3c19a84d234d7b71a4c363a83a0f91996491524fae1557f2af47840c91d066b86b7f137fc269e22ba6921782db48992d638dbbeddac18fb92cdc7d2baf8ee07073deb9b1b57fda2cf7491c34a2b91f2ed77f99a91e76277e6ad46df31c727ffd559ab3858f935225c7cd9cf34e1256225166b46df31cd54d4b504d3e2499836039fba327eeb510dc0f30f7c555d5195a1446c1fbdffa0b577c64ada9cfcaf60fec5bd995256d735289a4557290a2941900e071ef4563eb7e22f88967a9490e85a369177a522a0866b9bcf2e46f906ecaf6f9b23f0a2beb6385c3d97ba7cb4b1b5936aecdcf86d2eefed3ff00b67ffb3d75972c369ae1be145da5cc7aaba3875062191ff03aec6ea6dd9f4af0328ff73a7f3fcd9eb662ad899fcbf2452b863c8ae27c6adff12cb9ff0070ff002aec6e3247b5727e2ab71716e20270252109f4c9c57a5888b9539247152769a6784c21bce623a63fc6b3fe255f6a963e1bb66d19a65bafb42a0108cb11b1f8e9d32057b2c9f08edace19666bf9481ce3cb1cfa0eb563fe11a6d3eda37b5449437f0e3e6ef5f1181c8712aaa9574925f3b9fa565f4e9e669b84ad14ed7fd0f38f84de1af129d2e1d4bc46f37da655f360b59f19c073c918e325715ee8fa6d86b5a643789e597c70a4739ac2b3d62ef21278207f2d0222bc4c0aa8e9fc5cd5dd2f5cb88b4fbed96a824b701963691177e481f2127b67a75e0d7d6d5c045452a48f471796ce9d38aa2b67df7bb2f695e15b7bff000ec8d76e96daa4b79232cfb4282ad210bbbd80502b02486e6d49807ef2556da540c1c838c63d6acb5e6ada8d9a08dbeca7cdddfbadae7804e09607b93da9aad34d7e5ae773cd236e91a4e1bd49fe7515f2ac3d7b39692b6e8d21952b3f692fbba10aea0cb0ed933bb760e460f7a75bea6ac01cf1920f349ab5d69b269716a3a9ea69a7b2910cb23a8c3be0907391c95fe46b1e2b8f0f6d593fe12bd3fe6390be6a7ebf357cf3cbb154e6e31b35ea8f91c554a785ab2a35775e4ce962d48a9c96ea49a964b813f9218f258ffe82d4cd0b43d3bc450f9b61ad25caae373448180ce7fdaff38ada5f02840bfe9ec76f4fddfb1f7aeba782c5ade3a7aa3cd9e2f0fdf5f466558d8ea979670cd1de22232f01a10c78e3ae68ad686d6ef4b8c5ac5b648e3e0311c9ef457d8d395a094b7b1f313bf33e55a1cffc1f79750b7d55e08a49232d1e1d54907eff007af40fecabd7c9fb3c83ea315ec563e18b2d360115bc11a27d3fad66788bc2f2de69f3a69972ba75e95fddced109554fba6466bc9c261aa60f0f1a7f1357ff0033bb115e189acea6d73c8ef74dbbb785a47b790228c96e3007d6bce35ef1968cb7b1c33dd3a491b2be2385e5046723950456df8dbc23abe99780788ee2e352c9cc724b266ddbfdd40028fa119af26f1046b71ae4ac836aa84501471c2e315e663b1f88c3d3e79412d76ebfd7de776130b46b4f9549b3d4bfe134b3f132c4964ccd12c80ca5a278fb703e6033c9fd2b3d7c49159f892cb47727ccb92fb38e30a031ff00c749fc8d56f00e9f6ada4b1599639b76e70e3e5efdc720f4eddbad674ccfa4f8c05d5c40b7104272b346448106c75c9233839651ce3839af730d52752842a4b77ae87eb593e0a8d0c33a31d5a4dfab7b7adb4fb8efa7d1fed0dbcca09078e39a6c3e1d79269648d5a450997dab9007a9f6a8bc3f74f75ba590f2582fe439fd6b723924898ac72bc6acb875562038ce7071d47b577c7533ab52ad26e09982d0a5add24249f2d9f031c60d53d48dcc3a45d5db5c8b9b5f25d11f186563f2e3eb938ab5a93f992a91c316603f4c5721e22d786936eba6cc7c9b79f505779a4ced8d1a36650700f57d82b1934b73ba953751c5fa5fefb69e64d3786edbc6de1b9bc3f72f87bb93724c7928e8321bf3e3e84d7905bd9fc3bb396412f8eac77f2ac1edae0107e9e557b8f87b162b1ddda58dc6a6f1c4d2c8c1700a00771519e7a9eff8550bff0013b5d6a535c44d71691c8f9f2648dd803df8da7f4af3b135e346ce2937ea97e67c4f1261e956c4a9425676d74bfe0b6f9995f0e7e267c3ef07c26ca0f19584c25daaaa229b24e58f741ddabd3b45f88fa1f892eed61d2f504d4bcf95e20d046c155950b365880338c71d79f6accd2ef1ef93718a4c6c277b02a0fe079fd2a969fa93afc4ab9b736f6f71f64d22dee2de4b842cd0b4b35c249b70c31b843183feed631cc1a928cd24bc9dff0023e2278356bc5ddfa5bf33d33c90dc9519a2b223f115eed1f2da8ffb64dffc5d15d7fda187fe639bea55fb1efab7aa78c8cd4325d86cf3cd634d330901e54f1c5569af8acf0e4f53835e81c962ceb36b6daadac96f770a5c4120c34720c835f37f8dbe02c5378a14584f6b2c370acd1c776a4c9185c02a0e0e47cc39f7fc6bd6fe2878fbfe103d1e2bd11aca649046158e3391d8f4ce71d6bcfb45f8b51eb924923b223a9c1e7919eded5e7e330f4f151e49a3a70f5e7879734595bc2de07b5f86935e5b5eb5adcc7346b33797100bdc608fc3f5af38d72decee3c5c93c76932daccf985954985b1d483d33915eabac6b911d604ed99e092350481903dbfcfad43716fa66a56b88a558d23f982820015e4aa3ec5aa71768ab77eff0089f6d97e3a70519a9b576b9addbae854d2145bdac607ae4fe75b9035bb09ccc650fb3f75e58182d9fe2cf6c67a5733e1bfed4d6a69c9d3c59e9e843453cb2fccca4ff1263e5e307af7ad4fb518ef5ac769fb413b5463827b1cfa57d153ab09abc59f5d3a94f10df24b5dfe467ea49e4dc46a79c4e07fdf58ff001a5f17786ede6673247b92e57ca2a4646477ff00c787e55b2be19bed4ae034916c563138e72495da4ff2c7e35b1ae78bbc3de1b9becd76f1dd6b70f4b0dc0b8e3afaf419ae1c628d6a4e9a76db53cbcc31f1e48d3a52bcbadbe4ff003333e18e83abdf422e351b63676e2d9e231b9e70cb8ac28e3842b811a820f0715a737c46d6b5564090c3a75b671e5af2c47f4ac76fbc47b7f5af95c656a71e585277b5ee7ce2f6952729d456b9a90cb856e7a2ff008d72d0c9b7e2c6abb4e18e81618ffc09bdade8642b1b67d073f857356a0b7c59d4f3cffc482c7ff4a6f6b9a351ca2fd3f5467285a4bfae876d1431b460b4983453130171807eb4524ddb611ea57df102cb4d49e3d6addac6e215c92a72adf43f88aaba7f88ecbc4db7ec32379c87718a45dad8f5f7ae2f51f1968de29d3dacf5a48ef236180ec36c83e8693e16f84f4fd0e1b8ba8356d42e239e526049a4188a31c00383d4e79cfa57e8369f325d0f93bc526dee697c7fd4741d17e0ef89b51f144bf66d26decdd9a423e757c6102ffb458803eb5f9f3f00fe3c41f11ed5209ae16cfc456c312a9e3ce5030180ee0e3915fa63e20f0de93e30d165d2b58b48b55d3651892dee46f47fa8f5af9abc75ff0004f7f87daddc1d4fc1ab71e0bd762f9e1bcb290989587aa1ea0f7e7a56926ac937a9cda917867c49fe911adccb8973c479e0e3d3d7e95d86b1a6d8f892c156298db4e849df0938ce380d8ebf4af9ebc59a7f8bbe1024767e3bb0c46a7645ae5865ed6e0f45248e636e9c1c57b2fc2bd41b5af06daea1e6acc970ccd1ca983b94315c93dcf06b2f669bf791f4bc3d0f6d8e51e914dfe9fa9a11f8e2fac01d36f640b7ca4912449859471b5867f881fe1e846453adfc502caf924789a594e614c1c83c8f973e9cab03dd59bfba6b4351d06db548b6dc460b646187047d0d627fc2b7b5bebe68e3bc6b693c87f9a490802300e547a1f99b1f5ae2a9859def4d9fa4d5c061ece74a5cbdff005dba160fc68d471696da1c264b8be6611cb228c4700c0fb411fed303b4771835d07863c1fa65e5bddcf132b6a98791e6b850d2c8e464b6ef739ac1f0b785eded639119c35e49d243c050061507a28000ae9347865d3b5553b4a3af0c0f523b835bc30ebd9b8cf5b975307428d1952a1a4adabeff00f03a7e26045708b3ed2dd5aacee6698e016c7a7d6bb987c35630b1db6b1e73d715a306931c64958d47d1457ce53c865f6a68fcc2a66f18b69419c1456d70f191e539c90bc29f5ac8bab39347f1436aad6575335d5945667cb8c9c08e495f27feff001af604b3c7b5595b7daa00fa57a14f25a6be29b670cf359cb68d8f275d4a5c0ff43ba1ff006ccd15eb620e28ae8fec7a1dd98ff6956ec8f9bbc41aa5cd9de45a55dc12d86a770e238e1b8847cd938c8cf51df35d9e9fad4da4471c69c47180aab9ec2b16d7c49a8d942b0ce1750b3539114ebe6a0e3a8cf2a707b1ef5a76f79a36ad9292b695707185989960fa060372fe20d74d2c5479af2154a2ed64761a5f8d9a69a1b7f30a976cbe01e14024f3ee405fc6b7fc49f12a1d034a8795fb44ee238571f99c7a015e716da55de968f737281124c049a371242d8cf471c7249e0e0fb5792f8f7c46dac789ee21791d23b1fdc45b739571f7bf3c9edd08aeea0a3564e4ff00a5fd6a79d8893a50d0fa063d534ed71666bcd97eb227ef23b901d0a93c02a78eddfd2b02d74db0d2f75b6936d0d869f1bb7956f6e8123505893b40e002493c7ad791785fc70fa6de5bc523930bed85f273cef233dbb0fd6bd034ed5b51d42cccb6d696fb43b22f9b3b0380719c04f6adaa4796c7d8f06f2d5ad55dfdeb2d3cafabfc8e8667318e32f21fba2b2d6e1e3d620853e71f379d211d4e385158daa6a9e2fb78c35a5869323f4fde5c480ffe815c278d3c77e36f0e6832ea06df4986ee0923cc5b5dd0239dbbb71619e4818c572caa28ee7ec5430952a5d2b6be68f629a15dd90de5c9d430ae9b47f2b598631312b7911f9b07ef2f0370fa60715e77e179b53beb4866bdd42de733c6ae8d0db1453c723963820e78ae9ec56e6deea1649d4367a98f8fcb22b44ee8f2b1545db96faaea77d71756fa6058ee65547c12371ea39e6a1ff849b4d8f21ae17fce6b86f8913cf149a74d732ac8acaeaa2342841ca64672dc73edd6b8a5d6638504af2ab3b018f9c103fd91b48ff26bb2149495cfc133493a18ca90f3bfdeae7ba47e21b17e9283edfe7e952aebd6473892bc0d7c4d24d27fac09c12179031d41e54f5e475ef52cde2f487f7665766e70783d327fba3fbb5aaa0793f583df1756b3619f3968af12875cf32304cf6e4f43bb7678e3d28a3d8a1fd6199fe2bb68f45bc8bec4bf670f205655276e0fb74a2ea14685a5db89003f30e0d1457c7ad743ebe3b225d0f5abed2d165b5b978598e182e36b0f42a783f88ae77f696f0f69de19bef0cea9a55a258deeb418dfbc390b31541b4ecfbaa7dd40a28aeccbdbe748f371e97b26cf2a691becf136ec1da1b23d7279af74f86933cde17899d8b1c1e4ff00bef4515ee56d8f6783bfdfea7f81ff00e9513a29be60e0f236935c37c46852e3c27a82ca81c1b397391e8323f5a28ae596c7ee586f8d7f5d0e97c2abe5e9af1ae762246ea09ce188e4fe9fe735d3a93b90f7cd14511d8e2c57f11ff5d1183f18a678e6d1369c70e7f58ffc2bcb3529a413487cc7cae00f98fbff00f123f2a28af630ff00c33f9d3883fe46353feddffd2514524272dc6e04e3e51eaa3fa0a5b83b4e475c91ff008e9a28ad7a9e0fd92edab9f2baff00137fe8468a28a011ffd9);

-- --------------------------------------------------------

--
-- Table structure for table `user_register`
--

CREATE TABLE `user_register` (
  `user_id` varchar(50) DEFAULT NULL,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `Gender` varchar(50) DEFAULT NULL,
  `Date_of_birth` varchar(50) DEFAULT NULL,
  `Tel1` varchar(50) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `User` varchar(50) DEFAULT NULL,
  `backup_code` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `update_date` varchar(50) DEFAULT NULL,
  `ward_no` varchar(50) DEFAULT NULL,
  `staff_change_date_time` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user_register`
--

INSERT INTO `user_register` (`user_id`, `first_name`, `last_name`, `Gender`, `Date_of_birth`, `Tel1`, `Address`, `User`, `backup_code`, `password`, `update_date`, `ward_no`, `staff_change_date_time`) VALUES
('2525', 'Nihal', 'Peeris', 'M', '12/06/2024', '07123456789', 'Anuradhapura', 'Doctor', '12546', '2525', '05-06-2024 11:29:05', '01', '30-05-2024 15:58:56'),
('5050', 'A G J', 'Karuna', 'F', '19/06/2024', '0154663798', 'kandy', 'Sister', '12547', '5050', '05-06-2024 11:30:23', '01', '30-05-2024 15:58:56'),
('100', 'dsd', 'bhn', 'M', '12/06/2024', '07111111', 'colombo', 'Pharmacy', '12536', '150', '20-06-2024 13:25:07', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `ward_details`
--

CREATE TABLE `ward_details` (
  `ward_no` varchar(50) DEFAULT NULL,
  `ward_name` varchar(50) DEFAULT NULL,
  `ward_beds` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ward_details`
--

INSERT INTO `ward_details` (`ward_no`, `ward_name`, `ward_beds`) VALUES
('01', 'Cardiology', '50');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user_images`
--
ALTER TABLE `user_images`
  ADD PRIMARY KEY (`UID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
