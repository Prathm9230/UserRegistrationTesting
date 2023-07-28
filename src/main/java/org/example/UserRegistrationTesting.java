package org.example;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationTesting {
    public static String validfirstname(String firstName)
    {
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        String Firstname=firstName;

        Matcher matcher=pattern.matcher(Firstname);
        String validOrNotValid;
        if(matcher.matches())
        {
            System.out.println("Nice!Your First name is valid.");
            validOrNotValid = "Valid";
        }
        else {
            System.out.println("Sorry! your First name is not valid.");
            validOrNotValid="NotValid";
        }
        return validOrNotValid;
    }
    public static String validlastname(String lastName)
    {
        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]{2,}[0-9]*$");
        String lastname=lastName;

        Matcher matcher=pattern.matcher(lastname);
        String validOrNotValid;
        if(matcher.matches())
        {
            System.out.println("Nice! your last name is valid.");
            validOrNotValid="Valid";
        }
        else {
            System.out.println("Sorry! your last name is not valid.");
            validOrNotValid = "NotValid";
        }
        return validOrNotValid;
    }
    public static String validEmail(String email)
    {
        Pattern pattern = Pattern.compile("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$");

        String mail=email;

        Matcher matcher=pattern.matcher(mail);
        String validOrNotValid;
        if(matcher.matches())
        {
            System.out.println("Nice! your Email is valid.");
            validOrNotValid="Valid";

        }
        else {
            System.out.println("Sorry! your Email is not valid.");
            validOrNotValid="NotValid";
        }
        return validOrNotValid;
    }
    public static String validMobileNumber(String mobNumber) {
        Pattern pattern = Pattern.compile("^[9][1]\s[6-9][0-9]{9}$");
        String mobNo = mobNumber;

        Matcher matcher = pattern.matcher(mobNo);
        String validOrNotValid;
        if (matcher.matches()) {
            System.out.println("Nice!your Mobile number is valid.");
            validOrNotValid="Valid";
        } else {
            System.out.println("Sorry!your Mobile number is not valid.");
            validOrNotValid="NotValid";
        }
        return validOrNotValid;
    }


    public static String validPassword(String passWord) {
        //Should have one uppercase
        Pattern pattern = Pattern.compile("(?=.*[!@#$%^&*()&/]).{8,}");
        String password = passWord;

        Matcher matcher = pattern.matcher(password);
        String validOrNotValid;
        if (matcher.matches()) {
            System.out.println("Nice!your password is valid.");
            validOrNotValid="Valid";
        } else {
            System.out.println("Sorry!your password is not valid.");
            validOrNotValid="NotValid";
        }
        return  validOrNotValid;
    }
    public static void main(String[] args) {
        validfirstname("Prathmesh");
        validlastname("Jawahire");
        validEmail("Abc@gmail.com");
        validMobileNumber("91 6756789390");
        validPassword("Abcde@123");
    }
}
