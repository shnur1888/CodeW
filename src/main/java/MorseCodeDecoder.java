import java.util.Arrays;
import java.util.stream.Collectors;

public class MorseCodeDecoder {
    public static String decode(String morseCode) {


        String result = "";
        for(String word : morseCode.trim().split("   ")) {
            for(String letter : word.split("\\s+")) {
                result += MorseCode.get(letter);
            }
            result += ' ';
        }
        return result.trim();



    }
    public static String decode2(String morseCode) {
        return Arrays.stream(morseCode.split("   "))
                .map(i -> Arrays.stream(i.split(" "))
                        .map(l -> MorseCode.get(l))
                        .filter(l -> l != null)
                        .collect(Collectors.joining()))
                .collect(Collectors.joining(" "))
                .trim();
    }


}
