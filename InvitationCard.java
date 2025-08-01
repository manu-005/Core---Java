public class InvitationCard {
    InvitationCard(String occasion, String recipient) {
        this.occasion = occasion;
    }

    InvitationCard(String date) {
        this.date = date;
    }

    InvitationCard(boolean isDigital) {
        this.isDigital = isDigital;
    }

    InvitationCard(String design, String color) {
        this.design = design;
    }

    String occasion;
    String recipient;
    String date;
    boolean isDigital;
    String design;
    String color;
}