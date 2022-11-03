package automation.azure.selenium;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SeleniumTest{
    
    @Test void testApplsHasAGreeting() {
        String join = "Greeting";
        assertNotNull(join, "app should have a greeting");
    }
}