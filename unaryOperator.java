public class unaryOperator{
	public static void main (String [] args){
	
		for(int x=0; x<=5; x++){ 
		System.out.print(x);  // 012345
		}
		
		System.out.println("\t"+"for(int x=0; x<=5; x++)");
		
		for(int x=0; x<5; x++){ 
		System.out.print(x);  // 01234
		}
		
		System.out.println("\t"+"for(int x=0; x<5;  x++)");
		
		for(int y=0; y<=5; ++y){
		System.out.print(y);  // 012345
		}
		
		System.out.println("\t"+"for(int y=0; y<=5;  ++y) ");
		
		for(int y=10; y>5; --y){
		System.out.print(y);  // 109876
		}
		
		System.out.println("\t"+"for(int y=10; y>5; --y)");
		
		for(int z=0; z<=5; z=z+1){
		System.out.print(z);  // 012345
		}
		
		System.out.println("\t"+"for(int z=0; z<=5; z=z+1)");
		
		for(int l=0; l<=5; l=1+l){
		System.out.print(l);  // 012345
		}
		
		System.out.println("\t"+"for(int l=0; l<=5;  l=1+l)");
		
		for(int m=10; m>=5; m=m-1){
		System.out.print(m);  //1098765
		}
		
		System.out.println("\t"+"for(int m=10; m>=5; m=m-1)");
		
		
	}
}
