package com.larionov.epam;

import com.larionov.epam.util.Utils;
import com.larionov.epam.util.impl.UtilsImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestUtilsConcatenateWords {

    Utils utils = new UtilsImpl();

    @Test
    void testConcatenateWords() {
        assertEquals("Hello World!", utils.concatenateWords("Hello ", "World!"));
    }

    @Test
    void testConcatenateWordsNull() {
        assertThrows(NullPointerException.class, () -> utils.concatenateWords(null, "World!"));
    }

    @Test
    void testConcatenateWordsNonLatin() {
        assertThrows(IllegalArgumentException.class, () -> utils.concatenateWords("Привет ", "Мир!"));
    }

    @Test
    void testConcatenateWordsEmpty() {
        assertEquals("", utils.concatenateWords("", ""));
    }


}
