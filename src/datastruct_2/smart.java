package datastruct_2;

public class smart {
	public static void count(int num) {
		int cnt=0;
		int cnt1=0;
		int arr[]=new int[6];
		for(int a=0;a<10;a++) {
			arr[0]=a;
			for(int b=0;b<10;b++) {
				arr[1]=b;
				for(int c=0;c<10;c++) {
					arr[2]=c;
					for(int d=0;d<10;d++) {
						arr[3]=d;
						for(int e=0;e<10;e++) {
							arr[4]=e;
							for(int f=0;f<10;f++) {
								arr[5]=f;
								
								for(int i=0;i<5;i++) {
									System.out.print(arr[i]);
									cnt1++;
									if(cnt1%5==0) {
										System.out.println();
									}
									if(arr[i]==num) {
										
										cnt++;
										
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(cnt);
	}
	public static void main(String[] args) {
		smart.count(5);
	}
}
