package com.semanticbits.cbiit.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "clinical_trial")
public class ClinicalTrial {

    @Id
    @Column(name = "nct_id")
    private String id;

    @Column(name = "official_title")
    private String officialTitle;

    @Column(name = "phase")
    private String phase;

    @Column(name = "primary_completion_date")
    private Date primaryCompletionDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOfficialTitle() {
        return officialTitle;
    }

    public void setOfficialTitle(String officialTitle) {
        this.officialTitle = officialTitle;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public Date getPrimaryCompletionDate() {
        return primaryCompletionDate;
    }

    public void setPrimaryCompletionDate(Date primaryCompletionDate) {
        this.primaryCompletionDate = primaryCompletionDate;
    }
}
