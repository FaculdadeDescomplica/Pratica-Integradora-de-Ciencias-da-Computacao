CREATE DATABASE app_db;

USE app_db;

-- Tabela Doctor
CREATE TABLE Doctor (
    id INT NOT NULL AUTO_INCREMENT,
    name CHAR(50) NOT NULL,
    login CHAR(20) NOT NULL UNIQUE,
    password CHAR(20) NOT NULL,
    medicalSpecialty CHAR(50) NOT NULL,
    medicalRegistration CHAR(50) NOT NULL UNIQUE,
    email CHAR(50) NOT NULL UNIQUE,
    phone CHAR(20) NOT NULL,
    createdAt DATE NOT NULL,
    PRIMARY KEY (id)
);

-- Tabela Patient
CREATE TABLE Patient (
    id INT NOT NULL AUTO_INCREMENT,
    name CHAR(50) NOT NULL,
    birthDate DATE NULL,
    email CHAR(50) NOT NULL UNIQUE,
    phone CHAR(20) NOT NULL,
    createdAt DATE NOT NULL,
    PRIMARY KEY (id)
);

-- Tabela Appointment
CREATE TABLE Appointment (
    id INT NOT NULL AUTO_INCREMENT,
    date DATE NOT NULL,
    doctorId INT NOT NULL,
    patientId INT NOT NULL,
    createdAt DATE NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (doctorId) REFERENCES Doctor(id),
    FOREIGN KEY (patientId) REFERENCES Patient(id)
);

-- Tabela Prescription
CREATE TABLE Prescription (
    id INT NOT NULL AUTO_INCREMENT,
    date DATE NULL,
    appointmentId INT NOT NULL,
    medicine VARCHAR(255) NOT NULL,
    dosage VARCHAR(255) NOT NULL,
    instructions VARCHAR(255) NULL,
    createdAt DATE NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (appointmentId) REFERENCES Appointment(id)
);
