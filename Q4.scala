//19000022
import java.util.Scanner;
import scala.io.StdIn.readInt;

object Q4{

	def isEven(a:Int): Boolean=a match{
        	case 0 => true
		case _ => isOdd(a-1)
   	}
	
	def isOdd(a:Int): Boolean={
     		! (isEven(a)) 
   	}


	def main(args:Array[String]){
		
		var input = new Scanner (System.in);
		print("Determine given number is odd or even\n");
		print("Enter  the number :");
		val num=input.nextInt();

		if(isOdd(num))
			println("this is  Odd number ");
		else
			println("this is  even number ");
	}
}
