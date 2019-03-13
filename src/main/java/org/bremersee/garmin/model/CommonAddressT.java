/*
 * Copyright 2019 the original author or authors.
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

package org.bremersee.garmin.model;

import java.util.List;

/**
 * The common address interface.
 *
 * @author Christian Bremer
 */
@SuppressWarnings("unused")
public interface CommonAddressT {

  /**
   * Gets street addresses.
   *
   * @return the street addresses
   */
  List<String> getStreetAddresses();

  /**
   * Gets city.
   *
   * @return the city
   */
  String getCity();

  /**
   * Sets city.
   *
   * @param value the value
   */
  void setCity(String value);

  /**
   * Gets state.
   *
   * @return the state
   */
  String getState();

  /**
   * Sets state.
   *
   * @param value the value
   */
  void setState(String value);

  /**
   * Gets country.
   *
   * @return the country
   */
  String getCountry();

  /**
   * Sets country.
   *
   * @param value the value
   */
  void setCountry(String value);

  /**
   * Gets postal code.
   *
   * @return the postal code
   */
  String getPostalCode();

  /**
   * Sets postal code.
   *
   * @param value the value
   */
  void setPostalCode(String value);

}
