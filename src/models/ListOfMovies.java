package models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import movierecsys.be.Movie;
import movierecsys.bll.OwsLogicFacade;

public class ListOfMovies {

    public ListOfMovies(){
        allMovies = FXCollections.observableArrayList();
        allMovies.add(new Movie(1, 2001, "Zem mi kokot 2"));
    }
    private OwsLogicFacade logicFacade;
    private ObservableList<Movie> allMovies ;


    public ObservableList<Movie> getAllMovies() {
        return allMovies;
    }
}
