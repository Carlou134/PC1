package pe.edu.upc.aaw.vasquezrodriguez.dtos;

import java.time.LocalDate;

public class CertificacionDTO {
    private int vrId;
    private String vrName;
    private String vrCompany;
    private LocalDate vrDueDate;
    private LocalDate vrIssueDate;
    private int vrScore;
    private float vrCost;

    public int getVrId() {
        return vrId;
    }

    public void setVrId(int vrId) {
        this.vrId = vrId;
    }

    public String getVrName() {
        return vrName;
    }

    public void setVrName(String vrName) {
        this.vrName = vrName;
    }

    public String getVrCompany() {
        return vrCompany;
    }

    public void setVrCompany(String vrCompany) {
        this.vrCompany = vrCompany;
    }

    public LocalDate getVrDueDate() {
        return vrDueDate;
    }

    public void setVrDueDate(LocalDate vrDueDate) {
        this.vrDueDate = vrDueDate;
    }

    public LocalDate getVrIssueDate() {
        return vrIssueDate;
    }

    public void setVrIssueDate(LocalDate vrIssueDate) {
        this.vrIssueDate = vrIssueDate;
    }

    public int getVrScore() {
        return vrScore;
    }

    public void setVrScore(int vrScore) {
        this.vrScore = vrScore;
    }

    public float getVrCost() {
        return vrCost;
    }

    public void setVrCost(float vrCost) {
        this.vrCost = vrCost;
    }
}
