package Chapter7Examples;

public class GameList {

	public static void main(String[] args) {
		String [] gamelist = {"club penguin", "runescape", "roblox", "minecraft mobile", "fortnite mobile",
				"PUBG mobile", "Candy crush", "clash of clans", "clash royale", "UNO"};
		System.out.println(gamelist[4]);
		
		for (int i = 0; i<3; i++) {
			System.out.println(gamelist[i] + "\n");
		}
		for(int i = 0; i<6; i++) {
		System.out.println(gamelist[i]+"\n");
		}
		for (int i = 0; i<3 || i>8; i++) {
			System.out.println(gamelist[i] + "\n");
		}
		
		//elementtype[] arrrayRefVar; declaring an array
		
		//double array
		double[] nums;
		nums = new double[100];
		System.out.println(nums[1]);
		
		//character array
		char[] charlist = new char[10];
		System.out.println(charlist[0]);
		
		//int array
		int numint[] = new int[11];
		System.out.println(numint[0]);
		
		//boolean array
		boolean boollist[] = new boolean[10];
		System.out.println(boollist[9]);
		
		//adding data to doubles array
		for (int i=0; i<100; i++) {
			nums[i] = Math.random() * 100;
		}
		
		//initializing each position in the doubles array
		for (int i=0; i<nums.length; i++) {
		System.out.println(nums[i]+ " ");
		}
		
		//finding length of an array
		int x = nums.length;
		System.out.println(x);
		
		char[] city = { 's', 'a', 'l', 't', ' ', 'l', 'a', 'k', 'e'}; 
		System.out.println(city);
		
		//adding each double in the doubles array
		double total = 0;
		for (int i=0; i<nums.length; i++) {
			
			total = total+nums[i];
			
		}
		System.out.println(total);
		
		int mylist[] = new int[10];
		for (int i=0; i<mylist.length; i++) {
			mylist[i] = (int) (Math.random() * 10);
		}
		for (int i = 0; i<mylist.length; i++) {
			System.out.println(mylist[i]);
		}
		for (int i =0 ; i<mylist.length; i++) {
			if (mylist[i] == 5) {
				System.out.println("There is a 5 in this list");
			}
			else {
				System.out.println("There is no 5 in this list");
			}
		}
		int min = mylist[0];
		for (int i=0; i<mylist.length; i++) {
			if (mylist[i] < min) {
				min = mylist[i];
			}
		}
		System.out.println(min);
		
		int max = mylist[9];
		for (int i =0; i<mylist.length; i++) {
			if (mylist[i] > max) {
				max = mylist[i];
			}
		}
		System.out.println(max);
		
		for (int i = mylist.length -1; i>0; i--) {
			int j = (int) (Math.random() * i+1);
			int temp = mylist[i];
			mylist[i] = mylist[j];
			mylist[j] = temp;
			
			
			
		}
		for (int i=0; i<10; i++) {
			System.out.println(mylist[i]);
		}
		//alternative method for printing out everything in an array
		for (int e: mylist) {
			System.out.println(e);
		}
		}
	
}