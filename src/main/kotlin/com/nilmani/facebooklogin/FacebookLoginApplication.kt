package com.nilmani.facebooklogin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso
import org.springframework.boot.runApplication

@SpringBootApplication
class FacebookLoginApplication

fun main(args: Array<String>) {
	runApplication<FacebookLoginApplication>(*args)
}
