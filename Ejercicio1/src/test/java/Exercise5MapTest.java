import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat; // <-- Usa ESTE

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

    @Test
    public void containsKey(){
        assertThat(capitalCities).containsKey("England");
    }




}

