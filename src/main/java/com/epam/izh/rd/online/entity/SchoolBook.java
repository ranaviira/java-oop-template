package com.epam.izh.rd.online.entity;

import java.time.LocalDate;

public class SchoolBook extends Book {
    private String authorName;
    private String authorLastName;
    private LocalDate publishDate;

    public SchoolBook() {
    }

    public SchoolBook(int numberOfPages, String name, String authorName, String authorLastName, LocalDate publishDate) {
        super(numberOfPages, name);
        this.authorName = authorName;
        this.authorLastName = authorLastName;
        this.publishDate = publishDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        SchoolBook that = (SchoolBook) o;

        if (authorName != null ? !authorName.equals(that.authorName) : that.authorName != null) return false;
        if (authorLastName != null ? !authorLastName.equals(that.authorLastName) : that.authorLastName != null)
            return false;
        return publishDate != null ? publishDate.equals(that.publishDate) : that.publishDate == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (authorName != null ? authorName.hashCode() : 0);
        result = 31 * result + (authorLastName != null ? authorLastName.hashCode() : 0);
        result = 31 * result + (publishDate != null ? publishDate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "SchoolBook{" +
                "authorName='" + authorName + '\'' +
                ", authorLastName='" + authorLastName + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}
