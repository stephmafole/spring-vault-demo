package com.stephen.demos.springvault

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import java.beans.ConstructorProperties

//@Component
@ConfigurationProperties(prefix = "demo")
class Cred(
    var username: String = "",
    var password: String = ""
)
