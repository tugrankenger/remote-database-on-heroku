package com.tugrankenger.remote_sql.repositories;

import com.tugrankenger.remote_sql.models.Hello;

import org.springframework.data.repository.CrudRepository;

public interface HelloRepository extends CrudRepository<Hello, Integer> {
    
}
