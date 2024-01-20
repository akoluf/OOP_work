package Seminar7.behavioral.pubsub.task.pubsub;

public interface Publisher<T> {
    void registerSubscriber(Listener<T> listner);
    void unregisterSubscriber(Listener<T> listner);
    void notifySubscribers(Event<T> event);
}
