package br.com.mandakaruconn.SIS.repository;

import br.com.mandakaruconn.SIS.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SchoolRepository extends JpaRepository<School, UUID> {
}
