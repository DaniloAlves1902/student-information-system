package br.com.mandakaruconn.SIS.embedded;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class Address {

    private String street;

    private String number;

    private String district;

    private String city;

    private String state;

    private String zipCode;
}
