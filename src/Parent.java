public class Parent {
    private boolean atWork;

    public Parent(){
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
