import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Tests {

    @Ignore
    @Test
    public void testSetSecretValue() {
        Model model = new Model();
        model.setMinBarrier(0);
        model.setMaxBarrier(100);

        for (int i = 0; i < 1000000; i++) {
            if (model.setSecretValue() == GlobalConstants.PRIMARY_MIN_BARRIER ||
                    model.setSecretValue() == GlobalConstants.PRIMARY_MAX_BARRIER) {
                Assert.fail();
            }
        }
    }
}
