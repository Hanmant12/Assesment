package streams;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class stream {
    public static void main(String[] args) {
      List<person> people= List.of(  new person("abc","male"),
        new person("pqr","female"),
        new person("xyz","female")
        );
      people.stream().map(person -> person.gender).collect(Collectors.toSet()).forEach(System.out::println);

        Predicate<person> check=person-> Gender.male.equals(person.gender);
        boolean ch=people.stream().allMatch(check);
        System.out.println(ch);
    }


    static class person
    {
        private final String name;
        private final String gender;

        person(String name, String gender) {
            this.name = name;
            this.gender = gender;
        }
    }


    enum Gender{
        male,female;
    }
}
