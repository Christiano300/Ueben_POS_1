import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class ArrayUtilTest {
    @Nested
    class InsertTest {
        @Test
        void test_1() {
            assertArrayEquals(ArrayUtil.insertAt(new int[]{3, 2, 5, 2}, 1, 7), new int[]{3, 7, 2, 5, 2});

        }

        @Test
        void test_2() {
            assertArrayEquals(ArrayUtil.insertAt(new int[]{3, 7, 1}, 0, 2), new int[]{2, 3, 7, 1});
        }

        @Test
        void testEmpty() {
            assertArrayEquals(ArrayUtil.insertAt(new int[]{}, 0, 7), new int[]{7});
        }

        @Test
        void indexOutOfBounds() {
            assertNull(ArrayUtil.insertAt(new int[]{3, 2, 5, 2}, 5, 7));
        }
    }

    @Nested
    class DeleteTest {
        @Test
        void testWorking() {
            assertArrayEquals(ArrayUtil.deleteAt(new int[]{3, 2, 5, 2}, 2), new int[]{3, 2, 2});
        }

        @Test
        void testZero() {
            assertArrayEquals(ArrayUtil.deleteAt(new int[]{7, 3, 8, 2, 1}, 0), new int[]{3, 8, 2, 1});
        }

        @Test
        void IndexOutOfBounds() {
            assertNull(ArrayUtil.deleteAt(new int[]{4, 9, 2, 7}, 6));
        }
    }
}
