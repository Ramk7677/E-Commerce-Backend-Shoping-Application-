package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.Authorities;
@Repository
public interface AuthoritiesRepository extends JpaRepository<Authorities, Integer> {

}
