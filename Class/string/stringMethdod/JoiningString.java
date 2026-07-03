import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringJoiner;

public class JoiningString {
    public static void main(String[] args) {
        String[] elements = { "foo", "bar", "foobar" };
        String singleString = String.join("+", elements);
        System.out.println(singleString);
        System.out.println("=======================");
        StringJoiner sj = new StringJoiner(",", "[", "]");
        sj.add("foo");
        sj.add(singleString);
        sj.add("Ram");
        System.out.println(sj.toString());

    }
}
