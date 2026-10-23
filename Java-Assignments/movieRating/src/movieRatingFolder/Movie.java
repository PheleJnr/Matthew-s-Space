package movieRatingFolder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Movie {
    private final String name;
    private LocalDateTime dateAdded;
    private final ArrayList<Integer> ratings;

    public Movie(String name) {
        this.name = name;
        this.dateAdded = LocalDateTime.now();
        this.ratings = new ArrayList<>();

    }

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public String getName() {
        return name;
    }

    public String getFormattedDateAdded() {
        return dateAdded.format(FORMATTER);
    }

    public void addRating(int rating) {
        ratings.add(rating);
    }

    public int getNumberOfRating() {
        return ratings.size();
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) {
            return 0.0;
        }
        int total = 0;
        for (int count = 0; count < ratings.size(); count++) {
            total += ratings.get(count);
        }
        return (double) total / ratings.size();
    }

    public boolean HasName(String otherName) {
        return name.equalsIgnoreCase(otherName);
    }

}