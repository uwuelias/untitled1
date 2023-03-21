public class Main {
    public static void main(String[] args) {
        Family elias = new Family("Wu", 5);
        System.out.println(elias.getSize());
        System.out.println(elias.onVaction());
        System.out.println(elias.getLastName());
        elias.goVocation();
        Children eliasJr = new Children();
        System.out.println(eliasJr.getInSchool());
        eliasJr.goSchool();
        Parent andy = new Parent();
        System.out.println(andy.getAtWork());
        andy.goWork();
    }
}
