package com.traffic.traffic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.traffic.traffic.entity.Vehicle;
import com.traffic.traffic.repository.TrafficRepository;
import com.traffic.traffic.contoller.VehicleController;


@SpringBootApplication
public class TrafficApplication {

	@Autowired
	TrafficRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(TrafficApplication.class, args);
	}

//	@Override
//	public void run(String[] args)
//	{
////		Vehicle tr = repository.findById(3).get();
////		System.out.println(tr.getTotalvehicle());
////		Vehicle tr1 = new Vehicle();
////		tr1.setTime("07-00-00");
////		tr1.setVtr1(33);
////		tr1.setVtr2(42);
////		tr1.setVtr3(50);
////		tr1.setVtr4(40);
////		tr1.setVtr5(25);
////		tr1.setTotalvehicle(190);
////		repository.save(tr1);
//		List<Vehicle> allrecords = repository.findAll();
//		
//		for(Vehicle item : allrecords)
//		{
//			System.out.println(item.getTotalvehicle());
//		}
//	}
	
	
	
}

