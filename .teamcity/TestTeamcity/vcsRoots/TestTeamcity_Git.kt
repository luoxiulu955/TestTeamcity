package TestTeamcity.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object TestTeamcity_Git : GitVcsRoot({
    uuid = "0485a789-1349-4707-a7ce-5a674dc84c35"
    id = "TestTeamcity_Git"
    name = "Teamcity_testv1"
    url = "https://github.com/luoxiulu955/TestTeamcity.git"
    branch = "refs/heads/test-v1"
})
