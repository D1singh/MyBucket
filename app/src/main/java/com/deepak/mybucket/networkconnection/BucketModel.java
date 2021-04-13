package com.deepak.mybucket.networkconnection;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.deepak.mybucket.Movies.MoviesModel;
import com.deepak.mybucket.Webseries.WebSeriesModel;
import com.deepak.mybucket.adventure.AdventureModel;
import com.deepak.mybucket.book.BookModel;
import com.deepak.mybucket.career.CareerModel;
import com.deepak.mybucket.contribute.ContributeModel;
import com.deepak.mybucket.creativity.CreativeModel;
import com.deepak.mybucket.fitness.FitnessModel;
import com.deepak.mybucket.food.FoodModel;
import com.deepak.mybucket.game.GameModel;
import com.deepak.mybucket.others.OtherModel;
import com.deepak.mybucket.travel.TravelModel;

import java.util.List;

public class BucketModel extends AndroidViewModel {

    private final bucketRepository repository;
    private final LiveData<List<GameModel>> gameModel;
    private final LiveData<List<MoviesModel>> movieModel;
    private final LiveData<List<TravelModel>> travelModel;
    private final LiveData<List<FoodModel>> foodModel;
    private final LiveData<List<BookModel>> bookModel;
    private final LiveData<List<WebSeriesModel>> webSeriesModel;
    private final LiveData<List<CareerModel>> careerModel;
    private final LiveData<List<ContributeModel>> contributeModel;
    private final LiveData<List<FitnessModel>> fitnessModel;
    private final LiveData<List<CreativeModel>> creativeModel;
    private final LiveData<List<AdventureModel>> adventureModel;
    private final LiveData<List<OtherModel>> otherModel;



    public BucketModel(@NonNull Application application) {
        super(application);
        repository = new bucketRepository(application);
        gameModel = repository.getGameModel();
        movieModel = repository.getMovieModel();
        travelModel = repository.getTravelModel();
        foodModel = repository.getFoodModel();
        bookModel = repository.getBookModel();
        webSeriesModel = repository.getWebSeriesModel();
        careerModel = repository.getCareerModel();
        contributeModel = repository.getContributeModel();
        fitnessModel = repository.getFitnessModel();
        creativeModel = repository.getCreativeModel();
        adventureModel = repository.getAdventureModel();
        otherModel = repository.getOtherModel();

    }


    public void insetGame(GameModel gameModel) {
        repository.insertGame(gameModel);
    }

    public void deleteGame(GameModel gameModel) {
        repository.deleteGame(gameModel);
    }

    public LiveData<List<GameModel>> getGameModel() {
        return gameModel;
    }

    /**
     * -------Movies Model---------------------------------
     */

    public void insertMovie(MoviesModel moviesModel) {
        repository.insertMovies(moviesModel);
    }

    public void deleteMovie(MoviesModel moviesModel) {
        repository.deleteMovies(moviesModel);
    }

    public LiveData<List<MoviesModel>> getMovieModel() {
        return movieModel;
    }


    /**
     * -------Travel Model---------------------------------
     */
    public void insertTravel(TravelModel travelModel) {
        repository.insertTravel(travelModel);
    }

    public void deleteTravel(TravelModel travelModel) {
        repository.deleteTravel(travelModel);
    }

    public LiveData<List<TravelModel>> getTravelModel() {
        return travelModel;
    }

    /**
     * -------food Model---------------------------------
     */
    public void insertFood(FoodModel foodModel) {
        repository.insertFood(foodModel);
    }

    public void deleteFood(FoodModel foodModel) {
        repository.deleteFood(foodModel);
    }

    public LiveData<List<FoodModel>> getFoodModel() {
        return foodModel;
    }


    /**
     * -------Book Model---------------------------------
     */
    public void insertBook(BookModel bookModel) {
        repository.insertBook(bookModel);
    }

    public void deleteBook(BookModel bookModel) {
        repository.deleteBook(bookModel);
    }

    public LiveData<List<BookModel>> getBookModel() {
        return bookModel;
    }

    /**
     * -------WebSeries Model---------------------------------
     */
    public void insertWebSeries(WebSeriesModel webSeriesModel) {
        repository.insertWebSeries(webSeriesModel);
    }

    public void deleteWebSeries(WebSeriesModel webSeriesModel) {
        repository.deleteWebSeries(webSeriesModel);
    }

    public LiveData<List<WebSeriesModel>> getWebSeriesModel() {
        return webSeriesModel;
    }

    /**
     * -------career Model---------------------------------
     */
    public void insertCareer(CareerModel careerModel){
        repository.insertCareer(careerModel);
    }

    public void deleteCareer(CareerModel careerModel){
        repository.deleteCareer(careerModel);
    }

    public LiveData<List<CareerModel>> getCareerModel() {
        return careerModel;
    }


    /**
     * -------Contribute Model---------------------------------
     */
    public void insertContribute(ContributeModel contributeModel){
        repository.insertContribute(contributeModel);
    }
    public void deleteContribute(ContributeModel contributeModel){
        repository.deleteContribute(contributeModel);
    }

    public LiveData<List<ContributeModel>> getContributeModel() {
        return contributeModel;
    }

    /**
     * -------Fitness Model---------------------------------
     */
    public void insertFitness(FitnessModel fitnessModel){
        repository.insertFitness(fitnessModel);
    }
    public void deleteFitness(FitnessModel fitnessModel){
        repository.deleteFitness(fitnessModel);
    }

    public LiveData<List<FitnessModel>> getFitnessModel() {
        return fitnessModel;
    }

    /**
     * -------Creative Model---------------------------------
     */
    public void insertCreative(CreativeModel creativeModel){
        repository.insertCreative(creativeModel);
    }
    public void deleteCreative(CreativeModel creativeModel){
        repository.deleteCreative(creativeModel);
    }

    public LiveData<List<CreativeModel>> getCreativeModel() {
        return creativeModel;
    }

    /**
     * -------Creative Model---------------------------------
     */
    public void insertAdventure(AdventureModel adventureModel){
        repository.insertAdventure(adventureModel);
    }
    public void deleteAdventure(AdventureModel adventureModel){
        repository.deleteAdventure(adventureModel);
    }

    public LiveData<List<AdventureModel>> getAdventureModel() {
        return adventureModel;
    }

    /**
     * -------other Model---------------------------------
     */
    public void insertOther(OtherModel otherModel){
        repository.insertOther(otherModel);
    }
    public void deleteOther(OtherModel otherModel){
        repository.deleteOther(otherModel);
    }

    public LiveData<List<OtherModel>> getOtherModel() {
        return otherModel;
    }


}
