class ChatGPTRunner {
    public static void main(String[] args) {
        boolean registered = ChatGPT.register("4.0", "OpenAI", true, "GPT-4", 4096);
        System.out.println("Registered: " + registered);
        ChatGPT.get();
    }
}