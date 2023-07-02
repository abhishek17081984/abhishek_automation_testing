package Com.TestNG;

import org.testng.annotations.Test;


@Test(groups = "All_test_Done")
public class TestNG_Groups {
	
	
	@Test(groups = {"somke"})
public void tc1() {
   System.out.println("this logic of TC1");
		
	}
	
	
	@Test(groups = {"somke","sanity"})
public void tc2() {
	System.out.println("this logic of TC2");
		
	}

	
	@Test(groups = {"somke","sanity","regression"})
public void tc3() {
	System.out.println("this logic of TC3");
	
}
	
@Test(groups = {"window.sanity",})
public void tc4() {
	System.out.println("this logic of TC4");
	
}

@Test(groups = {"linux.regression"})
public void tc5() {
	System.out.println("this logic of TC5");
	
}

	

}
