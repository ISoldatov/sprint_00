public class LoyaltyProgram {
    public static void main(String[] args) {

        int age = 23;
        String dayOfWeek = "SATURDAY";

        int ticketPrice;

        // Логика по вычислению ticketPrice
        if (age < 6) {
            ticketPrice = 0;
        } else if (age >= 65) {
            if (dayOfWeek.equals("SUNDAY")) {
                ticketPrice = 3;
            } else {
                ticketPrice = 5;
            }
        } else {
            if (dayOfWeek.equals("MONDAY")) {
                ticketPrice = 8;
            } else {
                ticketPrice = 10;
            }
        }
        System.out.println("Цена билета составляет: " + ticketPrice);
    }
}
