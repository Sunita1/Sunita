-- phpMyAdmin SQL Dump
-- version 4.1.6
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 15, 2014 at 03:37 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `org`
--

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE IF NOT EXISTS `customers` (
  `customer_id` int(10) NOT NULL AUTO_INCREMENT,
  `customer_name` varchar(100) NOT NULL,
  `customer_phone` varchar(20) NOT NULL,
  `customer_address` varchar(255) NOT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`customer_id`, `customer_name`, `customer_phone`, `customer_address`) VALUES
(1, 'ram', '9818136462', 'kirtipur'),
(2, 'shyam', '988136425', 'balkhu'),
(3, 'hari', '9815136425', 'sanepa'),
(4, 'karma', '9834345634', 'baneshor'),
(5, 'mahesh', '9438457343', 'koteshor'),
(6, 'karuna', '9128345835', 'balaju'),
(7, 'gopal', '9238294957', 'nayabazar'),
(8, 'ram', '9818136462', 'kirtipur'),
(9, 'shyam', '988136425', 'balkhu'),
(10, 'hari', '9815136425', 'sanepa'),
(11, 'karma', '9834345634', 'baneshor'),
(12, 'mahesh', '9438457343', 'koteshor'),
(13, 'karuna', '9128345835', 'balaju'),
(14, 'gopal', '9238294957', 'nayabazar');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
