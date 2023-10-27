plugins {
    application
    kotlin("jvm")
    id("org.springframework.boot") version "3.2.0-RC1"
    id("org.springframework.boot.aot") version "3.2.0-RC1"
}

repositories {
    mavenCentral()
    maven("https://repo.spring.io/milestone/")
}

springBoot {
    mainClass = "io.github.sineaggi.testapp.TestAppKt"
}

dependencies {
    implementation(platform("org.springframework.boot:spring-boot-dependencies:3.2.0-RC1"))

    implementation("org.springframework.boot", "spring-boot-starter")

    testImplementation("org.springframework.boot", "spring-boot-starter-test")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

kotlin {
    jvmToolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
    sourceSets.configureEach {
        languageSettings {
            languageVersion = "2.0"
        }
    }
}

tasks.test {
}
