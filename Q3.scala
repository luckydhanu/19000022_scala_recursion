//19000022
import java.util.Scanner;
import scala.io.StdIn.readInt;

object Q3{


	def addNumber(a:Int,b:Int=0): Int=a match{
		case 0 =>b
		case x if x>0 => addNumber((a-1),(b+a))
   	}

	
	def main(args:Array[String]){
		
		var input = new Scanner (System.in);
		print("Get addition of numbers from 1 to n\n");
		print("Enter number :");
		val num=input.nextInt();

		println(addNumber(num));	
	}
}


