package use_case.clear_users;

// TODO Complete me

public class ClearOutputData {
    private String[] deleted_users;
    public ClearOutputData(String[] deleted_users) {
        this.deleted_users = deleted_users;
    }

    public String[] getDeleted_users() {
        return deleted_users;
    }
}
