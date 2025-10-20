import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise1EqualsTest {

    @Test

    public void equalsTest(){
        int a = 5;
        int b = 5;

        assertThat(a).isEqualTo(b);
    }

    @Test

    public void noteEqualsTest(){
        int a = 7;
        int b = 5;

        assertThat(a).isNotEqualTo(b);
    }

}
