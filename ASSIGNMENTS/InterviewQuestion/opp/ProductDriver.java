package InterviewQuestion.opp;

public class ProductDriver {
    public static void main(String[] args) {
        Product p = new Product(); // this create a object (usnig non-prmitive data type);

        // class obj and array are not primitive data type;
        p.name = "Book";
        p.price = 9887;

        p.toDisplay();
    }
}
