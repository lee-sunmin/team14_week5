package com.your.dream.team14;

import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.Level;


class App 
{
	private static User user;
	private static Scanner sc;
	private static Logger log;

	
	private App(){
		
	}
	
	public static void main(String[] args) {
		String plan;
		int time;
		int line;
		sc = new Scanner(System.in);
		log = Logger.getLogger("Logger");
			
			do{
				showMessage(0);
				plan = sc.nextLine();
			}while(!("Gold".equals(plan)||"Silver".equals(plan)));
		
			do{
				showMessage(1);
				time = sc.nextInt();
			}while(!(time >= 0));
		
			do{
				showMessage(2);
				line = sc.nextInt();
			}while(!(line > 0));		
		user = new User(plan, time, line);
		log.log(Level.INFO, "Total : " + user.getUserTotalCharge());
	}
	
	private static void showMessage(int message){
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
			case 3:
				log.log(Level.INFO, "Input Error\nStart agian");
				break;
			default:
				break;
		}
	}
}
