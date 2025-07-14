class Country {
    static String CountryName;

    public static int getCountryCode(String CountryName) {
        int countryCode = 0;
        if (CountryName == "India") {
            countryCode = 91;
        } else if (CountryName == "Australia") {
            countryCode = 61;
        } else if (CountryName == "Srilanka") {
            countryCode = 94;
        } else if (CountryName == "Turkey") {
            countryCode = 90;
        } else if (CountryName == "China") {
            countryCode = 86;
        } else if (CountryName == "Japan") {
            countryCode = 81;
        } else if (CountryName == "America") {
            countryCode = 1;
        } else if (CountryName == "Russia") {
            countryCode = 7;
        } else if (CountryName == "Egypt") {
            countryCode = 20;
        } else if (CountryName == "Germany") {
            countryCode = 20;
        } else {
            System.out.println("Not Valid Country Name ");
        }

        return countryCode;
    }
    public static void main (String[] ar){
        
        int code=getCountryCode("Egypt");
        System.out.println("Country Code is : "+code);

    }
}