package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemTestHelper {

    public static void assertItemEquals(Item actual, Item expected) {
        assertEquals(expected.name, actual.name);
        assertEquals(expected.quality, actual.quality);
        assertEquals(expected.sellIn, actual.sellIn);
    }
}
