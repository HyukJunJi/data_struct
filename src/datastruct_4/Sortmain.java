package datastruct_4;
import java.util.Random;



import java.util.Arrays;
import java.util.Collections;
class Sorting{
	int num;
	Integer arr[];
	Random r=new Random();
	Sorting(int num){
		this.num=num;
	}

	public void selectionSort(String type) {
		if(type.equals("Random")) {
			randomArr();
		}else if(type.equals("Up")) {
			upsort();
		}else if(type.equals("Down")) {
			downsort();
		}
		else {
			System.out.println("Wrong");
		}
		
		long startTime=System.currentTimeMillis();
		for(int i=0;i<arr.length-1;i++) {
			int min_idx=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_idx]) {
					min_idx=j;
				}
			}
			int temp=arr[min_idx];
			arr[min_idx]=arr[i];
			arr[i]=temp;

		}

		long endTime=System.currentTimeMillis();
		long timeDiff=endTime-startTime;
		System.out.println(type+" selectionSort = "+timeDiff+"밀리초");
	}
	public void insertionSort(String type) {
		if(type.equals("Random")) {
			randomArr();
		}else if(type.equals("Up")) {
			upsort();
		}else if(type.equals("Down")) {
			downsort();
		}
		else {
			System.out.println("Wrong");
		}
		long startTime=System.currentTimeMillis();
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			for(int j=i-1;j>=0;j--) {
				if(temp<arr[j]) {
					arr[j+1]=arr[j];
					arr[j+1]=temp;
				}
			}
		}

		long endTime=System.currentTimeMillis();
		long timeDiff=endTime-startTime;
		System.out.println(type+" insertionSort = "+timeDiff+"밀리초");
	}
	public void bubleSort(String type) {
		if(type.equals("Random")) {
			randomArr();
		}else if(type.equals("Up")) {
			upsort();
		}else if(type.equals("Down")) {
			downsort();
		}
		else {
			System.out.println("Wrong");
		}
		long startTime=System.currentTimeMillis();
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		long endTime=System.currentTimeMillis();
		long timeDiff=endTime-startTime;
		System.out.println(type+" bubleSort = "+timeDiff+"밀리초");
	}
	public void flagbubleSort(String type) {
		if(type.equals("Random")) {
			randomArr();
		}else if(type.equals("Up")) {
			upsort();
		}else if(type.equals("Down")) {
			downsort();
		}
		else {
			System.out.println("Wrong");
		}
		int n=arr.length;
		long startTime=System.currentTimeMillis();
		int i, j, temp;
		boolean swapped;
		for (i = 0; i < n - 1; i++) {
			swapped = false;
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			// IF no two elements were
			// swapped by inner loop, then break
			if (swapped == false)
				break;
		} 
		long endTime=System.currentTimeMillis();
		long timeDiff=endTime-startTime;
		System.out.println(type+" flagbubleSort = "+timeDiff+"밀리초");
	}
	public void randomArr() {
		arr=new Integer[num];
		for(int i=0;i<num;i++) {
			arr[i]=r.nextInt(num);
		}
	}
	public void upsort() {
		randomArr();
		Arrays.sort(arr);
	}
	public void downsort() {
		randomArr();
		Arrays.sort(arr,Collections.reverseOrder());
	}
}
public class Sortmain {
	public static void main(String[] args) {

		System.out.println("hello");
		Sorting s=new Sorting(10000);
		s.bubleSort("Random");
		s.bubleSort("Up");
		s.bubleSort("Down");
		System.out.println();
		s.insertionSort("Random");
		s.insertionSort("Up");
		s.insertionSort("Down");
		System.out.println();
		s.selectionSort("Random");
		s.selectionSort("Up");
		s.selectionSort("Down");
		System.out.println();
		s.flagbubleSort("Random");
		s.flagbubleSort("Up");
		s.flagbubleSort("Down");


	}
}
