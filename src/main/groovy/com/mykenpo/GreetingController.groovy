package com.mykenpo

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {
   @RequestMapping("/hello/{val}")
    String hello(@PathVariable String val ) {
        return "Hello, ${val}!"
    }
}
