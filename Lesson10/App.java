import java.util.List;
import java.util.stream.Collectors;


public class App {

    public static void main(String[] args) {
        List <Integer> ints = List.of(0,1,2,3,4,5,6,7,8,9,10);
        List <String> str = List.of("Лиса", "Кошка", "Собака", "Орел", "Рыба");
        int size = (int) ints.stream().filter(a->a==3).count();
        List <Integer> reint = ints.stream().map(a->a+1).collect(Collectors.toList());
        ints.stream().forEach(System.out::println);
        List<String> d = str.stream()
        .sorted().map(a->a+" ")
        .collect(Collectors.toList());
        System.out.println(size);
        System.out.println(str.stream().anyMatch(a->a.equals("Мышь")));
        System.out.println(str.stream().max(String::compareTo).get());
        reint.forEach(System.out::println);
        d.forEach(System.out::print);
    }
}