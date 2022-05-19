import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.6.5"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	id("org.jetbrains.kotlin.plugin.jpa") version "1.6.20"
	id("org.jetbrains.kotlin.plugin.noarg") version "1.6.20"
    id("org.flywaydb.flyway") version "8.5.10"
    kotlin("jvm") version "1.6.10"
	kotlin("plugin.spring") version "1.6.10"

}

group = "br.com.connectrescuedanimal"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlin:kotlin-noarg:1.6.20")
    implementation("org.flywaydb:flyway-core")
    implementation("org.springframework.boot:spring-boot-starter-cache:2.6.6")
    implementation("mysql:mysql-connector-java")
    implementation("io.mockk:mockk:1.12.2")
    implementation("org.assertj:assertj-core:3.22.0")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.6.6")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
