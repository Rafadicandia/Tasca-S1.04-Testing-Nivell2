import org.junit.jupiter.api.Test;

import java.util.List;

public class Exercise6ErrorTest {
    public static List<String> fruits=List.of("Bannana", "Per", "Apple");

    public static void getFruit(int i){
        fruits.get(i);
    }



    @Test
    public void errorTest(){
        

    }
}



