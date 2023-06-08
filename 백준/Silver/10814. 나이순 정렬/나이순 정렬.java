
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static class Person{
        int age;
        String name;

        public Person(int age, String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return age+" "+name+"\n";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        Person[] p = new Person[N];

        for(int i = 0 ; i < N ; i++){
            p[i] = new Person(sc.nextInt(),sc.next());
        }

        Arrays.sort(p, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age-o2.age;
            }
        });

        for(int i = 0 ; i < N ; i++){
            sb.append(p[i]);
        }
        System.out.println(sb);



    }
}
