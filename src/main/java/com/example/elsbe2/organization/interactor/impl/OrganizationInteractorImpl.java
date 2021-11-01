package com.example.elsbe2.organization.interactor.impl;

import com.example.elsbe2.organization.core.Organization;
import com.example.elsbe2.organization.dao.OrganizationDAO;
import com.example.elsbe2.organization.interactor.OrganizationInteractor;
import com.example.elsbe2.organization.store.OrganizationJPA;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrganizationInteractorImpl implements OrganizationInteractor {

    public final OrganizationJPA organizationJPA;

    @Override
    public String create(Organization organization) {
        OrganizationDAO dao = OrganizationDAO.builder()
                .id(organization.getId())
                .folderId(organization.getFolderId())
                .logo(organization.getLogo())
                .email(organization.getEmail())
                .phoneNumber(organization.getPhoneNumber())
                .fax(organization.getFax())
                .officePhone(organization.getOfficePhone())
                .website(organization.getWebsite())
                .notes(organization.getNotes())
                .enabled(organization.isEnabled())
                .createdAt(organization.getCreatedAt())
                .country(organization.getAddress().getCountry())
                .state(organization.getAddress().getState())
                .city(organization.getAddress().getCity())
                .zipCode(organization.getAddress().getZipCode())
                .address(organization.getAddress().getAddress())
                .extraAddress(organization.getAddress().getExtraAddress())
                .build();

        organizationJPA.save(dao);

        return organization.getId();
    }
}
