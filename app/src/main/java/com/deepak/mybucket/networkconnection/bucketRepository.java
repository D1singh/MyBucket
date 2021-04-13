package com.deepak.mybucket.networkconnection;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.deepak.mybucket.Movies.MoviesModel;
import com.deepak.mybucket.Webseries.WebSeriesModel;
import com.deepak.mybucket.adventure.AdventureModel;
import com.deepak.mybucket.book.BookModel;
import com.deepak.mybucket.career.CareerModel;
import com.deepak.mybucket.contribute.ContributeModel;
import com.deepak.mybucket.creativity.CreativeModel;
import com.deepak.mybucket.database.AdventureDao;
import com.deepak.mybucket.database.BookDao;
import com.deepak.mybucket.database.CareerDao;
import com.deepak.mybucket.database.ContributeDao;
import com.deepak.mybucket.database.CreativeDao;
import com.deepak.mybucket.database.FitnessDao;
import com.deepak.mybucket.database.FoodDao;
import com.deepak.mybucket.database.GameDao;
import com.deepak.mybucket.database.MovieDao;
import com.deepak.mybucket.database.OtherDao;
import com.deepak.mybucket.database.TravelDao;
import com.deepak.mybucket.database.WedSeriesDao;
import com.deepak.mybucket.database.bucketDataBase;
import com.deepak.mybucket.fitness.FitnessModel;
import com.deepak.mybucket.food.FoodModel;
import com.deepak.mybucket.game.GameModel;
import com.deepak.mybucket.others.OtherModel;
import com.deepak.mybucket.travel.TravelModel;

import java.util.List;

public class bucketRepository {
    private final GameDao gameDao;
    private final LiveData<List<GameModel>> gameModel;

    private final MovieDao movieDao;
    private final LiveData<List<MoviesModel>> movieModel;

    private final TravelDao travelDao;
    private final LiveData<List<TravelModel>> travelModel;

    private final FoodDao foodDao;
    private final LiveData<List<FoodModel>> foodModel;

    private final BookDao bookDao;
    private final LiveData<List<BookModel>> bookModel;

    private final WedSeriesDao wedSeriesDao;
    private final LiveData<List<WebSeriesModel>> webSeriesModel;

    private final CareerDao careerDao;
    private final LiveData<List<CareerModel>> careerModel;

    private final ContributeDao contributeDao;
    private final LiveData<List<ContributeModel>> contributeModel;

    private final FitnessDao fitnessDao;
    private final LiveData<List<FitnessModel>> fitnessModel;

    private final CreativeDao creativeDao;
    private final LiveData<List<CreativeModel>> creativeModel;

    private final AdventureDao adventureDao;
    private final LiveData<List<AdventureModel>> adventureModel;

    private final OtherDao otherDao;
    private final LiveData<List<OtherModel>> otherModel;

    protected bucketRepository(Application application) {
        bucketDataBase database = bucketDataBase.getInstance(application);
        gameDao = database.gameDao();
        gameModel = gameDao.getAllGame();

        movieDao = database.movieDao();
        movieModel = movieDao.getAllMovies();

        travelDao = database.travelDao();
        travelModel = travelDao.getAllTravel();

        foodDao = database.foodDao();
        foodModel = foodDao.getAllFood();

        bookDao = database.bookDao();
        bookModel = bookDao.getAllBook();

        wedSeriesDao = database.wedSeriesDao();
        webSeriesModel = wedSeriesDao.getAllWebSeries();

        careerDao = database.careerDao();
        careerModel = careerDao.gatAllCareer();

        contributeDao = database.contributeDao();
        contributeModel = contributeDao.getAllContribution();

        fitnessDao = database.fitnessDao();
        fitnessModel = fitnessDao.getAllFitness();

        creativeDao = database.creativeDao();
        creativeModel = creativeDao.getAllCreative();

        adventureDao = database.adventureDao();
        adventureModel =adventureDao.getAllAdventure();

        otherDao =database.otherDao();
        otherModel =otherDao.getAllOther();


    }

    public void insertGame(GameModel gameModel) {
        new insertGameAsyTask(gameDao).execute(gameModel);
    }

    public void deleteGame(GameModel gameModel) {
        new deleteGameAsyTask(gameDao).execute(gameModel);
    }

    public LiveData<List<GameModel>> getGameModel() {
        return gameModel;
    }

    private static class insertGameAsyTask extends AsyncTask<GameModel, Void, Void> {
        private GameDao gameDao;

        public insertGameAsyTask(GameDao gameDao) {
            this.gameDao = gameDao;
        }

        @Override
        protected Void doInBackground(GameModel... gameModels) {
            gameDao.insertGame(gameModels[0]);
            return null;
        }
    }

