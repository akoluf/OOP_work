package Seminar7.behavioral.pubsub.task.pubsub.impl.sub;

import Seminar7.behavioral.pubsub.task.pubsub.ChannelAdmin;
import Seminar7.behavioral.pubsub.task.pubsub.Event;
import Seminar7.behavioral.pubsub.task.pubsub.Listener;
import Seminar7.behavioral.pubsub.task.pubsub.Publisher;
import Seminar7.behavioral.pubsub.task.pubsub.impl.event.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
  Video channel's subscriber.
 */
public class Subscriber implements Listener<Video>, Publisher<Boolean> {
    private final String nickname;
    private boolean isLikeVideo;
    private final List<Listener<Boolean>> channelAdministrators;

    public Subscriber(String nickname) {
        this.nickname = nickname;
        this.isLikeVideo = false;
        this.channelAdministrators = new ArrayList<>();
    }

    public String getNickname() {
        return nickname;
    }

    public boolean isLikeVideo() {
        return isLikeVideo;
    }

    public void setLikeVideo(boolean likeVideo) {
        isLikeVideo = likeVideo;
    }

    @Override
    public void process(Event<Video> event) {
        Video video = event.appear();
        Random random = new Random();
        if(video.getDuration() > random.nextInt(100)){
            System.err.printf("%s: This is a very long! I don't like it!%n", nickname);
            setLikeVideo(false);
            notifySubscribers(() -> isLikeVideo);
        }
        else {
            System.out.printf("%s: I like it!%n", nickname);
            setLikeVideo(true);
            notifySubscribers(() -> isLikeVideo);
        }
    }

    @Override
    public void registerSubscriber(Listener<Boolean> listner) {
        this.channelAdministrators.add(listner);
    }

    @Override
    public void unregisterSubscriber(Listener<Boolean> listner) {
        this.channelAdministrators.remove(listner);
    }

    @Override
    public void notifySubscribers(Event<Boolean> event) {
        for (Listener<Boolean> admin : channelAdministrators){
            admin.process(event);
        }
    }
}
