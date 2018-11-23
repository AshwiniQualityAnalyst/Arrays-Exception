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
