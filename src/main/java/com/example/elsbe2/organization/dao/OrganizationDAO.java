package com.example.elsbe2.organization.dao;

import com.example.elsbe2.organization.core.address.Address;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "nazar")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationDAO {
    @Id
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

    private String country;
    private String state;
    private String city;
    private String zipCode;
    private String address;
    private String extraAddress;
    public  long createdAt;

}