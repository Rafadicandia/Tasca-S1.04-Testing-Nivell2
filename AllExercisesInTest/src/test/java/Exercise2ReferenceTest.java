import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Exercise2ReferenceTest {

    @Test
    public void equalReference(){
        String a = "Option a";
        String b = a;
        assertThat(a).isSameAs(b);

    }

    @Test
    public void notEqualReference(){
        String a = "Option a";
        String b = new String("Option a");
        assertThat(a).isNotSameAs(b);

    }
}
