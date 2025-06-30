class Library_BookNames {
    public static void main(String[] ar) {
        String library_BookNames[] = { "To Kill a Mockingbird", "1984", "The Great Gatsby", "Pride and Prejudice",
                "The Catcher in the Rye", "Harry Potter and the Sorcerer's Stone", "The Hobbit", "The Alchemist" };
        System.out.println(library_BookNames[0] + " " + library_BookNames[1] + " " + library_BookNames[2] + " "
                + library_BookNames[3]);
        System.out.println(library_BookNames[4] + " " + library_BookNames[5] + " " + library_BookNames[6] + " "
                + library_BookNames[7]);
        for (String book : library_BookNames) {
            System.out.println(book);

        }
    }
}