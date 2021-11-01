package com.example.elsbe2.organization.core.address;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class Address {
        private String country;
        private String state;
        private String zipCode;
        private String city;
        private String address;
        private String extraAddress;
}
