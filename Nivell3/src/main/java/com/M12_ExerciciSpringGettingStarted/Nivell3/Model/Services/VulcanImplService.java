package com.M12_ExerciciSpringGettingStarted.Nivell3.Model.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.M12_ExerciciSpringGettingStarted.Nivell3.Model.DTO.VulcanResponseDTO;
import com.M12_ExerciciSpringGettingStarted.Nivell3.Model.Repositories.VulcanRepository;

@Service
public class VulcanImplService implements IVulcanService {
	
	
	private final VulcanRepository vulcanRepository;
	
	@Autowired
	public VulcanImplService(VulcanRepository vulcanRepository) {
		this.vulcanRepository = vulcanRepository;
	}

	@Override
	public VulcanResponseDTO getVulcan() {
		return vulcanRepository.getVulcan();
	}

	@Override
	public String defaultGreeting() {
		return "Hello World!";
	}

	@Override
	public String parameterGreeting(String name) {
		return "Hello "+ name + "!";
	}

	@Override
	public String hello(String name) {
		return "Hello " + name + "!";
	}

}
