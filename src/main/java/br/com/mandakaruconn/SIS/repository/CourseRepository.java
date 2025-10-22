package br.com.mandakaruconn.SIS.repository;

import br.com.mandakaruconn.SIS.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseRepository extends JpaRepository<Course, UUID> {
}
