package Immutabuliting;

public class SingleTon {

    private static SingleTon obj;
    private SingleTon(){}

    public static SingleTon getA(){
        if (obj == null){
            synchronized(SingleTon.class){
                if (obj == null){
                    obj = new SingleTon();//instance will be created at request time
                }
            }
        }
        return obj;
    }

    public void doSomething(){
        //write your code


    }
}


