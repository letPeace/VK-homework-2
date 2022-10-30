plugins {
    id("java")
}

group = "ru.girmank.vk"
version = "1.0-SNAPSHOT"

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}