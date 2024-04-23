public class APLine
{
  private int a, b, c;
  public APLine(int a2, b2,c2){

    a= a2;
    b=b2;
    c=c2;
  }
  double getSlope(){
    return (double) -a/b;
  }
  boolean isOnline(int x, int y){
    return a*x + b*y + c==0;
  }
  
}
