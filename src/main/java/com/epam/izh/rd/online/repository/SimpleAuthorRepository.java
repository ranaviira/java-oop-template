package com.epam.izh.rd.online.repository;

import com.epam.izh.rd.online.entity.Author;
import org.apache.commons.lang3.ArrayUtils;

public class SimpleAuthorRepository implements AuthorRepository {

    private Author[] authors = new Author[]{};

    @Override
    public boolean save(Author author) {
        if (findByFullName(author.getName(), author.getLastName()) != null) {
            return false;
        } else {
            authors = ArrayUtils.add(authors, author);
            return true;
        }
    }

    @Override
    public Author findByFullName(String name, String lastname) {
        if (authors.length != 0) {
            for (Author author : authors) {
                if (name.equals(author.getName()) && lastname.equals(author.getLastName())) {
                    return author;
                }
            }
        }
        return null;
    }

    @Override
    public boolean remove(Author author) {
        if (findByFullName(author.getName(), author.getLastName()) == null) {
            return false;
        } else {
            authors = ArrayUtils.removeElement(authors, author);
            return true;
        }
    }

    @Override
    public int count() {
        return authors.length;
    }
}
