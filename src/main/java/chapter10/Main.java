package chapter10;

import chapter02.Money;
import java.time.Duration;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone(Money.wons(5), Duration.ofSeconds(10), 0.03);
        phone.call(new Call(
            LocalDateTime.of(2022, 4, 27, 12, 10, 0),
            LocalDateTime.of(2022, 4, 27, 12, 11, 0))
        );
        phone.call(new Call(
            LocalDateTime.of(2022, 5, 27, 12, 10, 0),
            LocalDateTime.of(2022, 5, 27, 12, 11, 0))
        );

        System.out.println(phone.calculateFee());
    }
}
