/*
 * Copyright 2018 the original author or authors.
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

import java.io.IOException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import org.junit.Before;
import org.junit.Test;

/**
 * XML schema test.
 *
 * @author Christian Bremer
 */
public class JaxbContextTest {

  private JAXBContext jaxbContext;

  @Before
  public void createJAXBContext() throws JAXBException {
    this.jaxbContext = JAXBContext.newInstance(JaxbContextHelper.contextPaths());
  }

  @Test
  public void testXmlSchema() throws IOException {
    System.out.println("Testing XML schema ...");

    final BufferSchemaOutputResolver res = new BufferSchemaOutputResolver();
    jaxbContext.generateSchema(res);
    System.out.print(res);

    System.out.println("OK\n");
  }

  @Test
  public void testXmlSchemaWithGpx() throws JAXBException, IOException {
    System.out.println("Testing XML schema with PPX ...");

    final String[] paths = JaxbContextHelper.contextPathsBuilder(
        org.bremersee.gpx.JaxbContextHelper.CONTEXT_PATHS);
    final JAXBContext jaxbContext = JAXBContext.newInstance(JaxbContextHelper.contextPaths(paths));

    final BufferSchemaOutputResolver res = new BufferSchemaOutputResolver();
    jaxbContext.generateSchema(res);
    System.out.print(res);

    System.out.println("OK\n");
  }
}