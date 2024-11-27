public import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("file1.txt");
        strings.add("file10.txt");
        strings.add("file2.txt");
        strings.add("file20.txt");
        strings.add("file3.txt");

        strings.sort(Main::naturalCompare);

        for (String str : strings) {
            System.out.println(str);
        }
    }

    public static int naturalCompare(String s1, String s2) {
        Pattern pattern = Pattern.compile("(\\D+)|(\\d+)");
        Matcher matcher1 = pattern.matcher(s1);
        Matcher matcher2 = pattern.matcher(s2);

        while (matcher1.find() && matcher2.find()) {
            String part1 = matcher1.group();
       String part2 = matcher2.group();

            // Compare numeric parts as integers
            if (Character.isDigit(part1.charAt(0)) && Character.isDigit(part2.charAt(0))) {
                int num1 = Integer.parseInt(part1);
                int num2 = Integer.parseInt(part2);
                if (num1 != num2) {
                    return Integer.compare(num1, num2);
                }
            } else {
                // Compare non-numeric parts as strings
                int result = part1.compareTo(part2);
                if (result != 0) {
                    return result;
                }
            }
        }
        // If one string has remaining parts, it is larger
        return matcher1.hitEnd() ? (matcher2.hitEnd() ? 0 : -1) : 1;
    }
}

