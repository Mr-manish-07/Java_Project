public class secInHourMin {
	public String timeConversion (int second) {
		int min = second / 60;
		int sec = second % 60;
		int hour = 0;
		int day = 0;
		if (min >= 60) {
			hour = min / 60;
			min = min % 60;
			if (hour >= 24){
				day = hour / 24;
				hour = hour % 24;
			}
		}
		return " Day is "+day+"\n Hour is " + hour + "\n min is " + min + "\n sec is " + sec;
	}
}
