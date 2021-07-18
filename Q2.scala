//19000022
import java.util.Scanner;
import scala.io.StdIn.readInt;
object Q2{


	def GCD(x:Int,y:Int): Int=y match{
        	case 0 => x
		case a if a>x => GCD(a,x)
		case _ => GCD(y,x%y)
   	}

	def prime(p:Int, q:Int=2): Boolean = q match{
		case a if(a==p) => true
		case a if GCD(p,a) > 1 => false
		case a => prime(p,a+1)
	}

	def primeSeq(b:Int): Unit={
		if(b>2) 
			primeSeq(b-1);
		var bool= (prime(b)); 
		if (bool)
			println(b);
	}

	def main(args:Array[String]){
		
		var input = new Scanner (System.in);
		print("Print all prime number which less than given number\n");
		print("Enter number :");
		val num=input.nextInt();

		primeSeq(num);	
	}
}

