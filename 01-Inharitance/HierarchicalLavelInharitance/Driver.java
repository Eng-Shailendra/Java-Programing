package HierarchicalLavelInharitance;

public class Driver {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();

        System.out.println("Child First Father : " + c1.faterName);
        System.out.println("Child second Father : " + c2.faterName);

    }
}
