package org.treblereel.celltable.server.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.treblereel.celltable.shared.domain.OrganisationDTO;
import org.treblereel.celltable.shared.domain.TeamDTO;

public class OrganisationDAOFakeImpl implements OrganisationDAO{

	public OrganisationDTO getOrganisationByName(String name) {

		OrganisationDTO organisationDTO = new OrganisationDTO();
		organisationDTO.setName(RandomStringUtils.randomAlphabetic(10));
		organisationDTO.setId(new Random().nextInt());
		List<TeamDTO> teams = new ArrayList<TeamDTO>();
		
		for(int i= 0; i<5;i++ ){
			TeamDTO team = new TeamDTO();
			team.setName(RandomStringUtils.randomAlphabetic(10));
			team.setId(new Random().nextInt());
			teams.add(team);
		}
		organisationDTO.setTeams(teams);

		return organisationDTO;
	}

}
