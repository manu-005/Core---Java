public class ObjectCreations {
    static  String billType;
    static int amtWithTax;
    static String billId;
    static String date;
    static String dueDate;
    static String status;
    static String customerId;
    static String customerName;
    static String customerAddress;
    static String customerPhone;
    static String customerEmail;
    static String customerType;
    static int discount;

    public static void main(String[] args) {
       
        ObjectCreations bill1 = new ObjectCreations();
        
        billId = "B12345";
        date = "2023-10-01";
        dueDate = "2023-10-15";
        status = "Pending";
        customerId = "C67890";
        customerName = "mail";
        customerAddress = "123 G Ramaiya Layout Street, Bangalore";
        customerPhone = "1234567890";
        customerEmail = "mail@gmail.com";

        System.out.println("Bill ID: " + bill1.billId);
        System.out.println("Bill Date: " + bill1.date);
        System.out.println("Due Date: " + bill1.dueDate);
        System.out.println("Status: " + bill1.status);
        System.out.println("Customer ID: " + bill1.customerId);
        System.out.println("Customer Name: " + bill1.customerName);
        System.out.println("Customer Address: " + bill1.customerAddress);
        System.out.println("Customer Phone: " + bill1.customerPhone);
        System.out.println("Customer Email: " + bill1.customerEmail);

        ObjectCreations bill2=new ObjectCreations();
        
        bill2.billId = "B54321";
        bill2.date = "2023-10-02";
        bill2.dueDate = "2023-10-16";
        bill2.status = "Paid";
        bill2.customerId = "C09876";
        bill2.customerName = "Manoj";
        bill2.customerAddress = "456 H Street, Bangalore";
        bill2.customerPhone = "0987654321";
        bill2.customerEmail = "manoj@gmail.com";

        System.out.println("Bill ID: " + bill2.billId);
        System.out.println("Bill Date: " + bill2.date);
        System.out.println("Due Date: " + bill2.dueDate);
        System.out.println("Status: " + bill2.status);
        System.out.println("Customer ID: " + bill2.customerId);
        System.out.println("Customer Name: " + bill2.customerName);
        System.out.println("Customer Address: " + bill2.customerAddress);
        System.out.println("Customer Phone: " + bill2.customerPhone);
        System.out.println("Customer Email: " + bill2.customerEmail);   

        ObjectCreations bill3 = new ObjectCreations();
        bill3.billId = "B67890";
        bill3.date = "2023-10-03";
        bill3.dueDate = "2023-10-17";
        bill3.status = "Overdue";
        bill3.customerId = "C54321";
        bill3.customerName = "Dharshan";
        bill3.customerAddress = "789 I Avenue, Bangalore";
        bill3.customerPhone = "1122334455";
        bill3.customerEmail = "darshandurga@gmail.com";

        System.out.println("Bill ID: " + bill3.billId);
        System.out.println("Bill Date: " + bill3.date);
        System.out.println("Due Date: " + bill3.dueDate);
        System.out.println("Status: " + bill3.status);
        System.out.println("Customer ID: " + bill3.customerId);
        System.out.println("Customer Name: " + bill3.customerName);
        System.out.println("Customer Address: " + bill3.customerAddress);
        System.out.println("Customer Phone: " + bill3.customerPhone);
        System.out.println("Customer Email: " + bill3.customerEmail);

        ObjectCreations bill4 = new ObjectCreations();
        bill4.billId = "B11223";
        bill4.date = "2023-10-04";
        bill4.dueDate = "2023-10-18";
        bill4.status = "Cancelled";
        bill4.customerId = "C33445";
        bill4.customerName = "Barath";
        bill4.customerAddress = "321 J Boulevard, Bangalore";
        bill4.customerPhone = "5566778899";
        bill4.customerEmail = "bharat_tan@gmail.com";

        System.out.println("Bill ID: " + bill4.billId);
        System.out.println("Bill Date: " + bill4.date);
        System.out.println("Due Date: " + bill4.dueDate);
        System.out.println("Status: " + bill4.status);
        System.out.println("Customer ID: " + bill4.customerId);
        System.out.println("Customer Name: " + bill4.customerName);
        System.out.println("Customer Address: " + bill4.customerAddress);
        System.out.println("Customer Phone: " + bill4.customerPhone);
        System.out.println("Customer Email: " + bill4.customerEmail);

        ObjectCreations bill5 = new ObjectCreations();
        bill5.billId = "B44556";
        bill5.date = "2023-10-05";
        bill5.dueDate = "2023-10-19";
        bill5.status = "Refunded";
        bill5.customerId = "C77889";
        bill5.customerName = "Chetan";
        bill5.customerAddress = "654 K Drive, Bangalore";
        bill5.customerPhone = "9988776655";
        bill5.customerEmail = "chetan@gmail.com";

        System.out.println("Bill ID: " + bill5.billId);
        System.out.println("Bill Date: " + bill5.date);
        System.out.println("Due Date: " + bill5.dueDate);
        System.out.println("Status: " + bill5.status);
        System.out.println("Customer ID: " + bill5.customerId);
        System.out.println("Customer Name: " + bill5.customerName);
        System.out.println("Customer Address: " + bill5.customerAddress);
        System.out.println("Customer Phone: " + bill5.customerPhone);
        System.out.println("Customer Email: " + bill5.customerEmail);       

        ObjectCreations bill6 = new ObjectCreations();
        bill6.billId = "B78901";
        bill6.date = "2023-10-06";
        bill6.dueDate = "2023-10-20";
        bill6.status = "Pending";
        bill6.customerId = "C22334";
        bill6.customerName = "son";
        bill6.customerAddress = "987 L Lane, Bangalore";
        bill6.customerPhone = "4433221100";
        bill6.customerEmail = "son@gmail.com";

        System.out.println("Bill ID: " + bill6.billId);
        System.out.println("Bill Date: " + bill6.date);
        System.out.println("Due Date: " + bill6.dueDate);
        System.out.println("Status: " + bill6.status);
        System.out.println("Customer ID: " + bill6.customerId);
        System.out.println("Customer Name: " + bill6.customerName);
        System.out.println("Customer Address: " + bill6.customerAddress);
        System.out.println("Customer Phone: " + bill6.customerPhone);
        System.out.println("Customer Email: " + bill6.customerEmail);       

        ObjectCreations bill7 = new ObjectCreations();
        bill7.billId = "B23456";            
        bill7.date = "2023-10-07";
        bill7.dueDate = "2023-10-21";
        bill7.status = "Paid";
        bill7.customerId = "C55667";
        bill7.customerName = "Tan Bharat";
        bill7.customerAddress = "321 M Street, Bangalore";
        bill7.customerPhone = "6677889900";
        bill7.customerEmail = "Tanbarat@gmail.com";       

        System.out.println("Bill ID: " + bill7.billId);     
        System.out.println("Bill Date: " + bill7.date);
        System.out.println("Due Date: " + bill7.dueDate);
        System.out.println("Status: " + bill7.status);
        System.out.println("Customer ID: " + bill7.customerId);
        System.out.println("Customer Name: " + bill7.customerName);
        System.out.println("Customer Address: " + bill7.customerAddress);
        System.out.println("Customer Phone: " + bill7.customerPhone);
        System.out.println("Customer Email: " + bill7.customerEmail);       

        ObjectCreations bill8 = new ObjectCreations();
        bill8.billId = "B34567";    
        bill8.date = "2023-10-08";
        bill8.dueDate = "2023-10-22";
        bill8.status = "Overdue";
        bill8.customerId = "C77889";
        bill8.customerName = "Harrish";
        bill8.customerAddress = "654 N Avenue, Bangalore";
        bill8.customerPhone = "1122334455";
        bill8.customerEmail = "harri@gmail.com";

        System.out.println("Bill ID: " + bill8.billId);
        System.out.println("Bill Date: " + bill8.date);
        System.out.println("Due Date: " + bill8.dueDate);
        System.out.println("Status: " + bill8.status);
        System.out.println("Customer ID: " + bill8.customerId);
        System.out.println("Customer Name: " + bill8.customerName);
        System.out.println("Customer Address: " + bill8.customerAddress);
        System.out.println("Customer Phone: " + bill8.customerPhone);
        System.out.println("Customer Email: " + bill8.customerEmail);   

        ObjectCreations bill9 = new ObjectCreations();
        bill9.billId = "B45678";    
        bill9.date = "2023-10-09";
        bill9.dueDate = "2023-10-23";
        bill9.status = "Cancelled";
        bill9.customerId = "C99001";
        bill9.customerName = "Grapes";
        bill9.customerAddress = "987 O Boulevard, Bangalore";
        bill9.customerPhone = "2233445566";
        bill9.customerEmail = "grapes@gmail.com";    

        System.out.println("Bill ID: " + bill9.billId);
        System.out.println("Bill Date: " + bill9.date);
        System.out.println("Due Date: " + bill9.dueDate);
        System.out.println("Status: " + bill9.status);
        System.out.println("Customer ID: " + bill9.customerId);
        System.out.println("Customer Name: " + bill9.customerName);
        System.out.println("Customer Address: " + bill9.customerAddress);
        System.out.println("Customer Phone: " + bill9.customerPhone);
        System.out.println("Customer Email: " + bill9.customerEmail);   

        ObjectCreations bill10 = new ObjectCreations();
        bill10.billId = "B56789";    
        bill10.date = "2023-10-10";
        bill10.dueDate = "2023-10-24";
        bill10.status = "Refunded";
        bill10.customerId = "C11223";
        bill10.customerName = "King maker";
        bill10.customerAddress = "321 P Street, Bangalore";
        bill10.customerPhone = "3344556677";
        bill10.customerEmail = "king_Maker@gmail.com";  

        System.out.println("Bill ID: " + bill10.billId);
        System.out.println("Bill Date: " + bill10.date);
        System.out.println("Due Date: " + bill10.dueDate);
        System.out.println("Status: " + bill10.status);
        System.out.println("Customer ID: " + bill10.customerId);
        System.out.println("Customer Name: " + bill10.customerName);
        System.out.println("Customer Address: " + bill10.customerAddress);
        System.out.println("Customer Phone: " + bill10.customerPhone);
        System.out.println("Customer Email: " + bill10.customerEmail);  

        ObjectCreations bill11 = new ObjectCreations();
        bill11.billId = "B67890";    
        bill11.date = "2023-10-11";
        bill11.dueDate = "2023-10-25";
        bill11.status = "Pending";
        bill11.customerId = "C33445";
        bill11.customerName = "Appple";
        bill11.customerAddress = "654 Q Avenue, Bangalore";
        bill11.customerPhone = "4455667788";
        bill11.customerEmail = "Apple@gmail.com";   

        System.out.println("Bill ID: " + bill11.billId);
        System.out.println("Bill Date: " + bill11.date);
        System.out.println("Due Date: " + bill11.dueDate);
        System.out.println("Status: " + bill11.status);
        System.out.println("Customer ID: " + bill11.customerId);
        System.out.println("Customer Name: " + bill11.customerName);
        System.out.println("Customer Address: " + bill11.customerAddress);
        System.out.println("Customer Phone: " + bill11.customerPhone);
        System.out.println("Customer Email: " + bill11.customerEmail);  

        ObjectCreations bill12 = new ObjectCreations();
        bill12.billId = "B78901";    
        bill12.date = "2023-10-12";
        bill12.dueDate = "2023-10-26";
        bill12.status = "Paid";
        bill12.customerId = "C55667";
        bill12.customerName = "Jacky";
        bill12.customerAddress = "987 R Road, Bangalore";
        bill12.customerPhone = "5566778899";
        bill12.customerEmail = "jacky@gmail.com";      

        System.out.println("Bill ID: " + bill12.billId);
        System.out.println("Bill Date: " + bill12.date);
        System.out.println("Due Date: " + bill12.dueDate);
        System.out.println("Status: " + bill12.status);
        System.out.println("Customer ID: " + bill12.customerId);
        System.out.println("Customer Name: " + bill12.customerName);
        System.out.println("Customer Address: " + bill12.customerAddress);
        System.out.println("Customer Phone: " + bill12.customerPhone);
        System.out.println("Customer Email: " + bill12.customerEmail);  

        ObjectCreations bill13 = new ObjectCreations();
        bill13.billId = "B89012";    
        bill13.date = "2023-10-13";
        bill13.dueDate = "2023-10-27";
        bill13.status = "Overdue";
        bill13.customerId = "C77889";
        bill13.customerName = "Mr.Whitey";
        bill13.customerAddress = "321 S Street, Bangalore";
        bill13.customerPhone = "6677889900";
        bill13.customerEmail = "Mr.whitey@gmail.com";      

        System.out.println("Bill ID: " + bill13.billId);
        System.out.println("Bill Date: " + bill13.date);
        System.out.println("Due Date: " + bill13.dueDate);
        System.out.println("Status: " + bill13.status);
        System.out.println("Customer ID: " + bill13.customerId);
        System.out.println("Customer Name: " + bill13.customerName);
        System.out.println("Customer Address: " + bill13.customerAddress);
        System.out.println("Customer Phone: " + bill13.customerPhone);
        System.out.println("Customer Email: " + bill13.customerEmail);  

        ObjectCreations bill14 = new ObjectCreations();
        bill14.billId = "B90123";    
        bill14.date = "2023-10-14";
        bill14.dueDate = "2023-10-28";
        bill14.status = "Cancelled";
        bill14.customerId = "C99001";
        bill14.customerName = "Mr.Blackey";
        bill14.customerAddress = "654 T Avenue, Bangalore";
        bill14.customerPhone = "7788990011";
        bill14.customerEmail = "blackey@gmail.com";   

        System.out.println("Bill ID: " + bill14.billId);
        System.out.println("Bill Date: " + bill14.date);
        System.out.println("Due Date: " + bill14.dueDate);
        System.out.println("Status: " + bill14.status);
        System.out.println("Customer ID: " + bill14.customerId);
        System.out.println("Customer Name: " + bill14.customerName);
        System.out.println("Customer Address: " + bill14.customerAddress);
        System.out.println("Customer Phone: " + bill14.customerPhone);
        System.out.println("Customer Email: " + bill14.customerEmail);  

        ObjectCreations bill15 = new ObjectCreations();
        bill15.billId = "B01234";    
        bill15.date = "2023-10-15";
        bill15.dueDate = "2023-10-29";
        bill15.status = "Refunded";
        bill15.customerId = "C11223";
        bill15.customerName = " Geerish";
        bill15.customerAddress = "987 U Boulevard, Bangalore";
        bill15.customerPhone = "8899001122";
        bill15.customerEmail = "geerish@gmail.com";

        System.out.println("Bill ID: " + bill15.billId);
        System.out.println("Bill Date: " + bill15.date);    
        System.out.println("Due Date: " + bill15.dueDate);
        System.out.println("Status: " + bill15.status);
        System.out.println("Customer ID: " + bill15.customerId);
        System.out.println("Customer Name: " + bill15.customerName);
        System.out.println("Customer Address: " + bill15.customerAddress);
        System.out.println("Customer Phone: " + bill15.customerPhone);
        System.out.println("Customer Email: " + bill15.customerEmail);  

        ObjectCreations bill16 = new ObjectCreations();
        bill16.billId = "B12345";   
        bill16.date = "2023-10-16";
        bill16.dueDate = "2023-10-30";
        bill16.status = "Pending";
        bill16.customerId = "C33445";
        bill16.customerName = "Blue_berry";
        bill16.customerAddress = "321 V Street, Bangalore";
        bill16.customerPhone = "0011223344";
        bill16.customerEmail = "blue_berry@gmail.com"; 

        System.out.println("Bill ID: " + bill16.billId);
        System.out.println("Bill Date: " + bill16.date);
        System.out.println("Due Date: " + bill16.dueDate);
        System.out.println("Status: " + bill16.status);
        System.out.println("Customer ID: " + bill16.customerId);
        System.out.println("Customer Name: " + bill16.customerName);
        System.out.println("Customer Address: " + bill16.customerAddress);
        System.out.println("Customer Phone: " + bill16.customerPhone);
        System.out.println("Customer Email: " + bill16.customerEmail);  

        ObjectCreations bill17 = new ObjectCreations();
        bill17.billId = "B23456";    
        bill17.date = "2023-10-17";
        bill17.dueDate = "2023-10-31";
        bill17.status = "Paid";
        bill17.customerId = "C55667";
        bill17.customerName = "Reddy";
        bill17.customerAddress = "654 W Avenue, Bangalore";
        bill17.customerPhone = "2233445566";
        bill17.customerEmail = "Reddy@gmail.com";            

        System.out.println("Bill ID: " + bill17.billId);
        System.out.println("Bill Date: " + bill17.date);
        System.out.println("Due Date: " + bill17.dueDate);
        System.out.println("Status: " + bill17.status);
        System.out.println("Customer ID: " + bill17.customerId);
        System.out.println("Customer Name: " + bill17.customerName);
        System.out.println("Customer Address: " + bill17.customerAddress);
        System.out.println("Customer Phone: " + bill17.customerPhone);
        System.out.println("Customer Email: " + bill17.customerEmail);  

        ObjectCreations bill18 = new ObjectCreations();
        bill18.billId = "B34567";    
        bill18.date = "2023-10-18";
        bill18.dueDate = "2023-11-01";
        bill18.status = "Overdue";
        bill18.customerId = "C77889";
        bill18.customerName = "Sagar";
        bill18.customerAddress = "987 X Boulevard, Bangalore";
        bill18.customerPhone = "3344556677";
        bill18.customerEmail = "Sagar@gmail.com";

        System.out.println("Bill ID: " + bill18.billId);
        System.out.println("Bill Date: " + bill18.date);
        System.out.println("Due Date: " + bill18.dueDate);
        System.out.println("Status: " + bill18.status);
        System.out.println("Customer ID: " + bill18.customerId);
        System.out.println("Customer Name: " + bill18.customerName);
        System.out.println("Customer Address: " + bill18.customerAddress);
        System.out.println("Customer Phone: " + bill18.customerPhone);
        System.out.println("Customer Email: " + bill18.customerEmail);  

        ObjectCreations bill19 = new ObjectCreations();
        bill19.billId = "B45678";   
        bill19.date = "2023-10-19";
        bill19.dueDate = "2023-11-02";
        bill19.status = "Cancelled";
        bill19.customerId = "C99001";
        bill19.customerName = "Pinky";
        bill19.customerAddress = "321 Y Street, Bangalore";
        bill19.customerPhone = "4455667788";
        bill19.customerEmail = "pinkey@gmail.com";

        System.out.println("Bill ID: " + bill19.billId);
        System.out.println("Bill Date: " + bill19.date);    
        System.out.println("Due Date: " + bill19.dueDate);
        System.out.println("Status: " + bill19.status);
        System.out.println("Customer ID: " + bill19.customerId);
        System.out.println("Customer Name: " + bill19.customerName);
        System.out.println("Customer Address: " + bill19.customerAddress);
        System.out.println("Customer Phone: " + bill19.customerPhone);
        System.out.println("Customer Email: " + bill19.customerEmail);  

        ObjectCreations bill20 = new ObjectCreations();
        bill20.billId = "B56789";    
        bill20.date = "2023-10-20";
        bill20.dueDate = "2023-11-03";
        bill20.status = "Refunded";
        bill20.customerId = "C11223";
        bill20.customerName = "Durga";
        bill20.customerAddress = "654 Z Avenue, Bangalore";
        bill20.customerPhone = "5566778899";
        bill20.customerEmail = "durga@gmail.com";

        System.out.println("Bill ID: " + bill20.billId);
        System.out.println("Bill Date: " + bill20.date);
        System.out.println("Due Date: " + bill20.dueDate);
        System.out.println("Status: " + bill20.status);
        System.out.println("Customer ID: " + bill20.customerId);
        System.out.println("Customer Name: " + bill20.customerName);
        System.out.println("Customer Address: " + bill20.customerAddress);
        System.out.println("Customer Phone: " + bill20.customerPhone);
        System.out.println("Customer Email: " + bill20.customerEmail);  

    }

}