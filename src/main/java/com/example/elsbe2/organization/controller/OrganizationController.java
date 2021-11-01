package com.example.elsbe2.organization.controller;

import com.example.elsbe2.organization.adapter.OrganizationAdapter;
import com.example.elsbe2.organization.dto.OrganizationFormDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;

@RestController
@RequiredArgsConstructor
public class OrganizationController {

    private final OrganizationAdapter organizationAdapter;

    @PostMapping("/els/v2/organization/create")
    public ResponseEntity<String> create(@RequestBody final OrganizationFormDTO form) throws URISyntaxException {
        String location = organizationAdapter.create(form);

        return ResponseEntity.ok(location);
        // .created(new URI(location))
        // .body("ok");
    }

}
