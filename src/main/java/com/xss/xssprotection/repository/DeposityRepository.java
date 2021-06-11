package com.xss.xssprotection.repository;

import com.xss.xssprotection.entity.Brand;
import com.xss.xssprotection.entity.Deposity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeposityRepository extends JpaRepository<Deposity, Long> {

}
