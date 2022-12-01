package Utility;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.parser.ParseException;
import org.testng.Assert;

public class assertList {
	
	
	public static void main(String[] args) throws Exception {
	
	ArrayList<Integer> ex= new  ArrayList<Integer>();
	
	for(int i =2001;i<=2016;i++) {
		ex.add(i);
	}
	for(int i =2017;i<=2029;i++) {
		ex.add(i);
	}
	System.out.println(ex);
	
	Assert.assertEquals(ex, APIData.bookTitles());
	}

}
