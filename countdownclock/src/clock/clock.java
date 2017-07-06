package clock;

import java.time.LocalDateTime;

public class clock {
	int dayOf;
	int hourOf;
	int minuteOf;
	int secondOf;
	public clock(){
		this.dayOf = LocalDateTime.of(2017, 7, 16, 0, 0, 0).getDayOfYear();
		this.hourOf = LocalDateTime.of(2017, 7, 16, 0, 0, 0).getHour();
		this.minuteOf = LocalDateTime.of(2017, 7, 16, 0, 0, 0).getMinute();
		this.secondOf = LocalDateTime.of(2017, 7, 16, 0, 0, 0).getSecond();
		
	}
	
	public int getDaysTill(){
		int dayTill = dayOf - LocalDateTime.now().getDayOfYear();
		return dayTill;
	}
	
	public int getHoursTill(){
		int hourTill = hourOf - LocalDateTime.now().getHour();
		if(hourTill < 0){
			hourTill += 23;
		}
		return hourTill;
	}
	
	public int getMinutesTill(){
		int minuteTill = minuteOf - LocalDateTime.now().getMinute();
		if(minuteTill < 0){
			minuteTill += 60;
		}
		return minuteTill;
	}
	
	public int getSecondsTill(){
		int secondTill = secondOf - LocalDateTime.now().getSecond();
		if(secondTill < 0){
			secondTill += 60;
		}
		return secondTill;
	}
	
	public void printTill(){
		System.out.println("Days: " + getDaysTill() + " Hours: " + getHoursTill() + " Minutes: " + getMinutesTill() + " Seconds: " + getSecondsTill());
	}
	
	
}
