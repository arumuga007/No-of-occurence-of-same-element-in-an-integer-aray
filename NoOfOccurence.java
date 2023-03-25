import java.util.*;
/*
This program is to find the number of occurence of every distinct element in the array
For eg: if array = [1, 2, 3, 2, 4, 2, 1] Then output is 2->3, 1->2, 3->1, 4->1

*/
class NoOfOccurence {
	public static void occurence(int[] getArray) {
		HashMap<Integer, Integer> ans = new HashMap<Integer, Integer> (); //Every new element in array is stored in hashmap with number of occurence as value
		for(int i = 0; i < getArray.length; i++) {
			int tempKey = getArray[i];
			if(ans.containsKey(tempKey)) { //is to check if current element is already exist in the hashmap and return true if it is
				int tempvalue = ans.get(tempKey);
				ans.replace(tempKey, tempvalue + 1); //if exist we only replace its value with value + 1 where value is number of occurence of particular element
			}
			else
				ans.put(getArray[i], 1); // if the current element is not exist in the hashamap list then we add them and initialise the value with 1
		}
		ans.forEach((key, value) -> //To traverse through all element in hashmap
			System.out.println("No of " + key + "=>" + value));
	}		
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		Random random = new Random(); //creation of random class object which is further used to any random value in integer, float, long and even boolean
		System.out.println("Enter the size of the array?");
		int size = s.nextInt();
		int[] givenArray = new int[size];
		for(int i = 0; i < size; i++) {
			givenArray[i] = random.nextInt(5); // To generate random number from 0 - 4
			System.out.println(givenArray[i]);
		}
		occurence(givenArray); // method to find the number of occurence and print in the terminal
		//By default array is passed as the call by reference in java
	}
}