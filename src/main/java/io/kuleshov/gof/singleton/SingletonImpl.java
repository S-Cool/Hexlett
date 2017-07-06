package io.kuleshov.gof.singleton;

public class SingletonImpl{

    private static SingletonImpl self = null;

    private SingletonImpl(){
        super();
        // perform initialization here
        self = this;
    }

    public static synchronized SingletonImpl getInstance(){
        return (self == null) ? new SingletonImpl() : self;
    }

//    public static SingletonImpl getInstance(){
//        if (self == null){
//            synchronized(SingletonImpl.class){
//                if (self == null){
//                    self = new SingletonImpl();
//                }
//            }
//        }
//        return self;
//    }

}