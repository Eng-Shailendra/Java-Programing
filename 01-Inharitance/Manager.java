
class Manager extends Bose {
    String MName;

    Manager() {
        super();
    }

    Manager(String BossName, String ManagerName, int salary) {
        super.name = BossName;
        super.salary = salary;
        this.MName = ManagerName;
    }

    
}
