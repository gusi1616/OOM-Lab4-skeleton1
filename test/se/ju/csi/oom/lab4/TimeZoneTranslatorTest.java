package se.ju.csi.oom.lab4;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

public class TimeZoneTranslatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testShiftTimeZone() {
		DateTime someDate = new DateTime(1993, 03, 24, 16, 00);
		
		someDate = TimeZoneTranslator.shiftTimeZone(someDate, 1, -6);
		
		assertEquals(new String("1993-03-24 09:00"), someDate.toString());
		
		System.out.println();
		System.out.println(someDate.toString());
		System.out.println("Correct date: 1993-03-24 09:00"); 
//		:)fail("Not yet implemented");
	}

	@Test
	public void testShiftEventTimeZone() {
		DateTime startDate = new DateTime(2016, 1, 1, 6, 0);
		DateTime endDate = new DateTime(2016, 1, 1, 8, 0);
		Person person = new Person("Simon");
		Place place = new Place("Somewhere", 13.37, 13.37 ,133.7);
		Event event = new Event("Test", startDate, endDate, new HashSet<>(Arrays.asList(person)), place);
		
		event = TimeZoneTranslator.shiftEventTimeZone(event, TimeZone.CENTRAL_EUROPEAN_TIME, TimeZone.US_PACIFIC);
		
		assertEquals(new String("2015-12-31 21:00"), event.getStartDate().toString());
		assertEquals(new String("2015-12-31 23:00"), event.getEndDate().toString());

		System.out.println(String.format("============\nOriginal event\n============\n%s", event.toString()));
		System.out.println();
		System.out.println(String.format("========================\nEvent shifted to US Pacific time\n========================\n%s",
				TimeZoneTranslator.shiftEventTimeZone(event, TimeZone.CENTRAL_EUROPEAN_TIME, TimeZone.US_PACIFIC).toString()));
		//fail("Not yet implemented");
	}

}
