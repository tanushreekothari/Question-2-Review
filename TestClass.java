import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String[] inp = br.readLine().split(" ");
            int N = Integer.parseInt(inp[0]);
            int K = Integer.parseInt(inp[1]);
            int[] A = new int[N];
            String[] inp1 = br.readLine().split(" ");
            for(int i=0;i<N;i++)
            {
                A[i] = Integer.parseInt(inp1[i]);
            }
            long out_ = solve(N, K, A);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static long solve(int N, int K, int[] A){
        // Your code goes here
        int count =0, res =0;
        for(int i=0; i<N;i++)
        {
            if(A[i]==K){
                if(count ==0)
                    res = res+1;
                else
                    count = count +1;
            }
            else if(A[i]<K){
                count = count + 1;
            }
            else{
             res = res + count;
             count =0;
            }
        }
        if(count>0) {
        	res = res +count;
        }
        return res;
    }
}
