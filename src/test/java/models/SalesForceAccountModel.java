package models;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
@EqualsAndHashCode
public class SalesForceAccountModel {

    private String accountName;
    private String phone;
    private String fax;
    private String webSite;
    private String type;
    private String industry;
    private String employees;
    private String annualRevenue;
    private String description;
    private String billingStreet;
    private String shippingStreet;
    private String billingCity;
    private String billingState;
    private String shippingCity;
    private String shippingState;
    private String billingZip;
    private String billingCountry;
    private String shippingZip;
    private String shippingCountry;
}
