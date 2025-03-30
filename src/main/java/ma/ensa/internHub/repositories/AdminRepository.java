package ma.ensa.internHub.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.ensa.internHub.domain.entities.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, UUID> {

}