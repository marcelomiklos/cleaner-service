package com.cleanerservice.cleanerservice.repository;

import com.cleanerservice.cleanerservice.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cleanerservice.cleanerservice.model.Task;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
