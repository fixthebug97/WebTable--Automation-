package testPages;

import java.util.ArrayList;

public interface Communicate {
	public int numberOfRows();
	public ArrayList<String> versions(int rowcount);
	public ArrayList<String> years(int rowcount);
	String beforexpath_Version="//*[@id='main']/table/tbody/tr[";
	String afterxpath_Version="]/td[1]";
	
	String beforexpath_year="//*[@id='main']/table/tbody/tr[";
	String afterxpath_year="]/td[2]";
}
