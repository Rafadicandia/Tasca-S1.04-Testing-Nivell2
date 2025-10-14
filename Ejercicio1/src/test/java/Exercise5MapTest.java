import org.junit.jupiter.api.BeforeEach;

import java.util.HashMap;

public class Exercise5MapTest {

    HashMap<String, String> capitalCities = new HashMap<String, String>();

    @BeforeEach
            public void setUp(){
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

    }
    



}

