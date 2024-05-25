package com.company.dfs.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.entity.annotation.OnDelete;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.webdav.entity.WebdavDocument;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@JmixEntity
@Entity
public class Card extends StandardEntity {
    @Column(name = "NAME", length = 50)
    protected String name = "";

    @OnDelete(DeletePolicy.UNLINK)
    @JoinColumn(name = "DOCUMENT_ID")
    @OneToOne(fetch = FetchType.LAZY)
    private WebdavDocument document;

    @Column(name = "STATUS")
    protected String status;

    @Column(name = "DESCRIPTION", length = 1000)
    protected String description;

    public WebdavDocument getDocument() {
        return document;
    }

    public void setDocument(WebdavDocument document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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