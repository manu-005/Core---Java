public class Network {
    Network(String name, String type) {
        this.name = name;
    }

    Network(int speed) {
        this.speed = speed;
    }

    Network(boolean isWireless) {
        this.isWireless = isWireless;
    }

    Network(String securityProtocol) {
        this.securityProtocol = securityProtocol;
    }

    String name;
    String type;
    int speed;
    boolean isWireless;
    String securityProtocol;
}