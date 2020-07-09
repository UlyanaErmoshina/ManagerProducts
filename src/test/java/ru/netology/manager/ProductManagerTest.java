package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    private ProductRepository repository = new ProductRepository();
    private ProductManager manager = new ProductManager(repository);


    private Book First = new Book(1, "morning", 100, "Elrod");
    private Book Third = new Book(1, "morning", 100, "Lev");
    private Book Fourth = new Book(1, "day", 100, "Leo");
    private Smartphone IPhone = new Smartphone(1, "IphoneXR", 200, "China");
    private Product Second = new Product(2, "Apple", 50);

    @BeforeEach
    public void setUp() {
        manager.add(First);
        manager.add(IPhone);
        manager.add(Second);
        manager.add(Third);
        manager.add(Fourth);
    }

    @Test
    public void shouldSearchTwoBooksByName() {
        String book = "morning";
        manager.searchBy(book);
        Product[] actual = manager.searchBy(book);
        Product[] expected = new Product[]{First,Third};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByBookName() {
        String book = "day";
        manager.searchBy(book);
        Product[] actual = manager.searchBy(book);
        Product[] expected = new Product[]{Fourth};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByBookAuthor() {
        String book = "Elrod";
        manager.searchBy(book);
        Product[] actual = manager.searchBy(book);
        Product[] expected = new Product[]{First};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByBookNoName() {
        String book = null;
        manager.searchBy(book);
        Product[] actual = manager.searchBy(book);
        Product[] expected = new Product[0];
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByBookNoAuthor() {
        String book = "Tolstoi";
        manager.searchBy(book);
        Product[] actual = manager.searchBy(book);
        Product[] expected = new Product[0];
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchBySmartphoneName() {
        String smartphone = "IPhoneXR";
        manager.searchBy(smartphone);
        Product[] actual = manager.searchBy(smartphone);
        Product[] expected = new Product[]{IPhone};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchBySmartphoneManufacturer() {
        String smartphone = "China";
        manager.searchBy(smartphone);
        Product[] actual = manager.searchBy(smartphone);
        Product[] expected = new Product[]{IPhone};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchBySmartphoneNoName() {
        String smartphone = null;
        manager.searchBy(smartphone);
        Product[] actual = manager.searchBy(smartphone);
        Product[] expected = new Product[0];
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchBySmartphoneNoManucturer() {
        String smartphone = "England";
        manager.searchBy(smartphone);
        Product[] actual = manager.searchBy(smartphone);
        Product[] expected = new Product[0];
        assertArrayEquals(expected, actual);
    }

    }



