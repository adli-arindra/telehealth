package org.drpl.telebe.dto;

import java.math.BigDecimal;
import java.util.Date;

public class OrderRequest {
    private Long patientId;
    private Long prescriptionId;
    private boolean isPaid;

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(Long prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public boolean getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean paid) {
        isPaid = paid;
    }
}