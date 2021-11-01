package com.example.elsbe2.organization.dto;

import com.example.elsbe2.organization.core.Organization;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationFormDTO {

    public String folderId;
    public String title;
    public String email;
    public String phoneNumber;
    public String country;
    public String state;
    public String city;
    public String zipCode;
    public String address;
    public String extraAddress;
    public String fax;
    public String officePhone;
    public String website;
    public String notes;
}
