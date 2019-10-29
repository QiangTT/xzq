package cn.zb.expection;

public class PricingsNameRepeatException extends RuntimeException {
    public PricingsNameRepeatException(){
        super();
    }
    public PricingsNameRepeatException(String message){
        super(message);
    }
}
