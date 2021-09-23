package geekster;

public class Replacenum {
	
	public static void main(String []args) {
		int a[]= {1,2,4,6,8,12,76,23,64};
		for(int i=0;i<a.length;i++) {
			if(a[i]==76)
			{
				a[i]=0;
			}
				System.out.print(a[i]+",");
		}
	}

}
