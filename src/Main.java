public class Main {
    public static void main(String[] args) {
        Car TOYOTA_MIRAI = new Car("Toyota", "Mirai", "Blue", 2024, 27000.00, 467);
        System.out.println(TOYOTA_MIRAI.toString());

        System.out.println("\n\n\n");
        TOYOTA_MIRAI.sell(1);
        System.out.println(TOYOTA_MIRAI.getModel());
        System.out.println(TOYOTA_MIRAI.getBrand());
        System.out.println(TOYOTA_MIRAI.getColor());
        System.out.println(TOYOTA_MIRAI.getYear());
        System.out.println(TOYOTA_MIRAI.getYear());
        System.out.println(TOYOTA_MIRAI.getQuantity());

        TOYOTA_MIRAI.setColor("Red");
        TOYOTA_MIRAI.setYear(2025);
        TOYOTA_MIRAI.setPrice(43956.94);
        System.out.println("\n\n\n");
        System.out.println(TOYOTA_MIRAI.toString());
    }
}