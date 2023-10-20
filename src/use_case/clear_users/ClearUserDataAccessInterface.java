package use_case.clear_users;

// TODO Complete me

import entity.User;

public interface ClearUserDataAccessInterface {
    boolean noUsers();
    String[] getAll();
    void clearUsers();
}
