public class Family {
    private int size;
    private String lastName;
    private boolean onVocation;

    public Family(String lastName, int size) {
        this.size = size;
        this.lastName = lastName;
        onVocation = false;
    }

    public int getSize() {
        return size;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean onVaction() {
        return onVocation;
    }

    public void goVocation() {
        if (onVocation) {
            System.out.println("The family is on vacation");
        }
        else {
            onVocation = true;
            System.out.println("The family left for vacation");
        }
    }
}
