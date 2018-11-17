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
 * GPX jaxb context data provider.
 *
 * @author Christian Bremer
 */
public class GarminJaxbContextDataProvider implements JaxbContextDataProvider {

  public static final String ACCELERATION_EXT_V1_NS = "http://www.garmin.com/xmlschemas/AccelerationExtension/v1";

  public static final String ACTIVE_ITEM_EXT_V1_NS = "http://www.garmin.com/xmlschemas/ActiveItemExtensions/v1";

  public static final String ACTIVITY_EXT_V1_NS = "http://www.garmin.com/xmlschemas/ActivityExtension/v1";

  public static final String ACTIVITY_EXT_V2_NS = "http://www.garmin.com/xmlschemas/ActivityExtension/v1";

  public static final String ACTIVITY_GOALS_EXT_V1_NS = "http://www.garmin.com/xmlschemas/ActivityGoals/v1";

  public static final String ADVENTURES_EXT_V1_NS = "http://www.garmin.com/xmlschemas/AdventuresExtensions/v1";

  public static final String CALORIE_BURN_DATA_V1_NS = "http://www.garmin.com/xmlschemas/CalorieBurnData/v1";

  public static final String CLIENT_PROFILE_V1_NS = "http://www.garmin.com/xmlschemas/ClientProfile/v1";

  public static final String CONVERTER_PLUGIN_V1_NS = "http://www.garmin.com/xmlschemas/ConverterPlugin/v1";

  public static final String COURSE_EXT_V1_NS = "http://www.garmin.com/xmlschemas/CourseExtension/v1";

  public static final String CREATION_TIME_EXT_V1_NS = "http://www.garmin.com/xmlschemas/CreationTimeExtension/v1";

  public static final String DATA_TYPE_LOCATION_EXT_V1_NS = "http://www.garmin.com/xmlschemas/GarminDeviceExtensions/DataTypeLocation/v1";

  public static final String DEVICE_DOWNLOAD_V1_NS = "http://www.garmin.com/xmlschemas/DeviceDownload/v1";

  public static final String DIRECTORY_LISTING_V1_NS = "http://www.garmin.com/xmlschemas/DirectoryListing/v1";

  public static final String EULA_V1_NS = "http://www.garmin.com/xmlschemas/Eula/v1";

  public static final String FAT_CALORIE_EXT_V1_NS = "http://www.garmin.com/xmlschemas/FatCalories/v1";

  public static final String FITNESS_DEVICE_LIMITS_V1_NS = "http://www.garmin.com/xmlschemas/FitnessDeviceLimits/v1";

  public static final String FLIGHT_PLAN_V1_NS = "http://www8.garmin.com/xmlschemas/FlightPlan/v1";

  public static final String FORERUNNER_LOGBOOK_V1_NS = "http://www.garmin.com/xmlschemas/ForerunnerLogbook";

  public static final String GARMIN_DEVICE_EXT_V1_NS = "http://www.garmin.com/xmlschemas/GarminDeviceExtensions/v1";

  public static final String GARMIN_DEVICE_EXT_V2_NS = "http://www.garmin.com/xmlschemas/GarminDeviceExtensions/v2";

  public static final String GARMIN_DEVICE_V1_NS = "http://www.garmin.com/xmlschemas/GarminDevice/v1";

  public static final String GARMIN_DEVICE_V2_NS = "http://www.garmin.com/xmlschemas/GarminDevice/v2";

  public static final String GARMIN_MOBILE_APP_PATH_EXT_V1_NS = "http://www.garmin.com/xmlschemas/GarminMobileAppPathExtension/v1";

  public static final String GARMIN_OEM_DEVICE_EXT_V1_NS = "http://www.garmin.com/xmlschemas/GarminOEMDeviceExtensions/v1";

  public static final String GARMIN_TEXT_TRANSLATION_V1_NS = "http://www.garmin.com/xmlschemas/GarminTextTranslation/v1";

  public static final String GGZ_NS = "http://www.garmin.com/xmlschemas/ggz/1/0";

  public static final String GPX_EXT_V1_NS = "http://www.garmin.com/xmlschemas/GpxExtensions/v1";

  public static final String GPX_EXT_V2_NS = "http://www.garmin.com/xmlschemas/GpxExtensions/v2";

  public static final String GPX_EXT_V3_NS = "http://www.garmin.com/xmlschemas/GpxExtensions/v3";

  public static final String HARDWARE_VERSION_EXT_V1_NS = "http://www.garmin.com/xmlschemas/HardwareVersionExtension/v1";

  public static final String HISTORY_DATABASE_V1_NS = "http://www.garmin.com/xmlschemas/HistoryDatabase/v1";

  public static final String IFIX_EXT_V1_NS = "http://www.garmin.com/xmlschemas/iFixExtensions/v1";

  public static final String MOBILE_EXT_V1_NS = "http://www.garmin.com/xmlschemas/MobileExtensions/v1";

