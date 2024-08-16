package com.bahar.practice_designpatterns.observer;

public class NewsChannel implements Channel {

    private String news;
    @Override
    public void update(Object o) {
        this.setNews((String) news);
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
