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

/**
 * XML context helper.
 *
 * @author Christian Bremer
 */
@SuppressWarnings("WeakerAccess")
public abstract class JaxbContextHelper {

  public static final String[] CONTEXT_PATHS = {
      org.bremersee.garmin.acceleration.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.activeitem.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.activity.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.activity.v2.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.activitygoals.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.adventures.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.calorieburndata.v1.model.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.clientprofile.v1.model.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.converterplugin.v1.model.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.course.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.creationtime.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.datatypelocation.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.devicedownload.v1.model.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.directorylisting.v1.model.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.eula.v1.model.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.fatcalorie.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.fitnessdevicelimits.v1.model.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.flightplan.v1.model.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.forerunnerlogbook.v1.model.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.garmindevice.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.garmindevice.v1.model.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.garmindevice.v2.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.garmindevice.v2.model.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.garminmobileapppath.v1.model.ext.ObjectFactory.class
          .getPackage().getName(),
      org.bremersee.garmin.garminoemdevice.v1.model.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.garmintexttranslation.v1.model.ObjectFactory.class
          .getPackage().getName(),
      org.bremersee.garmin.ggz.model.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.gpx.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.gpx.v2.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.gpx.v3.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.hardwareversion.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.historydatabase.v1.model.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.ifix.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.mobile.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.power.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.pressure.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.trackpoint.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.trackpoint.v2.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.trackstats.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.trip.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.tripmetadata.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.useraccounts.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.userprofile.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.userprofile.v2.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.userprofilepower.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.viapointtransportationmode.v1.model.ext.ObjectFactory.class
          .getPackage().getName(),
      org.bremersee.garmin.video.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.waypoint.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.weblink.v1.model.ext.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.workout.v1.model.ObjectFactory.class.getPackage().getName(),
      org.bremersee.garmin.workout.v1.model.ext.ObjectFactory.class.getPackage().getName()
  };

  @SuppressWarnings("WeakerAccess")
  public static String[] contextPathsBuilder(String[] otherContextPaths) {
    if (otherContextPaths == null || otherContextPaths.length == 0) {
      return CONTEXT_PATHS;
    }
    final String[] newContextPaths = new String[CONTEXT_PATHS.length + otherContextPaths.length];
    System.arraycopy(
        CONTEXT_PATHS,
        0,
        newContextPaths,
        0,
        CONTEXT_PATHS.length);
    System.arraycopy(
        otherContextPaths,
        0,
        newContextPaths,
        CONTEXT_PATHS.length,
        otherContextPaths.length);
    return newContextPaths;
  }

  @SuppressWarnings("WeakerAccess")
  public static String contextPaths() {
    return contextPaths(CONTEXT_PATHS);
  }

  @SuppressWarnings("WeakerAccess")
  public static String contextPaths(final String[] contextPaths) {
    final StringBuilder sb = new StringBuilder();
    if (contextPaths != null) {
      for (int i = 0; i < contextPaths.length; i++) {
        sb.append(contextPaths[i]);
        if (i < contextPaths.length - 1) {
          sb.append(':');
        }
      }
    }
    return sb.toString();
  }

}
