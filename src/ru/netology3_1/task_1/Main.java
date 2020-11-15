package ru.netology3_1.task_1;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n" + "Тест: Available -> Borrowed");
        moveFromAvailableToBorrowed();

        System.out.println("\n" + "Тест: Available -> Available");
        moveFromAvailableToAvailable();

        System.out.println("\n" + "Тест: Available -> Overdued");
        moveFromAvailableToOverdued();

        System.out.println("\n" + "Тест: Borrowed -> Borrowed");
        moveFromBorrowedToBorrowed();

        System.out.println("\n" + "Тест: Borrowed -> Available");
        moveFromBorrowedToAvailable();

        System.out.println("\n" + "Тест: Archived -> Available");
        moveFromArchivedToAvailable();

        System.out.println("\n" + "Тест: Archived -> Borrowed");
        moveFromArchivedToBorrowed();

        System.out.println("\n" + "Тест: Overdued -> Borrowed");
        moveFromOverduedToBorrowed();

        System.out.println("\n" + "Тест: Overdued -> Archived");
        moveFromOverduedToArchived();

        System.out.println("\n" + "Тест: неподходящий перемещатель");
        inappropriateMover();
    }

    public static void moveFromAvailableToBorrowed() {
        Book book = new Book(Status.AVAILABLE, "Queen's Gambit");
        FromAvailableStatusMover mover = new FromAvailableStatusMover();
        mover.moveToStatus(book, Status.BORROWED);
        System.out.println(String.format("Книга '%s' находится в статусе %s", book.getTitle(), book.getStatus()));
    }

    public static void moveFromAvailableToAvailable() {
        Book book = new Book(Status.AVAILABLE, "Queen's Gambit");
        FromAvailableStatusMover mover = new FromAvailableStatusMover();
        mover.moveToStatus(book, Status.AVAILABLE);
        System.out.println(String.format("Книга '%s' находится в статусе %s", book.getTitle(), book.getStatus()));
    }

    public static void moveFromAvailableToOverdued() {
        Book book = new Book(Status.AVAILABLE, "Queen's Gambit");
        FromAvailableStatusMover mover = new FromAvailableStatusMover();
        mover.moveToStatus(book, Status.OVERDUED);
        System.out.println(String.format("Книга '%s' находится в статусе %s", book.getTitle(), book.getStatus()));
    }

    public static void moveFromBorrowedToBorrowed() {
        Book book = new Book(Status.BORROWED, "Big Little Lies");
        FromBorrowedStatusMover mover = new FromBorrowedStatusMover();
        mover.moveToStatus(book, Status.BORROWED);
        System.out.println(String.format("Книга '%s' находится в статусе %s", book.getTitle(), book.getStatus()));
    }

    public static void moveFromBorrowedToAvailable() {
        Book book = new Book(Status.BORROWED, "Big Little Lies");
        FromBorrowedStatusMover mover = new FromBorrowedStatusMover();
        mover.moveToStatus(book, Status.AVAILABLE);
        System.out.println(String.format("Книга '%s' находится в статусе %s", book.getTitle(), book.getStatus()));
    }

    public static void moveFromArchivedToAvailable() {
        Book book = new Book(Status.ARCHIVED, "Blade Runner");
        FromArchivedStatusMover mover = new FromArchivedStatusMover();
        mover.moveToStatus(book, Status.AVAILABLE);
        System.out.println(String.format("Книга '%s' находится в статусе %s", book.getTitle(), book.getStatus()));
    }

    public static void moveFromArchivedToBorrowed() {
        Book book = new Book(Status.ARCHIVED, "Blade Runner");
        FromArchivedStatusMover mover = new FromArchivedStatusMover();
        mover.moveToStatus(book, Status.BORROWED);
        System.out.println(String.format("Книга '%s' находится в статусе %s", book.getTitle(), book.getStatus()));
    }

    public static void moveFromOverduedToBorrowed() {
        Book book = new Book(Status.OVERDUED, "Murder on the Orient Express");
        FromOverduedStatusMover mover = new FromOverduedStatusMover();
        mover.moveToStatus(book, Status.BORROWED);
        System.out.println(String.format("Книга '%s' находится в статусе %s", book.getTitle(), book.getStatus()));
    }

    public static void moveFromOverduedToArchived() {
        Book book = new Book(Status.OVERDUED, "Murder on the Orient Express");
        FromOverduedStatusMover mover = new FromOverduedStatusMover();
        mover.moveToStatus(book, Status.ARCHIVED);
        System.out.println(String.format("Книга '%s' находится в статусе %s", book.getTitle(), book.getStatus()));
    }

    public static void inappropriateMover() {
        Book book = new Book(Status.AVAILABLE, "Eugen Onegin");
        FromOverduedStatusMover mover = new FromOverduedStatusMover();
        mover.moveToStatus(book, Status.BORROWED);
        System.out.println(String.format("Книга '%s' находится в статусе %s", book.getTitle(), book.getStatus()));
    }

}

