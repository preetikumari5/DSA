// move hyphen to front

public class Main {
    public static void main(String[] args) {
        String originalString = "Preeti-Kumari";
        String transformedString = moveHyphen(originalString);
        System.out.println(transformedString)
    }
    public static String moveHyphen(String string) {
        if (string.contains("-")) {
            int hyphenIndex = string.indexOf("-");
            return "-" + string.substring(0, hyphenIndex) + string.substring(hyphenIndex + 1);
        } else {
            return string;
        }
    }
}

