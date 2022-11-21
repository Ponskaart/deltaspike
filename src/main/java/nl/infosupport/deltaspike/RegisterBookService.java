package nl.infosupport.deltaspike;


import org.apache.deltaspike.jpa.api.transaction.Transactional;

import javax.inject.Inject;
import javax.persistence.EntityManager;

@Transactional
public class RegisterBookService {

    @Inject
    EntityManager em;

    @Inject
    BookRepository bookRepository;


    public void remove(){
        Book book = bookRepository.findById(2L);
        bookRepository.remove(book);

    }

    public void save(){

        bookRepository.save(new Book("HH"));
    }

    public Long getBookCount(){
        return bookRepository.count();
    }

    public Long countBooks() {
        return bookRepository.count();
    }
}
