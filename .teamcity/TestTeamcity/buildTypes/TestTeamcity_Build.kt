package TestTeamcity.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object TestTeamcity_Build : BuildType({
    uuid = "testteamcity-testv1-test"
    id = "TestTeamcity_Testv1_Build"
    name = "Testv1_Build"

    vcs {
        root(TestTeamcity.vcsRoots.TestTeamcity_Git)

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
