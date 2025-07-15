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
        } else if (CountryName == "Algeria") {
            countryCode = 12;
        } else if (CountryName == "American  Samoa") {
            countryCode = 16;
        } else if (CountryName == "Andorra") {
            countryCode = 20;
        } else if (CountryName == "France") {
            countryCode = 250;
        } else if (CountryName == "French Guiana") {
            countryCode = 254;
        } else if (CountryName == "Indonesia") {
            countryCode = 62;
        } else if (CountryName == "Iraq") {
            countryCode = 964;
        } else if (CountryName == "Iran") {
            countryCode = 98;
        } else if (CountryName == "Iceland") {
            countryCode = 354;
        } else if (CountryName == "Italy") {
            countryCode = 39;
        } else if (CountryName == "Maldives") {
            countryCode = 960;
        } else if (CountryName == "Mexico") {
            countryCode = 52;
        } else if (CountryName == "Mongolia") {
            countryCode = 976;
        } else if (CountryName == "Myanmar") {
            countryCode = 95;
        } else if (CountryName == "Nepal") {
            countryCode = 977;
        } else if (CountryName == "Netherlands") {
            countryCode = 31;
        } else if (CountryName == "New Zealand") {
            countryCode = 64;
        } else if (CountryName == "Peru") {
            countryCode = 51;
        } else if (CountryName == "Philippines") {
            countryCode = 63;
        } else if (CountryName == "Qatar") {
            countryCode = 974;
        } else if (CountryName == "Singapore") {
            countryCode = 65;
        } else if (CountryName == "South Korea") {
            countryCode = 82;
        } else if (CountryName == "Spain") {
            countryCode = 34;
        } else if (CountryName == "Switzerland") {
            countryCode = 41;
        } else if (CountryName == "Thailand") {
            countryCode = 66;
        } else if (CountryName == "United Kingdom") {
            countryCode = 44;
        } else if (CountryName == "Portugal") {
            countryCode = 351;
        } else if (CountryName == "Faroe Islands") {
            countryCode = 298;
        } else if (CountryName == " Greenland") {
            countryCode = 299;
        } else if (CountryName == "South Africa") {
            countryCode = 27;
        } else if (CountryName == "Tanzania") {
            countryCode = 255;
        } else if (CountryName == "British Indian Ocean Territory") {
            countryCode = 246;
        } else if (CountryName == " Angola") {
            countryCode = 244;
        } else if (CountryName == "Central African Republic") {
            countryCode = 236;
        } else if (CountryName == " Algeria") {
            countryCode = 213;
        } else if (CountryName == "South Sudan") {
            countryCode = 211;
        } else if (CountryName == "Afghanistan") {
            countryCode = 93;
        } else if (CountryName == "Zimbabwe") {
            countryCode = 263;
        } else if (CountryName == "Vietnam") {
            countryCode = 84;
        } else if (CountryName == "Venezuela") {
            countryCode = 58;
        } else if (CountryName == "United States") {
            countryCode = 1;
        } else {
            System.out.println("Not Valid Country Name ");
        }
        return countryCode;
    }

    public static void main(String[] ar) {

        int code = getCountryCode("Afghanistan");
        System.out.println("Country Code is : " + code);

    }
}