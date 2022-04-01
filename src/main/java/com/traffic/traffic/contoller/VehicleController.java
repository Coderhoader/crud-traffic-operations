package com.traffic.traffic.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.traffic.traffic.entity.Vehicle;
import com.traffic.traffic.service.VehicleService;

@RestController
@RequestMapping("/traffic")
public class VehicleController {
	
	@Autowired
	VehicleService vehicleService;
	
	@GetMapping("/read/all")
	public List<Vehicle> readAll()
	{
		return vehicleService.readAll();
	}
	
	@PostMapping("/create")
	public String create(@RequestBody Vehicle traffic)
	{
		return vehicleService.create(traffic);
	}

	@PutMapping("/update/{lno}")
	public String update(@PathVariable String lno , @RequestBody Vehicle traffic)
	{
		return vehicleService.update(lno , traffic);
	}

	@DeleteMapping("/delete")
	public String delete (@RequestParam int traffic)
	{
		return vehicleService.delete(traffic);
	}
	
}
