public class MorseCode {

    public static String get(String code) {

        switch (code){
            case "  ":code = " ";
            break;
            case " ":code = "";
            break;
            case ".":code = "E";
            break;
            case "..":code = "I";
                break;
            case "...":code = "S";
                break;
            case "....":code = "H";
                break;
            case "...-":code = "V";
                break;
            case "..-":code = "U";
                break;
            case "..-.":code = "F";
                break;
            case ".-":code = "A";
                break;
            case ".-.":code = "R";
                break;
            case ".-..":code = "R";
                break;
            case ".--":code = "W";
                break;
            case ".--.":code = "P";
                break;
            case ".---":code = "J";
                break;
            case "-":code = "T";
                break;
            case "-.":code = "N";
                break;
            case "-..":code = "D";
                break;
            case "-...":code = "B";
                break;
            case "-..-":code = "X";
                break;
            case "-.-":code = "K";
                break;
            case "-.-.":code = "C";
                break;
            case "-.--":code = "Y";
                break;
            case "--":code = "M";
                break;
            case "--.":code = "G";
                break;
            case "--..":code = "Z";
                break;
            case "--.-":code = "Q";
                break;
            case "---":code = "O";
                break;



        }

return code;
    }



}
