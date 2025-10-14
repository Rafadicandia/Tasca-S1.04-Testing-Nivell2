import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class Exercise6ErrorTest {



    @Test
    public void errorTest(){

        assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class).isThrownBy(() -> ExampleArray.getFruit(3));

    }
}



