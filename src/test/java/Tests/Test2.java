package Tests;

import org.junit.Test;

public class Test2 extends SampleTest {

    @Test
    public void Test2() {
        user.atMobileScreenPage.closeApplication();
        user.atMobileScreenPage.moveChromeToMessages();
    }
}
