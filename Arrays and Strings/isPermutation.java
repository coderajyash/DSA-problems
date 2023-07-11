import java.util.*;

class isPermutation{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] compare = new int[128];
        for(int num:compare){
            num = 0;
        }
        for(int i=0;i<s.length();i++){
            int c = (int)s.charAt(i);
            compare[c]++;
        }
        String s2 = sc.nextLine();
        int flag=0;
        for(int i = 0;i<s2.length();i++){
            int c = (int)s2.charAt(i);
            compare[c]--;
            if(compare[c]<0){
                System.out.println("Not permutation");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Permutation");
        }
        }
        
    }
