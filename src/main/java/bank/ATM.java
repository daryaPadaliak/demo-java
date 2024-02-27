package bank;

public class ATM {

    public static void printBalance(Card card) {
        System.out.println("Уважаемый клиент " + card.getClient().getName() +
                " на вашем счету " + card.getClient().getId() + " находится сумма "
                + card.getAccount().getValue());
    }
}
