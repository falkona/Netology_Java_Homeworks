package ru.netology1_6;

public class Bookmark {

    Chapter chapter;
    int position;

    public Bookmark(Chapter chapter, int position) {
        this.chapter = chapter;
        this.position = position;
    }

    @Override
    public String toString() {
        return String.format("Глава %d. ...%s...", chapter.getNumber(), getBookmarkString());
    }

    public String getBookmarkString() {
        return chapter.getText().substring(position, position + 50);
    }

}
