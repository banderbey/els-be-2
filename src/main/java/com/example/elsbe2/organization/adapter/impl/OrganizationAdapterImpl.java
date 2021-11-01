package com.example.elsbe2.organization.adapter.impl;

import com.example.elsbe2.organization.adapter.OrganizationAdapter;
import com.example.elsbe2.organization.core.Organization;
import com.example.elsbe2.organization.core.address.Address;
import com.example.elsbe2.organization.dto.OrganizationFormDTO;
import com.example.elsbe2.organization.interactor.OrganizationInteractor;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.UUID;

@Service
@AllArgsConstructor
public class OrganizationAdapterImpl implements OrganizationAdapter {

    private final OrganizationInteractor organizationInteractor;

    @Override
    public String create(OrganizationFormDTO organizationFormDTO) {

        Organization organization = getOrganization(organizationFormDTO);

        return organizationInteractor.create(organization);
    }

    private Address getAddress(OrganizationFormDTO organizationFormDTO) {
        return Address.builder()
                .country(organizationFormDTO.getCountry())
                .address(organizationFormDTO.getAddress())
                .extraAddress(organizationFormDTO.getExtraAddress())
                .state(organizationFormDTO.getState())
                .zipCode(organizationFormDTO.getZipCode())
                .city(organizationFormDTO.getCity())
                .build();
    }

    private Organization getOrganization(OrganizationFormDTO organizationFormDTO) {
        return Organization.builder()
                .id(UUID.randomUUID().toString())
                .folderId(UUID.randomUUID().toString())
                .title(organizationFormDTO.getTitle())
                .email(organizationFormDTO.getEmail())
                .phoneNumber(organizationFormDTO.getPhoneNumber())
                .address(getAddress(organizationFormDTO))
                .fax(organizationFormDTO.getFax())
                .officePhone(organizationFormDTO.getOfficePhone())
                .website(organizationFormDTO.getWebsite())
                .notes(organizationFormDTO.getNotes())
                .createdAt(Calendar.getInstance().getTimeInMillis())
                .enabled(true)
                .build();
    }
}
