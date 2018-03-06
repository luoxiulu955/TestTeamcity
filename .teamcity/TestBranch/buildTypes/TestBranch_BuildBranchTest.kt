package TestBranch.buildTypes

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2017_2.triggers.vcs

object TestBranch_BuildBranchTest : BuildType({
    uuid = "97fb4a65-985e-4663-a48d-1ec4780cc0e2"
    id = "TestBranch_BuildBranchTest"
    name = "build branch test"

    vcs {
        root(TestBranch.vcsRoots.TestBranch_TestV1)

    }

    steps {
        script {
            name = "Step1"
            scriptContent = """
                echo "branch test"
                a=1+1
                echo a
            """.trimIndent()
        }
    }

    triggers {
        vcs {
        }
    }
})
