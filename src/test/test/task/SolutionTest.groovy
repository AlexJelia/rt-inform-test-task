package task

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SolutionTest {

    def voidList = []
    def integerList = [1, 3, 4, 5, 1, 5, 4]
    def stringList = ["Компьютер Acer", "Компьютер Asus", "Роутер Huawei", "Принтер",
                      "Компьютер Acer", "Роутер Huawei", "Роутер Huawei", "Принтер"]

    @Test
    void testElementsCount() {
        assertEquals(7, JavaSolution.countOfElements(integerList))
        assertEquals(7, GroovySolution.countOfElements(integerList))
    }

    @Test
    void testIntegerList() {
        String expected = "[1:2, 3:1, 4:2, 5:2]"

        String actualJava = JavaSolution.foo(integerList).toString()
        String actualGroovy = GroovySolution.foo(integerList).toString()

        assertEquals(expected, actualJava)
        assertEquals(expected, actualGroovy)
    }

    @Test
    void testStringList() {
        String expected = "[Принтер:2, Компьютер Acer:2, Компьютер Asus:1, Роутер Huawei:3]"

        String actualJava = JavaSolution.foo(stringList).toString()
        String actualGroovy = GroovySolution.foo(stringList).toString()

        assertEquals(expected, actualJava)
        assertEquals(expected, actualGroovy)
    }

    @Test
    void testVoidList() {
        String expected = "[:]"

        String actualJava = JavaSolution.foo(voidList).toString()
        String actualGroovy = GroovySolution.foo(voidList).toString()

        assertEquals(expected, actualJava)
        assertEquals(expected, actualGroovy)
    }
}
