package org.fasttrackit;

import java.time.LocalDate;

public class VetControl {

    private String vetName;
    private String animalName;
    private String ownerName;
    private String diagnosis;
    private String medicationName;
    private int dose;
    private LocalDate controlDate;
    private boolean hospitalization;

    public VetControl() {
        this.vetName = vetName;
        this.animalName = animalName;
        this.diagnosis = diagnosis;
        this.medicationName = medicationName;
    }

    public String getVetName() {
        return vetName;
    }

    public void setVetName(String vetName) {
        this.vetName = vetName;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedicationName() {
        return medicationName;
    }

    public void setMedicationName(String medicationName) {
        this.medicationName = medicationName;
    }

    public int getDose() {
        return dose;
    }

    public void setDose(int dose) {
        this.dose = dose;
    }

    public LocalDate getControlDate() {
        return controlDate;
    }

    public void setControlDate(LocalDate controlDate) {
        this.controlDate = controlDate;
    }

    public boolean isHospitalization() {
        return hospitalization;
    }

    public void setHospitalization(boolean hospitalization) {
        this.hospitalization = hospitalization;
    }
}
