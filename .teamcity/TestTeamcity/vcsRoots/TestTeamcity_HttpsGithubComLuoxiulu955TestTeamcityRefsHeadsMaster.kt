package TestTeamcity.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object TestTeamcity_HttpsGithubComLuoxiulu955TestTeamcityRefsHeadsMaster : GitVcsRoot({
    uuid = "b3f6e641-899f-4f27-bea3-dd0967939bb8"
    id = "TestTeamcity_HttpsGithubComLuoxiulu955TestTeamcityRefsHeadsMaster"
    name = "https://github.com/luoxiulu955/TestTeamcity#refs/heads/master"
    url = "https://github.com/luoxiulu955/TestTeamcity"
    branchSpec = "+:refs/pull/*/head"
    authMethod = password {
        userName = "luoxiulu955"
        password = "credentialsJSON:c1e97dd6-7ae8-4a80-9d4e-b0031923d25b"
    }
})