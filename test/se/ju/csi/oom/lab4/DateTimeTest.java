package se.ju.csi.oom.lab4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DateTimeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testToString() {
		DateTime _dateTime = new DateTime(2000, 1, 1, 10, 0);
		assertEquals(new String("2000-01-01 10:00"), _dateTime.toString());
		System.out.println(_dateTime.toString());
//		fail("Not yet implemented");
	}

	@Test
	public void testDateTimeString() {
		DateTime _dateTime = new DateTime(2012, 12, 12, 12, 12);
		assertEquals(new String("2012-12-12 12:12"), _dateTime.toString());
		System.out.println(_dateTime.toString());
//		fail("Not yet implemented");
	}

}
