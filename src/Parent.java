public class Parent extends Family{
    private boolean atWork;

    public Parent(String name, int age) {
        super(name, age);
        atWork = false;
    }
    public boolean getAtWork() {
        return atWork;
    }

    public void goWork() {
        if (atWork) {
            System.out.println("The parents are at work");
        }
        else {
            atWork = true;
            System.out.println("The parents left for work");
        }
    }
}
