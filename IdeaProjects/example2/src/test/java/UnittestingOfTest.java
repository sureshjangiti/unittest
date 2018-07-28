import org.junit.Assert;
import org.junit.Test;

public class UnittestingOfTest {
    Test1 test = new Test1();
    @Test
    public void testingAdditionMethodSuccess(){
        Assert.assertEquals(7,test.add(3,4));
    }
    @Test
    public void testingAdditionMethodFailure(){
        Assert.assertNotEquals(6,test.add(3,4));
    }
    @Test
    public void testingIsEvenMethodSuccess(){
        Assert.assertTrue(test.iseven(2));
    }
    @Test
    public void testingIsEvenMethodFailure(){
        Assert.assertFalse(test.iseven(3));
    }
}