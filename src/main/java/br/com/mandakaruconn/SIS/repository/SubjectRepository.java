package br.com.mandakaruconn.SIS.repository;

import br.com.mandakaruconn.SIS.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SubjectRepository extends JpaRepository<Subject, UUID> {
}
