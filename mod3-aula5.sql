SELECT 
    Appointment.id AS consulta_id,
    Doctor.name AS medico,
    Patient.name AS paciente,
    Appointment.date AS data_horario,
    NULL AS observacoes -- Substitua por uma coluna válida, se houver
FROM Appointment
JOIN Doctor ON Appointment.doctorId = Doctor.id
JOIN Patient ON Appointment.patientId = Patient.id;
