package com.traffic.traffic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traffic.traffic.entity.Vehicle;
import com.traffic.traffic.repository.TrafficRepository;

@Service
public class VehicleService {
	
	@Autowired
	TrafficRepository trafficRepository;

	public List<Vehicle> vehicle = new ArrayList<Vehicle>();
	
	public List<Vehicle> readAll() {
		
		return trafficRepository.findAll();
	}

	public String create(Vehicle traffic) {
		trafficRepository.save(traffic);
		return "Successfully Added!";
	}

	public String update(String lno, Vehicle traffic) {
		trafficRepository.save(traffic);
		return "Successfully Updated!";
	}

	public String delete(int traffic) {
		trafficRepository.deleteById(traffic);
		return "Successfully Deleted";
	}
	
	
	
	
	

}
