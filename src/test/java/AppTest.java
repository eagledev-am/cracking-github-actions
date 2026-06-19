import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testGetGreeting() {
        App app = new App();
        String greeting = app.getGreeting();
        assert greeting.equals("Hello World!") : "Expected 'Hello World!' but got '" + greeting + "'";
    }

    @Test
    public void testGetGoatWhenGoatIsRonaldo() {
        App app = new App();

        String ronaldoGoat = app.getGoat("Ronaldo");
        assert ronaldoGoat.equals("Ronaldo is the GOAT") : "Expected 'Ronaldo is the GOAT' but got '" + ronaldoGoat + "'";
    }

    @Test
    public void testGetGoatWhenGoatIsMessi() {
        App app = new App();

        String messiGoat = app.getGoat("Messi");
        assert messiGoat.equals("Messi is the GOAT") : "Expected 'Messi is the GOAT' but got '" + messiGoat + "'";
    }

    @Test
    public void testGetGoatWhenGoatIsUnknown() {
        App app = new App();

        String unknownGoat = app.getGoat("Neymar");
        assert unknownGoat.equals("Unknown player") : "Expected 'Unknown player' but got '" + unknownGoat + "'";

    }
}
