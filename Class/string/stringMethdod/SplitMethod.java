import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String csvFile = "Mickye;Bolton;1221;hfh3994;";
        String[] dataCells = csvFile.split(";");

        System.out.println(Arrays.toString(dataCells));
    }

}
