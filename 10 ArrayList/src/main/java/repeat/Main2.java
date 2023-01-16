package repeat;

public class Main2 {
    public static void main(String[] args) {
        int[] ticketNumbers = new int[1000];
        int[] winTickets = new int[10];

        for (int i = 0; i < ticketNumbers.length; i++){
            int value = 1_000_000 + (int)Math.round(1_000_000 * Math.random());
            ticketNumbers[i] = value;
            //System.out.println(value);
            if (i % 100 == 0){
                winTickets[i / 100] = value;
            }
        }
        for (int winTicketNumbers : winTickets){
            System.out.println(winTicketNumbers);
        }
    }
}
