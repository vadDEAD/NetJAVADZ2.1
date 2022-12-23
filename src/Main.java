public class Main {
    public static void main(String[] args) {

        int ticketCost = 1200; // цена билета
        int milePerTicket = 20; // миль за билет//
        int bonusMiles; // бесплатные мили
        if (ticketCost <= 0) // ошибка 0
        {
            System.out.println("Ошибка. Стоимость билета не может равняться или быть меньше нуля");
        } else {
            bonusMiles = ticketCost / milePerTicket; // формула расчета
            System.out.println("Стоимость вашего билета:" + ticketCost + "р. Ваши бонусные милии состовляют " + bonusMiles);
        }


    }
}
