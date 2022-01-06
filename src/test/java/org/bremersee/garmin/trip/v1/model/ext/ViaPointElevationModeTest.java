package org.bremersee.garmin.trip.v1.model.ext;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * The via point elevation mode test.
 */
class ViaPointElevationModeTest {

  /**
   * From value.
   */
  @Test
  void fromValue() {
    for (ViaPointElevationMode expected : ViaPointElevationMode.values()) {
      assertEquals(expected, ViaPointElevationMode.fromValue(expected.toString()));
    }
    assertEquals(ViaPointElevationMode.STANDARD, ViaPointElevationMode.fromValue(null));
  }
}