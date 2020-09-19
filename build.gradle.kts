import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask

plugins {
    java
    kotlin("jvm") version "1.4.10"
    id("com.github.ben-manes.versions") version "0.33.0"
}

version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter", "junit-jupiter-api", "5.7.0")
    testImplementation("org.junit.jupiter", "junit-jupiter-params", "5.7.0")
    testImplementation("com.google.truth", "truth", "1.0.1")

    testRuntimeOnly("org.junit.jupiter", "junit-jupiter-engine", "5.7.0")
}

java {
    sourceCompatibility = JavaVersion.VERSION_14
    targetCompatibility = JavaVersion.VERSION_14
}

tasks {
    test {
        useJUnitPlatform()
    }

    named("dependencyUpdates", DependencyUpdatesTask::class.java).configure {
        rejectVersionIf {
            isNonStable(candidate.version) && !isNonStable(currentVersion)
        }
    }
}

fun isNonStable(version: String): Boolean {
    val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { version.toUpperCase().contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    val isStable = stableKeyword || regex.matches(version)
    return isStable.not()
}
