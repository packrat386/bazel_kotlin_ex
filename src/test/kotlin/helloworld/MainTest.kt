package helloworld

import org.junit.Assert.assertEquals
import org.junit.Test

class MainTest {
    @Test fun testDuh() {
        assertEquals(true, true)
    }

    @Test fun testUm() {
        assertEquals(true, false)
    }

    @Test fun testMessge() {
        assertEquals("Hello World!", msg())
    }
}
