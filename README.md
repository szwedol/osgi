# OSGi examples
This project contains OSGi examples used in the slides.
Before running the examples make sure you have sonatype repository in your maven configuration.
## Maven settings
A configuration can be found in settings.xml file. It adds sonatype repository.
```xml
<settings>
      <profiles>
        <profile>
          <id>OSGi</id>
          <activation>
            <activeByDefault>true</activeByDefault>
          </activation>
          <repositories>
            <repository>
              <id>osgi-archetype</id>
              <url>https://oss.sonatype.org/content/groups/osgi</url>
              <releases>
                <enabled>true</enabled>
                <checksumPolicy>fail</checksumPolicy>
              </releases>
              <snapshots>
                <enabled>true</enabled>
                <checksumPolicy>warn</checksumPolicy>
              </snapshots>
            </repository>
          </repositories>
        </profile>
      </profiles>
    </settings>
```
## Dynamic configuration
dynamic-config project contains an example where configuration is injected dynamically.
## Hello + Dictionary examples
dictionary contains a bundle that exposes HelloDictionary service providing hello message, while hello bundle contains a bundle that exposes a client of this service using Declarative Services.
