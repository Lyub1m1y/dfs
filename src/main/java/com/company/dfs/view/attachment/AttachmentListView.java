package com.company.dfs.view.attachment;

import com.company.dfs.entity.Attachment;

import com.company.dfs.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "attachments", layout = MainView.class)
@ViewController("Attachment.list")
@ViewDescriptor("attachment-list-view.xml")
@LookupComponent("attachmentsDataGrid")
@DialogMode(width = "64em")
public class AttachmentListView extends StandardListView<Attachment> {
}