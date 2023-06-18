package ru.netology.ProductManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    public void testWhenProductsFound() {
        Repository repo = new Repository();
        Manager manager = new Manager(repo);

        Book book1 = new Book(1,"Мертвые души",267,"Николай Васильевич Гоголь");
        Book book2 = new Book(5,"Женское время, или, Война полов",299,"Эдуард Тополь");
        Book book3 = new Book(3,"Метель",158,"Александр Сергеевич Пушкин");
        Book book4 = new Book(4,"The Raven",145,"Edgar Allan Poe");
        Book book5 = new Book(2,"На Западном фронте без перемен",307,"Erich Maria Remarque");
        Smartphone phone1 = new Smartphone(11,"OPPO A71",17999,"OPPO");
        Smartphone phone2 = new Smartphone(22,"Iphone 15",97999,"Apple");
        Smartphone phone3 = new Smartphone(33,"Samsung Galaxy S22 ",17999,"Samsung");


        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(book4);
        manager.add(book5);
        manager.add(phone1);
        manager.add(phone2);
        manager.add(phone3);

        Product[] actual = manager.searchBy("Samsung");
        Product[] expected = {phone3};

        Assertions.assertArrayEquals(expected, actual);

    }

}