plugins {
    id("java")
    id("maven-publish")
}

group = "eu.asangrarin"
version = "1.4"

repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/groups/public/")
    //MMOItems, MythicLibs
    maven("https://nexus.phoenixdevt.fr/repository/maven-public/")
    //SpigotAPI
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    //PlaceholderAPI
    maven("https://repo.extendedclip.com/content/repositories/placeholderapi/")
}

dependencies {
    compileOnly("me.clip:placeholderapi:2.11.6")
    compileOnly("io.lumine:MythicLib-dist:1.6.2-SNAPSHOT")
    compileOnly("net.Indyuce:MMOItems-API:6.9.5-SNAPSHOT")
    compileOnly("org.spigotmc:spigot-api:1.21.1-R0.1-SNAPSHOT")
}

java.sourceCompatibility = JavaVersion.VERSION_21
java.targetCompatibility = JavaVersion.VERSION_21

tasks {
    compileJava {
        options.encoding = "UTF-8"
    }
    processResources {
        val props = mutableMapOf(Pair("version", rootProject.version.toString()))
        filesMatching("plugin.yml") {
            expand(props)
        }
    }
}

