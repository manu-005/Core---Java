class Contacts {
    static String personName;

    public static long getNumber(String personName) {
        long number = 0;
        if (personName == "Sharan") {
            number = 9173645289L;
        } else if (personName == "Rangaa") {
            number = 9813243111L;
        } else if (personName == "Raju") {
            number = 9121232344L;
        } else if (personName == "Ramu") {
            number = 9766523410L;
        } else if (personName == "Pavan") {
            number = 9912123450L;
        } else if (personName == "Praveen") {
            number = 8187655665L;
        } else if (personName == "Prajwal") {
            number = 9648878871L;
        } else if (personName == "Omprasad") {
            number = 8491982737L;
        } else if (personName == "Narayan") {
            number = 9834528721L;
        } else if (personName == "Nagaraj") {
            number = 8943614212L;
        } else if (personName == "Naagu") {
            number = 9024315616L;
        } else if (personName == "Devendra") {
            number = 6843530202L;
        } else if (personName == "Manjunatha") {
            number = 94231654250L;
        } else if (personName == "Manu") {
            number = 5231865254L;
        } else if (personName == "Manoj") {
            number = 94361345462L;
        } else if (personName == "Manju") {
            number = 9641234323L;
        } else if (personName == "Lohit") {
            number = 9854643242L;
        } else if (personName == "Karna") {
            number = 852413123354L;
        } else if (personName == "Kiran") {
            number = 842345643339L;
        } else if (personName == "Kariya") {
            number = 96053476543L;
        } else if (personName == "Jagadish") {
            number = 94352438852L;
        } else if (personName == "Jaggu") {
            number = 97654678765L;
        } else if (personName == "Imam") {
            number = 9589876567L;
        } else if (personName == "Ishwar") {
            number = 9778976056L;
        } else if (personName == "Indiraa") {
            number = 7865421331L;
        } else if (personName == "Harichandra") {
            number = 6456425432L;
        } else if (personName == "Harish") {
            number = 7456723451L;
        } else if (personName == "Hari") {
            number = 6654378223L;
        } else if (personName == "Gagan") {
            number = 9657329874L;
        } else if (personName == "Guru") {
            number = 6675436785L;
        } else if (personName == "Gangadhar") {
            number = 5952643217L;
        } else if (personName == "Ganesh") {
            number = 78265432434L;
        } else if (personName == "Fakkiresh") {
            number = 85341763441L;
        } else if (personName == "Elephant") {
            number = 6936543286L;
        } else if (personName == "Darling") {
            number = 987621134544L;
        } else if (personName == "Devuu") {
            number = 74562753351L;
        } else if (personName == "chandu") {
            number = 96351316528L;
        } else if (personName == " Vinayaka") {
            number = 7898765299L;
        } else if (personName == "Bharat") {
            number = 9000066627L;
        } else if (personName == "Tan") {
            number = 7345666255L;
        } else if (personName == "British") {
            number = 8653444246L;
        } else if (personName == "Pintuu") {
            number = 9445522324L;
        } else if (personName == "basavaraj") {
            number = 8743225236L;
        } else if (personName == "Basu") {
            number = 9442456213L;
        } else if (personName == "Abhi") {
            number = 7543457211L;
        } else if (personName == "Arun") {
            number = 9764312343L;
        } else if (personName == "Arjun") {
            number = 8765436263L;
        } else if (personName == "Viveka") {
            number = 8537825394L;
        } else if (personName == "Ram") {
            number = 9654321358L;
        } else if (personName == "Mahesh") {
            number = 9565543761L;
        } else {
            System.out.println("They are not In Your Contact");
        }
        return number;
    }

    public static void main(String[] ar) {

        long mobileNo = getNumber("Mahesh");
        System.out.println("You Searched Mobile Number is : " + mobileNo);

    }
}