package ru.netology3_1.task_1;

public class FromBorrowedStatusMover extends BookMover {

    @Override
    protected boolean isTransitionAvailable(Book book, Status requestedStatus) {
        if (!book.getStatus().equals(Status.BORROWED)) {
            return false;
        }
        boolean isAvailable = false;
        switch (requestedStatus) {
            case AVAILABLE:
            case ARCHIVED:
            case OVERDUED:
                isAvailable = true;
        }
        return isAvailable;
    }

}
