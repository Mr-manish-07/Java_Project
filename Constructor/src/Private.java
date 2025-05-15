public class Private {

    private Private(){
        System.out.println("Private constructor is called");
    }

    private static Private instance = null;

    public static Private getInstance() {
        if (instance == null) {
            instance = new Private();
        }
        return instance;
    }

    public static void main(String[] args) {
        Private obj = Private.getInstance();
    }
}
