//package com.company.dfs.entity;
//
//import io.jmix.core.entity.annotation.JmixGeneratedValue;
//import io.jmix.core.metamodel.annotation.InstanceName;
//import io.jmix.core.metamodel.annotation.JmixEntity;
//import io.jmix.webdav.entity.WebdavDocument;
//import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
//import jakarta.persistence.FetchType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Index;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.Table;
//
//import java.time.OffsetDateTime;
//import java.util.UUID;
//
//@JmixEntity
//@Table(name = "WEBDAV_DOCUMENT", indexes = {
//        @Index(name = "IDX_WEBDAV_DOCUMENT_WEBDAV_DOCUMENT", columnList = "WEBDAV_DOCUMENT_ID")
//})
//@Entity
//public class WebdavDocumentWrapper {
//    @JmixGeneratedValue
//    @Column(name = "ID", nullable = false)
//    @Id
//    private UUID id;
//
//    @InstanceName
//    @Column(name = "DESCRIPTION")
//    private String description;
//
//    @Column(name = "LAST_MODIFIED_BY")
//    private String lastModifiedBy;
//
//    @Column(name = "LAST_MODIFIED_DATE")
//    private OffsetDateTime lastModifiedDate;
//
//    @JoinColumn(name = "WEBDAV_DOCUMENT_ID")
//    @OneToOne(fetch = FetchType.LAZY)
//    private WebdavDocument webdavDocument;
//
//    public WebdavDocument getWebdavDocument() {
//        return webdavDocument;
//    }
//
//    public void setWebdavDocument(WebdavDocument webdavDocument) {
//        this.webdavDocument = webdavDocument;
//    }
//
//    public OffsetDateTime getLastModifiedDate() {
//        return lastModifiedDate;
//    }
//
//    public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
//        this.lastModifiedDate = lastModifiedDate;
//    }
//
//    public String getLastModifiedBy() {
//        return lastModifiedBy;
//    }
//
//    public void setLastModifiedBy(String lastModifiedBy) {
//        this.lastModifiedBy = lastModifiedBy;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public UUID getId() {
//        return id;
//    }
//
//    public void setId(UUID id) {
//        this.id = id;
//    }
//}