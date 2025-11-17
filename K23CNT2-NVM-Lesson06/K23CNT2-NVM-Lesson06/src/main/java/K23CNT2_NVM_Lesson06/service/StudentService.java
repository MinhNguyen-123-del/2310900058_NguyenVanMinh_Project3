package K23CNT2_NVM_Lesson06.service;

import K23CNT2_NVM_Lesson06.dto.StudentDTO;
import K23CNT2_NVM_Lesson06.entity.Student;
import K23CNT2_NVM_Lesson06.repository.StudentRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // -------------------------------
    // GET ALL
    // -------------------------------
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    // -------------------------------
    // GET ONE
    // -------------------------------
    public Optional<StudentDTO> findById(Long id) {

        Optional<Student> studentOptional = studentRepository.findById(id);

        if (studentOptional.isEmpty()) {
            return Optional.empty();
        }

        Student student = studentOptional.get();

        StudentDTO studentDTO = StudentDTO.builder()
                .id(student.getId())
                .name(student.getName())
                .email(student.getEmail())
                .age(student.getAge())
                .build();

        return Optional.of(studentDTO);
    }

    // -------------------------------
    // CREATE
    // -------------------------------
    public boolean save(StudentDTO studentDTO) {
        try {
            Student student = new Student();
            student.setName(studentDTO.getName());
            student.setEmail(studentDTO.getEmail());
            student.setAge(studentDTO.getAge());

            studentRepository.save(student);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

    // -------------------------------
    // UPDATE
    // -------------------------------
    public Student updateStudentById(Long id, StudentDTO updatedStudent) {
        return studentRepository.findById(id)
                .map(student -> {

                    student.setName(updatedStudent.getName());
                    student.setEmail(updatedStudent.getEmail());
                    student.setAge(updatedStudent.getAge());

                    return studentRepository.save(student);

                })
                .orElseThrow(() ->
                        new IllegalArgumentException("Invalid student ID: " + id));
    }

    // -------------------------------
    // DELETE
    // -------------------------------
    public void deleteStudent(Long id) {

        if (!studentRepository.existsById(id)) {
            throw new IllegalArgumentException("Invalid student ID: " + id);
        }

        studentRepository.deleteById(id);
    }
}
