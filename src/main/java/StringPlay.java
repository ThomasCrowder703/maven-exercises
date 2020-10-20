import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class StringPlay {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a String");
        String input = scan.nextLine();
        System.out.println("You entered \"" +input+"\"");
        if (StringUtils.isNumeric(input)){
            System.out.println("You entered a number");
        }else{
            System.out.println("You did not enter a number");
        }

        System.out.println("You string with the opposite case entered is is: "+ StringUtils.swapCase(input));

        System.out.println("Your string backwards is: " + StringUtils.reverse(input));
    }
}
