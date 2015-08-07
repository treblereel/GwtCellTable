package org.treblereel.celltable.client;

import org.treblereel.celltable.shared.domain.OrganisationDTO;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TextBox;

public class WidgetPanel extends HorizontalPanel{
	private final GreetingServiceAsync greetingService = GWT
			.create(GreetingService.class);
	final private TextBox textBox = new TextBox();
	final private Button sendButton = new Button("Send");
	private Celltable celltable;
	
	public WidgetPanel(Celltable celltable){
		this.celltable  = celltable;
		sendButton.addStyleName("sendButton");
		add(textBox);
		add(sendButton);
		
		sendButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent arg0) {
				sendNameToServer();
			}
		});
		
		
	}
	
	private void sendNameToServer() {
		String textToServer = textBox.getText();
		sendButton.setEnabled(false);

		greetingService.getOrganisation(textToServer,
				new AsyncCallback<OrganisationDTO>() {
					public void onFailure(Throwable caught) {
					}

					public void onSuccess(OrganisationDTO result) {
						sendButton.setEnabled(true);
						celltable.updateTable(result);
					}
				});

	}

}
