public class Main {
    public static void main(String[] args) {
        createObject("Apple");
        createObject("OnePlus");
        createObject("Xiaomi");
    }

    private static Telephone createObject(String ModelName) {
        switch (ModelName) {
            case "Apple":
                Apple apple = new Apple("Apple", "Stive Jobs", 2020, 388.8, 1000000);
                apple.print();
                break;
            case "OnePlus":
                Oneplus oneplus = new Oneplus("OnePlus", "Pit Lau", 2021, 1500000, "Guangdong Province China");
                oneplus.print();
                break;
            case "Xiaomi":
                Xiaomi xiaomi = new Xiaomi("Xiaomi", "Lei Jun", 2022, 16888, "Redmi");
                xiaomi.print();
                break;
        }
        return null;
    }
}