import org.junit.Test;
import static org.junit.Assert.*;

public class calculator {
    static int add(int a,int b)
    {
        return a+b;
    }
    static int comp(int a,int b){
        if(a==b){
            return 1;
        }
        else{
            return 0;
        }
    }
    @Test
    public void test4() {
        String str= "Junit is working fine";
        assertEquals("Junit is working fine",str);
    }



    @Test
    public void test1(){
        assertEquals(3,add(1,2));
    }
    @Test
    public void test2(){
        assertEquals(6,add(2,4));
    }
    @Test
    public void test3(){
        assertEquals(1,comp(2,2));

    }
}
