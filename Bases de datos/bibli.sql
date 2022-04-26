-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-07-2019 a las 03:59:24
-- Versión del servidor: 10.1.40-MariaDB
-- Versión de PHP: 7.1.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bibli`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estadosol`
--

CREATE TABLE `estadosol` (
  `IDestado` int(11) NOT NULL,
  `nombreEst` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `estadosol`
--

INSERT INTO `estadosol` (`IDestado`, `nombreEst`) VALUES
(0, 'En Espera'),
(1, 'Rechazada'),
(2, 'Reservado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `est_compra`
--

CREATE TABLE `est_compra` (
  `IDcompra` int(11) NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `est_compra`
--

INSERT INTO `est_compra` (`IDcompra`, `Nombre`) VALUES
(0, 'En Espera'),
(1, 'Compra Realizada'),
(2, 'Rechazada');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libro`
--

CREATE TABLE `libro` (
  `IDlibro` int(11) NOT NULL,
  `Codigo` varchar(45) NOT NULL,
  `Titulo` varchar(45) NOT NULL,
  `Categoria` varchar(45) NOT NULL,
  `Autor` varchar(45) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `FechaIngreso` varchar(45) NOT NULL,
  `DiasPrestamos` int(11) NOT NULL,
  `Costo` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `libro`
--

INSERT INTO `libro` (`IDlibro`, `Codigo`, `Titulo`, `Categoria`, `Autor`, `Cantidad`, `FechaIngreso`, `DiasPrestamos`, `Costo`) VALUES
(1, 'PAL404', 'Programación Estructurada', 'Programación', 'Willian Castillo', 17, '22-02-2012', 2, '$5.00'),
(2, 'POO404', 'Programación Orientados a Objetos', 'Programación', 'Walter Pérez', 0, '12-03-2018', 2, '$8.00'),
(3, 'MAD503', 'Matemática Discreta', 'Matemáticas', 'Daniel Sanchez', 3, '10-01-2010', 1, '$20.00'),
(4, 'CAL504', 'Cálculo I', 'Física', 'Idania Sanchez', 3, '10-03-2012', 2, '$20.00'),
(5, 'CAL102', 'Cálculo II', 'Física', 'José Saravia', 3, '21-09-2018', 1, '$15.00'),
(6, 'EST201', 'Estadística', 'Matemáticas', 'Fatima Batres', 4, '11-08-2017', 2, '$10.00'),
(7, 'LME404', 'HTML5', 'Programación', 'Juan Urquilla', 10, '12-07-2018', 2, '$15.00'),
(8, 'REC404', 'Redes I', 'Redes', 'Aaron Díaz', 5, '14-01-2017', 2, '$12.00'),
(9, 'SPL404', 'Servidores Linux', 'Redes', 'Aaron Díaz', 3, '12-02-2017', 2, '$10.00'),
(10, 'SPP404', 'Servidores Windows', 'Redes', 'Manual Argueta', 3, '12-02-2017', 1, '$12.00'),
(11, 'DAW404', 'JavaScript', 'Programación', 'Joel Castillo', 10, '15-04-2012', 3, '$10.00'),
(12, 'SPC404', 'PHP', 'Programación', 'Eduardo Mártinez', 4, '10-02-2014', 2, '$12.00'),
(13, 'DIF201', 'Calculo Diferencial', 'Física', 'Luis Vasquez', 4, '12-03-2015', 2, '$15.00'),
(14, 'EST102', 'Estadística II', 'Matemáticas', 'Pedro Pérez', 4, '15-03-2018', 1, '$14.00'),
(15, 'CON201', 'Contaduria I', 'Matemáticas', 'Luis Vasquez', 3, '19-09-2018', 1, '$12.00'),
(16, 'SES404', 'Mantenimineto PC', 'Informática', 'Eduardo Mártinez', 4, '01-02-2017', 2, '$15.00'),
(17, 'AMI402', 'Análisis Matemáticos', 'Matemáticas', 'Julio Valencia', 5, '10-03-2018', 2, '$12.00'),
(18, 'MAV403', 'Matemática V', 'Matemáticas', 'Julio Valencia', 4, '23-02-2017', 2, '$20.00'),
(19, 'DGC404', 'Gestores Contenidos', 'Programación', 'Henry Zepeda', 6, '20-01-2019', 2, '$15.00'),
(20, 'ELC201', 'Electrinica I', 'Electrónica', 'Alexis Molina', 6, '23-01-2018', 2, '$12.00'),
(21, 'CCN101', 'Ciencia Naturales', 'Ciencia', 'Luis Guerra', 1, 'Fri Jun 21 18:09:38 CST 2019', 2, '$10.00'),
(22, 'MAD503', 'Matemáticas Discreta', 'Matemáticas', 'Luis Areniva', 9, 'Sat Jun 22 07:42:07 CST 2019', 2, '$10.00'),
(23, 'FML100', 'Formación l', 'Literatura', 'Andres Castroa', 2, '24 - 5 - 2019', 2, '$10.00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pagolibro`
--

CREATE TABLE `pagolibro` (
  `IDpago` int(11) NOT NULL,
  `IDusuario` int(11) NOT NULL,
  `PagoLibro` varchar(45) NOT NULL,
  `ReposiciónLibro` varchar(45) NOT NULL,
  `IDcompra` int(11) NOT NULL,
  `Cantidad` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamo`
--

CREATE TABLE `prestamo` (
  `IDprestamo` int(11) NOT NULL,
  `IDusuario` int(11) NOT NULL,
  `IDlibro` int(11) NOT NULL,
  `FechaEntrega` varchar(45) DEFAULT NULL,
  `FechaDevolucion` varchar(45) DEFAULT NULL,
  `EstadoLibro` varchar(45) DEFAULT NULL,
  `Sancion` varchar(45) DEFAULT NULL,
  `Cantidad` int(11) DEFAULT NULL,
  `Hora` varchar(45) DEFAULT NULL,
  `renovaciones` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `prestamo`
--

INSERT INTO `prestamo` (`IDprestamo`, `IDusuario`, `IDlibro`, `FechaEntrega`, `FechaDevolucion`, `EstadoLibro`, `Sancion`, `Cantidad`, `Hora`, `renovaciones`) VALUES
(2, 3, 1, '6-6-2019', '6-6-2019', 'Prestado', 'Sancionado', 2, '7:35:25', '0'),
(3, 14, 4, '6-6-2019', '10-6-2019', 'Prestado', NULL, 1, '7:36:26', '1'),
(4, 3, 1, '6-6-2019', '9-6-2019', 'Prestado', NULL, 1, '7:46:47', '0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registromulta`
--

CREATE TABLE `registromulta` (
  `IDregistro` int(11) NOT NULL,
  `IDusuario` int(11) NOT NULL,
  `Multa` varchar(45) NOT NULL,
  `Tipo` varchar(45) NOT NULL,
  `Fecha` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `registromulta`
--

INSERT INTO `registromulta` (`IDregistro`, `IDusuario`, `Multa`, `Tipo`, `Fecha`, `Estado`) VALUES
(12, 3, '$20.00', 'No Devuelto', '5-6-2019', 'Pagado'),
(13, 3, '$2.00', 'Perdida de libro', '6-6-2019', 'Pagado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `IDreserva` int(11) NOT NULL,
  `IDlibro` int(11) NOT NULL,
  `IDestado` int(11) NOT NULL,
  `IDusuario` int(11) NOT NULL,
  `Canitidad` int(11) NOT NULL,
  `FechaPedido` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles`
--

CREATE TABLE `roles` (
  `IDroles` int(11) NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `roles`
--

INSERT INTO `roles` (`IDroles`, `Nombre`) VALUES
(0, 'Administrador'),
(1, 'Bibliotecario'),
(2, 'Docente'),
(3, 'Estudiante');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `IDServicio` int(11) NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`IDServicio`, `Nombre`) VALUES
(0, 'Solvente'),
(1, 'Desactivo'),
(2, 'Amonestación ');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `IDusuario` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Carnet` varchar(45) NOT NULL,
  `Contrasena` varchar(45) NOT NULL,
  `Telefono` int(11) NOT NULL,
  `IDroles` int(11) NOT NULL,
  `IDservicio` int(11) NOT NULL,
  `Correo` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`IDusuario`, `Nombre`, `Carnet`, `Contrasena`, `Telefono`, `IDroles`, `IDservicio`, `Correo`) VALUES
(1, 'Daniel Márquez', 'MS180652', '1234', 25645112, 0, 0, 'daniel@hotmail.com'),
(2, 'Josue Hernández', 'JH190001', '1234', 71829131, 1, 0, ''),
(3, 'Edwin Rauda', 'ER190002', '1234', 79124512, 2, 0, 'edwin@hotmail.com'),
(4, 'José Márquez', 'JM190003', '1234', 78531212, 3, 0, ''),
(6, 'Idania Perez', 'IP190004', '1234', 22425248, 0, 0, 'Idani@hotmail.com'),
(7, 'Angel Mártinez', 'AM190005', '123456', 22421244, 1, 0, 'ang21@hotmail.com'),
(10, 'Lourdes Perez', 'PM190006', '12345', 22312344, 0, 0, 'pedr1342o@hotmail.com'),
(12, 'Alejandro Luna', 'AL0001', '1234', 12345678, 0, 0, 'luna@hotmail.com'),
(14, 'Gloria Diaz', 'GD190008', '1234', 22425248, 2, 0, 'gloria@hotmail.com');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `estadosol`
--
ALTER TABLE `estadosol`
  ADD PRIMARY KEY (`IDestado`);

--
-- Indices de la tabla `est_compra`
--
ALTER TABLE `est_compra`
  ADD PRIMARY KEY (`IDcompra`);

--
-- Indices de la tabla `libro`
--
ALTER TABLE `libro`
  ADD PRIMARY KEY (`IDlibro`);

--
-- Indices de la tabla `pagolibro`
--
ALTER TABLE `pagolibro`
  ADD PRIMARY KEY (`IDpago`),
  ADD KEY `IDpago_idx` (`IDusuario`),
  ADD KEY `IDCompraFK_idx` (`IDcompra`);

--
-- Indices de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD PRIMARY KEY (`IDprestamo`),
  ADD KEY `IDprestamo_idx` (`IDusuario`),
  ADD KEY `IDlibroFK_idx` (`IDlibro`);

--
-- Indices de la tabla `registromulta`
--
ALTER TABLE `registromulta`
  ADD PRIMARY KEY (`IDregistro`),
  ADD KEY `IDregistroFK_idx` (`IDusuario`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`IDreserva`),
  ADD KEY `IDreserva_idx` (`IDusuario`),
  ADD KEY `IDestado_idx` (`IDestado`),
  ADD KEY `IDlibro_idx` (`IDlibro`);

--
-- Indices de la tabla `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`IDroles`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`IDServicio`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`IDusuario`),
  ADD KEY `IDservicioFK_idx` (`IDservicio`),
  ADD KEY `IDroles` (`IDroles`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `libro`
--
ALTER TABLE `libro`
  MODIFY `IDlibro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `pagolibro`
--
ALTER TABLE `pagolibro`
  MODIFY `IDpago` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  MODIFY `IDprestamo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `registromulta`
--
ALTER TABLE `registromulta`
  MODIFY `IDregistro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `IDreserva` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `IDusuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pagolibro`
--
ALTER TABLE `pagolibro`
  ADD CONSTRAINT `IDcompra` FOREIGN KEY (`IDcompra`) REFERENCES `est_compra` (`IDcompra`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `IDpago` FOREIGN KEY (`IDusuario`) REFERENCES `usuarios` (`IDusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD CONSTRAINT `IDlibroFK` FOREIGN KEY (`IDlibro`) REFERENCES `libro` (`IDlibro`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `IDprestamo` FOREIGN KEY (`IDusuario`) REFERENCES `usuarios` (`IDusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `registromulta`
--
ALTER TABLE `registromulta`
  ADD CONSTRAINT `IDregistroFK` FOREIGN KEY (`IDusuario`) REFERENCES `usuarios` (`IDusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `IDestado` FOREIGN KEY (`IDestado`) REFERENCES `estadosol` (`IDestado`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `IDlibro` FOREIGN KEY (`IDlibro`) REFERENCES `libro` (`IDlibro`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `IDreserva` FOREIGN KEY (`IDusuario`) REFERENCES `usuarios` (`IDusuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD CONSTRAINT `IDroles` FOREIGN KEY (`IDroles`) REFERENCES `roles` (`IDroles`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `IDservicioFK` FOREIGN KEY (`IDservicio`) REFERENCES `servicio` (`IDServicio`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
