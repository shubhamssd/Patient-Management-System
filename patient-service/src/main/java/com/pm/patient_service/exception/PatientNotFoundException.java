package com.pm.patient_service.exception;

public class PatientNotFoundException extends RuntimeException {
    public PatientNotFoundException(String msg) {
        super(msg);
    }
}
