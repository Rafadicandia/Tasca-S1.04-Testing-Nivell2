
import org.assertj.core.api.ListAssert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Exercise4ObjectArraysTest {

    @Test
    public void orderTest(){
        List<Object> zoo = new ArrayList<>();
        List<Object> zooUnorganized = new ArrayList<>();
        Animal hipo = new Animal("Hipo");
        Keeper jhon = new Keeper("Jhon");
        Animal monkey = new Animal("Monkey");
        Animal cangaroo = new Animal("Cangaroo");

        int cages = 10;

        zoo.add(hipo);
        zoo.add(jhon);
        zoo.add(monkey);
        zoo.add(cages);

        zooUnorganized.add(cages);
        zooUnorganized.add(hipo);
        zooUnorganized.add(monkey);
        zooUnorganized.add(jhon);


        assertThat(zoo).containsExactly(hipo, jhon, monkey, cages);

        assertThat(zoo).containsOnlyElementsOf(zooUnorganized);

        assertThat(zoo).containsOnlyOnce(cages);

        assertThat(zoo).doesNotContain(cangaroo);




    }




    }





