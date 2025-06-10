package com.bugra.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
