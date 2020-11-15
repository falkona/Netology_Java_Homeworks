package ru.netology1_6;

public class Chapter {

    int number;
    String header;
    String text;

    public Chapter(int number, String header, String text) {
        this.number = number;
        this.header = header;
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("Глава %d. %s", number, header) + System.lineSeparator()
                + text + System.lineSeparator();
    }

    public void printChapter() {
        System.out.println(toString());
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
