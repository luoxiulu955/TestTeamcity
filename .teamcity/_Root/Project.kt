package _Root

import _Root.vcsRoots.*
import _Root.vcsRoots.TeamcItyTestRoot
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "6d75b3c4-22e8-4e94-bee9-11a94b782bf6"
    id = "_Root"
    name = "<Root project>"
    description = "Contains all other projects"

    vcsRoot(TeamcItyTestRoot)

    features {
        feature {
            id = "PROJECT_EXT_1"
            type = "ReportTab"
            param("startPage", "coverage.zip!index.html")
            param("title", "Code Coverage")
            param("type", "BuildReportTab")
        }
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = TeamcItyTestRoot.id
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }

    cleanup {
        preventDependencyCleanup = false
    }
})
