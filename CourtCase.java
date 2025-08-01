public class CourtCase {
    CourtCase(String caseNumber, String plaintiff) {
        this.caseNumber = caseNumber;
        this.plaintiff = plaintiff; 
    }

    CourtCase(String defendant) {
        this.defendant = defendant;
    }

    CourtCase(boolean isClosed) {
        this.isClosed = isClosed;
    }

    CourtCase(String judge, boolean isAvailable) {
        this.judge = judge;
        this.isAvailable = isAvailable;
    }

    String caseNumber;
    String plaintiff;
    String defendant;
    boolean isClosed;
    String judge;
    boolean isAvailable;
}