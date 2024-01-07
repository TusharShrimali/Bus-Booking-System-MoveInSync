
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

CREATE TABLE `admin` (
  `Username` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `admin` (`Username`, `Password`) VALUES
('Tushar', 'Shrimali'),
('MoveInSync', 'MoveInSync');

CREATE TABLE `bus_booking` (
  `Bus_Name` varchar(30) NOT NULL,
  `Source` varchar(30) NOT NULL,
  `Destination` varchar(30) NOT NULL,
  `User` varchar(30) NOT NULL,
  `Bus_No` varchar(30) NOT NULL,
  `Paid` int(200) NOT NULL,
  `Seats` int(100) NOT NULL,
  `Name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bus_booking`
--

INSERT INTO bus_booking (Bus_Name, Source, Destination, User, Bus_No, Paid, Seats, Name)
VALUES
('Express Bus 1', 'City A', 'City B', 'User1', 'B001', 30, 50, 'John Doe'),
('Local Bus 2', 'City C', 'City D', 'User2', 'B002', 20, 30, 'Jane Doe'),
('Luxury Bus 3', 'City E', 'City F', 'User3', 'B003', 50, 20, 'Bob Smith'),
('City Shuttle 4', 'City G', 'City H', 'User4', 'B004', 15, 40, 'Alice Johnson'),
('Tour Bus 5', 'City I', 'City J', 'User5', 'B005', 40, 25, 'Charlie Brown');


CREATE TABLE `bus_detail` (
  `Bus_Name` varchar(30) NOT NULL,
  `Bus_No` varchar(30) NOT NULL,
  `Source` varchar(30) NOT NULL,
  `Destination` varchar(30) NOT NULL,
  `Time` varchar(30) NOT NULL,
  `Price` int(30) NOT NULL,
  `Seats` int(30) NOT NULL,
  `Current_Occupancy` int(30) NOT NULL,
  `Operation_Days` varchar(30) NOT NULL,
  `Distance` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `bus_detail` (`Bus_Name`, `Bus_No`, `Source`, `Destination`, `Time`, `Price`, `Seats`, `Current_Occupancy`, `Operation_Days`, `Distance`) VALUES
('Express1', 'IN123', 'Delhi', 'Mumbai', '10:00 AM', 500, 40, 10, 'Mon, Wed, Fri', 230),
('CityConnect', 'IN456', 'Bangalore', 'Chennai', '12:30 PM', 700, 30, 5, 'Tue, Thu, Sat', 340),
('MetroExpress', 'IN789', 'Kolkata', 'Hyderabad', '02:45 PM', 600, 50, 20, 'Mon, Tue, Wed, Thu, Fri', 563),
('FastTrack', 'IN234', 'Mumbai', 'Delhi', '04:15 PM', 550, 35, 15, 'Tue, Thu, Sat', 490),
('GreenLine', 'IN567', 'Chennai', 'Bangalore', '06:30 PM', 800, 25, 10, 'Mon, Wed, Fri, Sun', 120),
('HillShuttle', 'IN890', 'Hyderabad', 'Kolkata', '08:00 PM', 650, 45, 25, 'Mon, Thu, Sat, Sun', 420);

-- --------------------------------------------------------

--
-- Table structure for table `user`

CREATE TABLE `user` (
  `Name` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Gender` varchar(30) NOT NULL,
  `Username` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`Name`, `Email`, `Gender`, `Username`, `Password`) VALUES
('Rahul', 'rahulsharma349ur@gmail.com', 'Male', 'Rahul', 'Rahul123');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
