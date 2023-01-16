public class Main8 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.append("some text 133", "Справка");
        System.out.println();
        printer.append("some text 210", 544);
        System.out.println();
        System.out.println(printer.getPendingPagesCount()); // 545
        printer.print();
        printer.append("some text 8", 530);
        System.out.println();
        printer.clear();
        printer.append("some text 23", "Договор", 312);
        System.out.println();
        printer.append("some text 11");
        printer.print();
        System.out.println();
        System.out.println(printer.getPrintedPagesCount()); // 858
    }
}
