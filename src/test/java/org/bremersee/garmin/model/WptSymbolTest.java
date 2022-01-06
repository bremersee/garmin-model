package org.bremersee.garmin.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * The wpt symbol test.
 */
class WptSymbolTest {

  /**
   * Gets category.
   */
  @Test
  void getCategory() {
    for (WptSymbol wptSymbol : WptSymbol.values()) {
      assertNotNull(wptSymbol.getCategory());
    }
  }

  /**
   * From value.
   */
  @Test
  void fromValue() {
    for (WptSymbol expected : WptSymbol.values()) {
      assertEquals(expected, WptSymbol.fromValue(expected.toString()));
    }
    assertEquals(WptSymbol.FLAG_BLUE, WptSymbol.fromValue(null));
  }
}