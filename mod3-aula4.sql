-- INSERÇÃO
-- Inserir dados na tabela Doctor
INSERT INTO Doctor (name, login, password, medicalSpecialty, medicalRegistration, email, phone, createdAt)
VALUES
('Dr. João Silva', 'joaosilva', 'senha123', 'Cardiologia', 'CRM123456', 'joao.silva@email.com', '11999999999', '2024-01-01'),
('Dra. Maria Oliveira', 'mariaoliveira', 'senha456', 'Pediatria', 'CRM654321', 'maria.oliveira@email.com', '11988888888', '2024-01-01'),
('Dr. Carlos Santos', 'carlossantos', 'senha789', 'Ortopedia', 'CRM789012', 'carlos.santos@email.com', '11977777777', '2024-01-01');

-- Inserir dados na tabela Patient
INSERT INTO Patient (name, birthDate, email, phone, createdAt)
VALUES
('Ana Costa', '1990-05-10', 'ana.costa@email.com', '21999999999', '2024-01-01'),
('Pedro Almeida', '1985-12-15', 'pedro.almeida@email.com', '21988888888', '2024-01-01'),
('Clara Mendes', '2000-07-25', 'clara.mendes@email.com', '21977777777', '2024-01-01');

-- Inserir dados na tabela Appointment
INSERT INTO Appointment (date, doctorId, patientId, createdAt)
VALUES
('2024-11-01', 1, 1, '2024-11-01'),
('2024-11-02', 2, 2, '2024-11-02'),
('2024-11-03', 3, 3, '2024-11-03'),
('2024-11-04', 1, 2, '2024-11-04');

-- Inserir dados na tabela Prescription
INSERT INTO Prescription (date, appointmentId, medicine, dosage, instructions, createdAt)
VALUES
('2024-11-01', 1, 'Losartana', '50mg uma vez ao dia', 'Tomar pela manhã', '2024-11-01'),
('2024-11-02', 2, 'Paracetamol', '500mg a cada 8 horas', 'Tomar após as refeições', '2024-11-02'),
('2024-11-03', 3, 'Ibuprofeno', '200mg a cada 6 horas', 'Somente em caso de dor', '2024-11-03'),
('2024-11-04', 4, 'Amoxicilina', '500mg a cada 12 horas', 'Durante 7 dias', '2024-11-04');



-- CONSULTA
SELECT * FROM doctor WHERE id= 1;

SELECT * FROM patient WHERE id =1; 

SELECT * FROM appointment;

-- ATUALIZAÇÃO
UPDATE Doctor
SET phone = '11966666666'
WHERE id = 1; -- Atualiza o telefone do médico com ID 1

UPDATE Patient
SET name = 'Ana Paula Costa', email = 'ana.paula.costa@email.com'
WHERE id = 1; -- Atualiza o paciente com ID 1

-- DELEÇÃO
DELETE FROM Appointment
WHERE id = 4; -- Deleta a consulta com ID 4

-- Primeiro, deletar as consultas associadas ao médico
DELETE FROM Appointment
WHERE doctorId = 3; -- Deleta consultas associadas ao médico com ID 3

-- Depois, deletar o médico
DELETE FROM Doctor
WHERE id = 3; -- Deleta o médico com ID 3


-- PARA O FUTURO: funções agregadas e condições