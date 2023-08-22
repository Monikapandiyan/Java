import java.util.*;
class Main{
    static int getsum(int i){
        int sum=0;
        while(i!=0){
            int d=i%10;
            sum=sum+d;
            i=i/10;
        }
        return sum;
    }
    static void result(int n){
        int i=1;
        while(i!=0){
            if(getsum(i)==n){
                System.out.println(i);
                break;
            }
            i++;
        }
        
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        result(n);

    }
}
