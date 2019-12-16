
 // A (source tower), B (auxiliary tower) and C (destination tower).
 
 //Steps:
 //1) Move n-1 A(source) to B(destination) using C(auxiliary).
 //2) Move nth from A(source) to C(destination).
 //3) Move n-1 B(source) to C(destination) using A(auxiliary).
 
class TowersOfHanoiPuzzle
{


    public static void TOH(int n,int A, int B, int C) 
    {
        if (n == 1) {
            System.out.println("("+A+","+C+")");
            return;
        }
          
        //Move n-1 A(source) to B(destination) using C(auxiliary).
        TOH(n-1,A,C,B);
          
        //Move nth from A(source) to C(destination).
        System.out.println("("+A+","+C+")");
          
        //Move n-1 B(source) to C(destination) using A(auxiliary).
        TOH(n-1,B,A,C);
    }
      
    public static void main(String[] args) 
    {
         
        //Calling TOH method with n rods in three towers (1,2,3).
        Scanner sc=new Scanner(System.in);
        int n=sc.nextint();
        TOH(n,1,2,3);
    }
}