  public static final String POWER_EXT_V1_NS = "http://www.garmin.com/xmlschemas/PowerExtension/v1";

  public static final String PRESSURE_EXT_V1_NS = "http://www.garmin.com/xmlschemas/PressureExtension/v1";

  public static final String TRACK_POINT_EXT_V1_NS = "http://www.garmin.com/xmlschemas/TrackPointExtension/v1";

  public static final String TRACK_POINT_EXT_V2_NS = "http://www.garmin.com/xmlschemas/TrackPointExtension/v2";

  public static final String TRACK_STATS_EXT_V1_NS = "http://www.garmin.com/xmlschemas/TrackStatsExtension/v1";

  public static final String TRIP_EXT_V1_NS = "http://www.garmin.com/xmlschemas/TripExtensions/v1";

  public static final String TRIP_META_DATA_EXT_V1_NS = "http://www.garmin.com/xmlschemas/TripMetaDataExtensions/v1";

  public static final String USER_ACCOUNTS_EXT_V1_NS = "http://www.garmin.com/xmlschemas/UserAccounts/v1";

  public static final String USER_PROFILE_EXT_V1_NS = "http://www.garmin.com/xmlschemas/UserProfile/v1";

  public static final String USER_PROFILE_EXT_V2_NS = "http://www.garmin.com/xmlschemas/UserProfile/v2";

  public static final String USER_PROFILE_POWER_EXT_V1_NS = "http://www.garmin.com/xmlschemas/ProfileExtension/v1";

  public static final String VIA_POINT_TRANSPORTATION_MODEL_EXT_V1_NS = "http://www.garmin.com/xmlschemas/ViaPointTransportationModeExtensions/v1";

  public static final String VIDEO_EXT_V1_NS = "http://www.garmin.com/xmlschemas/VideoExtension/v1";

  public static final String WAYPOINT_EXT_V1_NS = "http://www.garmin.com/xmlschemas/WaypointExtension/v1";

  public static final String WEB_LINK_EXT_V1_NS = "http://www.garmin.com/xmlschemas/WebLinkExtensions/v1";

  public static final String WORKOUT_DATABASE_V1_NS = "http://www.garmin.com/xmlschemas/WorkoutDatabase/v1";

  public static final String WORKOUT_EXT_V1_NS = "http://www.garmin.com/xmlschemas/WorkoutExtension/v1";

