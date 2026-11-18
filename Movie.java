// Movie class to represent a movie with title, genre, and age rating
public class Movie {
    //variables
    private String title;
    private String genre;
    private int ageRating;
    private String duration;

    //constructor
    public Movie(String title, String genre, int ageRating, String duration) {
        this.title = title;
        this.genre = genre;
        this.ageRating = ageRating;
        this.duration = duration;
    }

    //getters and setters
    //title
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }

    //genre
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return this.genre;
    }

    //age rating
    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }
    public int getAgeRating() {
        return this.ageRating;
    }

    //duration
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public String getDuration() {
        return this.duration;
    }

    //function to display movie information
    public String displayMovieInfo() {
        return "Movie Title: " + this.title + ", Genre: " + this.genre + ", Age Rating: " + this.ageRating + ", Duration: " + this.duration;
    }
}
