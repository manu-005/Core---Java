class PeriodicTable {
    public static void main(String[] ar) {
        String periodikTable_Elements[] = { "Hydrogen", "Helium", "Lithium", "Beryllium", "Boron", "Carbon", "Nitrogen",
                "Oxygen", "Fluorine", "Neon", "Sodium", "Magnesium" };

        System.out.println(periodikTable_Elements[0] + " " + periodikTable_Elements[1] + " " + periodikTable_Elements[2]
                + " " + periodikTable_Elements[3]);
        System.out.println(periodikTable_Elements[4] + " " + periodikTable_Elements[5] + " " + periodikTable_Elements[6]
                + " " + periodikTable_Elements[7]);
        System.out.println(periodikTable_Elements[8] + " " + periodikTable_Elements[9] + " "
                + periodikTable_Elements[10] + " " + periodikTable_Elements[11]);
        for (String peri : periodikTable_Elements) {
            System.out.println(peri);
        }
    }
}