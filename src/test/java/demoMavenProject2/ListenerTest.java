package demoMavenProject2;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.Base;

public class ListenerTest implements ITestListener
{
	
	Base b =new Base();
	
	

 
   	
    public void onTestFailure(ITestResult Result) 					
    {		
    	
    	
    	try {
			b.GetScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    					
    }		

    public void onTestSkipped(ITestResult Result)					
    {		
				
    }		

  	
  		
    public void onTestSuccess(ITestResult Result)					
    {		
				
    }		

	
	
	
	
	
	

}
