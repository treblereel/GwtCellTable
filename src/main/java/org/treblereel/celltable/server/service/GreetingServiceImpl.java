package org.treblereel.celltable.server.service;

import org.apache.commons.lang3.RandomStringUtils;
import org.treblereel.celltable.server.dao.OrganisationDAO;
import org.treblereel.celltable.server.dao.OrganisationDAOFakeImpl;
import org.treblereel.celltable.shared.domain.OrganisationDTO;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
		org.treblereel.celltable.client.GreetingService {

	//@Inject instead
	private OrganisationDAO organisationDAO = new OrganisationDAOFakeImpl();

	public OrganisationDTO getOrganisation(String name) {
		return organisationDAO.getOrganisationByName(name);
	}

}
