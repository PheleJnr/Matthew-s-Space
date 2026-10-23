package movieRatingFolder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMovie {

    @Test
    public void testThatNewMovieHaveNoRatingAndNoAverageRating(){
        Movie movie = new Movie("Inception");
        assertEquals(0, movie.getNumberOfRating());
        assertEquals(0.0, movie.getAverageRating());
    }
    @Test
    public void testThatAddingOneRatingsSetsAverageToThatRating(){
        Movie movie = new Movie("Inception");
        movie.addRating(5);

        assertEquals(1, movie.getNumberOfRating());
        assertEquals(5.0, movie.getAverageRating());
    }
    @Test
    public void testThatAverageIsCalculatedCorrectlyAcrossMultipleRatings(){
        Movie movie = new Movie("Inception");
        movie.addRating(5);
        movie.addRating(4);
        movie.addRating(3);
        movie.addRating(4);

        assertEquals(4, movie.getNumberOfRating());
        assertEquals(4.0, movie.getAverageRating());

    }
    @Test
    public void testThatAverageIsNotTruncatedToAnInteger(){
        Movie movie = new Movie("Inception");
        movie.addRating(5);
        movie.addRating(4);

        assertEquals(4.5, movie.getAverageRating());
    }
    @Test
    public void testThatHasNameIsCorrectlyTheSame(){
       Movie movie = new Movie("Inception");
       assertTrue(movie.HasName("Inception"));
    }
    @Test
    public void testThatHasNameIsCaseSensitive(){
        Movie movie = new Movie("Inception");
        assertTrue(movie.HasName("inception"));
        assertTrue(movie.HasName("INCEPTION"));

    }
    @Test
    public void testThatHasNameReturnsFalseForADifferentName(){
        Movie movie = new Movie("Inception");
        assertFalse(movie.HasName("Interstellar"));

    }
    @Test
    public void testThatGetNameReturnsOriginalName(){
        Movie movie = new Movie("Koto Aye");
        assertEquals("Koto Aye", movie.getName());
    }

    @Test
    public void testThatFormattedDateAddedIsNotEmptyOrNull(){
        Movie movie = new Movie("Inception");
        assertNotNull(movie.getFormattedDateAdded());
        assertFalse(movie.getFormattedDateAdded().isEmpty());
    }
}
