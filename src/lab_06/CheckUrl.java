package lab_06;

import java.util.Arrays;
import java.util.Locale;

public class CheckUrl {

    public static void main(String[] args) {
        String url = "https://vnexpress.net";
        String scheme = url.split("://")[0];
        String s1 = url.split("://")[1];
        String domainName = s1.split("\\.")[0];
        String topLevelDomain = s1.split("\\.")[1];
        System.out.println("Url contains: " + scheme);
        System.out.println("Domain name is " + domainName);
        System.out.println("Top Level Domain is " + topLevelDomain);
    }
}
