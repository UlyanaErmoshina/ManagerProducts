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




    private Book first = new Book(1, "morning", 100, "Elrod");
    private Book third = new Book(3, "morning", 100, "Lev");
    private Smartphone iPhone = new Smartphone(1, "IphoneXR", 200, "China");
    private Product second = new Product(2, "Apple", 50);

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(iPhone);
        manager.add(second);
        manager.add(third);
    }

    @Test
    public void shouldSearchByBookName() {
        String Book = "Morning";
        manager.searchBy(Book);
        Product[] actual = manager.searchBy(Book);
        Product[] expected = new Product[]{first,third};
        assertArrayEquals(expected, actual);
    }


    @Test
    public void shouldSearchByBookAuthor() {
        String Book = "Elrod";
        manager.searchBy(Book);
        Product[] actual = manager.searchBy(Book);
        Product[] expected = new Product[]{first};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldSearchByBookNoName() {
        String Book = null;
        manager.searchBy(Book);
        Product[] actual = manager.searchBy(Book);
        Product[] expected = new Product[0];
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldSearchByBookNoAuthor() {
        String Book = "Tolstoi";
        manager.searchBy(Book);
        Product[] actual = manager.searchBy(Book);
        Product[] expected = new Product[0];
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldSearchBySmartphoneName() {
        String Smartphone = "IPhoneXR";
        manager.searchBy(Smartphone);
        Product[] actual = manager.searchBy(Smartphone);
        Product[] expected = new Product[]{iPhone};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldSearchBySmartphoneManufacturer() {
        String Smartphone = "China";
        manager.searchBy(Smartphone);
        Product[] actual = manager.searchBy(Smartphone);
        Product[] expected = new Product[]{iPhone};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldSearchBySmartphoneNoName() {
        String Smartphone = null;
        manager.searchBy(Smartphone);
        Product[] actual = manager.searchBy(Smartphone);
        Product[] expected = new Product[0];
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldSearchBySmartphoneNoManucturer() {
        String Smartphone = "England";
        manager.searchBy(Smartphone);
        Product[] actual = manager.searchBy(Smartphone);
        Product[] expected = new Product[0];
        assertArrayEquals(expected, actual);
    }

    }



