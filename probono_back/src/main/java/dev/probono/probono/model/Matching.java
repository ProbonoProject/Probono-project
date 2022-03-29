package dev.probono.probono.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Matching {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="MATCHING_ID")
    private Long id;

    private Long beneficiaryId;
    private Long donatorId;
    private Long talentId;
    
    public Matching() {}

    public Matching(Long beneficiaryId, Long donatorId, Long talentId) {
        this.beneficiaryId = beneficiaryId;
        this.donatorId = donatorId;
        this.talentId = talentId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBeneficiaryId() {
        return beneficiaryId;
    }

    public void setBeneficiaryId(Long beneficiaryId) {
        this.beneficiaryId = beneficiaryId;
    }

    public Long getDonatorId() {
        return donatorId;
    }

    public void setDonatorId(Long donatorId) {
        this.donatorId = donatorId;
    }

    public Long getTalentId() {
        return talentId;
    }

    public void setTalentId(Long talentId) {
        this.talentId = talentId;
    }

}
