class NewsPaper{
    int newsPaperId=1;
    String company="Default Company";
    String date="01-01-2023";
    String day="Monday";
    String  language="English";
    int noPages=10;

    public void display() {
        System.out.println("Newspaper ID: " + newsPaperId);
        System.out.println("Company: " + company);
        System.out.println("Date: " + date);
        System.out.println("Day: " + day);
        System.out.println("Language: " + language);
        System.out.println("Number of Pages: " + noPages);
        System.out.println("-----------------------------");
    }
}


