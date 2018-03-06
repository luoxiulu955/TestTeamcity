package TestBranch

import TestBranch.buildTypes.*
import TestBranch.vcsRoots.*
import TestBranch.vcsRoots.TestBranch_TestV1
import jetbrains.buildServer.configs.kotlin.v2017_2.*
import jetbrains.buildServer.configs.kotlin.v2017_2.Project
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2017_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "883e1e97-b750-4bad-8734-e1b16a5808b8"
    id = "TestBranch"
    parentId = "_Root"
    name = "TestBranch"

    vcsRoot(TestBranch_TestV1)

    buildType(TestBranch_BuildBranchTest)

    features {
        versionedSettings {
            id = "PROJECT_EXT_3"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.PREFER_SETTINGS_FROM_VCS
            rootExtId = TestBranch_TestV1.id
            showChanges = true
            settingsFormat = VersionedSettings.Format.KOTLIN
            storeSecureParamsOutsideOfVcs = true
        }
    }
})
