package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TurkeyAdapterTest {
    @Test
    void testMallardDuck() {
        Duck duck = new MallardDuck();
        assertEquals("Mallard Duck flying", duck.fly());
        duck.quack();
    }

    @Test
    void testTurkeyAdapter() {
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.quack();
        turkeyAdapter.fly();

    }

}

