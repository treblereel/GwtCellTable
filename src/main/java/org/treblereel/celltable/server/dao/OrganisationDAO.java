package org.treblereel.celltable.server.dao;

import org.treblereel.celltable.shared.domain.OrganisationDTO;

public interface OrganisationDAO {
	
	OrganisationDTO getOrganisationByName(String name);

}
