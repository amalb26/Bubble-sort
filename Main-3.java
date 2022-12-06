/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
	public static void main(String[] args) {
	int arr[]={2,5,7,3,9,1};
	int n=arr.length;
	
	for(int i=0;i<n-1;i++){
	    for(int j=0;j<n-i-1;j++){
	        if(arr[j]>arr[j+1]){
	            int temp=arr[j];
	            arr[j]=arr[j+1];
	            arr[j+1]=temp;
	        }
	    }
	}
	
	printArray(arr);
	}
}
