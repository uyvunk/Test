import java.util.*;
public class DuplicateIntInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[11];
		Random r = new Random();
		for(int i = 0; i < 11; i++) {
			array[i] = r.nextInt(9);
		}
		System.out.println("Array: \n" + Arrays.toString(array));
		findDuplicate(array);
	}
	
	public static void findDuplicate(int[] input){
		Hashtable<Integer,Integer> seen = new Hashtable<Integer,Integer>();
		Hashtable<Integer,Integer> duplicate = new Hashtable<Integer,Integer>();
		
		for(int i=0; i<input.length;i++){
			if(seen.get(input[i]) != null){
				duplicate.put(input[i], input[i]);
			} else {
				seen.put(input[i], input[i]);
			}
		}
		
		System.out.println("The duplicated items " + duplicate.toString());
	}

}
