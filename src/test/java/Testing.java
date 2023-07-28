import org.example.UserRegistrationTesting;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class Testing {

    @Test
     public void fNameTesting()
    {
        assertEquals("Valid", UserRegistrationTesting.validfirstname("Prathmesh"));
    }
    @Test
    public void lNameTesting()
    {
        assertEquals("Valid", UserRegistrationTesting.validlastname("Jawahire"));
    }
    @Test
   public  void emailTesting()
    {
        assertEquals("Valid", UserRegistrationTesting.validEmail("Abc@gmail.com"));
    }
    @Test
    public void mobNoTesting()
    {
        assertEquals("Valid", UserRegistrationTesting.validMobileNumber("91 6756789390"));
    }
    @Test
   public  void passwordTesting()
    {
        assertEquals("Valid", UserRegistrationTesting.validPassword("Abcde@123"));
    }

    public static void main(String[] args) {

    }
}
