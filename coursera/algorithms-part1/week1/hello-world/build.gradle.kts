plugins {
    java
}

version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation(files("lib/algs4.jar"))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.register<Zip>("zip") {
    archiveFileName.set("hello-world.zip")
    destinationDirectory.set(layout.buildDirectory.dir("dist"))
    from(sourceSets.main.get().java.sourceDirectories, sourceSets.main.get().java.classesDirectory)
}
