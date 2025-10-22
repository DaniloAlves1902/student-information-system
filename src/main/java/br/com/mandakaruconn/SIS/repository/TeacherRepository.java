package br.com.mandakaruconn.SIS.repository;

import br.com.mandakaruconn.SIS.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TeacherRepository extends JpaRepository<Teacher, UUID> {
}
