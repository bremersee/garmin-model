package org.bremersee.garmin.trip.v1.model.ext;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * The via point calculation mode test.
 */
class ViaPointCalculationModeTest {

  /**
   * From value.
   */
  @Test
  void fromValue() {
    for (ViaPointCalculationMode expected : ViaPointCalculationMode.values()) {
      assertEquals(expected, ViaPointCalculationMode.fromValue(expected.toString()));
    }
    assertEquals(ViaPointCalculationMode.FASTER_TIME, ViaPointCalculationMode.fromValue(null));
  }
}