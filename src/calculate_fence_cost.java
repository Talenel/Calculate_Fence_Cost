import java.util.Scanner;

public class calculate_fence_cost {
	
	
	public static void main(String[] args){
	
		int perimeter;
		int fencingType;
		int numGates=0;
		int cost=0;
		Scanner user =new Scanner(System.in);
		
		System.out.println("Please Input total length in feet");
		int length=user.nextInt();
		
		System.out.println("Please Input total width in feet");
		int width=user.nextInt();
		perimeter= calculatePerimeter(length, width);
		
		boolean incorrect=true;
		System.out.println("Please Input desired fencing type, input 1 for wood ($25/ft) or 2 for chain link($15/ft)");
		
		while(incorrect==true)
		{
			fencingType=user.nextInt();
			if(fencingType==1)
			{
				cost=25;
				incorrect=false;
			}
			else{
				if(fencingType==2)
				{
				    cost=15;
			    	incorrect=false;
				}
				else
			    {
			    	System.out.println("The value you inputted is incorrect");
				    System.out.println("Please Input desired fencing type, input 1 for wood ($25/ft) or 2 for chain link($15/ft)");
				}
			}
		}
		System.out.println("Please Input desired number of gates 1,2 or 3");
		incorrect=true;
		while(incorrect==true)
		{
			numGates=user.nextInt();
			if(numGates==1||numGates==2||numGates==3)
			{
				cost=25;
				incorrect=false;
			}
			else
			{
				System.out.println("The value you inputted is incorrect");
				System.out.println("Please Input desired number of gates 1,2 or 3");
				numGates=0;
			}
		}
		
		double totalCost=calculateCost(perimeter, cost, numGates);
		System.out.println(totalCost);
		
	}

	private static int calculatePerimeter(int length, int width) {
		// TODO Auto-generated method stub
		return 2*(length+width);
	}

	public static double calculateCost(int aPerimeter, int aCost, int aGates)
	{
	    double totalCost;
		totalCost=aPerimeter*aCost+150*aGates;
		double tax=totalCost*0.06;
		totalCost=totalCost+tax+50;
		
		
		
		return totalCost;
	}
	
}
