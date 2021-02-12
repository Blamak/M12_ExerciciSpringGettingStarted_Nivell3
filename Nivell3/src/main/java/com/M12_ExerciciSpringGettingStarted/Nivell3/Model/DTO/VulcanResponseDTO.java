package com.M12_ExerciciSpringGettingStarted.Nivell3.Model.DTO;

import org.springframework.stereotype.Component;

@Component
public class VulcanResponseDTO extends ResponseDTO{
	
	private String name;
	private String rank;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}

}
