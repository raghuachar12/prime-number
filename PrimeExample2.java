import java.util.Random;

public class PrimeExample2{    
static void checkPrime(int n){  
  int i,m=0,flag=0;      
  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");      
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     flag=1;      
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(n+" is prime number"); }  
  }//end of else  
}  
 public static void main(String args[]){  
	 Random rand = new Random(); 

	  // Generate random integers in range 0 to 999 
	  
	  int n = rand.nextInt(20);
	  checkPrime(n);  
	  }    
}  