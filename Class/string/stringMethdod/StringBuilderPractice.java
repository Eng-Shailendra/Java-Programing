public class StringBuilderPractice {
    public static void main(String[] args) {
        String s1 = "Suraj";

        StringBuilder sb = new StringBuilder(100);
        for (int i = 0; i < s1.length(); i++) {
            sb.setLength(0);
            // System.out.println(sb.length());
            System.out.print(sb.append("this is String line ").append(i).append('\n').toString());
        }
    }
}
