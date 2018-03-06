package TestTeamcity

import TestTeamcity.buildTypes.*
import TestTeamcity.vcsRoots.*
import TestTeamcity.vcsRoots.TestTeamcity_HttpsGithubComLuoxiulu955TestTeamcityRefsHeadsMaster
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "3ad4904a-bb68-49ec-b8da-951b6182599d"
    id = "TestTeamcity"
    parentId = "_Root"
    name = "TestTeamcity"

    vcsRoot(TestTeamcity_HttpsGithubComLuoxiulu955TestTeamcityRefsHeadsMaster)
    vcsRoot(TestTeamcity_Branch1)
    vcsRoot(TestTeamcity_Git)

    buildType(TestTeamcity_Build)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = TestTeamcity_HttpsGithubComLuoxiulu955TestTeamcityRefsHeadsMaster.id
            showChanges = true
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
