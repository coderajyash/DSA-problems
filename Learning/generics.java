package Learning;

public class generics {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(23);
        printer.print();
    }
    
    
}
