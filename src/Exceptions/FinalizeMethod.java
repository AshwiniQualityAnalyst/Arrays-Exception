package Exceptions;

import java.util.GregorianCalendar;

public class FinalizeMethod extends GregorianCalendar {

	public static void main(String[] args) throws Throwable {

		FinalizeMethod F = new FinalizeMethod();
		FinalizeMethod F1 = new FinalizeMethod();
		System.out.println("1"+F.getTime());
		System.out.println("2"+F1.getCalendarType());

		F.finalize();
		F1.finalize();

	}

}

// final and finally are keywords in java whereas finalize is a method
// final keyword can be used with class variables so that they can’t be reassigned, with class to avoid extending by classes and with methods to avoid overriding by subclasses
// 
