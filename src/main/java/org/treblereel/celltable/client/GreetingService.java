package org.treblereel.celltable.client;

import org.treblereel.celltable.shared.domain.OrganisationDTO;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
	OrganisationDTO getOrganisation(String name);
}
