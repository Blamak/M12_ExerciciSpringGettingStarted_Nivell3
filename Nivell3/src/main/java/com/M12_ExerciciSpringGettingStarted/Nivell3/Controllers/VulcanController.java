package com.M12_ExerciciSpringGettingStarted.Nivell3.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.M12_ExerciciSpringGettingStarted.Nivell3.Model.DTO.VulcanResponseDTO;
import com.M12_ExerciciSpringGettingStarted.Nivell3.Model.Services.IVulcanService;

@RestController
public class VulcanController {
	
	private final IVulcanService vulcanService;
	
	@Autowired
	public VulcanController(IVulcanService vulcanService) {
		this.vulcanService = vulcanService;
	}
	
	@GetMapping("/")
	public String defaultGreeting() {
		return vulcanService.defaultGreeting();
	}
	
	@GetMapping("/{name}")
	public String parameterGreeting(@PathVariable(name = "name") String name) {
		return vulcanService.parameterGreeting(name);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return vulcanService.hello(name);
	}
	
	@GetMapping("/vulcan/{uuid}")
	public ResponseEntity<VulcanResponseDTO> updatePrescription(@PathVariable(name="uuid") String vulcan) throws Exception {
		VulcanResponseDTO vulcanDTO = vulcanService.getVulcan();
		
		return new ResponseEntity<>(vulcanDTO, HttpStatus.OK);
	}
}
