package Seminar7.behavioral.pubsub.solution;

import Seminar7.behavioral.pubsub.solution.impl.event.Video;
import Seminar7.behavioral.pubsub.solution.impl.pub.Channel;
import Seminar7.behavioral.pubsub.solution.impl.sub.User;

import java.time.LocalDateTime;

public class Run {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        Channel channel = new Channel();

        Video bandsOfNewYork = new Video(LocalDateTime.of(
                2023, 6, 12, 2, 0), "Bands of NewYork", 49
        );

        Video santaBarbara = new Video(LocalDateTime.of(
                1990, 1, 1, 0, 0), "Santa Barbara", 1000000
        );

        User u1 = new User("Bob");
        User u2 = new User("Jack");

        channel.registerSubscriber(u1);
        u1.registerSubscriber(channel.getAdmin());
        channel.notifySubscribers(() -> bandsOfNewYork);

        channel.registerSubscriber(u2);
        u2.registerSubscriber(channel.getAdmin());
        channel.notifySubscribers(() -> santaBarbara);
    }
}
