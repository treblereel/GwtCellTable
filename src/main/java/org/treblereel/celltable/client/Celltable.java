package org.treblereel.celltable.client;

import org.treblereel.celltable.shared.domain.OrganisationDTO;
import org.treblereel.celltable.shared.domain.TeamDTO;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Celltable implements EntryPoint {

	final private CellTable<TeamDTO> table = new CellTable<TeamDTO>();

	public void onModuleLoad() {

		VerticalPanel vp = new VerticalPanel();
		vp.add(new WidgetPanel(this));

		TextColumn<TeamDTO> idColumn = new TextColumn<TeamDTO>() {
			@Override
			public String getValue(TeamDTO object) {
				return object.getId().toString();
			}
		};
		table.addColumn(idColumn, "Id");

		TextColumn<TeamDTO> nameColumn = new TextColumn<TeamDTO>() {
			@Override
			public String getValue(TeamDTO object) {
				return object.getName();
			}
		};
		table.addColumn(nameColumn, "Name");

		vp.add(table);

		RootPanel.get().add(vp);
	}

	public void updateTable(OrganisationDTO result) {
		table.setRowData(result.getTeams());

	}

}
