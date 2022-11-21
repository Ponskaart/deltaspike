package nl.infosupport.deltaspike;

import javax.inject.Inject;

public class DemoEvent {

    private final Book book;

    @Inject
    public DemoEvent(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }
}
