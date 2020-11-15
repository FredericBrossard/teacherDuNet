import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {


@Test
    public void test0() throws Exception 
    {   
        assertEquals(false,IsItANumber.isDigit("s2324"));
    }
     @Test
    public void test1() throws Exception 
    {   
        assertEquals(true,IsItANumber.isDigit("-234.4"));
    }

}
