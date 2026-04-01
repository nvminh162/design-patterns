package com.nvminh162;

import java.util.ArrayList;
import java.util.List;

// Subject - Lớp phát thông báo khi có thay đổi
public class NewsPublisher {

    private List<Observer> observers = new ArrayList<>();
    private String latestNews;

    // Thêm observer
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    // Xóa observer
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    // Thông báo tới tất cả observers
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestNews);
        }
    }

    // Đăng tin mới
    public void publish(String news) {
        this.latestNews = news;
        notifyObservers();
    }
}
