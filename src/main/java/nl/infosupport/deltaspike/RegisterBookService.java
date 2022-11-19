package nl.infosupport.deltaspike;



import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Transactional
public class RegisterBookService {

    @Inject
    EntityManager em;

    @Inject
    BookRepository bookRepository;


    public void remove(){
        Book book = bookRepository.findById(1L);
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
