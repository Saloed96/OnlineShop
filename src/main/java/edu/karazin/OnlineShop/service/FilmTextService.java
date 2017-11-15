package edu.karazin.OnlineShop.service;

import edu.karazin.OnlineShop.model.FilmText;
import edu.karazin.OnlineShop.repository.FilmTextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmTextService implements ShopService {

    @Autowired
    private FilmTextRepository filmTextRepository;

//
//    @Override
//    public Country getCountry() {
//        return null;
//    }

    @Override
    public Iterable<FilmText> getFilmText() {
        return filmTextRepository.findAll();
    }

    @Override
    public FilmText saveFilmText(FilmText filmText) {
        return filmTextRepository.save(filmText);
    }

    @Override
    public void deleteFilmText(Long id) {
        filmTextRepository.delete(id);
    }

    @Override
    public FilmText getByTitle(String title) {
        return filmTextRepository.getByTitleStartingWith(title);
    }


}
