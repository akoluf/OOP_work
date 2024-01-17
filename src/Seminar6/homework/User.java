package Seminar6.homework;

public class User{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void report(){
        UserReporter reporter = new UserReporter(this);
        reporter.report();
    }

    public void save(){
        UserPersister persister = new UserPersister(this);
        persister.save();
    }
}