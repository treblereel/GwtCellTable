package org.treblereel.celltable.client;

import org.treblereel.celltable.shared.domain.OrganisationDTO;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void getOrganisation(String name, AsyncCallback<OrganisationDTO> callback);

}
