/**
 * 
 */
package studio2;

import java.util.Scanner;

/**
 * @author 13380
 *
 */
public class Ruin {

	private static int finalAmount;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The amount of money that you start with is?");
		int startAmount = in.nextInt();
		System.out.println("The win probability, or the probability that you win a single play is?");
		double winChance = in.nextDouble();
		System.out.println("The win limit is?");
		int winLimit = in.nextInt();
		System.out.println("The number of day’s you’ll simulate?");
		int totalSimulations = in.nextInt();
		String result = "";
		int losses =0;
		int totalLosses=0;
		int wins =0;
		for (int i=1; i<=totalSimulations; i++) {
			int amount = startAmount;
			losses =0;
			wins =0;
		while ((amount < winLimit) && (0<amount))	{
			boolean winChance2 = Math.random() <= winChance;
					if (winChance2==true) {
						amount++;
						result = "win";
						wins=wins+1;
						
					}
					else {
						amount--;
						result = "lose";
						losses = losses +1;

					}
		}
		if (amount ==0) {
			System.out.println("Simulation " + i + ": " + losses + " " + result);
			totalLosses++;
		}
		if (amount ==winLimit) {
			System.out.println("Simulation " + i + ": " + wins + " " + result);
		
		}
		

		}
		System.out.println("Losses: " + totalLosses + " Simulations: " + totalSimulations);
		double totalLosses1 = (int)totalLosses;
		double ruinRateFromSimulation= (totalLosses1*1.0/totalSimulations);
		System.out.println("Ruin Rate from Simulation: " + ruinRateFromSimulation);
		double x= (1-winChance)/(winChance);
		double winChance3 = Math.random();
		if (winChance3 == 0.5) {
			double expectedRuin = 1-(startAmount/winLimit);
			System.out.println("Expected Ruin Rate: " + expectedRuin);
		}
		if (winChance3 !=0.5) {
			double expectedRuin = ((Math.pow(x, startAmount)-Math.pow(x, winLimit))/(1-Math.pow(x, winLimit)));
			System.out.println("Expected Ruin Rate: " + expectedRuin);

		}
	}
}

			
			//first check if youre out of money or at win limit, if you are print "you lost"
			
			//simulate a gameplay, if math.random is smaller than the win chance you win

	
				
			
			     
			     
			     

		
		


