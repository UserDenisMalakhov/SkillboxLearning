package repeat;

public class Substrings {
    public static void main(String[] args) {
        //getEncoding
        String header1 = "Content-Type: text/html; charset=utf-8;";
        String header2 = "Content-Type: text/html; charset=windows-1251;";
        String header3 = "Content-Type: text/html; charset=ISO-8859-1;";
        System.out.println(getEncoding(header1));
        System.out.println(getEncoding(header2));
        System.out.println(getEncoding(header3));
        System.out.println();

        //getEncoding2
        String header4 = "Content-Type: text/html;";
        String header5 = "Content-Type: text/html; charset=";
        String header6 = "Content-Type: text/html; charset=;";
        System.out.println(getEncoding2(header4));
        System.out.println(getEncoding2(header5));
        System.out.println(getEncoding2(header6));

    }

    public static String getEncoding(String header){
        //определяем позицию, послекоторой следует строка с кодировкой
        String charsetStr = "charset=";
        int start = header.indexOf(charsetStr) + charsetStr.length();
        //определяем позицию ";"
        int end = header.indexOf(';', start);
        String encoding = header.substring(start,end);
        return encoding;
    }

    public static String getEncoding2(String header){
        //определяем позицию, послекоторой следует строка с кодировкой
        String charsetStr = "charset=";
        int start = header.indexOf(charsetStr);
        //определяем позицию ";"
        int end = header.indexOf(';', start);
        if (start < 0 || end < 0){
            return "";
        }
        String encoding2 = header.substring(start + charsetStr.length(),end);
        return encoding2;
    }
}
