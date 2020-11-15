package ru.netology3_1.task_1;

public class FromArchivedStatusMover extends BookMover {

    @Override
    protected boolean isTransitionAvailable(Book book, Status requestedStatus) {
        if (!book.getStatus().equals(Status.ARCHIVED)) {
            return false;
        }
        boolean isAvailable = false;
        switch (requestedStatus) {
            case AVAILABLE:
                isAvailable = true;
        }
        return isAvailable;
    }

}
