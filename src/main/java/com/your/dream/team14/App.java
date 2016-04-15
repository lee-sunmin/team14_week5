package com.your.dream.team14;

import java.util.logging.Logger;
import java.util.logging.Level;


class App 
{
	private static User user;
	private static Logger log;
	
	// 생성자
	public App(){
	}

	public static void main(String[] args) {
		String plan;
		int time;
		int line;
		
		log = Logger.getLogger("Logger");
			
			do{
				showMessage(0);
				plan = args[0];
			}while(!("Gold".equals(plan)||"Silver".equals(plan)));
		
			do{
				showMessage(1);
				time = Integer.parseInt(args[1]);
			}while(!(time >= 0));
		
			do{
				showMessage(2);
				line = Integer.parseInt(args[2]);
			}while(!(line > 0));		
		user = new User(plan, time, line);
		log.log(Level.INFO, "Total : " + user.getUserTotalCharge());
	}
	
	public static void showMessage(int message){
		switch(message){
			case 0:
				log.log(Level.INFO, "Plan(Gold, Silver) : ");
				break;
			case 1:
				log.log(Level.INFO, "time : ");
				break;
			case 2:
				log.log(Level.INFO, "line : ");
				break;
			default:
				break;
		}
	}
}
