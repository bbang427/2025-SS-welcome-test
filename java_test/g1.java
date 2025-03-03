package java_test;
class Fan {
    private String model;
    private int price;

    public Fan(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String Model){
        this.model = Model;
    }

    public void setPrice(int Price) {
        this.price = Price;
    }
}

public class g1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Fan[] fans = new Fan[3];
        for (int i = 0; i < 3; i++) {
            String model = scanner.nextLine();
            int price = Integer.parseInt(scanner.nextLine());
            fans[i] = new Fan(model, price);
        }
        scanner.close();

        Fan cheapestFan = fans[0];
        for (int i = 1; i < fans.length; i++) {
            if (fans[i].getPrice() < cheapestFan.getPrice()) {
                cheapestFan = fans[i];
            }
        }

        System.out.println(cheapestFan.getModel());
    }

}
