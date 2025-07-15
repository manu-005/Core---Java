class ChatGPTValidator{
    static String version;
    static String developer;
    static boolean aiBased;
    static String languageModel;
    static int maxTokens;

    public static boolean register(String ver, String dev, boolean ai, String lm, int tokens) {
        boolean valid = true;

        if (ver != null)
            version = ver;
        else {
            System.out.println("Invalid version");
            valid = false;
        }
        if (dev != null)
            developer = dev;
        else {
            System.out.println("Invalid developer");
            valid = false;
        }
        aiBased = ai;
        if (lm != null)
            languageModel = lm;
        else {
            System.out.println("Invalid model");
            valid = false;
        }
        if (tokens > 0)
            maxTokens = tokens;
        else {
            System.out.println("Invalid token count");
            valid = false;
        }

        return valid;
    }
}