import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    @Test
    public void statement() {
        Movie m1 = new Movie("Pokémon: O Filme", 2);
        Movie m2 = new Movie("Detetive Pikachu", 1);

        Customer c1 = new Customer("Eduardo Villani");

        Rental r1 = new Rental(m1, 3);
        Rental r2 = new Rental(m2, 1);

        c1.addRental(r1);
        c1.addRental(r2);

        assertEquals("Rental Record for Eduardo Villani\n" +
                "	Pokémon: O Filme	1.5\n" +
                "	Detetive Pikachu	3.0\n" +
                "Amount owed is 4.5\n" +
                "You earned 2 frequent renter points", c1.statement());
    }
    @Test
    public void htmlStatement() {
        Movie m1 = new Movie("Pokémon: O Filme", 2);
        Movie m2 = new Movie("Detetive Pikachu", 1);

        Customer c1 = new Customer("Eduardo Villani");

        Rental r1 = new Rental(m1, 3);
        Rental r2 = new Rental(m2, 1);

        c1.addRental(r1);
        c1.addRental(r2);

        assertEquals("<H1>Rentals for <EM>Eduardo Villani</EM></H1><P>\n" +
                "Pokémon: O Filme: 1.5<BR>\n" +
                "Detetive Pikachu: 3.0<BR>\n" +
                "<P>You owe <EM>4.5</EM><P>\n" +
                "On this rental you earned <EM>2</EM> frequent renter points<P>", c1.htmlStatement());
    }
}