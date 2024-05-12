package com.company.dfs.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.webdav.entity.WebdavDocument;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import java.time.OffsetDateTime;
import java.util.UUID;

@JmixEntity
@Entity
public class Attachment {

//    @InstanceName
//    @Column(name = "NAME")
//    protected String name;

//    @ManyToOne(fetch = FetchType.LAZY) TODO delete
//    @JoinColumn(name = "FILE_ID")
//    protected FileDescriptor file;

    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    protected UUID id;

    @JoinColumn(name = "WEBDAV_DOCUMENT_ID")
    @OneToOne(fetch = FetchType.LAZY)
    protected WebdavDocument webdavDocument;

    @Column(name = "IS_MAIN")
    protected Boolean main = false;

    @InstanceName
    @Column(name = "DESCRIPTION")
    protected String description;

    @Column(name = "LAST_MODIFIED_BY")
    protected String lastModifiedBy;

    @Column(name = "LAST_MODIFIED_DATE")
    protected OffsetDateTime lastModifiedDate;

    @JoinColumn(name = "CARD_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    protected Card card;

    public WebdavDocument getWebdavDocument() {
        return webdavDocument;
    }

    public void setWebdavDocument(WebdavDocument webdavDocument) {
        this.webdavDocument = webdavDocument;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public OffsetDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Boolean isMain() {
        return main;
    }

    public void setMain(Boolean main) {
        this.main = main;
    }

    //    public WebdavDocument getWebdavDocument() {
//        return webdavDocument;
//    }
//
//    public void setWebdavDocument(WebdavDocument webdavDocument) {
//        this.webdavDocument = webdavDocument;
//    }

//    public FileDescriptor getFile() { TODO delete
//        return file;
//    }
//
//    public void setFile(FileDescriptor file) {
//        this.file = file;
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

}