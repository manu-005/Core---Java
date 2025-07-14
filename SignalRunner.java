class SignalRunner {
    public static void main(String[] args) {
        System.out.println("Signal Type: " + Signal.getType());
        System.out.println("Duration: " + Signal.getDuration());
        System.out.println("Location: " + Signal.getLocation());
        System.out.println("Functional: " + Signal.isFunctional());
        System.out.println("Color: " + Signal.getColor());
    }
}