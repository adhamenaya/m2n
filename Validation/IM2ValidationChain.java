package Validation;

public interface IM2ValidationChain {
    boolean validate();

    void setNext(IM2ValidationChain next);
}
