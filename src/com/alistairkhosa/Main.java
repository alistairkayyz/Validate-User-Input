package com.alistairkhosa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter first name: ");
        String firstname = sc.nextLine();

        System.out.print("Please enter last name: ");
        String lastname = sc.nextLine();

        System.out.print("Please enter address: ");
        String address = sc.nextLine();

        System.out.print("Please enter city: ");
        String city = sc.nextLine();

        System.out.print("Please enter state: ");
        String state = sc.nextLine();

        System.out.print("Please enter zip: ");
        String zip = sc.nextLine();

        System.out.print("Please enter phone: ");
        String phone = sc.nextLine();

        System.out.println("Validate Result:");

        if (!ValidateInput.validateFirstName(firstname))
            System.out.println("Invalid first name");
        else if (!ValidateInput.validateLastName(lastname))
            System.out.println("Invalid last name");
        else if (!ValidateInput.validateAddress(address))
            System.out.println("Invalid address");
        else if (!ValidateInput.validateCity(city))
            System.out.println("Invalid city");
        else if (!ValidateInput.validateState(state))
            System.out.println("Invalid state");
        else if (!ValidateInput.validateZip(zip))
            System.out.println("Invalid zip code");
        else if (!ValidateInput.validatePhone(phone))
            System.out.println("Invalid phone number");
        else
            System.out.println("Valid input. Thank you!");
    }
}
class ValidateInput{
    public static boolean validateFirstName(String firstname){
        return firstname.matches("[A-Z][a-zA-Z]*");
    }
    public static boolean validateLastName(String lastname){
        return lastname.matches("[a-zA-z]+(['-][a-zA-Z]+)*");
    }
    public static boolean validateAddress(String address){
        return address.matches("\\d+\\s+([a-zA-Z]+\\s[a-zA-Z]+)");
    }
    public static boolean validateCity(String city){
        return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
    public static boolean validateState(String state){
        return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z])");
    }
    public static boolean validateZip(String zip){
        return zip.matches("\\d{4}|\\d{5}");
    }
    public static boolean validatePhone(String phone){
        return phone.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}");
    }
}