package _Root.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.vcs.GitVcsRoot

object TeamcItyTestRoot : GitVcsRoot({
    uuid = "d9c3328a-575a-44ac-a19c-796ba5dd0626"
    id = "TeamcItyTestRoot"
    name = "TeamcItyTestRoot"
    url = "https://github.com/luoxiulu955/TestTeamcity.git"
    authMethod = password {
        userName = "luoxiulu955"
        password = "credentialsJSON:c1e97dd6-7ae8-4a80-9d4e-b0031923d25b"
    }
})
