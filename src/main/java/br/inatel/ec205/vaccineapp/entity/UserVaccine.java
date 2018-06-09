package br.inatel.ec205.vaccineapp.entity;


import javax.persistence.*;

@Entity
@Table
public class UserVaccine {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Long userId;

    @Column(nullable = false)
    private Long vaccineId;

    @Column(nullable = false)
    private Integer dose;

    public UserVaccine() {}

    public UserVaccine(Long userId, Long vaccineId, Integer dose) {
        this.userId = userId;
        this.vaccineId = vaccineId;
        this.dose = dose;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getVaccineId() {
        return vaccineId;
    }

    public void setVaccineId(Long vaccineId) {
        this.vaccineId = vaccineId;
    }

    public Integer getDose() {
        return dose;
    }

    public void setDose(Integer dose) {
        this.dose = dose;
    }

    public void incrementDose() {
        this.dose += 1;
    }
}
