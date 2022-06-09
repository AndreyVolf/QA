import org.junit.Assert;
import org.junit.Test;

public class SimpleTests1 {
    @Test
    public void testMark0()
    {
        var actualResult  = getMarkResult(12);
          Assert.assertEquals("2",  actualResult);
    }
    @Test
    public void testMark1()
    {
        var actualResult  = getMarkResult(14);
        Assert.assertEquals("2",  actualResult);
    }
    @Test
    public void testMark2()
    {
        var actualResult  = getMarkResult(15);
        Assert.assertEquals("2",  actualResult);
    }
    @Test
    public void testMark3()
    {
        var actualResult  = getMarkResult(35);
        Assert.assertEquals("3",  actualResult);
    }
    @Test
    public void testMark4()
    {
        var actualResult  = getMarkResult(36);
        Assert.assertEquals("3",  actualResult);
    }
    @Test
    public void testMark(int i, String s)
    {
        var actualResult  = getMarkResult(37);
        Assert.assertEquals("3",  actualResult);
    }
    @Test
    public void testMark5()
    {
        var actualResult  = getMarkResult(55);
        Assert.assertEquals("4",  actualResult);
    }
    @Test
    public void testMark6()
    {
        var actualResult  = getMarkResult(56);
        Assert.assertEquals("4",  actualResult);
    }
    @Test
    public void testMark7()
    {
        var actualResult  = getMarkResult(57);
        Assert.assertEquals("4",  actualResult);
    }
    @Test
    public void testMark8()
    {
        var actualResult  = getMarkResult(97);
        Assert.assertEquals("5",  actualResult);
    }
    @Test
    public void ALLTests()
    {
     testMark(0,"2" );
     testMark(35,"2");
     testMark(37,"2");
     testMark(39,"3");
     testMark(60,"4");
     testMark(90,"5");

    }
private void testMark(Integer mark, String expectedMarkResult)
    {
        var actualResult = getMarkResult(mark);
        Assert.assertEquals(expectedMarkResult,actualResult);
    }
    private String getMarkResult(Integer mark)

    {

        if(mark>=0 && mark <=35) return "2";

        if(mark>35 && mark <=56) return "3";

        if(mark>56 && mark<71) return "4";

        if(mark>72 && mark<100) return "5";

        return "no mark result";

    }




    }



