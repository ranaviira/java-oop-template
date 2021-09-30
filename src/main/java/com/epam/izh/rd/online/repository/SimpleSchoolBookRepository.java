package com.epam.izh.rd.online.repository;

import com.epam.izh.rd.online.entity.SchoolBook;
import org.apache.commons.lang3.ArrayUtils;

public class SimpleSchoolBookRepository implements BookRepository<SchoolBook> {

    private SchoolBook[] schoolBooks = new SchoolBook[]{};

    @Override
    public boolean save(SchoolBook book) {
        schoolBooks = ArrayUtils.add(schoolBooks, book);
        return true;
    }

    @Override
    public SchoolBook[] findByName(String name) {
        if (schoolBooks.length != 0) {
            SchoolBook[] findBooksByName = new SchoolBook[]{};
            for (SchoolBook schoolBook : schoolBooks) {
                if (name.equals(schoolBook.getName())) {
                    findBooksByName = ArrayUtils.add(findBooksByName, schoolBook);
                }
            }
            return findBooksByName;
        }
        return new SchoolBook[0];
    }

    @Override
    public boolean removeByName(String name) {
        if (schoolBooks.length != 0) {
            schoolBooks = ArrayUtils.removeElements(schoolBooks, findByName(name));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int count() {
        return schoolBooks.length;
    }
}
