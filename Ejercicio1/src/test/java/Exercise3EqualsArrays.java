import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise3EqualsArrays {

    @Test
    public void equalArrays(){

        String [] fruits = {"Bannana", "Apple", "Peach" };
        String [] fruits2 = {"Bannana", "Apple", "Peach" };

        assertThat(fruits).containsExactly(fruits2);

    }
}
