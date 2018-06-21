package io.kuleshov.gof.observer;

public interface Observer {
    void handleEvent(BidEvent event);
}
