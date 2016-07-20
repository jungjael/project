package kr.ac.itschool.practice;

import java.util.Timer;
import java.util.TimerTask;

import customutil.CustomDateFormat;

public class JavaTimerDemoMain {

	

	public static void main(String [] args) {
		Timer timer = new Timer();
		timer.schedule(new WorkTask(), 1,6000);
	}                               //start time
									//   last time


public static class WorkTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("-----timer----");
		String today = CustomDateFormat.dateFormat();
		System.out.println( today );
		}
	}
} 