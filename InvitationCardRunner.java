public class InvitationCardRunner {
    public static void main(String[] args) {

        InvitationCard card1 = new InvitationCard("Wedding");
        System.out.println("Card Type: " + card1.type);

        InvitationCard card2 = new InvitationCard("Red", true);
        System.out.println("Card Color: " + card2.color);

        InvitationCard card3 = new InvitationCard(100);
        System.out.println("Card Count: " + card3.count);

        InvitationCard card4 = new InvitationCard("Premium Glossy", 25.5);
        System.out.println("Card Paper: " + card4.paper + ", Cost: ₹" + card4.cost);
    }
}
