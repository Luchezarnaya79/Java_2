public class Main {

    public static void main(String[] args) {

        int ticketPrice = 1350; // стоимость билета

        int amountMile=20; // количество рублей на 1 милю
        int bonusMile = 0; // количество бонусных миль

        System.out.println("Бонусные мили =" + (bonusMile=ticketPrice/amountMile));

    }


}
