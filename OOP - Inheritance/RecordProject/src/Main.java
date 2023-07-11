public class Main {

    public static void main(String[] args) {

        Student s = new Student("23124",
                "Jesus",
                "19/06/98",
                "XD");

        Student1 s1 = new Student1("12314", "Ramon", "20/09/97", "XD");

        System.out.println(s);
        System.out.println(s1);

        System.out.println(s.getName());
        System.out.println(s1.name());

    }
}