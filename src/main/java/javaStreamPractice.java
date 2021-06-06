import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class javaStreamPractice {

    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>(Arrays.asList(7,1,2,3,4,5,5,5,6,12,13,13));

        list.stream().filter(p ->p%2!=0).forEach(System.out::println);

    }


}
