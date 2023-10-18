package ru.granitsa.cacheredis;

import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SimpleBookRepository implements BookRepository{

    @Override
    @Cacheable(value = "books", keyGenerator = "customKeyGenerator")
    public Book getByIsbn(String isbn) {
        simulateSlowService();
        return new Book(isbn, "Some book");
    }

    @Override
    @Cacheable(value = "books",  keyGenerator = "customKeyGenerator")
    public Book getByIsbnAndTitle(String isbn, String title) {
        simulateSlowService();
        return new Book(isbn, title);
    }



    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
