package ru.granitsa.cacheredis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.CacheManager;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootTest
class SimpleBookRepositoryTest {
    @Autowired
    CacheManager cacheManager;

    @Autowired
    BookRepository bookRepository;

    @Test
    void checkTheSpeedOfTheMethod(){
        SimpleDateFormat sdfDate = new SimpleDateFormat("mm:ss.SSSS");

        bookRepository.getByIsbn("isbn-1234");
        System.out.println(sdfDate.format(new Date()));
        bookRepository.getByIsbn("isbn-1234");
        System.out.println(sdfDate.format(new Date()));
        bookRepository.getByIsbnAndTitle("isbn-1234", "tets-title");
        System.out.println(sdfDate.format(new Date()));
        bookRepository.getByIsbnAndTitle("isbn-1234", "tets-title");
        System.out.println(sdfDate.format(new Date()));
        bookRepository.getByIsbnAndTitle("isbn-1234", "tets-title");
        System.out.println(sdfDate.format(new Date()));
        bookRepository.getByIsbnAndTitle("isbn-1234", "tets-title2");
        System.out.println(sdfDate.format(new Date()));
        bookRepository.getByIsbnAndTitle("isbn-1234", "tets-title2");
        System.out.println(sdfDate.format(new Date()));
    }

}