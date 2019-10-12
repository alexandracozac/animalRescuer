package org.fasttrackit;


public class Medication {

    private String nameOfDrug;
    private String medicationFor;
    private String adverseEffects;
    private double doseInMg;
    private String notRecommendedIf;

    public Medication() {
        this.nameOfDrug = nameOfDrug;
        this.adverseEffects = adverseEffects;
    }

    public String getNameOfDrug() {
        return nameOfDrug;
    }

    public void setNameOfDrug(String nameOfDrug) {
        this.nameOfDrug = nameOfDrug;
    }

    public String getMedicationFor() {
        return medicationFor;
    }

    public void setMedicationFor(String medicationFor) {
        this.medicationFor = medicationFor;
    }

    public String getAdverseEffects() {
        return adverseEffects;
    }

    public void setAdverseEffects(String adverseEffects) {
        this.adverseEffects = adverseEffects;
    }

    public double getDoseInMg() {
        return doseInMg;
    }

    public void setDoseInMg(double doseInMg) {
        this.doseInMg = doseInMg;
    }

    public String getNotRecommendedIf() {
        return notRecommendedIf;
    }

    public void setNotRecommendedIf(String notRecommendedIf) {
        this.notRecommendedIf = notRecommendedIf;
    }
}
