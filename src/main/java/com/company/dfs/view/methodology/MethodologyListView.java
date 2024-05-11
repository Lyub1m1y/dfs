package com.company.dfs.view.methodology;

import com.company.dfs.entity.Methodology;

import com.company.dfs.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "methodologies", layout = MainView.class)
@ViewController("Methodology.list")
@ViewDescriptor("methodology-list-view.xml")
@LookupComponent("methodologiesDataGrid")
@DialogMode(width = "64em")
public class MethodologyListView extends StandardListView<Methodology> {
}