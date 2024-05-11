package com.company.dfs.view.methodology;

import com.company.dfs.entity.Methodology;

import com.company.dfs.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "methodology/:id", layout = MainView.class)
@ViewController("Methodology.detail")
@ViewDescriptor("methodology-detail-view.xml")
@EditedEntityContainer("methodologyDc")
public class MethodologyDetailView extends StandardDetailView<Methodology> {
}