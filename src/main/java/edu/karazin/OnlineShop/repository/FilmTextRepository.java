package edu.karazin.OnlineShop.repository;

import edu.karazin.OnlineShop.model.FilmText;
import org.springframework.data.repository.CrudRepository;

public interface FilmTextRepository extends CrudRepository<FilmText, Long> {

    FilmText getByTitleStartingWith(String title);

}
