plugins {
    id("java")
    id( "com.github.ben-manes.versions") version "0.51.0"
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks {
    javadoc {
        options.encoding = "UTF-8"
    }
    compileJava {
        options.encoding = "UTF-8"
        options.compilerArgs.add("--enable-preview")
    }
    compileTestJava {
        options.encoding = "UTF-8"
        options.compilerArgs.add("--enable-preview")
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.google.guava:guava:33.4.0-jre")

    testImplementation("org.junit.jupiter:junit-jupiter:5.11.4")
    testImplementation("org.assertj:assertj-core:3.27.2")
    testImplementation("org.mockito:mockito-core:5.15.2")
    // testImplementation("org.mockito:mockito-junit-jupiter:2.+")
}

tasks.test {
    useJUnitPlatform()
    jvmArgs("--enable-preview")
    testLogging {
        events("passed", "skipped", "failed")
    }
}
