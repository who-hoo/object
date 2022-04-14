package chapter02;

public class NoneDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculateDiscountAmount(Screening Screening) {
        return null;
    }
}
