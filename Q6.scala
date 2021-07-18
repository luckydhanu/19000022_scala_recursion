//19000022
import java.util.Scanner;
import scala.io.StdIn.readInt;

object Q6{

    def fibonacai(b:Int):Int= b match{
        case 0=>0
        case y if(y==1) => 1
        case _ => fibonacai(b-1)+fibonacai(b-2)
    }

    def fibonacaiSeq(b:Int):Unit={
        if(b>0){
            fibonacaiSeq(b-1)
            println(fibonacai(b))
        }
    }

    def main(args:Array[String]){
        var input = new Scanner(System.in);
        println("Enter  number:");
        val num = input.nextInt();
        fibonacaiSeq(num);
    }
} 