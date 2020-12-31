import java.util.Scanner;
public class Sorting {
	
	void bubblesort(int c[],int b){
	
	for(int i=0;i<b-1;i++) {
    	for(int j=0;j<b-i-1;j++) {
    		if(c[j]>c[j+1]) {
    			int d =c[j];
    			c[j]=c[j+1];
    			c[j+1]=d;
    		}
    		
    	}
    }
   
	
	}
	
	void insertionsort(int c[]) {
		
		for(int i=1;i<c.length;i++) {
			int store =c[i];
		int	j=i-1;
		while(j>=0 && c[j]>store ) {
			
			c[j+1]=c[j];
			j--;
		}
			c[j+1]=store;

		}
		
		
	}
	
	void selectionsort(int c[]) {
		for (int i=0;i<c.length-1;i++) {
			int min =i;
			for(int j=i+1;j<c.length;j++) {
				if(c[min]<c[j]) {
					min=j;
				}
			}int a=c[min];
		c[min]=c[i];
		c[i]=a;
		}
		
	}
	public static void main (String args[]) {
	Scanner a=new Scanner(System.in);
		System.out.print("enter the number of elements :");
		int b=a.nextInt();
		System.out.print("the elements to be sorted  are :");
		int c[]=new int[b];
		for(int i=0;i<b;i++) {
			c[i]=a.nextInt();
		}
		Sorting ob=new Sorting();
		System.out.println("1)bubble sort /n2)insertion sort /n 3)selection sort");
		System.out.print("you choose :");
		switch(a.nextInt()) {
		case 1:
			System.out.println("you have choosed bubble sort");
			ob.bubblesort(c, b);
			System.out.print("the sorted value is :");
		    for(int i=0;i<b;i++) {
		    System.out.print(c[i] + " ");
		    }
			break;
		case 2:
			System.out.println("you have choosed insertion sort");
			ob.insertionsort(c);
			System.out.print("the sorted value is :");
			for (int i=0;i<c.length;i++) {
				 System.out.print(c[i] + " ");
				
			}
			break;
		case 3:
			System.out.println("you have choosed selection sort");
			ob.selectionsort(c);
			System.out.print("the sorted value is :");
			for(int i=0;i<c.length;i++) {
				System.out.print(c[i] + " ");
			}
			break;
		default:
			System.out.print("not an valid option");
		}
		
		
		
	}
	
	

}
