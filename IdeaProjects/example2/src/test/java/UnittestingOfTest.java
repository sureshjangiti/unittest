import org.junit.Assert;
import org.junit.Test;

public class UnittestingOfTest {
    @Test
    public void testingAdditionMethodSuccess(){
        Test1 test = new Test1();
        Assert.assertEquals(7,test.add(3,4));
        Assert.assertEquals(6,test.add(2,4));
    }
    @Test
    public void testingAdditionMethodFailure(){
        Test1 test = new Test1();
        Assert.assertNotEquals(6,test.add(3,4));
    }

    @Test
    public void testingIsEvenMethodSuccess(){
        Test1 test = new Test1();
        Assert.assertTrue(test.iseven(2));
    }
    @Test
    public void testingIsEvenMethodFailure(){
        Test1 test = new Test1();
        Assert.assertFalse(test.iseven(3));
    }
}