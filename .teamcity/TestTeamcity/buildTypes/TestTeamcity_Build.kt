package TestTeamcity.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object TestTeamcity_Build : BuildType({
    uuid = "ea1472f1-7fd7-4740-89f5-f0804de00076"
    id = "TestTeamcity_Build"
    name = "Build"

    vcs {
        root(TestTeamcity.vcsRoots.TestTeamcity_HttpsGithubComLuoxiulu955TestTeamcityRefsHeadsMaster)

    }

    steps {
        script {
            name = "test1"
            scriptContent = """echo "test1""""
        }
        script {
            name = "Build1"
            scriptContent = """echo "build1""""
        }
        script {
            name = "Build2"
            scriptContent = """echo "build2""""
        }
        script {
            name = "branch test-v1 test1 "
            scriptContent = """echo "test-v1" && makdir test-v1"""
        }
    }

    triggers {
        vcs {
        }
    }
})
