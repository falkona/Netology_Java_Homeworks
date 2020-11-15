package ru.netology1_6;

public class Main1 {
    public static void main(String[] args) throws Exception {
        Book harryPotter = new Book("Harry Potter and philosopher's stone", "J. K. Rowling", "This is the 1st book about Harry Potter", "../cover", "Bloomsbury", 245, 1999);
        Chapter chapter1 = new Chapter(1, "The Boy Who Lived", "Mr. and Mrs. Dursley, of number four, Privet Drive, were proud to say " +
                "that they were perfectly normal, thank you very much...");
        Chapter chapter2 = new Chapter(2, "The Vanishing Glass", "Nearly ten years had passed since the Dursleys had woken up to find " +
                "their nephew on the front step, but Privet Drive had hardly changed at all...");
        harryPotter.addChapter(chapter1);
        harryPotter.addChapter(chapter2);
        harryPotter.addBookmark(chapter1, 10);
        harryPotter.addBookmark(chapter2, 5);

        harryPotter.printBookInfo();
        harryPotter.getChapterByNumber(1).printChapter();
        harryPotter.getChapterByNumber(2).printChapter();
        harryPotter.printAllBookmarks();

        //harryPotter.getChapterByNumber(3).printChapter();
    }
}
