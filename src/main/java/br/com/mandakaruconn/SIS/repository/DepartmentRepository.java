package br.com.mandakaruconn.SIS.repository;

import br.com.mandakaruconn.SIS.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DepartmentRepository extends JpaRepository<Department, UUID> {
}
