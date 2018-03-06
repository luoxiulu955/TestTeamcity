package TestBranch.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object TestBranch_TestV1 : GitVcsRoot({
    uuid = "66b5cd14-c2e5-4096-a003-f62f5fbc8b72"
    id = "TestBranch_TestV1"
    name = "test-v1"
    url = "https://github.com/luoxiulu955/TestTeamcity.git"
    branch = "refs/heads/test-v1"
    authMethod = password {
        userName = "luoxiulu955"
        password = "credentialsJSON:d276e0b0-57a2-4f31-a883-6e2ee2c7f56d"
    }
})