    private static class deleteGameAsyTask extends AsyncTask<GameModel, Void, Void> {
        private GameDao gameDao;

        public deleteGameAsyTask(GameDao gameDao) {
            this.gameDao = gameDao;
        }

        @Override
        protected Void doInBackground(GameModel... gameModels) {
            gameDao.deleteGame(gameModels[0]);
            return null;
        }
    }

    /**
     * --------------------------Here Movie Repository is start-------------------------------
     */

    public void insertMovies(MoviesModel moviesModel) {
        new insertMovieAsTask(movieDao).execute(moviesModel);
    }

    public void deleteMovies(MoviesModel moviesModel) {
        new deleteMovieAsTask(movieDao).execute(moviesModel);
    }

    public LiveData<List<MoviesModel>> getMovieModel() {
        return movieModel;
    }

    private static class insertMovieAsTask extends AsyncTask<MoviesModel, Void, Void> {
        private MovieDao movieDao;

        public insertMovieAsTask(MovieDao movieDao) {
            this.movieDao = movieDao;
        }

        @Override
        protected Void doInBackground(MoviesModel... moviesModels) {
            movieDao.insertMovie(moviesModels[0]);
            return null;
        }
    }

    private static class deleteMovieAsTask extends AsyncTask<MoviesModel, Void, Void> {
        private MovieDao movieDao;

        public deleteMovieAsTask(MovieDao movieDao) {
            this.movieDao = movieDao;
        }

        @Override
        protected Void doInBackground(MoviesModel... moviesModels) {
            movieDao.deleteMovie(moviesModels[0]);
            return null;
        }
    }

    /**
     * --------------------------Here Travel Repository is start-------------------------------
     */

    public void insertTravel(TravelModel travelModel) {
        new insertTravelAsyTask(travelDao).execute(travelModel);
    }

    public void deleteTravel(TravelModel travelModel) {
        new deleteTravelAsyTask(travelDao).execute(travelModel);
    }

    public LiveData<List<TravelModel>> getTravelModel() {
        return travelModel;
    }

    private static class insertTravelAsyTask extends AsyncTask<TravelModel, Void, Void> {
        private TravelDao travelDao;

        public insertTravelAsyTask(TravelDao travelDao) {
            this.travelDao = travelDao;
        }

        @Override
        protected Void doInBackground(TravelModel... travelModels) {
            travelDao.insertTravel(travelModels[0]);
            return null;
        }
    }

    private static class deleteTravelAsyTask extends AsyncTask<TravelModel, Void, Void> {
        private TravelDao travelDao;

        public deleteTravelAsyTask(TravelDao travelDao) {
            this.travelDao = travelDao;
        }

        @Override
        protected Void doInBackground(TravelModel... travelModels) {
            travelDao.deleteTravel(travelModels[0]);
            return null;
        }
    }

    /**
     * --------------------------Here Food Repository is start-------------------------------
     */
    public void insertFood(FoodModel foodModel) {
        new insertFoodAsyTask(foodDao).execute(foodModel);
    }

    public void deleteFood(FoodModel foodModel) {
        new deleteFoodAsyTask(foodDao).execute(foodModel);
    }

    public LiveData<List<FoodModel>> getFoodModel() {
        return foodModel;
    }

    private static class insertFoodAsyTask extends AsyncTask<FoodModel, Void, Void> {
        private FoodDao foodDao;

        public insertFoodAsyTask(FoodDao foodDao) {
            this.foodDao = foodDao;
        }

        @Override
        protected Void doInBackground(FoodModel... foodModels) {
            foodDao.insertFood(foodModels[0]);
            return null;
        }
    }

    private static class deleteFoodAsyTask extends AsyncTask<FoodModel, Void, Void> {
        private FoodDao foodDao;

        public deleteFoodAsyTask(FoodDao foodDao) {
            this.foodDao = foodDao;
        }

        @Override
        protected Void doInBackground(FoodModel... foodModels) {
            foodDao.deleteFood(foodModels[0]);
            return null;
        }
    }

    /**
     * --------------------------Here Book Repository is start-------------------------------
     */

    public void insertBook(BookModel bookModel) {
        new insertBookATask(bookDao).execute(bookModel);
    }

    public void deleteBook(BookModel bookModel) {
        new deleteBookATask(bookDao).execute(bookModel);
    }

    public LiveData<List<BookModel>> getBookModel() {
        return bookModel;
    }

    private static class insertBookATask extends AsyncTask<BookModel, Void, Void> {
        private BookDao bookDao;

        public insertBookATask(BookDao bookDao) {
            this.bookDao = bookDao;
        }

        @Override
        protected Void doInBackground(BookModel... bookModels) {
            bookDao.insertBook(bookModels[0]);
            return null;
        }
    }

