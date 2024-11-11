// sort
import java.util.Arrays;

public class useArrayssortByCompareTo {
    public static void main(String[] args) {
        Person[] ps = new Person[] {
            new Person("Bob", 61),
            new Person("Alice", 88),
            new Person("Lily", 75),
            new Person("a", 1),
            new Person("b", 23),
            new Person("c", 34),
            new Person("d", 43),
            new Person("e", 25),
            new Person("f", 25),
            new Person("g", 52),
            new Person("h", 99),
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }
}

class Person implements Comparable<Person> {
    String name;
    Integer score;
    Person(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public int compareTo(Person other) {
        return other.score.compareTo(this.score);
    }
    public String toString() {
        return this.name + "-" + this.score;
    }
}