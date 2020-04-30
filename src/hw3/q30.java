package hw3;

public class q30 {

	public static void main(String[] args) {
		
		int x=10,y=5;;
		boolean w =true,z=false;
		x= w ? y++ : y--;
		w = !z;
		System.out.println((x+y)+"  " +(w? 5 : 10));
		
		int a=10,b=5;;
		boolean c =true,d=false;
		a= c ? y++ : y--;
		c = d;
		System.out.println((a+b)+"  " +(w? 5 : 10));

	}

}
