public class Main{
    public static void main(String[] args) {
        Print printer = new Print(50, true);
System.out.println(printer.addToner(50));
printer.addToner(50);
System.out.println(printer.getTonerLevel());

System.out.println("initial page count = " +printer.getPagesPrinted());
int pagesPrinted = printer.printPages(5);
System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
pagesPrinted = printer.printPages(3);
System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +printer.getPagesPrinted());
    }
}