/*
 * Copyright 2019-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bremersee.garmin.trip.v1.model.ext;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The via point elevation mode.
 *
 * @author Christian Bremer
 */
@SuppressWarnings("unused")
public enum ViaPointElevationMode {

  /**
   * Standard elevation mode.
   */
  STANDARD("Standard");

  private final String value;

  ViaPointElevationMode(String values) {
    this.value = values;
  }

  @JsonValue
  @Override
  public String toString() {
    return value;
  }

  /**
   * From value.
   *
   * @param value the value
   * @return the via point elevation mode
   */
  @JsonCreator
  public static ViaPointElevationMode fromValue(String value) {
    for (ViaPointElevationMode e : ViaPointElevationMode.values()) {
      if (e.value.equalsIgnoreCase(value) || e.name().equalsIgnoreCase(value)) {
        return e;
      }
    }
    return STANDARD;
  }
}
