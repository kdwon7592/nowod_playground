package com.nowod.nowod_play_ground.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class HelloController {

    @GetMapping("/getMapping/{id}")
    fun getMappingTest(@PathVariable("id") test: String, model : Model): String {
        model["data"] = "getMapping"
        model["getTest"] = test
        return "restApiPlay/getMethod"
    }

    @PostMapping("/postMapping")
    fun postMappingTest(model : Model): String {
        return "restApiPlay/postMethod"
    }
}