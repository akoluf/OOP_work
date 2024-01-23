package Seminar7.behavioral.pubsub.task.pubsub.impl.pub;

import Seminar7.behavioral.pubsub.task.pubsub.ChannelAdmin;
import Seminar7.behavioral.pubsub.task.pubsub.Event;
import Seminar7.behavioral.pubsub.task.pubsub.Listener;
import Seminar7.behavioral.pubsub.task.pubsub.Publisher;
import Seminar7.behavioral.pubsub.task.pubsub.impl.event.Video;
import Seminar7.behavioral.pubsub.task.pubsub.impl.sub.Subscriber;

import java.util.ArrayList;
import java.util.List;

/**
  Description object of video channel(model).
 */
public class VideoChannel implements Publisher<Video> {
    private final List<Listener> subscribers;
    private final List<Video> videos;
    private ChannelAdmin admin;

    public VideoChannel() {
        this(new ChannelAdmin("Rob"));
    }

    public VideoChannel(ChannelAdmin admin) {
        this.subscribers = new ArrayList<>();
        this.videos = new ArrayList<>();
        this.admin = admin;
    }

    public void addVideo(Video video) {
        videos.add(video);
        notifySubscribers(() -> video);
    }

    public ChannelAdmin getAdmin() {
        return admin;
    }

    public void setAdmin(ChannelAdmin admin) {
        this.admin = admin;
    }

    @Override
    public void registerSubscriber(Listener<Video> listener) {
        this.subscribers.add(listener);
        for (Video video : videos){
            listener.process(() -> video);
        }
    }

    @Override
    public void unregisterSubscriber(Listener<Video> listener) {
        this.subscribers.remove(listener);
    }

    @Override
    public void notifySubscribers(Event<Video> event) {
        for (Listener subscriber : subscribers){
            subscriber.process(event);
        }
    }
}
