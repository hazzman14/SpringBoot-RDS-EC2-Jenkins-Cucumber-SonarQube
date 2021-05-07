package com.harry.demo.film;

import com.harry.demo.actor.Actor;
import com.harry.demo.actor.ActorRepository;
import com.harry.demo.category.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.time.Year;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/films")
public class FilmController {
    @Autowired
    private FilmRepository filmRepository;

    @GetMapping(path="/all")
    public Iterable<Film> getFilms() {
        return filmRepository.findAll();
    }

    @GetMapping(path="/get/{id}")
    public Optional<Film> getFilmById(@PathVariable("id") Long id) throws Exception {
        //get the film with that id if it exists
        Optional<Film> film = filmRepository.findById(id);
        //if it exists
        if(film.isPresent()){
            //return it
            return film ;
        }else{
            //otherwise throw exception
            throw new Exception("No film with this id");
        }
    }

    @PostMapping(path="/add")
    public @ResponseBody void addFilm(@RequestParam String title, @RequestParam String description,
                                      @RequestParam Long releaseYear, @RequestParam Long length) throws Exception {
        //make the new film
        Film a = new Film(title,description,releaseYear,length);
        //if there is already a film with this name
        if(filmRepository.findFilmByTitle(title).isPresent()){
            //throw error
            throw new Exception("Film with this title already exists");
        }else{
            //otherwise save the film
            filmRepository.save(a);

        }
    }

    @DeleteMapping(path="/delete/{id}")
    public void deleteFilmById(@PathVariable("id") Long id) throws Exception {
        //get the film with that id
        Optional<Film> check = getFilmById(id);
        //if there is a film with that id
        if(check.isPresent()){
            //deletes the category with a specific id
            filmRepository.deleteById(id);
        }else{
            //if there isnt a category with that id
            throw new Exception("No film with this id");
        }
    }

    @Transactional
    @PutMapping("/modify/{id}")
    public void modifyFilmById(@PathVariable("id") Long id, @RequestParam String title, @RequestParam String description,
                               @RequestParam Long releaseYear, @RequestParam Long length ){
        //gets the category by id if it exists
        Film film = filmRepository.findById(id).orElseThrow(() -> new IllegalStateException("id not found: " + id));
        //change details
        film.setTitle(title);
        film.setDescription(description);
        film.setReleaseYear(releaseYear);
        film.setLength(length);
    }

}
