import functions.LogInFunction;
import org.testng.annotations.Test;
import utility.BeforeAll;

import java.io.IOException;

public class LogOut extends BeforeAll {

        @Test
        public void LogOut() throws IOException {

            LogInFunction.logInValidUser(driver, wait);
            LogInFunction.logOut(driver, wait);

        }

}
