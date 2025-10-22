package br.com.mandakaruconn.SIS.repository;

import br.com.mandakaruconn.SIS.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
