package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    private ProductManager manager = new ProductManager();
    private Book First = new Book(1, "morning", 100, "Elrod");
    private Smartphone IPhone = new Smartphone(1, "IphoneXR", 200, "China");
    private Product Second = new Product(2, "Apple", 50);

    @BeforeEach
    public void SetUp() {
        manager.add(First);
        manager.add(IPhone);
        manager.add(Second);
    }

    @Test
    public void ShouldSearchByBookName() {
        String Book = "Morning";
        manager.searchBy(Book);
        Product[] actual = manager.searchBy(Book);
        Product[] expected = new Product[]{First};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldSearchByBookAuthor() {
        String Book = "Elrod";
        manager.searchBy(Book);
        Product[] actual = manager.searchBy(Book);
        Product[] expected = new Product[]{First};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldSearchByBookNoName() {
        String Book = null;
        manager.searchBy(Book);
        Product[] actual = manager.searchBy(Book);
        Product[] expected = new Product[0];
        assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldSearchByBookNoAuthor() {
        String Book = "Tolstoi";
        manager.searchBy(Book);
        Product[] actual = manager.searchBy(Book);
        Product[] expected = new Product[0];
        assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldSearchBySmartphoneName() {
        String Smartphone = "IPhoneXR";
        manager.searchBy(Smartphone);
        Product[] actual = manager.searchBy(Smartphone);
        Product[] expected = new Product[]{IPhone};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldSearchBySmartphoneManufacturer() {
        String Smartphone = "China";
        manager.searchBy(Smartphone);
        Product[] actual = manager.searchBy(Smartphone);
        Product[] expected = new Product[]{IPhone};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldSearchBySmartphoneNoName() {
        String Smartphone = null;
        manager.searchBy(Smartphone);
        Product[] actual = manager.searchBy(Smartphone);
        Product[] expected = new Product[0];
        assertArrayEquals(expected, actual);
    }
    @Test
    public void ShouldSearchBySmartphoneNoManucturer() {
        String Smartphone = "England";
        manager.searchBy(Smartphone);
        Product[] actual = manager.searchBy(Smartphone);
        Product[] expected = new Product[0];
        assertArrayEquals(expected, actual);
    }

    }



