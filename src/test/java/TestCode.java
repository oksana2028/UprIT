import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class TestCode {

    @Test
    public void IsnotA() throws Exception {
        String result = Main.IsA("na");
        Assert.assertEquals("Nah... That's not a...", result);
    }

    @Test
    public void IsA() throws Exception {
        String result = Main.IsA("a");
        Assert.assertEquals("Wow! That's a!", result);
    }

}
