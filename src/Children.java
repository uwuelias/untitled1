public class Children extends Family{
    private boolean inSchool;

    public Children(String name, int age) {
        super(name, age);
        inSchool = false;
    }
    public boolean getInSchool() {
        return inSchool;
    }

    public void goSchool() {
        if (inSchool) {
            System.out.println("The childrens are in school");
        }
        else {
            inSchool = false;
            System.out.println("The childrens left for school");
        }
    }
}
