package Practice.Examples;

public interface ex5 {
    void start();

    void stop();

    // Separate helper class
    class VehicleUtils {
        static void washVehicle() {
            System.out.println("Washing the vehicle...");
        }
    }

}

class another implements ex5 {
    String str;
    public void start() {
        System.out.println("start");
    }

    public void stop() {
        System.out.println("stop");
    }

    public static void main(String[] args) {
        VehicleUtils.washVehicle();
        another another = new another();
        another.start();
        another.stop();
        String str = new String();
        String str2;
        if (another.str==null) {
            System.out.println("null");
        }
    }
}
