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

import java.util.Arrays;
import java.util.Collection;
import org.bremersee.xml.JaxbContextData;
import org.bremersee.xml.JaxbContextDataProvider;

/**
 * Garmin jaxb context data provider.
 *
 * @author Christian Bremer
 */
public class GarminJaxbContextDataProvider implements JaxbContextDataProvider {

  /**
   * The constant GPX_NAMESPACES.
   */
  @SuppressWarnings("unused")
  public static final String[] GPX_NAMESPACES = {
      "http://www.topografix.com/GPX/1/1",
      "http://www.garmin.com/xmlschemas/WaypointExtension/v1",
      "http://www.garmin.com/xmlschemas/GpxExtensions/v3",
      "http://www.garmin.com/xmlschemas/TrackPointExtension/v1",
      "http://www.garmin.com/xmlschemas/GpxExtensions/v3",
      "http://www.garmin.com/xmlschemas/TripExtensions/v1",
      "http://www.garmin.com/xmlschemas/AdventuresExtensions/v1",
      "http://www.garmin.com/xmlschemas/PressureExtension/v1",
      "http://www.garmin.com/xmlschemas/TripMetaDataExtensions/v1",
      "http://www.garmin.com/xmlschemas/ViaPointTransportationModeExtensions/v1",
      "http://www.garmin.com/xmlschemas/CreationTimeExtension/v1",
      "http://www.garmin.com/xmlschemas/AccelerationExtension/v1",
      "http://www.garmin.com/xmlschemas/PowerExtension/v1",
      "http://www.garmin.com/xmlschemas/VideoExtension/v1"
  };

  @Override
  public Collection<JaxbContextData> getJaxbContextData() {
    return Arrays.asList(
        new JaxbContextData(
            org.bremersee.garmin.acceleration.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/AccelerationExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.activeitem.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/ActiveItemExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.activity.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/ActivityExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.activity.v2.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/ActivityExtensionv2.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.activitygoals.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/ActivityGoalsExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.adventures.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/AdventuresExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.calorieburndata.v1.model.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/CalorieBurnDataV1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.clientprofile.v1.model.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/clientprofilev1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.converterplugin.v1.model.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/ConverterPluginv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.course.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/CourseExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.creationtime.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/CreationTimeExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.datatypelocation.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/DataTypeLocationExtension1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.devicedownload.v1.model.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/DeviceDownloadV1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.directorylisting.v1.model.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/DirectoryListingV1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.eula.v1.model.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/Eulav1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.fatcalorie.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/fatcalorieextensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.fitnessdevicelimits.v1.model.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/FitnessDeviceLimitsv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.flightplan.v1.model.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/FlightPlanv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.forerunnerlogbook.v1.model.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/ForerunnerLogbookv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.garmindevice.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/GarminDeviceExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.garmindevice.v2.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/GarminDeviceExtensionv2.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.garmindevice.v1.model.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/GarminDevicev1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.garmindevice.v2.model.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/GarminDevicev2.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.garminmobileapppath.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/GarminMobileAppPathExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.garminoemdevice.v1.model.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/GarminOEMDeviceExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.garmintexttranslation.v1.model.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/GarminTextTranslationv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.ggz.model.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/ggz.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.gpx.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/GpxExtensionsv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.gpx.v2.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/GpxExtensionsv2.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.gpx.v3.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/GpxExtensionsv3.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.hardwareversion.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/HardwareVersionExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.historydatabase.v1.model.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/HistoryDatabasev1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.ifix.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/iFixExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.mobile.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/MobileExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.power.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/PowerExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.pressure.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/PressureExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.trackpoint.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/TrackPointExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.trackpoint.v2.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/TrackPointExtensionv2.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.trackstats.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/TrackStatsExtension.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.trip.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/TripExtensionsv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.tripmetadata.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/TripMetaDataExtensionsv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.useraccounts.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/UserAccountsExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.userprofile.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/UserProfileExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.userprofile.v2.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/UserProfileExtensionv2.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.userprofilepower.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/UserProfilePowerExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.viapointtransportationmode.v1.model.ext.ObjectFactory.class
                .getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/ViaPointTransportationModeExtensionsv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.video.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/VideoExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.waypoint.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/WaypointExtensionv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.weblink.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/WebLinkExtensionsv1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.workout.v1.model.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/WorkoutDatabasev1.xsd"),
        new JaxbContextData(
            org.bremersee.garmin.workout.v1.model.ext.ObjectFactory.class.getPackage(),
            "http://bremersee.github.io/xmlschemas/garmin/WorkoutExtensionv1.xsd")
    );
  }

}
