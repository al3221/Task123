package com.hillel.hometask13;

public class BookShelf {
    private final int TOTAL_BOOK_COUNT = 10;
    private static int counterBook;
    private Book[]  arrBooks = new Book[TOTAL_BOOK_COUNT];

    public void add(String name, int totalPages, Author author){
        Book book = new Book(name,totalPages,author);
        add(book);
    }

    public void add(Book book){
        if (counterBook>=TOTAL_BOOK_COUNT){
            System.out.println("Impossible to add new book");
            return;
        }
        arrBooks[counterBook] = book;
        counterBook++;
    }

    public void showAllBooks(){
        System.out.println("Show all books from the bookshelf: ");
        for(Book b: arrBooks){
            String author = b.getAuthor().getName();
            String nameBook = b.getName();
            int pages = b.getTotalPages();

            System.out.printf("Author is a %s and book with name %s that has %d total pages\n", author,nameBook,pages);
        }
    }

    public static void main(String[] args) {
        BookShelf myFavouriteBookShelf = new BookShelf();
        for (int i = 0; i < 10; i++) {
            String nameBook = "Book"+i;
            Book addedBook = new Book(nameBook,i,new Author("Pushkin",1789));
            myFavouriteBookShelf.add(addedBook);
        }
        myFavouriteBookShelf.showAllBooks();
    }
}
