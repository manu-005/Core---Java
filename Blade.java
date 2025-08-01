public class Blade {
    Blade(String material , String sharpness) {
        this.material = material;

    }

    Blade(double len) {
        this.length = len;
    }

    Blade(double width, double thickness) {
        this.width = width;
        this.thickness = thickness;

    }

    Blade(String sharpness) {
        this.sharpness = sharpness;
    }

    String material;
    double length;
    double width;
    double thickness;
    String sharpness;

    public void displayInfo() {
        System.out.println("Blade Material: " + material);
        System.out.println("Length: " + length + " cm");
        System.out.println("Width: " + width + " cm");
        System.out.println("Thickness: " + thickness + " cm");
        System.out.println("Sharpness: " + sharpness);
        System.out.println("-----------------------------");
    }
}
