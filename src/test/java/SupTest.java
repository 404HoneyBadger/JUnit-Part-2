import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import Package.Superhero;

import static org.junit.jupiter.api.Assertions.*;

class SuperheroTest {

    @Test
    @DisplayName("Does this return the beginning of the story correctly?")
    void storyStart() {
        assertEquals("There once was a superhero named Batman, who had the power of money.", Superhero.storyStart("Batman", "money"));
    }

    @Test
    @DisplayName("Does this return the middle of the story correctly?")
    void storyMiddle() {
        assertEquals("As they grew older, Superman saw that the world needed them.", Superhero.storyMiddle("Superman"));
    }

    @Test
    @DisplayName("Does this return the ending of the story correctly?")
    void storyEnding() {
        assertEquals("Doctor Strange used their ability to striptease to save the world", Superhero.storyEnding("Doctor Strange", "striptease"));
    }
}