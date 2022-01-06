package org.bremersee.garmin.trip.v1.model.ext;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * The trip transportation mode test.
 */
class TripTransportationModeTest {

  /**
   * From value.
   */
  @Test
  void fromValue() {
    for (TripTransportationMode expected : TripTransportationMode.values()) {
      assertEquals(expected, TripTransportationMode.fromValue(expected.toString()));
    }
    assertEquals(TripTransportationMode.AUTOMOTIVE, TripTransportationMode.fromValue(null));
  }
}