package com.company.dfs.entity;

import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import java.util.List;

@JmixEntity
@Entity
public class Card extends StandardEntity {

    @InstanceName
    @Column(name = "NAME")
    private String name;

    @OneToMany(mappedBy = "card", fetch = FetchType.LAZY)
    @Composition
    private List<Attachment> attachments;

    @Column(name = "STATUS")
    protected String status;

    @Column(name = "DESCRIPTION", length = 1000)
    protected String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}