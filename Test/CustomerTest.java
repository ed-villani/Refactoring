import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {

    @Test
    public void statement() {
        Movie m1 = new Movie("Pokémon: O Filme", 15);
        Movie m2 = new Movie("Detetive Pikachu", 12);

        Customer c1 = new Customer("Eduardo Villani");

        Rental r1 = new Rental(m1, 3);
        Rental r2 = new Rental(m2, 1);

        c1.addRental(r1);
        c1.addRental(r2);

        assertEquals("Rental Record for Eduardo Villani\n" +
                "	Pokémon: O Filme	0.0\n" +
                "	Detetive Pikachu	0.0\n" +
                "Amount owed is 0.0\n" +
                "You earned 2 frequent renter points", c1.statement());
    }
}