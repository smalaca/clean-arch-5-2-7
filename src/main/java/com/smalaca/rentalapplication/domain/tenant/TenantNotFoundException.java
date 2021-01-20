package com.smalaca.rentalapplication.domain.tenant;

public class TenantNotFoundException extends RuntimeException {
    public TenantNotFoundException(String tenantId) {
        super("Tenant with id: " + tenantId + " does not exist.");
    }
}
