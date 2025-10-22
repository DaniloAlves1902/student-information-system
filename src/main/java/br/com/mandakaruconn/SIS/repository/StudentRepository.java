package br.com.mandakaruconn.SIS.repository;

import br.com.mandakaruconn.SIS.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {
}
