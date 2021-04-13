package com.deepak.mybucket.database;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

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

@Database(entities = {GameModel.class, MoviesModel.class, TravelModel.class,
        FoodModel.class, BookModel.class, WebSeriesModel.class,
        CareerModel.class, ContributeModel.class, FitnessModel.class,
        CreativeModel.class, AdventureModel.class, OtherModel.class}, version = 15, exportSchema = false)

public abstract class bucketDataBase extends RoomDatabase {
    private static bucketDataBase instance = null;

    public abstract GameDao gameDao();

    public abstract MovieDao movieDao();

    public abstract TravelDao travelDao();

    public abstract FoodDao foodDao();

    public abstract BookDao bookDao();

    public abstract WedSeriesDao wedSeriesDao();

    public abstract CareerDao careerDao();

    public abstract ContributeDao contributeDao();

    public abstract FitnessDao fitnessDao();

    public abstract CreativeDao creativeDao();

    public abstract AdventureDao adventureDao();

    public abstract OtherDao otherDao();



    public static synchronized bucketDataBase getInstance(final Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    bucketDataBase.class, "bucket_database")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build();
        }
        return instance;
    }

    private static RoomDatabase.Callback roomCallback = new Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsyTask(instance).execute();
            new MoviesDbAsyTask(instance).execute();
            new TravelDbAsyTask(instance).execute();
            new FoodDbAsyTask(instance).execute();
            new BookDbAsyTask(instance).execute();
            new WebSeriesAsyncTask(instance).execute();
            new CareerAsyncTask(instance).execute();
            new ContributeAsynTask(instance).execute();
            new FitnessAsyncTask(instance).execute();
            new CreativeAsyncTask(instance).execute();
            new AdventureAsyncTask(instance).execute();
            new OtherAsyncTask(instance).execute();

        }
    };

    private static class PopulateDbAsyTask extends AsyncTask<Void, Void, Void> {
        private final GameDao gameDao;

        private PopulateDbAsyTask(bucketDataBase db) {
            gameDao = db.gameDao();

        }

        @Override
        protected Void doInBackground(Void... voids) {

            return null;
        }
    }

    private static class MoviesDbAsyTask extends AsyncTask<Void, Void, Void> {

        private final MovieDao movieDao;

        private MoviesDbAsyTask(bucketDataBase db) {

            movieDao = db.movieDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {


            return null;
        }
    }

    private static class TravelDbAsyTask extends AsyncTask<Void, Void, Void> {
        private final TravelDao travelDao;

        public TravelDbAsyTask(bucketDataBase db) {
            this.travelDao = db.travelDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {

            return null;
        }
    }

    private static class FoodDbAsyTask extends AsyncTask<Void, Void, Void> {
        private final FoodDao foodDao;

        public FoodDbAsyTask(bucketDataBase db) {
            this.foodDao = db.foodDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {

            return null;
        }
    }

    /**
     * ..............................Book Data Base AsyncTask...........................
     */
    private static class BookDbAsyTask extends AsyncTask<Void, Void, Void> {
        private BookDao bookDao;

        public BookDbAsyTask(bucketDataBase db) {
            this.bookDao = db.bookDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {

            return null;
        }
    }

    /**
     * ..............................WebSeries Data Base AsyncTask...........................
     */
    private static class WebSeriesAsyncTask extends AsyncTask<Void, Void, Void> {
        private WedSeriesDao wedSeriesDao;

        public WebSeriesAsyncTask(bucketDataBase db) {
            this.wedSeriesDao = db.wedSeriesDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            return null;
        }
    }

    /**
     * ..............................WebSeries Data Base AsyncTask...........................
     */
    private static class CareerAsyncTask extends AsyncTask<Void, Void, Void> {
        private CareerDao careerDao;

        public CareerAsyncTask(bucketDataBase db) {
            this.careerDao = db.careerDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            return null;
        }
    }

    /**
     * ..............................Contribute Data Base AsyncTask...........................
     */
    private static class ContributeAsynTask extends AsyncTask<Void, Void, Void> {
        private ContributeDao contributeDao;

        public ContributeAsynTask(bucketDataBase db) {
            this.contributeDao = db.contributeDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            return null;
        }
    }

    /**
     * ..............................Fitness Data Base AsyncTask...........................
     */
    private static class FitnessAsyncTask extends AsyncTask<Void, Void, Void> {
        private FitnessDao fitnessDao;

        public FitnessAsyncTask(bucketDataBase db) {
            this.fitnessDao = db.fitnessDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            return null;
        }
    }

    /**
     * ..............................Creative Data Base AsyncTask...........................
     */
    private static class CreativeAsyncTask extends AsyncTask<Void, Void, Void> {
        private CreativeDao creativeDao;

        public CreativeAsyncTask(bucketDataBase db) {
            this.creativeDao = db.creativeDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            return null;
        }
    }

    /**
     * ..............................Adventure Data Base AsyncTask...........................
     */
    private static class AdventureAsyncTask extends AsyncTask<Void, Void, Void> {
        private AdventureDao adventureDao;

        public AdventureAsyncTask(bucketDataBase db) {
            this.adventureDao = db.adventureDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            return null;
        }
    }

    /**
     * ..............................Other Data Base AsyncTask...........................
     */
    private static class OtherAsyncTask extends AsyncTask<Void, Void, Void> {
        private OtherDao otherDao;

        public OtherAsyncTask(bucketDataBase db) {
            this.otherDao = db.otherDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            return null;
        }
    }

}
