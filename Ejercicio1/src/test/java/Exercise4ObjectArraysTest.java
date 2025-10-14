
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Exercise4ObjectArraysTest {

    @Test
    public void correctOrder(){
        List<Object> zoo = new ArrayList<>();
        Animal hipo = new Animal("Hipo");
        Keeper jhon = new Keeper("Jhon");
        Animal monkey = new Animal("Monkey");
        int cages = 10;

        zoo.add(hipo);
        zoo.add(jhon);
        zoo.add(monkey);
        zoo.add(cages);

        assertThat(zoo).containsExactly(hipo, jhon, monkey, cages);


    }




}
