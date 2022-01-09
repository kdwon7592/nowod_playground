package com.nowod.nowod_play_ground.useTestSite

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping

/*
 * 성격검사, 심리검사 등 각종 테스트를 만들기 위한 사이트
 * @Author : dowon_kim
 * @version : 1.0.0
 * @date : 2022-01-09
 */

@Controller
class UseTestSiteController {

    @GetMapping("useTest/main")
    fun main(model : Model): String {
        return "useTestSite/useIndex"
    }

    @GetMapping("useTest/useTestFirst")
    fun useTestFirst(model : Model): String {
        return "useTestSite/useIndex"
    }

    @GetMapping("useTest/getMapping/{id}")
    fun getMappingTest(@PathVariable("id") test: String, model : Model): String {
        model["data"] = "getMapping"
        model["getTest"] = test
        return "useTestSite/getMethod"
    }

    @PostMapping("useTest/postMapping")
    fun postMappingTest(model : Model): String {
        return "useTestSite/postMethod"
    }
}