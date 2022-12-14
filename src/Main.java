public class Main {
    public static void main(String[] args) {

        int Ticket_cost = 1200; // цена билета
        int Mile_per_Ticket = 20; // миль за билет//
        int Bonus_miles; // бесплатные мили
        if (Ticket_cost <= 0) // ошибка 0
        {
            System.out.println("Ошибка. Стоимость билета не может равняться или быть меньше нуля");
        } else {
            Bonus_miles = Ticket_cost / Mile_per_Ticket; // формула расчета
            System.out.println("Стоимость вашего билета:" + Ticket_cost + "р. Ваши бонусные милии состовляют " + Bonus_miles);
        }


    }
}