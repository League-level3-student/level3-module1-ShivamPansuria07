package _06_Meeting_Scheduler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class MeetingScheduler {
	/*
	 * Your task is to code a method to find a meeting time for two people given
	 * their schedules.
	 * 
	 * Code the method below so that it returns a Schedule object that contains all
	 * the times during the week that are in BOTH people's schedules. The Schedule
	 * class is included in this package.
	 * 
	 * Example: person1 availability - Monday at 9, Tuesday at 14, and Friday 10
	 * person2 availability - Tuesday at 14, Friday 8, and Monday at 9 The returned
	 * HashMap should contain: Tuesday 14 and Monday 9
	 * 
	 * The returned Schedule object represents the times both people are available
	 * for a meeting.
	 * 
	 * Time availability is always at the top of the hour, so 9:30 is not valid Time
	 * availability always represents 1 hour Assume both schedules are in the same
	 * time zones
	 */

	public static Schedule getMutualAvailability(Schedule person1, Schedule person2) {
		Schedule time = new Schedule();
		HashMap<String, ArrayList<Integer>> p1Schedule = person1.getSchedule();
		HashMap<String, ArrayList<Integer>> p2Schedule = person2.getSchedule();
		for(String day : p1Schedule.keySet()){
			for(String day2 : p2Schedule.keySet()){
		 for(ArrayList<Integer> date : p1Schedule.values()){
			 for(ArrayList<Integer> date2 : p2Schedule.values()){
		            	for (int i = 0; i < date.size(); i++) {
							for (int j = 0; j < date2.size(); j++) {
								if(i==j && day==day2) {
									
									time.addAvailability(day, j);
									}
									
								}
							}
						}
		            	
		            }
		        }
	        
		
		return time;
	}
}
