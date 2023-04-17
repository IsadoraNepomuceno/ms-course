package com.coursemsb.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coursemsb.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
