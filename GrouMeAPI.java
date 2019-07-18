package bot;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Timer;

final class GroupMeAPI {
	public static final String VERSION = "0.0.1";
	
	public static void main(String[] args) {
		Timer timer = new Timer();
		Calendar cal = new GregorianCalendar();
		SrikarTwo bot = new SrikarTwo("b906a11ddfb776bf03d38536e3");
		timer.schedule(new run(bot,cal),0,60000);
	}
}
