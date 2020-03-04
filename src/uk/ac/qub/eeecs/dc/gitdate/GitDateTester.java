package uk.ac.qub.eeecs.dc.gitdate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GitDateTester {

	public static void main(String[] args) {
		
		String[] testSet = 
		{
				"Mon Dec 2 11:29:03 2019 -0800",
				"Mon Nov 25 14:33:42 2019 -0800",
				"Wed Nov 20 10:17:56 2019 -0800",
				"Thu Nov 14 13:44:34 2019 -0800",
				"Tue Nov 12 09:03:40 2019 -0800",
				"Tue Nov 12 14:10:56 2019 -0800",
				"Fri Nov 8 14:19:43 2019 -0800",
				"Thu Nov 7 10:36:12 2019 -0800",
				"Tue Nov 5 14:47:15 2019 -0800",
				"Tue Nov 5 10:22:59 2019 -0800",
				"Mon Nov 4 20:12:24 2019 -0800",
				"Mon Nov 4 15:15:28 2019 -0800",
				"Mon Nov 4 12:24:26 2019 -0800"
		};
		
		final String outFormat = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat format = new SimpleDateFormat(outFormat);
		
		for(String s : testSet)
		{
			System.out.print("Input: "+s);
			System.out.print("  Output: ");
			Date d = GitDate.fromString(s);
			if (d == null)
				System.out.print("Error - is null");
			else
				System.out.print(format.format(d));
			System.out.println();
		}

	}

}
