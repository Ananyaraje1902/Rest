package com.springrest.springrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springrest.springrest.entities.PayLoads;

public interface LoadsRepository extends JpaRepository<PayLoads, Long>{
}