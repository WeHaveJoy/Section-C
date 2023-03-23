import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumeralReaderTest {

    @Test
    public void testReadNumeral_Zero() {
        String numeral = "0000";
        String expected = "zero";
        assertEquals(expected, NumeralReader.readNumeral(numeral));
    }

    @Test
    public void testReadNumeral_OneDigit() {
        String numeral = "7";
        String expected = "seven";
        assertEquals(expected, NumeralReader.readNumeral(numeral));
    }

    @Test
    public void testReadNumeral_TwoDigits() {
        String numeral = "21";
        String expected = "twenty one";
        assertEquals(expected, NumeralReader.readNumeral(numeral));
    }

    @Test
    public void testReadNumeral_ThreeDigits() {
        String numeral = "123";
        String expected = "one hundred twenty three";
        assertEquals(expected, NumeralReader.readNumeral(numeral));
    }

    @Test
    public void testReadNumeral_FourDigits() {
        String numeral = "1001";
        String expected = "one thousand one";
        assertEquals(expected, NumeralReader.readNumeral(numeral));
    }

    @Test
    public void testReadNumeral_FiveDigits() {
        String numeral = "10021";
        String expected = "ten thousand twenty one";
        assertEquals(expected, NumeralReader.readNumeral(numeral));
    }

    @Test
    public void testReadNumeral_SixDigits() {
        String numeral = "123456";
        String expected = "one hundred twenty three thousand four hundred fifty six";
        assertEquals(expected, NumeralReader.readNumeral(numeral));
    }

    @Test
    public void testReadNumeral_SevenDigits() {
        String numeral = "1000001";
        String expected = "one million one";
        assertEquals(expected, NumeralReader.readNumeral(numeral));
    }

    @Test
    public void testReadNumeral_EightDigits() {
        String numeral = "12345678";
        String expected = "twelve million three hundred forty five thousand six hundred seventy eight";
        assertEquals(expected, NumeralReader.readNumeral(numeral));
    }

    @Test
    public void testReadNumeral_NineDigits() {
        String numeral = "123456789";
        String expected = "one hundred twenty three million four hundred fifty six thousand seven hundred eighty nine";
        assertEquals(expected, NumeralReader.readNumeral(numeral));
    }
}
