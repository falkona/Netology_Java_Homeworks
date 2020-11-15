package ru.netology3_1.task_1;

public class FromOverduedStatusMover extends BookMover {

    @Override
    protected boolean isTransitionAvailable(Book book, Status requestedStatus) {
        if (!book.getStatus().equals(Status.OVERDUED)) {
            return false;
        }
        boolean isAvailable = false;
        switch (requestedStatus) {
            case AVAILABLE:
            case ARCHIVED:
                isAvailable = true;
        }
        return isAvailable;
    }

}
