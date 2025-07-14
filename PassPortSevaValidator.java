class PassPortSevaValidator{
    static String givenName;
    static String surName;
    static String password;
    static String cfmPwd;

    public static boolean validateUser(String gName, String sName, String pwd, String cPwd){

        boolean isUserValid=false;
        boolean gNameValid=false;
        boolean sNameValid=false;
        boolean pwdValid=false;
        boolean cPwdValid=false;

        if ( gName!= null){
            gNameValid=true;
            givenName=gName;
        }
        else{
            System.out.println("Enter Valid Name");
        }

         if ( sName!= null){
            sNameValid=true;
            surName=sName;
        }
        else{
            System.out.println("Enter Valid SurName");

        } 
        if ( pwd!= null){
            pwdValid=true;
            password=pwd;
        }
        
        else{
            System.out.println("Enter Valid Pwd");
        } 
        if ( cPwd!= null && pwd==cPwd){
            cPwdValid=true;
            cfmPwd=cPwd;
        }
        else{
            System.out.println("Enter Valid cPwd");
        }
        if (gNameValid==true && sNameValid==true && pwdValid ==true && cPwdValid ==true ){
            System.out.println("User Validated");
            isUserValid=true;
        }
        return isUserValid;

    }
}