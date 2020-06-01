package pl.gren.todospringbootapplication.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.gren.todospringbootapplication.Model.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {



}
