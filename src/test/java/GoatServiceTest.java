import com.eagledev.services.GoatService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = GoatService.class)
public class GoatServiceTest {
    private GoatService goatService;

    @BeforeEach
    void setUp() {
        goatService = new GoatService();
    }

    @Test
    void getGoat_whenPlayerIsRonaldo_returnsRonaldoMessage() {
        String result = goatService.getGoat("Ronaldo");
        assertEquals("Ronaldo is the GOAT", result);
    }

    @Test
    void getGoat_whenPlayerIsRonaldoLowerCase_returnsRonaldoMessage() {
        String result = goatService.getGoat("ronaldo");
        assertEquals("Ronaldo is the GOAT", result);
    }

    @Test
    void getGoat_whenPlayerIsRonaldoUpperCase_returnsRonaldoMessage() {
        String result = goatService.getGoat("RONALDO");
        assertEquals("Ronaldo is the GOAT", result);
    }

    @Test
    void getGoat_whenPlayerIsMessi_returnsMessiMessage() {
        String result = goatService.getGoat("Messi");
        assertEquals("Messi is the GOAT", result);
    }

    @Test
    void getGoat_whenPlayerIsMessiLowerCase_returnsMessiMessage() {
        String result = goatService.getGoat("messi");
        assertEquals("Messi is the GOAT", result);
    }

    @Test
    void getGoat_whenPlayerIsMessiUpperCase_returnsMessiMessage() {
        String result = goatService.getGoat("MESSI");
        assertEquals("Messi is the GOAT", result);
    }


    @Test
    void getGoat_whenPlayerIsAboutrika_returnsAboutrikaMessage() {
        String result = goatService.getGoat("Aboutrika");
        assertEquals("Aboutrika is the GOAT", result);
    }

    @Test
    void getGoat_whenPlayerIsUnknown_returnsAboutrikaMessage() {
        String result = goatService.getGoat("Neymar");
        assertEquals("Aboutrika is the GOAT", result);
    }

    @Test
    void getGoat_whenPlayerIsEmptyString_returnsAboutrikaMessage() {
        String result = goatService.getGoat("");
        assertEquals("Aboutrika is the GOAT", result);
    }
}
