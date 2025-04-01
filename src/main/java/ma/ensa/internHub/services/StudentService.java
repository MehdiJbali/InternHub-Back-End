package ma.ensa.internHub.services;

import ma.ensa.internHub.domain.dto.request.StudentRequest;
import ma.ensa.internHub.domain.dto.response.StudentResponse;

import java.util.List;
import java.util.UUID;

public interface StudentService {
    StudentResponse createStudent(StudentRequest request);

    StudentResponse getStudentById(UUID id);
    StudentResponse getStudentByEmail(String email);
    long countStudents();
    List<StudentResponse> getAllStudents();
    StudentResponse updateStudentById(UUID id, StudentRequest request);
    void deleteStudentById(UUID id);

}