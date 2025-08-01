public class CourtCaseRunner {
    public static void main(String[] args) {

        CourtCase c1 = new CourtCase("CASE420", "criminal");
        System.out.println("Case Number: " + c1.caseNumber + ", Plaintiff: " + c1.plaintiff);
        CourtCase c2 = new CourtCase("A.Srinivasan");
        System.out.println("Defendant: " + c2.defendant);
        CourtCase c3 = new CourtCase(true);
        System.out.println("Is Closed: " + c3.isClosed);
        CourtCase c4 = new CourtCase("S.Lakshmi", true);

        System.out.println("Judge: " + c4.judge + ", Is Available: " + c4.isAvailable);

    }
}