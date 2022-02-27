import java.util.ArrayList;
import java.util.Scanner;

public class path_of_snake{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt(); // board length
        int M = scn.nextInt(); // Number of faces of dice

        System.out.println(count(N,M));
        System.out.println(paths(N, M));
        print(N,M);
        
        scn.close();
    }

    public static int count(int N,int M){
        
        if(N==0)
            return 1;
        
        int ct = 0;
        
        for(int i=1; i<=M && N-i>=0; i++)
            ct += count(N-i,M);
        
        return ct;
    }

    public static void print(int N,int M){
        
        printHelp(N,M,"");
    }
    
    public static void printHelp(int N, int M, String ans){
        
        if(N==0)
        {
            System.out.println(ans);
            return;
        }
        
        for(int i=1; i<=M && N-i>=0; i++)
            printHelp(N-i,M,ans+i);
        
    }
    
    public static ArrayList<String> paths(int N,int M){
        
        if(N==0)
        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        ArrayList<String> mres = new ArrayList<>();
        
        for(int i=1; i<=M && N-i>=0; i++)
        {
            ArrayList<String> rres = paths(N-i,M);
            
            for(String s : rres)
                mres.add(i+s);
        }
        
        return mres;
    }
    
}