//19000022
import scala.io.StdIn._
object Q1 {
  def main(args : Array[String]){
    print("Enter number :");
    val c = scala.io.StdIn.readInt()
    print(" Is given number a prime:\n");
    if(prime(c)){println("true")}
      else{println("false")}
    
  }
  
  def gcd(a:Int ,b:Int):Int = b match{
    case 0 => a
    case b if (b>a) => gcd(b,a)
    case _ => gcd(b,a%b)
    
  }
  
  def prime(p:Int ,q:Int=2):Boolean = q match{
    case a if(p==a) => true
    case a if(gcd(p,a)>1) => false
    case a => prime(p,a+1)
  }
}
