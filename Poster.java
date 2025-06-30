class Poster {
    static int posterId;
    static String posterName;
    static String posterContent = "Welcome to All for this Class";
    static String posterColour = "RED colour";
    static int posterSize = 100;

    public static void main(String[] pos) {
        int local = 1;
        System.out.println("Local :" + local);
        System.out.println("Poster Id :" + posterId);
        posterId = 100;
        System.out.println("Poster Id :" + posterId);

        System.out.println("Poster Name :" + posterName);

        System.out.println("Poster Content :" + posterContent);
        System.out.println("Poster Colour :" + posterColour);
        System.out.println("Poster size is :" + posterSize);

    }
}