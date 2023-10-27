pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
        maven("https://repo.spring.io/milestone/")
    }
}

rootProject.name = "spring-boot-issue-38065"

include(
    "service",
)
project(":service").name = "spring-boot-issue-38065"
