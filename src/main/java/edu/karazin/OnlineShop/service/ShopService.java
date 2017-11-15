package edu.karazin.OnlineShop.service;

import edu.karazin.OnlineShop.model.FilmText;

public interface ShopService {

//    Country getCountry();
    Iterable<FilmText> getFilmText();
    FilmText saveFilmText(FilmText filmText);
    void deleteFilmText(Long id);
    FilmText getByTitle(String title);

}
