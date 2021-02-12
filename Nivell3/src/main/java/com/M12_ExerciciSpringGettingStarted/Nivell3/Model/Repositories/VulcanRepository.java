package com.M12_ExerciciSpringGettingStarted.Nivell3.Model.Repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.M12_ExerciciSpringGettingStarted.Nivell3.Model.DTO.VulcanResponseDTO;

@Repository
public class VulcanRepository {
	
	@Autowired
	private VulcanResponseDTO vulcanResponseDTO;

	public VulcanResponseDTO getVulcan() {
		vulcanResponseDTO.setName("T'Pol");
		vulcanResponseDTO.setRank("Commander");
		return vulcanResponseDTO;
	}



}
