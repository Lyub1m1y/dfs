package com.company.dfs.view.attachment;

import com.company.dfs.entity.Attachment;

import com.company.dfs.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "attachment/:id", layout = MainView.class)
@ViewController("Attachment.detail")
@ViewDescriptor("attachment-detail-view.xml")
@EditedEntityContainer("attachmentDc")
public class AttachmentDetailView extends StandardDetailView<Attachment> {
}