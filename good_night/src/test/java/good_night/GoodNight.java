/*
 * This source file was generated by the Gradle 'init' task
 */
package good_night;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GoodNightTest {
    @Test void appHasAGreeting() {
        GoodNight classUnderTest = new GoodNight();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}