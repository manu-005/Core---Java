class LinkedInRunner {
    public static void main(String[] args) {
        boolean registered = LinkedInVal.register("linkedin.com", "Careers", 900000000, true, "Ryan Roslansky");
        System.out.println("Registered: " + registered);
        LinkedIn.get();
    }
}
