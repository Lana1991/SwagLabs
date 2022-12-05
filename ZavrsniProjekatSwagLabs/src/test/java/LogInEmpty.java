import functions.LogInFunction;
import org.testng.annotations.Test;
import utility.BeforeAll;

import java.io.IOException;

public class LogInEmpty extends BeforeAll{


    @Test
    public void emptyUsernameLogIn() throws IOException {

        LogInFunction.emptyUsername(driver, wait);

    }

}
