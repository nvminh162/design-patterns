package com.nvminh162;

// Main class
public class Main {
    public static void main(String[] args) {
        NewsPublisher newsPublisher = new NewsPublisher();

        Observer subscriber1 = new Subscriber("Alice");
        Observer subscriber2 = new Subscriber("Bob");

        newsPublisher.subscribe(subscriber1);
        newsPublisher.subscribe(subscriber2);

        newsPublisher.publish("Breaking News: Observer Pattern là gì?");
        // Alice nhận được...
        // Bob nhận được...

        newsPublisher.unsubscribe(subscriber2);

        newsPublisher.publish("Breaking News: Observer Pattern đã được cập nhật!");
        // Chỉ còn Alice nhận được
    }
}
