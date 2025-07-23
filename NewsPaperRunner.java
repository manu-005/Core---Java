public class NewsPaperRunner {
    public static void main (String[] ar){
        NewsPaper news =new NewsPaper();

        
        System.out.println("The NewsPapaer Id is :"+news.newsPaperId);
        System.out.println("The NewsPapaer Id is :"+news.company);
         System.out.println("The NewsPapaer Id is :"+news.noPages);
        System.out.println("The NewsPapaer Id is :"+news.day);
         System.out.println("The NewsPapaer Id is :"+news.date);
       
// ceate desion 6 7 variables, each design 25 copies, 
        news.newsPaperId=1;
        news.company="Times of India";
        news.date="12-07-2025";
        news.day="Monday";
        news.noPages=22;

        System.out.println("The NewsPapaer Id is :"+news.newsPaperId);
        System.out.println("The NewsPapaer Id is :"+news.company);
         System.out.println("The NewsPapaer Id is :"+news.noPages);
        System.out.println("The NewsPapaer Id is :"+news.day);
         System.out.println("The NewsPapaer Id is :"+news.date);
         
       

    }
}
