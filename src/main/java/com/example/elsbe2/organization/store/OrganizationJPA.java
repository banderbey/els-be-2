package com.example.elsbe2.organization.store;

import com.example.elsbe2.organization.core.Organization;
import com.example.elsbe2.organization.dao.OrganizationDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizationJPA extends JpaRepository<OrganizationDAO,String> {
}
