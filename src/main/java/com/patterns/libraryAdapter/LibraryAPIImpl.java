package com.patterns.libraryAdapter;

import java.time.LocalDate;

public class LibraryAPIImpl implements LibraryAPI{
    @Override
    public boolean isAviable(String bookTitle) {
        System.out.println("Sprawdzam dostepnosc " + bookTitle);
        return true;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        System.out.println("Sprawdzam date zwrotu dla " + bookTitle);
        return LocalDate.now();
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        System.out.println("Rezerwuje " + bookTitle);
        return true;
    }
}
