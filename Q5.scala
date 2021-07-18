//19000022
import java.util.Scanner;
import scala.io.StdIn.readInt;

object Q5{

    def isEven(a:Int): Boolean=a match{
        	case 0 => true
		case _ => isOdd(a-1)
   	}

	def isOdd(a:Int): Boolean={
     		! (isEven(a)) 
   	}

	def add(a:Int, n:Int=0 ,result:Int=0) : Int =n match{
		case y if (y==a) => result
		case y if ((y<a) && (isOdd(n))) => add(a,n+1,result)
		case y if ((y<a) && (! isOdd(n))) => add(a,n+1,result+n)
	}

    def main(args:Array[String]){
        var input = new Scanner(System.in);
        println("Enter the number:");
        val num = input.nextInt();
        println(add(num));
    }
}  