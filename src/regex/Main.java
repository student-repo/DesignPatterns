package regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile(".*<a\\s+href=\"(.*)\">.*");
//        Matcher matcher = pattern.matcher("<a href=\"www.devastzone.com\"></a>");

//        Pattern pattern = Pattern.compile("43-453");
//        Matcher matcher = pattern.matcher("4(.).*");
        Pattern pattern = Pattern.compile("[a-z | 0-9]*");
        Matcher matcher = pattern.matcher("adfasfdas123d21");
//
        matcher.matches();
//        System.out.println(matcher.group(1));
//        System.out.println("awdds7a7dwad7deaawdawd wadawdawd".matches("([a-z | \\d && [^kml]]*7){3}[a-z | \\d && [^kml]]*"));
        System.out.println("32132125612".matches("[0-9&&[^5]]*5[0-9&&[^3]]*"));
//        System.out.println("aba ab ababab a".matches(".*a.*"));
    }

}
