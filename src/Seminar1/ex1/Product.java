package Seminar1.ex1;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

// Класс Product, представляющий продукт
class Product {
    // Имя продукта
    private String name;
    // Цена продукта
    private double price;

    // Конструктор класса Product
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Геттер для имени продукта
    public String getName() {
        return name;
    }

    // Сеттер для имени продукта
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для цены продукта
    public double getPrice() {
        return price;
    }

    // Сеттер для цены продукта
    public void setPrice(double price) {
        this.price = price;
    }
}

// Класс Trade, представляющий автомат торговли
class Trade {
    // Карта для хранения продуктов
    private Map<String, Product> products;

    // Конструктор класса Trade без аргументов
    public Trade() {
        this.products = new HashMap<>();
    }

    // Конструктор класса Trade с аргументом - списком продуктов
    public Trade(List<Product> productList) {
        this();
        initProducts(productList);
    }

    // Метод для инициализации продуктов
    public void initProducts(List<Product> productList) {
        for (Product product : productList) {
            this.products.put(product.getName(), product);
        }
    }

    // Метод для получения продукта по имени
    public Product getProduct(String name) {
        return this.products.get(name);
    }

    // Метод для добавления продукта
    public void addProduct(Product product) {
        this.products.put(product.getName(), product);
    }

    // Метод для удаления продукта
    public void removeProduct(String name) {
        this.products.remove(name);
    }

    // Метод для обновления продукта
    public void updateProduct(Product product) {
        this.products.put(product.getName(), product);
    }
}