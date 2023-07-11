import java.util.*;
public class urlify {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int spaceCount = 0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)==' '){
                spaceCount+=1;
            }
        }
        int  newlength = spaceCount*2 + s.length();
        char[] charAr = new char[newlength];
        for(int i = 0;i<newlength;i++){
            if(i<s.length()){
                charAr[i] = s.charAt(i);
            }
            else{
                charAr[i] = ' ';
            }
        }
        int index = newlength-1;
        for(int i=s.length()-1;i>=0;i--){
            if(charAr[i]==' '){
                charAr[index] = '0';
                charAr[index-1] = '2';
                charAr[index-2] = '%';
                index = index - 3;
            }
            else{
                charAr[index] = charAr[i];
                index--;
            }
        }
        for(char ch:charAr){
            System.out.print(ch);
        }
        System.out.println();
        
    }
}
