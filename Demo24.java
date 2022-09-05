package Bnglr;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Demo24 
{
	static void leap_check(int year)
	{
		//Calendar cal=Calendar.getInstance();
		GregorianCalendar cal=new GregorianCalendar();
		System.out.println(cal.isLeapYear(year));
		
	}
	public static void main(String[] args) 
	{
		leap_check(2004);
	}
}
