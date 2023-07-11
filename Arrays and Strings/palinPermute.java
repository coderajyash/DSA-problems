import java.util.*;
public class palinPermute {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] compare = new int[128];
        for(int i=0;i<128;i++){
            compare[i] = 0;
        }
        for(int i=0;i<s.length();i++){
            int position = (int)s.charAt(i);
            compare[position] = compare[position]+1;   
        }
        int oddCount=0,maxOdd;
        if(s.length()%2==0){
            maxOdd = 0; 
        }
        else{
            maxOdd = 1;
        }
        for(int i=0;i<128;i++){
            if(compare[i]%2==0){
                continue;
            }
            else{
                oddCount+=1;
            }
        }
        if(oddCount==maxOdd){
            System.out.println("Palindromic Permuatation");
        }
        else{
            System.out.println("Not Palindromic Permutation");
        }
        
    }
    
}
