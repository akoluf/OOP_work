package Seminar7.behavioral.pubsub.task.pubsub;

public interface Listener<T> {
    void process(Event<T> event);
}
