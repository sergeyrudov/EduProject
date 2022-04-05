import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

@Getter
@Setter
class Data {
    private int value;
    private boolean flag;
    private String name;

    public Data(int value, boolean flag, String name) {
        this.value = value;
        this.flag = flag;
        this.name = name;
    }
}

public class Demo {

    @Mock
    Data data = new Data(221, true, "Test");

    @BeforeEach
    public void setUp() {
        //data = new Data(221, true, "test");
        data = mock(Data.class);
    }

    @Test
    public void checkObj() {
      //  data.setFlag(true);
     //  data.setName("Test");
     //   data.setValue(221);

        assertThat(data).isNotNull();
    }
}