    private static class deleteBookATask extends AsyncTask<BookModel, Void, Void> {
        private BookDao bookDao;

        public deleteBookATask(BookDao bookDao) {
            this.bookDao = bookDao;
        }

        @Override
        protected Void doInBackground(BookModel... bookModels) {
            bookDao.deleteBook(bookModels[0]);
            return null;
        }
    }

    /**
     * --------------------------Here Book Repository is start-------------------------------
     */

    public void insertWebSeries(WebSeriesModel webSeriesModel) {
        new insertWebSeriesAsyncTask(wedSeriesDao).execute(webSeriesModel);
    }

    public void deleteWebSeries(WebSeriesModel webSeriesModel) {
        new deleteWebSeriesAsyncTask(wedSeriesDao).execute(webSeriesModel);
    }

    public LiveData<List<WebSeriesModel>> getWebSeriesModel() {
        return webSeriesModel;
    }

    private static class insertWebSeriesAsyncTask extends AsyncTask<WebSeriesModel, Void, Void> {
        private WedSeriesDao wedSeriesDao;

        public insertWebSeriesAsyncTask(WedSeriesDao wedSeriesDao) {
            this.wedSeriesDao = wedSeriesDao;
        }

        @Override
        protected Void doInBackground(WebSeriesModel... webSeriesModels) {
            wedSeriesDao.insertWebSeries(webSeriesModels[0]);
            return null;
        }
    }

    private static class deleteWebSeriesAsyncTask extends AsyncTask<WebSeriesModel, Void, Void> {
        private WedSeriesDao wedSeriesDao;

        public deleteWebSeriesAsyncTask(WedSeriesDao wedSeriesDao) {
            this.wedSeriesDao = wedSeriesDao;
        }

        @Override
        protected Void doInBackground(WebSeriesModel... webSeriesModels) {
            wedSeriesDao.deleteWebSeries(webSeriesModels[0]);
            return null;
        }
    }

    /**
     * --------------------------Here Career Repository is start-------------------------------
     */

    public void insertCareer(CareerModel careerModel){
        new insertCareerAsTask(careerDao).execute(careerModel);
    }
    public void deleteCareer(CareerModel careerModel){
        new deleteCareerAsTask(careerDao).execute(careerModel);
    }

    public LiveData<List<CareerModel>> getCareerModel() {
        return careerModel;
    }

    private static class insertCareerAsTask extends AsyncTask<CareerModel,Void,Void>{
    private CareerDao careerDao;

        public insertCareerAsTask(CareerDao careerDao) {
            this.careerDao = careerDao;
        }

        @Override
        protected Void doInBackground(CareerModel... careerModels) {
           careerDao.insertCareer(careerModels[0]);
            return null;
        }
    }

    private static class deleteCareerAsTask extends AsyncTask<CareerModel,Void,Void>{
        private CareerDao careerDao;

        public deleteCareerAsTask(CareerDao careerDao) {
            this.careerDao = careerDao;
        }

        @Override
        protected Void doInBackground(CareerModel... careerModels) {
            careerDao.deleteCareer(careerModels[0]);
            return null;
        }
    }

    /**
     * --------------------------Here Contribute Repository is start-------------------------------
     */
    public void insertContribute(ContributeModel contributeModel){
        new insertContributeAsyncTask(contributeDao).execute(contributeModel);
    }
    public void deleteContribute(ContributeModel contributeModel){
        new deleteContributeAsyncTask(contributeDao).execute(contributeModel);
    }

    public LiveData<List<ContributeModel>> getContributeModel() {
        return contributeModel;
    }

    private static class insertContributeAsyncTask extends AsyncTask<ContributeModel,Void,Void>{
private ContributeDao contributeDao;

        public insertContributeAsyncTask(ContributeDao contributeDao) {
            this.contributeDao = contributeDao;
        }

        @Override
        protected Void doInBackground(ContributeModel... contributeModels) {
           contributeDao.insertContribute(contributeModels[0]);
            return null;
        }
    }
    private static class deleteContributeAsyncTask extends AsyncTask<ContributeModel,Void,Void>{
        private ContributeDao contributeDao;

        public deleteContributeAsyncTask(ContributeDao contributeDao) {
            this.contributeDao = contributeDao;
        }

        @Override
        protected Void doInBackground(ContributeModel... contributeModels) {
            contributeDao.deleteContribute(contributeModels[0]);
            return null;
        }
    }

    /**
     * --------------------------Here Fitness Repository is start-------------------------------
     */
    public void insertFitness(FitnessModel fitnessModel){
        new insertFitnessAsyTask(fitnessDao).execute(fitnessModel);
    }
    public void deleteFitness(FitnessModel fitnessModel){
        new deleteFitnessAsyTask(fitnessDao).execute(fitnessModel);
    }

