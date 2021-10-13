package com.nilmani.facebooklogin.controller


import org.springframework.security.oauth2.provider.OAuth2Authentication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.security.Principal



@RestController
@RequestMapping("/user")
class UserController {
//    @GetMapping
//    fun getUser(user:Principal):Principal{
//        return user
//    }

//    @GetMapping("/")
//    fun home(principal: Principal):String{
//        val authUserDetails : OAuth2Authentication = (principal as OAuth2Authentication)
//            .userAuthentication
//            .details as OAuth2Authentication
//        val userName = authUserDetails.name
//        return "Hey $userName,Welcome"
//
//    }
    /** this function return userName if login success*/
    @GetMapping("/")
    fun getUSer(principal: Principal): String? {
        val authDetails = (principal as OAuth2Authentication)
            .userAuthentication
            .details as Map<*, *>
        val userName = authDetails["name"] as String?
        return "Hey $userName, Welcome to Elaunch solution"
    }

}




