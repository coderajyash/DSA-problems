package Learning;

public class Printer <T>{
    T printVariable;
   public Printer(T printVariable) {
        this.printVariable = printVariable;
    }
    public void print(){
        System.out.println(printVariable);
    }
}