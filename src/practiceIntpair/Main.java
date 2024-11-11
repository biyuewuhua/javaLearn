package practiceIntpair;
public class Main {
    public static void main(String[] args) throws Exception {
        Pair<String> p1 = new Pair<>(String.class);
        Intpair p2 = new Intpair(123, 456);
        Class c1 = p1.getClass();
        Class c2 = p2.getClass();
        System.out.println(c1==c2); // true
        System.out.println(c1==Pair.class); // true
    }
}

