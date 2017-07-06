package Main;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import clock.clock;

public class mainMethod {
	public static void main(String args[]) throws IOException, InterruptedException{
		Scanner keyboard = new Scanner(System.in);
		clock countdown = new clock();
		while(System.in.available() == 0){
			countdown.printTill();
			TimeUnit.SECONDS.sleep(1);
		}
		keyboard.close();
	}
}
