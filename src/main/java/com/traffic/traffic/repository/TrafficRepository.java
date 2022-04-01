package com.traffic.traffic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.traffic.traffic.entity.Vehicle;

@Repository
public interface TrafficRepository extends JpaRepository<Vehicle , Integer > {

}
