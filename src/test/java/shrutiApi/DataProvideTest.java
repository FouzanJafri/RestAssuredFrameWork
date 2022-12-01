package shrutiApi;

import org.testng.annotations.DataProvider;

public class DataProvideTest {
	

	@DataProvider(name="dataprovide")
	public static Object[][] getData(){
		Object data[][] = {{1,"2","2",0.1},{2,"2","2",0.1}};
		return data;
	}
	

}
