package Com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Data_provider_ass {
	
	@Test(dataProvider = "getdata")
	public void DataMaxtrix(String username,String password,int moblie,String browser) {
		
	}

	
	@DataProvider
	
	public Object [][]getdata(){
		Object[][]data=new Object[3][4];
		
		
		data[0][0]="username";
	    data[0][1]="abhi";
	    data[0][2]=123456789;
	    data[0][3]="xyz";
				
	    data[1][0]="username1";
	    data[1][1]="abhi1";
	    data[1][2]=1234567891;
	    data[1][3]="xyz1";
		
	    data[2][0]="username2";
	    data[2][1]="abhi2";
	    data[2][2]=1234567892;
	    data[2][3]="xyz2";
		
		return data;
		
		
	}
}
