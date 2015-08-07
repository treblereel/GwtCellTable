package org.treblereel.celltable.shared.domain;

import java.io.Serializable;
import java.util.List;

public class OrganisationDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private List<TeamDTO> teams;
	
	
	public OrganisationDTO(){
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public List<TeamDTO> getTeams() {
		return teams;
	}


	public void setTeams(List<TeamDTO> teams) {
		this.teams = teams;
	}
	
}
