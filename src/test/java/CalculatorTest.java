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

    @Test
    void testSubtraction() {
        // Подготовка данных
        int a = 10;
        int b = 4;

        // Выполнение действия
        int result = Calculator.subtract(a, b);

        // Проверка результата
        assertEquals(6, result, "Вычитание работает неверно");
    }

}
