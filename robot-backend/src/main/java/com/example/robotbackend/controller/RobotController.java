package com.example.robotbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.robotbackend.beans.Robot;
import com.example.robotbackend.service.RobotSevice;

@RestController()
@CrossOrigin("**")
@RequestMapping(path = "app/v1")
public class RobotController {

	@Autowired
	Robot robot;
	@Autowired
	RobotSevice robotService;
	
	
	@GetMapping("/{distance}/{weight}")
	public Robot getRobotBatteryDetails(@PathVariable String  distance, @PathVariable String weight) {
		robot.setWalkedDistance(Integer.parseInt(distance));
		robot.setCarryingWeight(Integer.parseInt(weight));
		robotService.walk(robot);
		robotService.carry(robot);
		return robot;
	}
}
