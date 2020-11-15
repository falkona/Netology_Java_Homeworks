package ru.netology3_1.task_1;

public class FromAvailableStatusMover extends BookMover {

    @Override
    protected boolean isTransitionAvailable(Book book,  Status requestedStatus) {
        if (!book.getStatus().equals(Status.AVAILABLE)) {
            return false;
        }
        boolean isAvailable = false;
        switch (requestedStatus) {
            case BORROWED:
            case ARCHIVED:
                isAvailable = true;
        }
        return isAvailable;
    }

}
