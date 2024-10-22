package pe.edu.upc.aaw.vasquezrodriguez.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Certificacion")
public class Certificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vrId;
    @Column(name = "vrName", length = 200, nullable = false)
    private String vrName;
    @Column(name = "vrCompany", length = 200, nullable = false)
    private String vrCompany;
    @Column(name = "vrDueDate", nullable = false)
    private LocalDate vrDueDate;
    @Column(name = "vrIssueDate", nullable = false)
    private LocalDate vrIssueDate;
    @Column(name = "vrScore", nullable = false)
    private int vrScore;
    @Column(name = "vrCost", nullable = false)
    private float vrCost;

    public Certificacion() {
    }

    public Certificacion(int vrId, String vrName, String vrCompany, LocalDate vrDueDate, LocalDate vrIssueDate, int vrScore, float vrCost) {
        this.vrId = vrId;
        this.vrName = vrName;
        this.vrCompany = vrCompany;
        this.vrDueDate = vrDueDate;
        this.vrIssueDate = vrIssueDate;
        this.vrScore = vrScore;
        this.vrCost = vrCost;
    }

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
