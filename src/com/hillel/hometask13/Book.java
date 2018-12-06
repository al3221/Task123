package com.hillel.hometask13;

public class Book {
    private String name;
    private int totalPages;
    private Author author;

    public Book(String name, int totalPages , Author author) {
        this.name = name;
        this.totalPages = totalPages;
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getTotalPages() {
        return totalPages;
    }

    @Override
    public boolean equals(Object obj) {
        Book incomeBook = (Book) obj;
        boolean comparedName = name.equals(incomeBook.name);
        boolean comparedTotalPages = totalPages == incomeBook.totalPages;
        if(comparedName && comparedTotalPages){
            return true;
        }

        return false;
    }
}
