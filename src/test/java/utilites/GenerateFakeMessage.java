package utilites;

import com.github.javafaker.Faker;

public class GenerateFakeMessage {


    public static String getAccountName() {
        Faker faker = new Faker();
        return faker.beer().name();

    }

    public static String getPhone() {
        Faker faker = new Faker();
        return faker.phoneNumber().phoneNumber();
    }

    public static String getFax() {
        Faker faker = new Faker();
        return faker.number().digits(5);
    }

    public static String getWebSite() {
        Faker faker = new Faker();
        return faker.internet().domainName();
    }

    public static String getEmployee() {
        Faker faker = new Faker();
        return faker.chuckNorris().fact();
    }

    public static String getAnnualRevenue() {
        Faker faker = new Faker();
        return faker.number().digits(6);
    }

    public static String getDescription() {
        Faker faker = new Faker();
        return faker.weather().description();
    }

    public static String getBillingStreet() {
        Faker faker = new Faker();
        return faker.address().streetAddress();
    }

    public static String getShippingStreet() {
        Faker faker = new Faker();
        return faker.address().streetAddress();
    }

    public static String getBillingCity() {
        Faker faker = new Faker();
        return faker.address().city();
    }
    public static String getShippingCity() {
        Faker faker = new Faker();
        return faker.address().city();
    }

    public static String getShippingState() {
        Faker faker = new Faker();
        return faker.address().state();
    }

    public static String getBillingState() {
        Faker faker = new Faker();
        return faker.address().state();
    }

    public static String getBillingZip() {
        Faker faker = new Faker();
        return faker.address().zipCode();
    }

    public static String getBillingCountry() {
        Faker faker = new Faker();
        return faker.address().country();
    }

    public static String getShippingZip() {
        Faker faker = new Faker();
        return faker.address().zipCode();
    }

    public static String getShippingCountry() {
        Faker faker = new Faker();
        return faker.address().country();
    }
}
