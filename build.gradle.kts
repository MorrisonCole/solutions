plugins {
    java
    kotlin("jvm") version "1.3.50"
}

version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
    testImplementation("org.junit.jupiter", "junit-jupiter-api", "5.5.2")
    testImplementation("com.google.truth", "truth", "1.0")

    testRuntimeOnly("org.junit.jupiter", "junit-jupiter-engine", "5.5.2")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.test {
    useJUnitPlatform()
}
