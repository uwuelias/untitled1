public class Children {
    private boolean inSchool;
    public Children() {
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
