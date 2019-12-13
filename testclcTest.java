package test; 
import org.junit.Test; 
import junit.framework.Assert; 
import qwe.calculator; 
public class testclcTest { 
@Test 
public void testing(){ 
calculator k = new calculator(); 
float A=k.Result(20000,20,22,2000); 
if(A!=24000.0)Assert.fail(); 
} 
}
