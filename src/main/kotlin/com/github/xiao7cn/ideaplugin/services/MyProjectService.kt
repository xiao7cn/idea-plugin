package com.github.xiao7cn.ideaplugin.services

import com.intellij.openapi.project.Project
import com.github.xiao7cn.ideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
