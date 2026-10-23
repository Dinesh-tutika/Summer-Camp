public class Recuression {
    /* 
    public static void f(int n){
        if(n==0)
            return;
        if(n%2==0){
                System.out.print(n+" ");
        }
        f(n-1);
        if(n%2!=0) System.out.print(n+" ");
        
    }
*/
/* 
    public static void printTable(int n,int i){
        if(i==11) return;
        System.out.println(n+"x"+i+"="+n*i);
        printTable(n, i+1);
}*/
/* 
public static int naturalNosum(int n){
        if(n==0) return 0;
        return n +naturalNosum(n-1);
    }*/

//counting of numbers
/* 
   public static int co(int n){
    if(n<=0) return 0;
    return 1+co(n/10);
   }
    */
// febnoic series
 /*    public static int febnoic(int n){
        if(n==1||n==2) return 1;
        return (febnoic(n-1)+febnoic(n-2));
    }*/
    public static int steps=0;
    public static void toh(int n,String s,String d,String h){
        if(n==0) return;
        toh(n-1, s, d, h);
        steps++;
        System.out.println("take disc from "+s+"  place it to "+ d);
        toh(n-1, s, d, h);

    }
    public static void main(String[] args) {
        //f(10);
        //printTable(9, 1);
        //int k=naturalNosum(10);
        //System.out.println(k);
        //System.out.println(co(1234567890));
        //System.out.println(febnoic(5));
        toh(2,"source","destination","helper");
        System.out.println(steps);

    }
}
