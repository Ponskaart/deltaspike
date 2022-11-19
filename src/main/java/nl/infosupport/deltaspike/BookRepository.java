package nl.infosupport.deltaspike;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository(forEntity = Book.class)
public interface BookRepository extends EntityRepository<Book, Long> {

    Book findById(long id);
    void remove(Book book);

    Book save(Book book);

    Long count();
}
