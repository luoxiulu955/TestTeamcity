package TestTeamcity.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object TestTeamcity_Branch1 : GitVcsRoot({
    uuid = "0ac794d3-ee34-4d84-be25-01ddf72f1563"
    id = "TestTeamcity_Branch1"
    name = "branch1"
    url = "https://github.com/luoxiulu955/TestTeamcity.git"
    branch = "refs/heads/branch1"
})