  @Override
  public Collection<JaxbContextData> getJaxbContextData() {
    return Arrays.asList(
        new JaxbContextData(
            ACCELERATION_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/AccelerationExtensionv1.xsd",
            org.bremersee.garmin.acceleration.v1.model.ext.ObjectFactory.class.getPackage()
                .getName()),
        new JaxbContextData(
            ACTIVE_ITEM_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/ActiveItemExtensionv1.xsd",
            org.bremersee.garmin.activeitem.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            ACTIVITY_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/ActivityExtensionv1.xsd",
            org.bremersee.garmin.activity.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            ACTIVITY_EXT_V2_NS,
            "http://bremersee.github.io/xmlschemas/garmin/ActivityExtensionv2.xsd",
            org.bremersee.garmin.activity.v2.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            ACTIVITY_GOALS_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/ActivityGoalsExtensionv1.xsd",
            org.bremersee.garmin.activitygoals.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            ADVENTURES_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/AdventuresExtensionv1.xsd",
            org.bremersee.garmin.adventures.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            CALORIE_BURN_DATA_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/CalorieBurnDataV1.xsd",
            org.bremersee.garmin.calorieburndata.v1.model.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            CLIENT_PROFILE_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/clientprofilev1.xsd",
            org.bremersee.garmin.clientprofile.v1.model.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            CONVERTER_PLUGIN_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/ConverterPluginv1.xsd",
            org.bremersee.garmin.converterplugin.v1.model.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            COURSE_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/CourseExtensionv1.xsd",
            org.bremersee.garmin.course.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            CREATION_TIME_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/CreationTimeExtensionv1.xsd",
            org.bremersee.garmin.creationtime.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            DATA_TYPE_LOCATION_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/DataTypeLocationExtension1.xsd",
            org.bremersee.garmin.datatypelocation.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            DEVICE_DOWNLOAD_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/DeviceDownloadV1.xsd",
            org.bremersee.garmin.devicedownload.v1.model.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            DIRECTORY_LISTING_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/DirectoryListingV1.xsd",
            org.bremersee.garmin.directorylisting.v1.model.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            EULA_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/Eulav1.xsd",
            org.bremersee.garmin.eula.v1.model.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            FAT_CALORIE_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/fatcalorieextensionv1.xsd",
            org.bremersee.garmin.fatcalorie.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            FITNESS_DEVICE_LIMITS_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/FitnessDeviceLimitsv1.xsd",
            org.bremersee.garmin.fitnessdevicelimits.v1.model.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            FLIGHT_PLAN_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/FlightPlanv1.xsd",
            org.bremersee.garmin.flightplan.v1.model.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            FORERUNNER_LOGBOOK_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/ForerunnerLogbookv1.xsd",
            org.bremersee.garmin.forerunnerlogbook.v1.model.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            GARMIN_DEVICE_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/GarminDeviceExtensionv1.xsd",
            org.bremersee.garmin.garmindevice.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            GARMIN_DEVICE_EXT_V2_NS,
            "http://bremersee.github.io/xmlschemas/garmin/GarminDeviceExtensionv2.xsd",
            org.bremersee.garmin.garmindevice.v2.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            GARMIN_DEVICE_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/GarminDevicev1.xsd",
            org.bremersee.garmin.garmindevice.v1.model.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            GARMIN_DEVICE_V2_NS,
            "http://bremersee.github.io/xmlschemas/garmin/GarminDevicev2.xsd",
            org.bremersee.garmin.garmindevice.v2.model.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            GARMIN_MOBILE_APP_PATH_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/GarminMobileAppPathExtensionv1.xsd",
            org.bremersee.garmin.garminmobileapppath.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            GARMIN_OEM_DEVICE_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/GarminOEMDeviceExtensionv1.xsd",
            org.bremersee.garmin.garminoemdevice.v1.model.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            GARMIN_TEXT_TRANSLATION_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/GarminTextTranslationv1.xsd",
            org.bremersee.garmin.garmintexttranslation.v1.model.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            GGZ_NS,
            "http://bremersee.github.io/xmlschemas/garmin/ggz.xsd",
            org.bremersee.garmin.ggz.model.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            GPX_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/GpxExtensionsv1.xsd",
            org.bremersee.garmin.gpx.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            GPX_EXT_V2_NS,
            "http://bremersee.github.io/xmlschemas/garmin/GpxExtensionsv2.xsd",
            org.bremersee.garmin.gpx.v2.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            GPX_EXT_V3_NS,
            "http://bremersee.github.io/xmlschemas/garmin/GpxExtensionsv3.xsd",
            org.bremersee.garmin.gpx.v3.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            HARDWARE_VERSION_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/HardwareVersionExtensionv1.xsd",
            org.bremersee.garmin.hardwareversion.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            HISTORY_DATABASE_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/HistoryDatabasev1.xsd",
            org.bremersee.garmin.historydatabase.v1.model.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            IFIX_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/iFixExtensionv1.xsd",
            org.bremersee.garmin.ifix.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            MOBILE_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/MobileExtensionv1.xsd",
            org.bremersee.garmin.mobile.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            POWER_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/PowerExtensionv1.xsd",
            org.bremersee.garmin.power.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            PRESSURE_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/PressureExtensionv1.xsd",
            org.bremersee.garmin.pressure.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            TRACK_POINT_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/TrackPointExtensionv1.xsd",
            org.bremersee.garmin.trackpoint.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            TRACK_POINT_EXT_V2_NS,
            "http://bremersee.github.io/xmlschemas/garmin/TrackPointExtensionv2.xsd",
            org.bremersee.garmin.trackpoint.v2.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            TRACK_STATS_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/TrackStatsExtension.xsd",
            org.bremersee.garmin.trackstats.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            TRIP_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/TripExtensionsv1.xsd",
            org.bremersee.garmin.trip.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            TRIP_META_DATA_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/TripMetaDataExtensionsv1.xsd",
            org.bremersee.garmin.tripmetadata.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            USER_ACCOUNTS_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/UserAccountsExtensionv1.xsd",
            org.bremersee.garmin.useraccounts.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            USER_PROFILE_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/UserProfileExtensionv1.xsd",
            org.bremersee.garmin.userprofile.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            USER_PROFILE_EXT_V2_NS,
            "http://bremersee.github.io/xmlschemas/garmin/UserProfileExtensionv2.xsd",
            org.bremersee.garmin.userprofile.v2.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            USER_PROFILE_POWER_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/UserProfilePowerExtensionv1.xsd",
            org.bremersee.garmin.userprofilepower.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            VIA_POINT_TRANSPORTATION_MODEL_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/ViaPointTransportationModeExtensionsv1.xsd",
            org.bremersee.garmin.viapointtransportationmode.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            VIDEO_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/VideoExtensionv1.xsd",
            org.bremersee.garmin.video.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            WAYPOINT_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/WaypointExtensionv1.xsd",
            org.bremersee.garmin.waypoint.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            WEB_LINK_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/WebLinkExtensionsv1.xsd",
            org.bremersee.garmin.weblink.v1.model.ext.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            WORKOUT_DATABASE_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/WorkoutDatabasev1.xsd",
            org.bremersee.garmin.workout.v1.model.ObjectFactory.class.getPackage().getName()),
        new JaxbContextData(
            WORKOUT_EXT_V1_NS,
            "http://bremersee.github.io/xmlschemas/garmin/WorkoutExtensionv1.xsd",
            org.bremersee.garmin.workout.v1.model.ext.ObjectFactory.class.getPackage().getName())
    );
  }

}
