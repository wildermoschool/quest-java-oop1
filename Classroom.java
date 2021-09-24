public class Classroom {

    public static void main(String[] args) {

        Wilder classMate = new Wilder("Tim", true);
        Wilder classMate2 = new Wilder("Lea", false);
        Wilder classmate3 = new Wilder("Hugo", true);

        System.out.println(classMate.whoAmI());
        System.out.println(classMate2.whoAmI());
        System.out.println(classmate3.whoAmI());

    }
}
