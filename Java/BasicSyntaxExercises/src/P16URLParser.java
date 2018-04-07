import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P16URLParser {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        String protocol = "";
        int protocolIndex = input.indexOf("://");
        if (protocolIndex != -1) {
            protocol += input.substring(0, protocolIndex);
            input = input.substring(protocolIndex + 3, input.length());
        }

        String server = "";
        String resource = "";
        int serverIndex = input.indexOf('/');
        if (serverIndex != -1) {
            server = input.substring(0, serverIndex);
            resource = input.substring(serverIndex + 1, input.length());
        } else {
            server = input;
        }

        System.out.printf("[protocol] = \"%s\"%n", protocol);
        System.out.printf("[server] = \"%s\"%n", server);
        System.out.printf("[resource] = \"%s\"", resource);
        //main ends here
    }
}
