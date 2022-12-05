import functions.LogInFunction;
import org.testng.annotations.Test;
import utility.BeforeAll;

import java.io.IOException;

public class LogInValid extends BeforeAll {

    @Test
    public void validUserLogIn() throws IOException {

        LogInFunction.logInValidUser(driver, wait);

    }

}
