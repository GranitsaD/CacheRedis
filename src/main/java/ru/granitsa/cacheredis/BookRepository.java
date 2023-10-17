package ru.granitsa.cacheredis;

public interface BookRepository {
    Book getByIsbn(String isbn);
}
