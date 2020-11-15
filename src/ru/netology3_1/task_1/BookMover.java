package ru.netology3_1.task_1;

public class BookMover {

    protected void moveToStatus(Book book, Status requestedStatus) {
        if (book.getStatus().equals(requestedStatus)) {
            System.out.println(String.format("Книга уже находится в статусе %s", book.getStatus()));
        } else {
            System.out.println("Изменяю статус...");
            if (isTransitionAvailable(book, requestedStatus)) {
                Status currentStatus = book.getStatus();
                book.setStatus(requestedStatus);
                System.out.println(String.format("Статус книги изменен: %s -> %s", currentStatus, book.getStatus()));
            } else {
                System.out.println(String.format("Перевод книги из статуса '%s' в статус '%s' невозможен", book.getStatus(),
                                                 requestedStatus));
            }
        }
    }

    protected boolean isTransitionAvailable(Book book, Status requestedStatus) {
        return false;
    }

}
