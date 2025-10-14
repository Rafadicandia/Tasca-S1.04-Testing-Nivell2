import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class Exercise6ErrorTest {



    @Test
    public void errorTest(){

        assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class).isThrownBy(() -> ExampleArray.getFruit(3));

    }
}



