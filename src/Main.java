import Desktop.Desktop;
import Desktop.AbstractDesktopBuilder;
import Desktop.DesktopDirector;
import Desktop.HpDesktopBuilder;
import Prototype.Product;
import Prototype.ProductPrototype;

import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ProductPrototype product1 = new Product("Laptop", 999.99);
        ProductPrototype product2 = product1.clone();

//        product1.display();
        product2.display();



//        DesktopDirector director = new DesktopDirector();
//
//        AbstractDesktopBuilder builder = new HpDesktopBuilder();
//
//        Desktop desktop = director.createDesktop(builder);
//
//        desktop.display();


    }
}