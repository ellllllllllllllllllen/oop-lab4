package by.bntu.fitr.povt.zavadskaya.labs.lab4.logic;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Age {

	
	public static int ageCalculation(int day, int month, int year) {
		GregorianCalendar date = new GregorianCalendar();
		
		return ((date.get(Calendar.DAY_OF_MONTH)) - day) + 
				((date.get(Calendar.MONTH) - month) * 30) + 
				((date.get(Calendar.YEAR) - year) * 365);
	
	}
}