    public LiveData<List<FitnessModel>> getFitnessModel() {
        return fitnessModel;
    }

    private static class insertFitnessAsyTask extends AsyncTask<FitnessModel,Void,Void>{
private FitnessDao fitnessDao;

        public insertFitnessAsyTask(FitnessDao fitnessDao) {
            this.fitnessDao = fitnessDao;
        }

        @Override
        protected Void doInBackground(FitnessModel... fitnessModels) {
            fitnessDao.insertFitness(fitnessModels[0]);
            return null;
        }
    }
    private static class deleteFitnessAsyTask extends AsyncTask<FitnessModel,Void,Void>{
        private FitnessDao fitnessDao;

        public deleteFitnessAsyTask(FitnessDao fitnessDao) {
            this.fitnessDao = fitnessDao;
        }

        @Override
        protected Void doInBackground(FitnessModel... fitnessModels) {
            fitnessDao.deleteFitness(fitnessModels[0]);
            return null;
        }
    }

    /**
     * --------------------------Here Creative Repository is start-------------------------------
     */
    public void insertCreative(CreativeModel creativeModel){
        new insertCreativeAsyTask(creativeDao).execute(creativeModel);
    };

    public void deleteCreative(CreativeModel creativeModel){
        new deleteCreativeAsyTask(creativeDao).execute(creativeModel);
    };

    public LiveData<List<CreativeModel>> getCreativeModel() {
        return creativeModel;
    }

    private static class insertCreativeAsyTask extends AsyncTask<CreativeModel,Void,Void>{
private CreativeDao creativeDao;

        public insertCreativeAsyTask(CreativeDao creativeDao) {
            this.creativeDao = creativeDao;
        }

        @Override
        protected Void doInBackground(CreativeModel... creativeModels) {
            creativeDao.insertCreative(creativeModels[0]);
            return null;
        }
    }

    private static class deleteCreativeAsyTask extends AsyncTask<CreativeModel,Void,Void>{
        private CreativeDao creativeDao;

        public deleteCreativeAsyTask(CreativeDao creativeDao) {
            this.creativeDao = creativeDao;
        }

        @Override
        protected Void doInBackground(CreativeModel... creativeModels) {
            creativeDao.deleteCreative(creativeModels[0]);
            return null;
        }
    }

    /**
     * --------------------------Here Adventure Repository is start-------------------------------
     */

    public void insertAdventure(AdventureModel adventureModel){
        new insertAdventureAsyTask(adventureDao).execute(adventureModel);
    }
    public void deleteAdventure(AdventureModel adventureModel){
        new deleteAdventureAsyTask(adventureDao).execute(adventureModel);
    }

    public LiveData<List<AdventureModel>> getAdventureModel() {
        return adventureModel;
    }
    private static class insertAdventureAsyTask extends AsyncTask<AdventureModel,Void,Void>{
private AdventureDao adventureDao;

        public insertAdventureAsyTask(AdventureDao adventureDao) {
            this.adventureDao = adventureDao;
        }

        @Override
        protected Void doInBackground(AdventureModel... adventureModels) {
            adventureDao.insertAdventure(adventureModels[0]);
            return null;
        }
    }

    private static class deleteAdventureAsyTask extends AsyncTask<AdventureModel,Void,Void>{
        private AdventureDao adventureDao;

        public deleteAdventureAsyTask(AdventureDao adventureDao) {
            this.adventureDao = adventureDao;
        }

        @Override
        protected Void doInBackground(AdventureModel... adventureModels) {
            adventureDao.deleteAdventure(adventureModels[0]);
            return null;
        }
    }

    /**
     * --------------------------Here other Repository is start-------------------------------
     */
    public void insertOther(OtherModel otherModel){
        new insertOtherAsTask(otherDao).execute(otherModel);
    }
    public void deleteOther(OtherModel otherModel){
        new deleteOtherAsTask(otherDao).execute(otherModel);
    }

    public LiveData<List<OtherModel>> getOtherModel() {
        return otherModel;
    }

    private static class insertOtherAsTask extends AsyncTask<OtherModel,Void,Void>{
private OtherDao otherDao;

        public insertOtherAsTask(OtherDao otherDao) {
            this.otherDao = otherDao;
        }

        @Override
        protected Void doInBackground(OtherModel... otherModels) {
           otherDao.insertOther(otherModels[0]);
            return null;
        }
    }

    private static class deleteOtherAsTask extends AsyncTask<OtherModel,Void,Void>{
        private OtherDao otherDao;

        public deleteOtherAsTask(OtherDao otherDao) {
            this.otherDao = otherDao;
        }

        @Override
        protected Void doInBackground(OtherModel... otherModels) {
            otherDao.deleteOther(otherModels[0]);
            return null;
        }
    }




}

