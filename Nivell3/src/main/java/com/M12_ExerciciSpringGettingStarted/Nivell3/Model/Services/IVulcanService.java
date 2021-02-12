package com.M12_ExerciciSpringGettingStarted.Nivell3.Model.Services;

import com.M12_ExerciciSpringGettingStarted.Nivell3.Model.DTO.VulcanResponseDTO;

public interface IVulcanService {

	VulcanResponseDTO getVulcan();

	String defaultGreeting();

	String parameterGreeting(String name);

	String hello(String name);
}
