import functions.CheckOutFunction;
import functions.LogInFunction;
import org.testng.annotations.Test;
import utility.BeforeAll;

import java.io.IOException;

public class CheckOut extends BeforeAll {

    @Test
    public void checkOut() throws IOException {

        LogInFunction.logInValidUser(driver, wait);
        CheckOutFunction.checkOut(driver, wait);

    }

}
