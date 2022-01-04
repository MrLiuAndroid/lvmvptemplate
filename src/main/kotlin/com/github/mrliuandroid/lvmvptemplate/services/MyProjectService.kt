package com.github.mrliuandroid.lvmvptemplate.services

import com.intellij.openapi.project.Project
import com.github.mrliuandroid.lvmvptemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
