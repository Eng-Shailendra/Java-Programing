import java.util.Arrays;
import java.util.regex.Pattern;

public class SplitMethod2 {
    public static void main(String[] args) {
        String csvFile = "This is     me        name  is            Suraj .";
        String[] words = csvFile.split("\\s+");
        System.out.println(Arrays.toString(words));

        System.out.println("===========================");
        String[] arr = "arde.jhe".split(".");
        System.out.println(Arrays.toString(arr));

        System.out.println("escape them using \\ or Pattern.quote() ");
        String s = "a  |b  |c";
        String regex = Pattern.quote("|");
        String[] arr2 = s.split(regex);
        System.out.println(Arrays.toString(arr2));

        String[] a = s.split("\\|");
        System.out.println(Arrays.toString(a));
        String[] a2 = s.split("\\|", -1);
        System.out.println(Arrays.toString(a2));
    }

}
