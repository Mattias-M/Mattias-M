package hemläxa;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1, 4, 5, 6};
	


		int holder = 0;
		
		int [] list1 = {1, 4, 5, 6};
		
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length -i; j++) {
				if(list[j] > list[j++]) {
					 
					holder = list[j];
					list[j] = list [j++] ;
					list [j++] = holder;
					
					
				}
				
				
			}
			
		}
		
		System.out.println(list);
	}
}
