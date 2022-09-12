public class grade{
	public static void main(String args[])
		{
			int arr[]= new int[10];
			for(int i=0;i<10;i++){
				arr[i]=Integer.parseInt(args[i]);
		}
			int temp;
			for (int i = 0; i < 10; i++) {     
           			 for (int j = i+1; j < 10; j++) {     
               				if(arr[i] > arr[j]) {    
                   				temp = arr[i];    
                   				arr[i] = arr[j];    
                   				arr[j] = temp;    
               }     
            }     
        }  	
		
		for(int i=0;i<10;i++){
			System.out.println(arr[i]);
			if(arr[i]>40 && arr[i]<=50){
				System.out.println("PASS");
			}
			else if(arr[i]>50 && arr[i]<=75){
				System.out.println("Merit");
			}
			else if(arr[i]>75 && arr[i]<=100){
				System.out.println("DISTINCTION");
			}
			else{
				System.out.println("Invalid Maeks");
			}

		}
	}
}