class ChatGPTRunner {
    public static void main(String[] args) {
        boolean registered = ChatGPTValidator.register("4.0", "OpenAI", true, "GPT-4", 4096);
        System.out.println("Registered: " + registered);
        ChatGPT.get();
    }
}