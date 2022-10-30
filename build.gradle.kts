plugins {
    id("java")
}

group = "ru.girmank.vk"
version = "1.0-SNAPSHOT"

allprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation("com.intellij:annotations:12.0")
        implementation("com.google.inject:guice:5.0.1")
        implementation("log4j:log4j:1.2.17")
    }
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}