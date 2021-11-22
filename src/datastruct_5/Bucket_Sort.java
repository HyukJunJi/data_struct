package datastruct_5;
class Tree{
	Tree link;
	int data;
}
public class Bucket_Sort {
	Tree head;
	int num(int number)
	void B_Sort(int arr[],Tree bucket[]) {
		
		for(int i=0;i<arr.length;i++) {
			switch(arr[i]/10) {
			case 1:
				bucket[1] =new Tree();
				if(head==null) {
					bucket[1].data=arr[i];
					bucket[1].link=null;
					head=bucket[1];
				}
				else {
					bucket[1].data=arr[i];
					bucket[1].link=head;
					head=bucket[1];	
				}
			case 2:
				bucket[2] =new Tree();
				if(head==null) {
					bucket[2].data=arr[i];
					bucket[2].link=null;
					head=bucket[2];
				}
				else {
					bucket[2].data=arr[i];
					bucket[2].link=head;
					head=bucket[2];	
				}
			case 3:
				bucket[3] =new Tree();
				if(head==null) {
					bucket[3].data=arr[i];
					bucket[3].link=null;
					head=bucket[3];
				}
				else {
					bucket[3].data=arr[i];
					bucket[3].link=head;
					head=bucket[3];	
				}
			}


		}
	}
	
	public static void main(String[] args) {
		System.out.println("hello");
		int arr[]={12,62,23,51,74,26,51,89,91,32,16,15};
		Bucket_Sort b=new Bucket_Sort();
		Tree bucket[]=new Tree[10];
		b.B_Sort(arr,bucket);
		System.out.println(bucket[1].data);
		System.out.println(bucket[1].link.data);
		System.out.println(bucket[1].link.link.data);
	}
}
