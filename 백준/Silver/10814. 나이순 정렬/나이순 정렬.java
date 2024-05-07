import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    static class Person implements Comparable<Person>{
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
        @Override
        public int compareTo(Person o){
            return this.age-o.age;
        }
    }
    private static StringBuilder sb;
    private static BufferedReader br;
    private static StringTokenizer st;
    private static int N;
    private static ArrayList<Person> list = new ArrayList<>();

    //입력
    public static void input() throws Exception {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < N ; i++){
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            list.add(new Person(age,name));
        }
    }

    //실행
    public static void process() {
        Collections.sort(list);
        for(Person p : list){
            sb.append(p.age).append(" ").append(p.name).append("\n");
        }

        System.out.println(sb.toString());
    }


    public static void main(String[] args) throws Exception {
        input();
        process();
    }
}
