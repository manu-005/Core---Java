class Hospital {
    public static void main(String[] ar) {
        String hospital_DoctorsName[] = { "Dr. Ramesh Kumar - Apollo Hospital", "Dr. Anjali Sharma - Fortis Hospital",
                "Dr. Vikram Patel - AIIMS Delhi", "Dr. Neha Gupta - Manipal Hospital",
                "Dr. Sandeep Mehta - Max Healthcare", "Dr. Priya Nair - Narayana Health",
                "Dr. Rajiv Verma - Medanta Hospital", "Dr. Sneha Rao - Columbia Asia", "Dr. Arjun Das - Care Hospitals",
                "Dr. Meera Joshi - Hinduja Hospital" };

        System.out.println(hospital_DoctorsName[0] + " " + hospital_DoctorsName[1] + " " + hospital_DoctorsName[2] + " "
                + hospital_DoctorsName[3] + " " + hospital_DoctorsName[4]);
        System.out.println(hospital_DoctorsName[5] + " " + hospital_DoctorsName[6] + " " + hospital_DoctorsName[7] + " "
                + hospital_DoctorsName[8] + " " + hospital_DoctorsName[9]);
        for (String hosp : hospital_DoctorsName) {
            System.out.println(hosp);
        }
    }
}