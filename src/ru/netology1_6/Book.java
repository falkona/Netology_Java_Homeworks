package ru.netology1_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {

    String title;
    String author;
    String summary;
    String pathToCover;
    String publisher;
    List<Chapter> contents;
    List<Bookmark> bookmarks;
    int volume;
    int year;


    public Book(String title, String author, String summary, String pathToCover, String publisher, int volume, int year) {
        this.title = title;
        this.author = author;
        this.summary = summary;
        this.pathToCover = pathToCover;
        this.volume = volume;
        this.year = year;
        this.publisher = publisher;
        this.contents = new ArrayList<>();
        this.bookmarks = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("Название: %s", title) + System.lineSeparator()
                + String.format("Автор: %s", author) + System.lineSeparator()
                + String.format("Аннотация: %s", summary) + System.lineSeparator()
                + String.format("Количество страниц: %d", volume) + System.lineSeparator();
    }

    public void printBookInfo() {
        System.out.println(toString());
    }

    public Chapter getChapterByNumber(int number) throws Exception {
        return contents.stream().filter(chapter -> chapter.getNumber() == number).findFirst().orElseThrow(() -> new Exception("Глава не " +
                                                                                                                                      "найдена"));
    }

    public void addChapter(Chapter chapter) {
        this.contents.add(chapter);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                Objects.equals(publisher, book.publisher);
    }

    public void addBookmark(Chapter chapter, int position) {
        this.bookmarks.add(new Bookmark(chapter, position));
    }

    public void printAllBookmarks() {
        for (Bookmark bookmark : bookmarks) {
            System.out.println(bookmark);
        }
    }
}
