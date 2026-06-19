import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testGetGreeting() {
        App app = new App();
        String greeting = app.getGreeting();
        assert greeting.equals("Hello World!") : "Expected 'Hello World!' but got '" + greeting + "'";
    }
}
