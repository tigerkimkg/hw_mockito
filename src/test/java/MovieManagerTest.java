import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void emptyList() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovie() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");

        String[] expected = { "Бладшот"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddThreeMovies() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");

        String[] expected = { "Бладшот", "Вперёд", "Отель Белград"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastThreeMoviesIfLimitDefault() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");

        String[] expected = { "Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFiveMoviesIfLimitDefault() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");

        String[] expected = { "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперёд", "Бладшот" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFiveMoviesIfLimitSeven() {
        MovieManager manager = new MovieManager(7);

        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");

        String[] expected = { "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперёд", "Бладшот" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastSevenMoviesIfLimitSeven() {
        MovieManager manager = new MovieManager(7);

        manager.addMovie("Бладшот");
        manager.addMovie("Вперёд");
        manager.addMovie("Отель Белград");
        manager.addMovie("Джентльмены");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Тролли. Мировой тур");
        manager.addMovie("Номер один");

        String[] expected = { "Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентльмены", "Отель Белград", "Вперёд", "Бладшот" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
