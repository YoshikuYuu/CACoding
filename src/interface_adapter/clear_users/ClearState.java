package interface_adapter.clear_users;

// TODO Complete me

import interface_adapter.signup.SignupState;

public class ClearState {
    private String deletedUsers = null;
    private String noUsersError = null;
    public ClearState() {}

    public String getDeletedUsers() {
        return deletedUsers;
    }

    public void setDeletedUsers(String deletedUsers) {
        this.deletedUsers = deletedUsers;
    }

    public String getNoUsersError() {
        return noUsersError;
    }

    public void setNoUsersError(String noUsersError) {
        this.noUsersError = noUsersError;
    }
}
