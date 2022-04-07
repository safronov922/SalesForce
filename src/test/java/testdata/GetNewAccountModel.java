package testdata;

import models.SalesForceAccountModel;
import utilites.GenerateFakeMessage;

public class GetNewAccountModel {
    public  static SalesForceAccountModel getAccountWithAllFields(){
        return SalesForceAccountModel.builder()
                .accountName(GenerateFakeMessage.getAccountName())
                .phone(GenerateFakeMessage.getPhone())
                .fax((GenerateFakeMessage.getFax()))
                .webSite(GenerateFakeMessage.getWebSite())
                .type("Analyst")
                .industry("Energy")
                .employees(GenerateFakeMessage.getEmployee())
                .annualRevenue(GenerateFakeMessage.getAnnualRevenue())
                .description(GenerateFakeMessage.getDescription())
                .billingStreet(GenerateFakeMessage.getBillingStreet())
                .shippingStreet(GenerateFakeMessage.getShippingStreet())
                .billingCity(GenerateFakeMessage.getBillingCity())
                .billingState(GenerateFakeMessage.getBillingState())
                .shippingCity(GenerateFakeMessage.getShippingCity())
                .shippingState(GenerateFakeMessage.getShippingState())
                .billingZip(GenerateFakeMessage.getBillingZip())
                .billingCountry(GenerateFakeMessage.getBillingCountry())
                .shippingZip(GenerateFakeMessage.getShippingZip())
                .shippingCountry(GenerateFakeMessage.getShippingCountry())
                .build();
    }
}
