/*
 * Copyright 2018-2020 the original author or authors.
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

package org.bremersee.garmin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.ServiceLoader;
import org.bremersee.garmin.gpx.v3.model.ext.DisplayColorT;
import org.bremersee.garmin.gpx.v3.model.ext.TrackExtension;
import org.bremersee.xml.JaxbContextBuilder;
import org.bremersee.xml.JaxbContextDataProvider;
import org.bremersee.xml.SchemaMode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Jaxb context builder test.
 *
 * @author Christian Bremer
 */
public class JaxbContextBuilderTest {

  private static JaxbContextBuilder jaxbContextBuilder;

  /**
   * Create jaxb context builder.
   */
  @BeforeAll
  static void createJaxbContextBuilder() {
    jaxbContextBuilder = JaxbContextBuilder.builder()
        .withSchemaMode(SchemaMode.ALWAYS)
        .withFormattedOutput(false)
        .processAll(ServiceLoader.load(JaxbContextDataProvider.class))
        .initJaxbContext();
  }

  /**
   * Test xml.
   *
   * @throws Exception the exception
   */
  @Test
  public void testXml() throws Exception {
    TrackExtension model = new TrackExtension();
    model.setDisplayColor(DisplayColorT.CYAN);

    StringWriter sw = new StringWriter();
    jaxbContextBuilder.buildMarshaller().marshal(model, sw);
    String xmlWithAllSchemaLocations = sw.toString();
    assertNotNull(xmlWithAllSchemaLocations);

    sw = new StringWriter();
    jaxbContextBuilder.buildMarshaller(model).marshal(model, sw);
    String xmlWithOneSchemaLocation = sw.toString();
    assertNotNull(xmlWithOneSchemaLocation);

    assertNotEquals(xmlWithAllSchemaLocations, xmlWithOneSchemaLocation);
    assertTrue(xmlWithOneSchemaLocation.length() < xmlWithAllSchemaLocations.length());

    TrackExtension actualModel = (TrackExtension) jaxbContextBuilder
        .buildUnmarshaller(TrackExtension.class)
        .unmarshal(new StringReader(xmlWithOneSchemaLocation));

    assertNotNull(actualModel);
    assertEquals(DisplayColorT.CYAN, actualModel.getDisplayColor());
  }

}
