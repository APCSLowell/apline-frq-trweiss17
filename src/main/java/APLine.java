public class APLine
{
  private int a, b, c;
  public APLine(int a2, int b2,int c2){

    a= a2;
    b=b2;
    c=c2;
  }
  public double getSlope(){
    return -(double) a/b;
  }
  public boolean isOnLine(int x, int y){
    return a*x + b*y + c==0;
  }
  
}
