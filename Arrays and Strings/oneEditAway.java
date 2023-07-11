
import java.util.*;
public class oneEditAway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1 : ");
        String s1 = sc.nextLine();
        System.out.print("Enter String 2 : ");
        String s2 =sc.nextLine();
        
        int n1 = s1.length();
        int n2 = s2.length();
        int d =(int)Math.abs(n1-n2);
        if (d==1 || d==0){
            int indexS1 = 0;
            int indexS2 = 0;
            int edit = 0;
            if(d==0){
                while(indexS1<n1){
                    if(s1.charAt(indexS1)==s2.charAt(indexS1)){
                        indexS1++;
                        continue;
                    }
                    else{
                        edit++;
                        indexS1++;
                    }
                }
            }
            else if(d==1){
                indexS1 = 0;
                edit = 0;
                
                while(indexS1<n1 && indexS2<n2){
                    if(s1.charAt(indexS1)==s2.charAt(indexS2)){
                        indexS1++;
                        indexS2++;
                    }
                    else{
                        edit++;
                        if(n1>n2){
                            indexS1++;
                        }
                        else{
                            indexS2++;
                        }
                    }
                }
                if(indexS1<n1 || indexS2<n2){
                    edit++;
                }
            }
           if(edit==1){
                System.out.println("Yes One Edit Away");
            }
            else if(edit==0){
                System.out.println("Same strings no edit required");
            }
            else{
                System.out.println("Not One Edit Away");
            }
        }
        else{
            System.out.println("Not One Edit Away");
        }
    }
}
