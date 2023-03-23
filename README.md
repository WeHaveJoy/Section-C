# Section C

### Written code:

I chose the ´Say the number´ option. I wrote a Java code that creates a public class named NumeralReader which contains a public static function readNumeral that takes a numeral as input and returns the standard way of reading a number, complete with punctuation. You can then use this NumeralReader class in your main file to read numerals and return the output as words.


### Unit testing:

I added the following dependencies on the ´SectionC.iml´:

´´´<dependency>
<groupId>org.junit</groupId>
<artifactId>junit-bom</artifactId>
<version>5.9.1</version>
<scope>test</scope>
</dependency> ```

I wrote some Junit tests for the NumeralReader class. These Junit tests include situations with leading zeros as well as the corner case of a zero input, and they cover a range of input numeral lengths. They check to see if the output string matches the expected string for each input by testing different combinations of digit groupings.

The tests are under the test folder insinde Java folder. The file name is ´numeralTest.java´.
