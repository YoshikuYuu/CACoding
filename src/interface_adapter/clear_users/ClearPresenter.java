package interface_adapter.clear_users;

// TODO Complete me

import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;
    public ClearPresenter(ClearViewModel clearViewModel) {
        this.clearViewModel = clearViewModel;
    }
    @Override
    public void prepareSuccessView(ClearOutputData clearOutputData) {
        String deletedUsersString = String.join("\n", clearOutputData.getDeleted_users());
        deletedUsersString  = "Users deleted: \n" + deletedUsersString;

        ClearState clearState = clearViewModel.getState();
        clearState.setDeletedUsers(deletedUsersString);
        this.clearViewModel.setState(clearState);
        clearViewModel.firePropertyChanged();
    }

    @Override
    public void prepareFailView(String noUsersMessage) {
        ClearState clearState = clearViewModel.getState();
        clearState.setNoUsersError(noUsersMessage);
        clearViewModel.firePropertyChanged();
    }
}
