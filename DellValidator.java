class DellValidator{
     static String brand;
    static String model;
    static String gen;
    static String memory;
    static String processor;
    static int price;
    

    static public boolean info(String bName,String mName, String genName, String mStorage, String pName, int amt ){
        boolean validLaptop=false;
        boolean bNameValid=false;
        boolean mNameValid=false;
        boolean genNameValid = false;
        boolean mStorageValid = false;
        boolean pNameValid = false;
        boolean amtValid = false;

        if (bName != null){
            bNameValid=true;
            brand=bName;
        }
        else{
            System.out.println("Enter VAlid Brand Name..");
        }
        if (mName !=null){
            mNameValid = true;
            model=mName;
        }
        else{
            System.out.println("Enter Valid Model");
        }
        if(genName != null){
            genNameValid = true;
            gen=genName;
        }
        else{
            System.out.println("ENter Valid Genaration");
        }
        if(mStorage!=null){
            mStorageValid=true;
            memory=mStorage;
        }
        else{
            System.out.println("Enter valid Storage");
        }
        if(pName!=null){
            pNameValid=true;
            processor=pName;
        }
        else{
            System.out.println("Enter Valid Processor");
        }
        if (amt > 0){
            amtValid=true;
            price=amt;
        }
        else{
            System.out.println("Enter correct Price");
        }
        if(bNameValid== true && mNameValid==true && genNameValid == true && mStorageValid == true && pNameValid == true && amtValid == true)
        {
            validLaptop=true;
        }
        else {
            System.out.println("Enter Correct Credential");
        }
    return validLaptop;
    }
}