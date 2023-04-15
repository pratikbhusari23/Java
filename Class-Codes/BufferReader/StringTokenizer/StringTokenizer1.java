import java.util.StringTokenizer;
import java.io.* ;

public class StringTokenizer1 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputString = br.readLine();
        StringTokenizer st = new StringTokenizer(inputString, " ,.!");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
