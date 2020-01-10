package com.larionov.epam;

import com.larionov.epam.util.Utils;
import com.larionov.epam.util.impl.UtilsImpl;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUtilsComputeFactorial {

    Utils utils = new UtilsImpl();


    @Test
    @Disabled
    void testComputeFactorial() {
        assertEquals(120, utils.computeFactorial(5));
    }

    @Test()
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
    void testFactorialWithTimeout() {
        assertEquals(120, utils.computeFactorial(5));
    }
}
