package chapter11;

import chapter02.Money;

public interface RatePolicy {

    Money calculateFee(Phone phone);
}
