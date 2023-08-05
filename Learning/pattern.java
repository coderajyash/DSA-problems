package Learning;

public class pattern {
    public static void main(String[] args) {
        int i;
        int j;
        for(i = 1;i<=9;i++){
            if(i<6){
                for(j=1;j<=i;j++){
                System.out.print("*");
            }
            }
            else{
                for(j=9-i-1;j>=0;j--){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
