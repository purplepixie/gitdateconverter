package uk.ac.qub.eeecs.dc.gitdate;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class GitDate {
	static java.util.Date fromString(String dt)
	{
		final String format = "E MMM d HH:mm:ss yyyy Z";
		try {
			return new SimpleDateFormat(format).parse(dt);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
}
