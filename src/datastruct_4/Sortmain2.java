package datastruct_4;



import java.util.*;
public class Sortmain2 {
	public static void main(String[] args) {

		//정렬된 값
		/*int[] a =new int[1000000];
			for(int i=0; i<a.length; i++){
				a[i]=i+1;
			} */ 


		// 랜덤 값 
		int num=100000;
		Integer[] a = new Integer [num];
		for(int i=0; i<a.length; i++){

			a[i]=(int)(Math.random()*100+1);
		}

//		for(int i=0; i<a.length; i++){
//
//			System.out.print(a[i]+" ");;
//		}
//		System.out.println();
		try{
			long start = System.currentTimeMillis();
			Sortmain2.heapSort(a);
			long end = System.currentTimeMillis();
			long diff= end - start;
			System.out.println(diff);

		} catch (Exception e){
			System.out.println("An exception occurs");
		}
		
	
		Arrays.sort(a);
//		for(int i=0; i<a.length; i++){
//
//			System.out.print(a[i]+" ");;
//		}
//		System.out.println();
		try{
			long start = System.currentTimeMillis();
			Sortmain2.heapSort(a);
			long end = System.currentTimeMillis();
			long diff= end - start;
			System.out.println(diff);

		} catch (Exception e){
			System.out.println("An exception occurs");
		}
		
		Arrays.sort(a,Collections.reverseOrder());
//		for(int i=0; i<a.length; i++){
//
//			System.out.print(a[i]+" ");;
//		}
//		System.out.println();
		try{
			long start = System.currentTimeMillis();
			Sortmain2.heapSort(a);
			long end = System.currentTimeMillis();
			long diff= end - start;
			System.out.println(diff);

		} catch (Exception e){
			System.out.println("An exception occurs");
		}

	}


	public static void quickSort(Integer[] a) {
		internalQuickSort(a,0,a.length-1);
	}

	public static void internalQuickSort(Integer[]a, int i, int j){
		int p;
		if(i < j)
		{
			p=partition(a,i,j);
			internalQuickSort(a,i,p-1);
			internalQuickSort(a,p+1,j);
		}
	}


	public static int partition(Integer a[], int i, int j ){
		int pivot,p,temp,middle;
//		middle=(i+j)/2;
//		pivot = a[middle];
//		a[middle] = a[i];
//		a[i] = pivot;
		pivot=a[i];
		p=i;
		for(int k=i+1; k<=j; k=k+1){
			if(a[k]<pivot){
				p=p+1;
				temp=a[p];
				a[p]=a[k];
				a[k]=temp;
			}
		}
		temp=a[i];
		a[i]=a[p];
		a[p]=temp;
		return p;
	}
	public static void mergeSort(Integer[] a){
		Integer[] temp= new Integer[a.length];
		internalMergeSort(a,temp,0,a.length-1);
	}

	private static void internalMergeSort(Integer[] a, Integer[] temp, int m, int n){
		if(m<n){
			int middle=(m+n)/2;
			internalMergeSort(a,temp,m,middle);
			internalMergeSort(a,temp,middle+1,n);
			merge(a,temp,m,middle,middle+1,n);

		}
	}

	private static void merge(Integer[] a, Integer[] temp, int m, int p, int q, int n){
		int t = m;
		int numElements = n - m + 1;
		while(m<=p&&q<=n){
			if(a[m] <a[q])
				temp[t++]=a[m++];
			else
				temp[t++] = a[q++];

		}
		while(m<=p)
			temp[t++]=a[m++];
		while(q<=n)
			temp[t++]=a[q++];
		for(int i=0; i<numElements; i++,n--)
			a[n]=temp[n];

	}
	public static void heapSort(Integer a[]){
		int n,temp;
		n= a.length-1;

		for(int i= n/2; i>=1; i=i-1)
			heapify(a,i,n);
		for(int i= n-1; i>=1; i=i-1){

			temp=a[1];
			a[1]=a[i+1];
			a[i+1]=temp;
			heapify(a,1,i);
		}

	}

	private static void heapify(Integer a[],int h,int m){
		int j;
		int root=a[h];
		for(j=2*h; j<=m; j=2*j){
			if(j<m)
				if(a[j] <a[j+1]) j=j+1;
			
			if(root>=a[j])break;//if(a[h]>=a[j]) break;
			else a[j/2] = a[j];
		}
		a[j/2]=root;

	}
}





