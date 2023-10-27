plugins {
    application
    kotlin("jvm")
    id("org.springframework.boot") version "3.1.5"
    id("org.springframework.boot.aot") version "3.1.5"
}

repositories {
    mavenCentral()
}

springBoot {
    mainClass = "io.github.sineaggi.testapp.TestAppKt"
}

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:3.1.5"))

    implementation("org.springframework.boot", "spring-boot-starter")

    testImplementation("org.springframework.boot", "spring-boot-starter-test")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

kotlin {
    jvmToolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
    sourceSets.configureEach {
        languageSettings {
            languageVersion = "2.0"
        }
    }
}

tasks.test {
}
