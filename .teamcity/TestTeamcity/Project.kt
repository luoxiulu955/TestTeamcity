package TestTeamcity

import TestTeamcity.buildTypes.*
import TestTeamcity.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project

object Project : Project({
    uuid = "3ad4904a-bb68-49ec-b8da-951b6182599d"
    id = "TestTeamcity"
    parentId = "_Root"
    name = "TestTeamcity"

    vcsRoot(TestTeamcity_HttpsGithubComLuoxiulu955TestTeamcityRefsHeadsMaster)

    buildType(TestTeamcity_Build)
})
