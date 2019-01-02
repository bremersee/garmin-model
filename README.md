# garmin-model

Java model of Garmin GPX extensions (see src/main/xsd).

- [Documentation](https://nexus.bremersee.org/repository/maven-sites/garmin-model/index.html)

### Maven

```xml
<dependency>
  <groupId>org.bremersee</groupId>
  <artifactId>garmin-model</artifactId>
  <version>1.0.0-SNAPSHOT</version>
</dependency>
```

### Maven Repository

```xml
<repositories>
  <repository>
    <id>bremersee-releases</id>
    <name>Bremersee Releases</name>
    <url>https://nexus.bremersee.org/repository/maven-releases</url>
    <snapshots>
      <enabled>false</enabled>
    </snapshots>
  </repository>
  <repository>
    <id>bremersee-snapshots</id>
    <name>Bremersee Snapshots</name>
    <url>https://nexus.bremersee.org/repository/maven-snapshots</url>
    <snapshots>
      <enabled>true</enabled>
    </snapshots>
  </repository>
</repositories>
```
