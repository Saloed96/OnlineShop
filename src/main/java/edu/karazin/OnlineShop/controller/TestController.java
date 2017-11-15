package edu.karazin.OnlineShop.controller;

import edu.karazin.OnlineShop.model.Country;
import edu.karazin.OnlineShop.model.FilmText;
//import edu.karazin.OnlineShop.service.CountryService;
import edu.karazin.OnlineShop.service.FilmTextService;
import edu.karazin.OnlineShop.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/films")
public class TestController {
//
//    @Autowired
//    private CountryService countryService;
//
    @Autowired
    private ShopService filmTextService;
//
//    @RequestMapping(value = "/countries", method = RequestMethod.GET)
//    public ResponseEntity<Country> getCountries(){
//        return new ResponseEntity<>(countryService.getCountry(), HttpStatus.OK);
//    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<Iterable<FilmText>> getFilmTexts(){
        return new ResponseEntity<>(filmTextService.getFilmText(), HttpStatus.OK);
    }

    @RequestMapping(value = "/getByTitle/{Title}", method = RequestMethod.GET)
    public ResponseEntity<FilmText> getFilmTextsByTitle(@PathVariable("Title") String title){
        System.out.println(title);
        return new ResponseEntity<>(filmTextService.getByTitle(title), HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public FilmText createFilm(@RequestBody FilmText filmEntity){
        return filmTextService.saveFilmText(filmEntity);
    }

    @RequestMapping(value = "/delete/{filmId}", method = RequestMethod.GET)
    public void deleteFilm(@PathVariable("filmId") Long filmId){
        System.out.println(filmId);
        filmTextService.deleteFilmText(filmId);
    }

}
