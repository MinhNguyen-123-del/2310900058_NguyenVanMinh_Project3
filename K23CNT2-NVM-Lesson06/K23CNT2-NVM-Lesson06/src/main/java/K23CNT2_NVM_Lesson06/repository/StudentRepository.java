package K23CNT2_NVM_Lesson06.repository;

import K23CNT2_NVM_Lesson06.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
