import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Exercise6ErrorTest {



    @Test
    public void errorTest(){
        assertThat(ExampleArray.fruits).

                assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class)
                // ".isThrownBy" ejecuta el código (la lambda) que debería lanzar la excepción.
                .isThrownBy(() -> ExceptionThrower.accessInvalidIndex())

    }
}



