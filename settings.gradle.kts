pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "spring-boot-issue-38065"

include(
    "service",
)
project(":service").name = "spring-boot-issue-38065"
