package CreationalDesignPattern.src.DataAccessLayer;

/*
 * Singelotn, so that only one instance/object can be created
 */
public class UserDatabase {
    private static UserDatabase instance;

    private UserDatabase() {
        // make the constructor private
    }
    
    public static synchronized UserDatabase getInstance() {
        if (instance == null) {
            instance = new UserDatabase();
        }

        return instance;
    }
}
