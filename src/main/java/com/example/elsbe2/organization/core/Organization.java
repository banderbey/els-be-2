package com.example.elsbe2.organization.core;

import com.example.elsbe2.organization.core.address.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;


@Data
@Builder
public class Organization {
    private String id;
    private String folderId;
    private String title;
    private String logo;
    private String email;
    private String phoneNumber;
    private String fax;
    private String officePhone;
    private String website;
    private String notes;
    private boolean enabled;
    private final Address address;
    public final long createdAt;

}