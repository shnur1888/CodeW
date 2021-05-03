import org.testng.annotations.Test;


import static org.junit.jupiter.api.Assertions.*;


public class MorseCodeDecoderTest {
    @Test
    public void testExampleFromDescription() {
        assertEquals(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), ("HEY JUDE"));

    }
}+