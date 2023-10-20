package use_case.clear_users;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface clearUserDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearUserDataAccessInterface, ClearOutputBoundary clearPresenter) {
        this.clearUserDataAccessObject = clearUserDataAccessInterface;
        this.clearPresenter = clearPresenter;
    }

    @Override
    public void execute() {
        if (clearUserDataAccessObject.noUsers()) {
            clearPresenter.prepareFailView("No users to delete.");
        } else {
            ClearOutputData clearOutputData = new ClearOutputData(clearUserDataAccessObject.getAll());
            clearUserDataAccessObject.clearUsers();
            clearPresenter.prepareSuccessView(clearOutputData);
        }
    }
}
