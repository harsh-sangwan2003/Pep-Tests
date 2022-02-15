import java.util.ArrayList;
import java.util.Scanner;

public class dice{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt(); // board length
        int M = scn.nextInt(); // Number of faces of dice

        System.out.println(count(N,M));
        System.out.println(paths(N, M));
        print(N,M,"");
        
    }

    public static int count(int N,int M){
        if(N==0){
            return 1;
        }
        int num = 0;
        for(int step = 1; N-step>=0 && step<=M; step++){
           num += count(N-step,M); 
        }
        return num;
    }

    public static void print(int N,int M, String ans){
        if(N==0){
            System.out.println(ans);
            return;
        }
        
        for(int step = 1; N-step>=0 && step<=M; step++){
           print(N-step,M,ans+step) ;
        }
    }

    public static ArrayList<String> paths(int N,int M){
        if(N==0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> myAns = new ArrayList<>();
        for(int step = 1; N-step>=0 && step<=M; step++){
            ArrayList<String> recAns = paths(N-step,M);
            for(String ele: recAns){
                myAns.add(step+ele);
            }
        }
        
        return myAns;
        
    }
}