import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.5.5"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.5.31"
	kotlin("plugin.spring") version "1.5.31"
	kotlin("plugin.jpa") version "1.5.31"
}

group = "com.nilmani"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}
extra["springCloudVersion"] = "2020.0.0"

dependencies {
	//implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-security")
	// https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-oauth2
	//implementation("org.springframework.cloud:spring-cloud-starter-oauth2:2.2.1.RELEASE")
	// https://mvnrepository.com/artifact/org.webjars.bower/jquery
	implementation("org.webjars.bower:jquery:2.1.3")
	// https://mvnrepository.com/artifact/org.webjars/bootstrap
	implementation("org.webjars:bootstrap:3.2.0")
	// https://mvnrepository.com/artifact/org.webjars/webjars-locator-core
	implementation("org.webjars:webjars-locator-core:0.46")
	// https://mvnrepository.com/artifact/org.springframework.security.oauth.boot/spring-security-oauth2-autoconfigure
	implementation("org.springframework.security.oauth.boot:spring-security-oauth2-autoconfigure:2.5.2")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	//runtimeOnly("mysql:mysql-connector-java")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.security:spring-security-test")
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
