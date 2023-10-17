package ru.granitsa.cacheredis;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {
    private String isbn;
    private String title;
}
