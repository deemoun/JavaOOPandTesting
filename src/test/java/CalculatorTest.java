import org.deemoun.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    // Здесь описываются тесты

    @Test
    void testAddition() {
        // Подготовка данных
        int a = 5;
        int b = 7;

        // Выполнение действия
        int result = Calculator.add(a, b);

        // Проверка результата
        assertEquals(12, result, "Сложение работает неверно");
    }

}
