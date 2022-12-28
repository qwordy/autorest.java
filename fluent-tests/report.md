# Java Codegen Report
Generated at 2022-12-28T19:46:48.134426
## Success
<details>
<summary>RP count: 213</summary>

- EnterpriseKnowledgeGraph
- addons
- adp
- advisor
- agrifood
- alertsmanagement
- analysisservices
- apimanagement
- app
- appcomplianceautomation
- appconfiguration
- applicationinsights
- appplatform
- attestation
- automanage
- azure-kusto
- azureactivedirectory
- azurearcdata
- azuredata
- azurestack
- baremetalinfrastructure
- batch
- billing
- billingbenefits
- blockchain
- blueprint
- botservice
- cdn
- changeanalysis
- chaos
- cloudshell
- cognitiveservices
- commerce
- communication
- compute
- confidentialledger
- confluent
- connectedvmware
- consumption
- containerinstance
- containerregistry
- containerservice
- cosmos-db
- cost-management
- cpim
- customer-insights
- customerlockbox
- customproviders
- dashboard
- databox
- databoxedge
- databricks
- datacatalog
- datadog
- datafactory
- datalake-analytics
- datalake-store
- datamigration
- dataprotection
- datashare
- deploymentmanager
- desktopvirtualization
- devcenter
- developerhub
- deviceprovisioningservices
- deviceupdate
- devops
- devtestlabs
- dfp
- digitaltwins
- dnc
- dns
- dnsresolver
- domainservices
- dynatrace
- edgeorder
- edgeorderpartner
- elastic
- elasticsan
- engagementfabric
- eventgrid
- eventhub
- extendedlocation
- fluidrelay
- frontdoor
- guestconfiguration
- hanaonazure
- hardwaresecuritymodules
- hdinsight
- healthbot
- healthcareapis
- hybridaks
- hybridcompute
- hybridconnectivity
- hybriddatamanager
- hybridkubernetes
- hybridnetwork
- imagebuilder
- iotcentral
- iothub
- iotsecurity
- keyvault
- kubernetesconfiguration
- labservices
- liftrqumulo
- loadtestservice
- logic
- logz
- m365securityandcompliance
- machinelearningcompute
- machinelearningexperimentation
- machinelearningservices
- maintenance
- managednetwork
- managedservices
- managementgroups
- managementpartner
- maps
- mariadb
- marketplace
- marketplacecatalog
- marketplacenotifications
- marketplaceordering
- mediaservices
- migrate
- mixedreality
- mobilenetwork
- monitor
- msi
- mysql
- netapp
- network
- networkfunction
- nginx
- notificationhubs
- oep
- operationalinsights
- operationsmanagement
- peering
- policyinsights
- portal
- postgresql
- postgresqlhsc
- powerbidedicated
- powerbiembedded
- powerbiprivatelinks
- powerplatform
- privatedns
- providerhub
- purview
- quantum
- quota
- recommendationsservice
- recoveryservices
- recoveryservicesbackup
- recoveryservicessiterecovery
- redhatopenshift
- redis
- redisenterprise
- relay
- reservations
- resourceconnector
- resourcegraph
- resourcehealth
- resourcemover
- resources
- riskiq
- saas
- scheduler
- scvmm
- search
- security
- securityandcompliance
- securitydevops
- securityinsights
- serialconsole
- servicebus
- servicefabric
- servicefabricmanagedclusters
- servicefabricmesh
- servicelinker
- servicenetworking
- signalr
- softwareplan
- solutions
- sqlvirtualmachine
- storSimple1200Series
- storage
- storagecache
- storageimportexport
- storagemover
- storagepool
- storagesync
- storsimple8000series
- streamanalytics
- subscription
- support
- synapse
- syntex
- testbase
- timeseriesinsights
- trafficmanager
- vi
- videoanalyzer
- vmware
- vmwarecloudsimple
- voiceservices
- web
- webpubsub
- windowsesu
- windowsiot
- workloadmonitor
- workloads
</details>

## Failure at Codegen
- automation

## Failure at Build
- authorization
- azurestackhci
- education
- iotspaces
- orbital
- sql
- visualstudio

## Logs
<details>
<summary>adhybridhealthservice</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.6.2; node: v14.21.1]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
info    | AutoRest core version selected from configuration: 3.4.5.
   Loading AutoRest core      '/home/runner/.autorest/@autorestcore@3.4.5/nodemodules/@autorest/core/dist' (3.4.5)
INFORMATION: > Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
INFORMATION: > Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
INFORMATION: > Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentnamer)
INFORMATION: > Loading AutoRest extension '@autorest/modelerfour' (4.18.1->4.18.1)
WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.

```
**stderr**
```
FATAL: Error: Name is empty!
  Error: Plugin pre-namer reported failure.

```
</details>

<details>
<summary>authorization</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] ---< com.azure.resourcemanager:azure-resourcemanager-authorization >----
[INFO] Building Microsoft Azure SDK for Authorization Management 1.0.0-beta.1
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-authorization ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-authorization ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 249 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewHistoryScheduleSettings.java:[103,44] method type() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewHistoryScheduleSettings
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[291,19] method id() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[300,19] method displayName() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[345,19] method principalId() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[354,42] method principalType() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[363,19] method principalName() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[372,19] method userPrincipalName() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewScheduleDefinitionProperties.java:[689,43] method principalType() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewScheduleDefinitionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewRecurrenceSettings.java:[103,44] method type() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewRecurrenceSettings
[INFO] 9 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.728 s
[INFO] Finished at: 2022-12-28T18:24:44Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-authorization: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewHistoryScheduleSettings.java:[103,44] method type() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewHistoryScheduleSettings
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[291,19] method id() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[300,19] method displayName() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[345,19] method principalId() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[354,42] method principalType() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[363,19] method principalName() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[372,19] method userPrincipalName() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewScheduleDefinitionProperties.java:[689,43] method principalType() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewScheduleDefinitionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewRecurrenceSettings.java:[103,44] method type() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewRecurrenceSettings
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
**stderr**
```

```
</details>

<details>
<summary>automation</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.6.2; node: v14.21.1]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
info    | AutoRest core version selected from configuration: 3.4.5.
   Loading AutoRest core      '/home/runner/.autorest/@autorestcore@3.4.5/nodemodules/@autorest/core/dist' (3.4.5)
INFORMATION: > Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
INFORMATION: > Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
INFORMATION: > Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentnamer)
INFORMATION: > Loading AutoRest extension '@autorest/modelerfour' (4.18.1->4.18.1)
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/dscNode.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/dscCompilationJob.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/dscNodeCounts.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/preview/2020-01-13-preview/watcher.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2019-06-01/softwareUpdateConfiguration.json:15:2
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > SUCScheduleProperties > properties > frequency)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2019-06-01/softwareUpdateConfiguration.json:345:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > softwareUpdateConfigurationCollectionItemProperties > properties > frequency)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2019-06-01/softwareUpdateConfiguration.json:480:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > TargetProperties > properties > azureQueries > items)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2019-06-01/softwareUpdateConfiguration.json:525:6
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > TargetProperties > properties > nonAzureQueries > items)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2019-06-01/softwareUpdateConfiguration.json:534:6
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > AzureQueryProperties > properties > tagSettings)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2019-06-01/softwareUpdateConfiguration.json:578:5
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2015-10-31/webhook.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-01-31/deletedAutomationAccount.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/account.json:11:2
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > AutomationAccountCreateOrUpdateParameters > properties > identity)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/account.json:176:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > AutomationAccountUpdateParameters > properties > identity)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/account.json:417:5
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/certificate.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/connection.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/connectionType.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/credential.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/dscConfiguration.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/dscNodeConfiguration.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/hybridRunbookWorker.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/hybridRunbookWorkerGroup.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/job.json:11:2
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > JobListResultV2 > properties > value > items)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/job.json:139:6
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > JobCollectionItemProperties > properties > runbook)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/job.json:292:5
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/jobSchedule.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/linkedWorkspace.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/module.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/operations.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/python2package.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/python3package.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/runbook.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/schedule.json:11:2
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > ScheduleCreateOrUpdateProperties > properties > frequency)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/schedule.json:115:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > ScheduleProperties > properties > frequency)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/schedule.json:252:5
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/softwareUpdateConfigurationMachineRun.json:15:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/softwareUpdateConfigurationRun.json:15:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/sourceControl.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/sourceControlSyncJob.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/sourceControlSyncJobStreams.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/variable.json:11:2
WARNING: Semantic violation: Extension 'x-ms-code-generation-settings' is not supported in Autorest V3. It will just be ignored. (info > x-ms-code-generation-settings)
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2015-10-31/schedule.json:11:2
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > ScheduleCreateOrUpdateProperties > properties > frequency)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2015-10-31/schedule.json:114:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > ScheduleProperties > properties > frequency)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2015-10-31/schedule.json:251:5
WARNING (PreCheck/SchemaMissingType): The schema 'DscNodeReportListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscReportResourceNavigation' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscMetaConfiguration' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscNodeReport' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscReportResource' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscReportError' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AgentRegistration' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AgentRegistrationKeys' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscNode' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscNodeProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscNodeExtensionHandlerAssociationProperty' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscNodeConfigurationAssociationProperty' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AgentRegistrationRegenerateKeyParameter' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscNodeUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscNodeUpdateParameters-properties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscNodeListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscCompilationJob' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscCompilationJobCreateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscCompilationJobProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscCompilationJobListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscCompilationJobCreateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscConfigurationAssociationProperty' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'JobStream' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'JobStreamListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'JobStreamProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'NodeCounts' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'NodeCount' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'NodeCountProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Watcher' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'WatcherProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'WatcherUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'WatcherUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'WatcherListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'softwareUpdateConfigurationProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SUCScheduleProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AdvancedSchedule' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AdvancedScheduleMonthlyOccurrence' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'softwareUpdateConfigurationListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'softwareUpdateConfigurationCollectionItemProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'WebhookProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Webhook' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'WebhookListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'WebhookUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'WebhookUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'RunbookAssociationProperty' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'WebhookCreateOrUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'WebhookCreateOrUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AutomationAccount' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AutomationAccountProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Sku' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AutomationAccountCreateOrUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AutomationAccountCreateOrUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AutomationAccountListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Statistics' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'StatisticsListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Usage' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'UsageCounterName' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'UsageListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Key' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'KeyListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AutomationAccountUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AutomationAccountUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Identity' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'EncryptionProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'EncryptionProperties-identity' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'CertificateCreateOrUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'CertificateCreateOrUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'CertificateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Certificate' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'CertificateListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'CertificateUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'CertificateUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ConnectionCreateOrUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ConnectionCreateOrUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ConnectionProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Connection' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ConnectionListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ConnectionUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ConnectionUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ConnectionTypeAssociationProperty' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'FieldDefinition' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ConnectionTypeProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ConnectionType' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ConnectionTypeListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ConnectionTypeCreateOrUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ConnectionTypeCreateOrUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'CredentialCreateOrUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'CredentialCreateOrUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'CredentialProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Credential' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'CredentialListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'CredentialUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'CredentialUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ContentSource' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscConfigurationCreateOrUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscConfigurationListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscConfigurationCreateOrUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscConfigurationParameter' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscConfigurationUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscConfigurationProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ContentSource' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscNodeConfigurationProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscNodeConfigurationListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscNodeExtensionHandlerAssociationProperty' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscNodeConfigurationCreateOrUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscNodeConfigurationCreateOrUpdateParametersProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DscConfigurationAssociationProperty' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'HybridRunbookWorker' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'RunAsCredentialAssociationProperty' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'HybridRunbookWorkerGroup' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'HybridRunbookWorkerGroupsListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'JobStream' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'JobStreamProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'JobStreamListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Job' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'JobListResultV2' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'JobProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'RunbookAssociationProperty' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'JobCreateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'JobCollectionItemProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'JobCreateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'JobScheduleListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'JobSchedule' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ScheduleAssociationProperty' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'RunbookAssociationProperty' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'JobScheduleProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'JobScheduleCreateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'JobScheduleCreateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'LinkedWorkspace' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ModuleCreateOrUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ModuleCreateOrUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ModuleUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ModuleUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'OperationListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Operation-display' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AdvancedSchedule' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AdvancedScheduleMonthlyOccurrence' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ScheduleCreateOrUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ScheduleCreateOrUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Schedule' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ScheduleProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ScheduleUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ScheduleUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ScheduleListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'softwareUpdateConfigurationMachineRunListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'updateConfigurationMachineRunProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'softwareUpdateConfigurationRunProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'softwareUpdateConfigurationRunListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SourceControlListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SourceControlUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SourceControlUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SourceControl' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SourceControlProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SourceControlCreateOrUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SourceControlCreateOrUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SourceControlSecurityTokenProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SourceControlSyncJobListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SourceControlSyncJobCreateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SourceControlSyncJobCreateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SourceControlSyncJobById' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SourceControlSyncJobByIdProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SourceControlSyncJob' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SourceControlSyncJobProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SourceControlSyncJobStreamsListBySyncJob' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SourceControlSyncJobStream' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SourceControlSyncJobStreamProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SourceControlSyncJobStreamById' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SourceControlSyncJobStreamByIdProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'VariableCreateOrUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'VariableCreateOrUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Variable' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'VariableListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'VariableUpdateParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'VariableUpdateProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'VariableProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.
WARNING (Modeler/MissingType): The schema 'ScheduleCreateOrUpdateProperties-interval' has no type or format information whatsoever. Location:
   file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/schedule.json#/components/schemas/ScheduleCreateOrUpdateProperties-interval
WARNING (Modeler/MissingType): The schema 'ScheduleProperties-interval' has no type or format information whatsoever. Location:
   file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/automation/resource-manager/Microsoft.Automation/stable/2022-08-08/schedule.json#/components/schemas/ScheduleProperties-interval
INFORMATION (FluentNamer): Load fluent settings
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, string, remove-model : null
INFORMATION (FluentJavaSettings): Option, string, preserve-model : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, generate-samples : true
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentNamer): Transform code model
INFORMATION (FluentTransformer): Rename ungrouped operation group to 'ResourceProvider'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'userName' to 'username'
INFORMATION (SchemaNameNormalization): Override default name, from 'userName' to 'username'
INFORMATION (SchemaNameNormalization): Override default name, from 'userName' to 'username'
INFORMATION (NamingConflictResolver): Rename operation group from 'Statistics' to 'StatisticsOperation'
INFORMATION (OperationNameNormalization): Rename operation from 'get' to 'getByResourceGroup', in operation group 'AutomationAccount'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'ProxyResource'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'Watcher'
INFORMATION (ResourceTypeNormalization): Add parent ProxyResource, for 'SoftwareUpdateConfiguration'
INFORMATION (ResourceTypeNormalization): Change parent from 'TrackedResource' to 'Resource', for 'AutomationAccount'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'TrackedResource'
INFORMATION (ResourceTypeNormalization): Change parent from 'TrackedResource' to 'Resource', for 'DscConfiguration'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'HybridRunbookWorker'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'HybridRunbookWorkerGroup'
INFORMATION (ResourceTypeNormalization): Change parent from 'TrackedResource' to 'Resource', for 'Module'
INFORMATION (ResourceTypeNormalization): Change parent from 'TrackedResource' to 'Resource', for 'Runbook'
INFORMATION (ErrorTypeNormalization): Rename error from 'ErrorResponse' to 'ManagementError'
INFORMATION (SchemaCleanup): Remove unused object schema 'Resource'
INFORMATION (SchemaCleanup): Remove unused object schema 'TrackedResource'
INFORMATION (SchemaCleanup): Remove unused object schema 'RunbookCreateOrUpdateDraftProperties'
INFORMATION (SchemaCleanup): Remove unused object schema 'RunbookCreateOrUpdateDraftParameters'
INFORMATION (SchemaCleanup): Remove unused choice schema 'CreatedByType'
INFORMATION (FluentGen): Read YAML
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, string, remove-model : null
INFORMATION (FluentJavaSettings): Option, string, preserve-model : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, generate-samples : true
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentGen): Map code model to client model
INFORMATION (FluentMapper): Add Inner to response types: [SourceControlSyncJob, TestJob, RunbookDraft, PrivateEndpointConnection, JobSchedule, DscNode, SourceControlSyncJobById, DscCompilationJob, AutomationAccount, SourceControl, Watcher, Variable, JobStreamListResult, KeyListResult, SourceControlSyncJobStream, SourceControlSyncJobStreamById, SoftwareUpdateConfigurationMachineRun, SoftwareUpdateConfigurationListResult, HybridRunbookWorker, DscNodeReport, Webhook, Module, JobStream, SoftwareUpdateConfigurationRun, TypeField, Usage, SoftwareUpdateConfigurationRunListResult, HybridRunbookWorkerGroup, Runbook, Statistics, Activity, NodeCounts, PrivateLinkResource, DeletedAutomationAccountListResult, ConnectionType, Operation, SoftwareUpdateConfiguration, LinkedWorkspace, DscNodeConfiguration, GraphicalRunbookContent, Schedule, Certificate, Connection, Credential, DscConfiguration, Job, RunbookDraftUndoEditResult, SoftwareUpdateConfigurationMachineRunListResult, AgentRegistration, JobCollectionItem]
INFORMATION (FluentMapper): Add Inner for type 'RunbookDraft': [RunbookCreateOrUpdateProperties, RunbookProperties]
INFORMATION (FluentMapper): Add Inner for type 'RunbookCreateOrUpdateProperties': [RunbookCreateOrUpdateParameters]
INFORMATION (FluentMapper): Add Inner for type 'RunbookProperties': []
INFORMATION (FluentGen): Java template for client model
INFORMATION (FluentGen): Process for Fluent Lite, SDK integration disabled
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'PrivateEndpointConnection', method reference 'createOrUpdate', body parameter 'PrivateEndpointConnectionInner'
INFORMATION (ResourceParser): Fluent model 'PrivateEndpointConnection' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'PrivateEndpointConnection', method reference 'createOrUpdate', body parameter 'PrivateEndpointConnectionInner'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'PrivateEndpointConnection', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'PrivateEndpointConnection', method reference 'delete'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'DscCompilationJob', method reference 'create', body parameter 'DscCompilationJobCreateParameters'
INFORMATION (ResourceParser): Fluent model 'DscCompilationJob' as category NESTED_CHILD
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'DscCompilationJob', method reference 'get'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'Watcher', method reference 'createOrUpdate', body parameter 'WatcherInner'
INFORMATION (ResourceParser): Fluent model 'Watcher' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'Watcher', method reference 'update', body parameter 'WatcherUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'Watcher', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'Watcher', method reference 'delete'
INFORMATION (ResourceActions): ResourceActions: Fluent model 'Watcher', action methods: [stop, start]
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'SoftwareUpdateConfiguration', method reference 'create', body parameter 'SoftwareUpdateConfigurationInner'
INFORMATION (ResourceParser): Fluent model 'SoftwareUpdateConfiguration' as category NESTED_CHILD
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'SoftwareUpdateConfiguration', method reference 'getByName'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'SoftwareUpdateConfiguration', method reference 'delete'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'Webhook', method reference 'createOrUpdate', body parameter 'WebhookCreateOrUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'Webhook' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'Webhook', method reference 'update', body parameter 'WebhookUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'Webhook', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'Webhook', method reference 'delete'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'AutomationAccount', method reference 'createOrUpdate', body parameter 'AutomationAccountCreateOrUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'AutomationAccount' as category RESOURCEGROUP_ASPARENT
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'AutomationAccount', method reference 'update', body parameter 'AutomationAccountUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'AutomationAccount', method reference 'getByResourceGroup'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'AutomationAccount', method reference 'delete'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'Certificate', method reference 'createOrUpdate', body parameter 'CertificateCreateOrUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'Certificate' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'Certificate', method reference 'update', body parameter 'CertificateUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'Certificate', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'Certificate', method reference 'delete'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'Connection', method reference 'createOrUpdate', body parameter 'ConnectionCreateOrUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'Connection' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'Connection', method reference 'update', body parameter 'ConnectionUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'Connection', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'Connection', method reference 'delete'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'ConnectionType', method reference 'createOrUpdate', body parameter 'ConnectionTypeCreateOrUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'ConnectionType' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'ConnectionType', method reference 'createOrUpdate', body parameter 'ConnectionTypeCreateOrUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'ConnectionType', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'ConnectionType', method reference 'delete'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'Credential', method reference 'createOrUpdate', body parameter 'CredentialCreateOrUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'Credential' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'Credential', method reference 'update', body parameter 'CredentialUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'Credential', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'Credential', method reference 'delete'
WARNING (ResourceParser): client model not found for type name 'String', method 'createOrUpdate'
WARNING (ResourceParser): client model not found for collection 'DscConfigurations', method 'createOrUpdate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'DscConfiguration', method reference 'createOrUpdate', body parameter 'DscConfigurationCreateOrUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'DscConfiguration' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'DscConfiguration', method reference 'update', body parameter 'DscConfigurationUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'DscConfiguration', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'DscConfiguration', method reference 'delete'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'DscNodeConfiguration', method reference 'createOrUpdate', body parameter 'DscNodeConfigurationCreateOrUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'DscNodeConfiguration' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'DscNodeConfiguration', method reference 'createOrUpdate', body parameter 'DscNodeConfigurationCreateOrUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'DscNodeConfiguration', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'DscNodeConfiguration', method reference 'delete'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'HybridRunbookWorker', method reference 'create', body parameter 'HybridRunbookWorkerCreateParameters'
INFORMATION (ResourceParser): Fluent model 'HybridRunbookWorker' as category NESTED_CHILD
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'HybridRunbookWorker', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'HybridRunbookWorker', method reference 'delete'
INFORMATION (ResourceActions): ResourceActions: Fluent model 'HybridRunbookWorker', action methods: [move]
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'HybridRunbookWorkerGroup', method reference 'create', body parameter 'HybridRunbookWorkerGroupCreateOrUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'HybridRunbookWorkerGroup' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'HybridRunbookWorkerGroup', method reference 'update', body parameter 'HybridRunbookWorkerGroupCreateOrUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'HybridRunbookWorkerGroup', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'HybridRunbookWorkerGroup', method reference 'delete'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'Job', method reference 'create', body parameter 'JobCreateParameters'
INFORMATION (ResourceParser): Fluent model 'Job' as category NESTED_CHILD
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'Job', method reference 'get'
INFORMATION (ResourceActions): ResourceActions: Fluent model 'Job', action methods: [suspend, resume, stop]
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'JobSchedule', method reference 'create', body parameter 'JobScheduleCreateParameters'
INFORMATION (ResourceParser): Fluent model 'JobSchedule' as category NESTED_CHILD
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'JobSchedule', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'JobSchedule', method reference 'delete'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'Module', method reference 'createOrUpdate', body parameter 'ModuleCreateOrUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'Module' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'Module', method reference 'update', body parameter 'ModuleUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'Module', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'Module', method reference 'delete'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'Runbook', method reference 'createOrUpdate', body parameter 'RunbookCreateOrUpdateParametersInner'
INFORMATION (ResourceParser): Fluent model 'Runbook' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'Runbook', method reference 'update', body parameter 'RunbookUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'Runbook', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'Runbook', method reference 'delete'
INFORMATION (ResourceActions): ResourceActions: Fluent model 'Runbook', action methods: [publish]
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'Schedule', method reference 'createOrUpdate', body parameter 'ScheduleCreateOrUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'Schedule' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'Schedule', method reference 'update', body parameter 'ScheduleUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'Schedule', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'Schedule', method reference 'delete'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'SourceControl', method reference 'createOrUpdate', body parameter 'SourceControlCreateOrUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'SourceControl' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'SourceControl', method reference 'update', body parameter 'SourceControlUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'SourceControl', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'SourceControl', method reference 'delete'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'SourceControlSyncJob', method reference 'create', body parameter 'SourceControlSyncJobCreateParameters'
INFORMATION (ResourceParser): Fluent model 'SourceControlSyncJob' as category NESTED_CHILD
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'Variable', method reference 'createOrUpdate', body parameter 'VariableCreateOrUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'Variable' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'Variable', method reference 'update', body parameter 'VariableUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'Variable', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'Variable', method reference 'delete'
INFORMATION (ExampleParser): Parse collection method example 'Gets private endpoint connection.'
INFORMATION (ExampleParser): Parse collection method example 'Gets private endpoint connection.'
INFORMATION (ExampleParser): Parse collection method example 'Deletes a private endpoint connection with a given name.'
INFORMATION (ExampleParser): Parse resource create example 'Approve or reject a private endpoint connection with a given name.'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'PrivateEndpointConnection', resource define method 'define'
INFORMATION (ExampleParser): Parse collection method example 'Gets private endpoint connection.'
INFORMATION (ExampleParser): Parse collection method example 'Get the agent registration information'
INFORMATION (ExampleParser): Parse collection method example 'Regenerate registration key'
INFORMATION (ExampleParser): Parse collection method example 'Delete a DSC Node'
INFORMATION (ExampleParser): Parse collection method example 'Get a node'
INFORMATION (ExampleParser): Parse collection method example 'Update a node'
INFORMATION (ExampleParser): Parse collection method example 'List DSC nodes by Automation Account'
INFORMATION (ExampleParser): Parse collection method example 'List Paged DSC nodes by Automation Account with Node Configuration Custom filter'
INFORMATION (ExampleParser): Parse collection method example 'List Paged DSC nodes by Automation Account with no filters'
INFORMATION (ExampleParser): Parse collection method example 'List Paged DSC nodes by Automation Account with node status filter'
INFORMATION (ExampleParser): Parse collection method example 'List Paged DSC nodes by Automation Account with version filter'
INFORMATION (ExampleParser): Parse collection method example 'List Paged DSC nodes with filters separated by 'and''
INFORMATION (ExampleParser): Parse collection method example 'List Paged DSC nodes by Automation Account where Node Configurations are not assigned filter'
INFORMATION (ExampleParser): Parse collection method example 'List Paged DSC nodes by Automation Account with name filter'
INFORMATION (ExampleParser): Parse collection method example 'List Paged DSC reports by node id.'
INFORMATION (ExampleParser): Parse collection method example 'List DSC reports by node id.'
INFORMATION (ExampleParser): Parse collection method example 'Get Dsc node report data by node id and report id. '
INFORMATION (ExampleParser): Parse collection method example 'Get content of node'
INFORMATION (ExampleParser): Parse collection method example 'Get a DSC Compilation job'
INFORMATION (ExampleParser): Parse collection method example 'List DSC Compilation job in Automation Account'
INFORMATION (ExampleParser): Parse collection method example 'Get a DSC Compilation job stream by job stream id'
INFORMATION (ExampleParser): Parse resource create example 'Create or update a DSC Compilation job'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'DscCompilationJob', resource define method 'define'
INFORMATION (ExampleParser): Parse collection method example 'List DSC Compilation job streams'
INFORMATION (ExampleParser): Parse collection method example 'Get node's node configuration counts'
INFORMATION (ExampleParser): Parse collection method example 'Get node's status counts'
INFORMATION (ExampleParser): Parse collection method example 'Get watcher'
INFORMATION (ExampleParser): Parse collection method example 'Delete watcher'
INFORMATION (ExampleParser): Parse collection method example 'Start Watcher'
INFORMATION (ExampleParser): Parse collection method example 'Start Watcher'
INFORMATION (ExampleParser): Parse collection method example 'List watchers by Automation Account'
INFORMATION (ExampleParser): Parse resource create example 'Create or update watcher'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'Watcher', resource define method 'define'
INFORMATION (ExampleParser): Parse resource update example 'Update watcher'
INFORMATION (ExampleParser): Parse collection method example 'Get software update configuration by name'
INFORMATION (ExampleParser): Parse collection method example 'Delete software update configuration'
INFORMATION (ExampleParser): Parse collection method example 'List software update configurations'
INFORMATION (ExampleParser): Parse collection method example 'List software update configurations Targeting a specific azure virtual machine'
INFORMATION (ExampleParser): Parse resource create example 'Create software update configuration'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'SoftwareUpdateConfiguration', resource define method 'define'
INFORMATION (ExampleParser): Parse collection method example 'Generate webhook uri'
INFORMATION (ExampleParser): Parse collection method example 'Delete webhook'
INFORMATION (ExampleParser): Parse collection method example 'Get webhook'
INFORMATION (ExampleParser): Parse collection method example 'List webhooks by Automation Account'
INFORMATION (ExampleParser): Parse resource create example 'Create or update webhook'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'Webhook', resource define method 'define'
INFORMATION (ExampleParser): Parse resource update example 'Update webhook'
INFORMATION (ExampleParser): Parse collection method example 'Get deleted automation account'
INFORMATION (ExampleParser): Parse collection method example 'Delete automation account'
INFORMATION (ExampleParser): Parse collection method example 'Get automation account'
INFORMATION (ExampleParser): Parse collection method example 'List automation accounts by resource group'
INFORMATION (ExampleParser): Parse collection method example 'List automation accounts by resource group'
INFORMATION (ExampleParser): Parse resource create example 'Create or update automation account'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'AutomationAccount', resource define method 'define'
INFORMATION (ExampleParser): Parse resource update example 'Update an automation account'
INFORMATION (ExampleParser): Parse collection method example 'Get statistics of an automation account'
INFORMATION (ExampleParser): Parse collection method example 'Get usages of an automation account'
INFORMATION (ExampleParser): Parse collection method example 'Get lists of an automation account'
INFORMATION (ExampleParser): Parse collection method example 'Delete a certificate'
INFORMATION (ExampleParser): Parse collection method example 'Get a certificate'
INFORMATION (ExampleParser): Parse collection method example 'List certificates'
INFORMATION (ExampleParser): Parse resource create example 'Create or update a certificate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'Certificate', resource define method 'define'
INFORMATION (ExampleParser): Parse resource update example 'Update a certificate'
INFORMATION (ExampleParser): Parse collection method example 'Delete an existing connection'
INFORMATION (ExampleParser): Parse collection method example 'Get a connection'
INFORMATION (ExampleParser): Parse collection method example 'List connections by automation account, first 100'
INFORMATION (ExampleParser): Parse collection method example 'List connections by automation account, next 100'
INFORMATION (ExampleParser): Parse resource create example 'Create or update connection'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'Connection', resource define method 'define'
INFORMATION (ExampleParser): Parse resource update example 'Update a connection'
INFORMATION (ExampleParser): Parse collection method example 'Delete an existing connection type'
INFORMATION (ExampleParser): Parse collection method example 'Get connection type'
INFORMATION (ExampleParser): Parse collection method example 'Get connection types, first 100'
INFORMATION (ExampleParser): Parse collection method example 'Get connection types, next 100'
INFORMATION (ExampleParser): Parse resource create example 'Create or update connection type'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'ConnectionType', resource define method 'define'
INFORMATION (ExampleParser): Parse collection method example 'Delete a credential'
INFORMATION (ExampleParser): Parse collection method example 'Get a credential'
INFORMATION (ExampleParser): Parse collection method example 'List credentials by automation account, first 100'
INFORMATION (ExampleParser): Parse collection method example 'List credentials by automation account, next 100'
INFORMATION (ExampleParser): Parse resource create example 'Create a credential'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'Credential', resource define method 'define'
INFORMATION (ExampleParser): Parse resource update example 'Update a credential'
INFORMATION (ExampleParser): Parse collection method example 'Delete DSC Configuration'
INFORMATION (ExampleParser): Parse collection method example 'Get a DSC Configuration'
INFORMATION (ExampleParser): Parse collection method example 'Create or Update Configuration'

```
**stderr**
```
ERROR (FluentGen): Failed to successfully run fluentgen plugin java.lang.IllegalStateException: model type not found for type String and value {name=SetupServer, location=East US 2, properties={description=sample configuration, source={type=embeddedContent, hash={algorithm=sha256, value=A9E5DB56BA21513F61E0B3868816FDC6D4DF5131F5617D7FF0D769674BD5072F}, value=Configuration SetupServer {
    Node localhost {
                               WindowsFeature IIS {
                               Name = "Web-Server";
            Ensure = "Present"
        }
    }
}}}}
java.lang.IllegalStateException: model type not found for type String and value {name=SetupServer, location=East US 2, properties={description=sample configuration, source={type=embeddedContent, hash={algorithm=sha256, value=A9E5DB56BA21513F61E0B3868816FDC6D4DF5131F5617D7FF0D769674BD5072F}, value=Configuration SetupServer {
    Node localhost {
                               WindowsFeature IIS {
                               Name = "Web-Server";
            Ensure = "Present"
        }
    }
}}}}
	at com.azure.autorest.fluent.mapper.ExampleParser.parseNode(ExampleParser.java:574)
	at com.azure.autorest.fluent.mapper.ExampleParser.parseNodeFromMethodParameter(ExampleParser.java:502)
	at com.azure.autorest.fluent.mapper.ExampleParser.parseNodeFromParameter(ExampleParser.java:441)
	at com.azure.autorest.fluent.mapper.ExampleParser.parseMethodForExample(ExampleParser.java:197)
	at com.azure.autorest.fluent.mapper.ExampleParser.parseMethod(ExampleParser.java:165)
	at com.azure.autorest.fluent.mapper.ExampleParser.lambda$parseResourceCollection$2(ExampleParser.java:100)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
	at com.azure.autorest.fluent.mapper.ExampleParser.parseResourceCollection(ExampleParser.java:99)
	at com.azure.autorest.fluent.mapper.FluentMapper.lambda$map$1(FluentMapper.java:65)
	at java.base/java.util.stream.ReferencePipeline$7$1.accept(ReferencePipeline.java:271)
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1655)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:913)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:578)
	at com.azure.autorest.fluent.mapper.FluentMapper.map(FluentMapper.java:67)
	at com.azure.autorest.fluent.FluentGen.handleFluentLite(FluentGen.java:291)
	at com.azure.autorest.fluent.FluentGen.processInternal(FluentGen.java:106)
	at com.azure.autorest.extension.base.plugin.NewPlugin.process(NewPlugin.java:206)
	at com.azure.autorest.fluent.Main.lambda$main$1(Main.java:18)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$dispatch$2(Connection.java:151)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$process$3(Connection.java:270)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)

  Error: Plugin fluentgen reported failure.

```
</details>

<details>
<summary>azurestackhci</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] ---< com.azure.resourcemanager:azure-resourcemanager-azurestackhci >----
[INFO] Building Microsoft Azure SDK for AzureStackHci Management 1.0.0-beta.1
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-azurestackhci ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-azurestackhci ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 166 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/Update.java:[526,11] cannot find symbol
  symbol:   class Update
  location: interface com.azure.resourcemanager.azurestackhci.models.Update
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/Update.java:[529,5] interface com.azure.resourcemanager.azurestackhci.models.Update is already defined in package com.azure.resourcemanager.azurestackhci.models
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/Severity.java:[12,14] duplicate class: com.azure.resourcemanager.azurestackhci.models.Severity
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/PackageVersionInfo.java:[15,14] duplicate class: com.azure.resourcemanager.azurestackhci.models.PackageVersionInfo
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/State.java:[12,14] duplicate class: com.azure.resourcemanager.azurestackhci.models.State
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/HealthState.java:[12,14] duplicate class: com.azure.resourcemanager.azurestackhci.models.HealthState
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/UpdatePrerequisite.java:[17,14] duplicate class: com.azure.resourcemanager.azurestackhci.models.UpdatePrerequisite
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/fluent/models/UpdateStateProperties.java:[17,14] duplicate class: com.azure.resourcemanager.azurestackhci.fluent.models.UpdateStateProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/PrecheckResultTags.java:[14,14] duplicate class: com.azure.resourcemanager.azurestackhci.models.PrecheckResultTags
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/ProvisioningState.java:[12,14] duplicate class: com.azure.resourcemanager.azurestackhci.models.ProvisioningState
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/fluent/models/UpdateProperties.java:[24,14] duplicate class: com.azure.resourcemanager.azurestackhci.fluent.models.UpdateProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/Status.java:[12,14] duplicate class: com.azure.resourcemanager.azurestackhci.models.Status
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/fluent/models/UpdateInner.java:[26,14] duplicate class: com.azure.resourcemanager.azurestackhci.fluent.models.UpdateInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/PrecheckResult.java:[15,14] duplicate class: com.azure.resourcemanager.azurestackhci.models.PrecheckResult
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/AvailabilityType.java:[12,14] duplicate class: com.azure.resourcemanager.azurestackhci.models.AvailabilityType
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/implementation/UpdateImpl.java:[24,14] com.azure.resourcemanager.azurestackhci.implementation.UpdateImpl is not abstract and does not override abstract method refresh(com.azure.core.util.Context) in com.azure.resourcemanager.azurestackhci.models.Update
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/implementation/UpdateImpl.java:[244,19] refresh(com.azure.core.util.Context) in com.azure.resourcemanager.azurestackhci.implementation.UpdateImpl cannot implement refresh(com.azure.core.util.Context) in com.azure.resourcemanager.azurestackhci.models.Update
  return type com.azure.resourcemanager.azurestackhci.models.Update.Update is not compatible with com.azure.resourcemanager.azurestackhci.models.Update
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/implementation/UpdateImpl.java:[234,19] refresh() in com.azure.resourcemanager.azurestackhci.implementation.UpdateImpl cannot implement refresh() in com.azure.resourcemanager.azurestackhci.models.Update
  return type com.azure.resourcemanager.azurestackhci.models.Update.Update is not compatible with com.azure.resourcemanager.azurestackhci.models.Update
[INFO] 18 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.446 s
[INFO] Finished at: 2022-12-28T18:27:35Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-azurestackhci: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/Update.java:[526,11] cannot find symbol
[ERROR]   symbol:   class Update
[ERROR]   location: interface com.azure.resourcemanager.azurestackhci.models.Update
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/Update.java:[529,5] interface com.azure.resourcemanager.azurestackhci.models.Update is already defined in package com.azure.resourcemanager.azurestackhci.models
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/Severity.java:[12,14] duplicate class: com.azure.resourcemanager.azurestackhci.models.Severity
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/PackageVersionInfo.java:[15,14] duplicate class: com.azure.resourcemanager.azurestackhci.models.PackageVersionInfo
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/State.java:[12,14] duplicate class: com.azure.resourcemanager.azurestackhci.models.State
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/HealthState.java:[12,14] duplicate class: com.azure.resourcemanager.azurestackhci.models.HealthState
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/UpdatePrerequisite.java:[17,14] duplicate class: com.azure.resourcemanager.azurestackhci.models.UpdatePrerequisite
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/fluent/models/UpdateStateProperties.java:[17,14] duplicate class: com.azure.resourcemanager.azurestackhci.fluent.models.UpdateStateProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/PrecheckResultTags.java:[14,14] duplicate class: com.azure.resourcemanager.azurestackhci.models.PrecheckResultTags
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/ProvisioningState.java:[12,14] duplicate class: com.azure.resourcemanager.azurestackhci.models.ProvisioningState
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/fluent/models/UpdateProperties.java:[24,14] duplicate class: com.azure.resourcemanager.azurestackhci.fluent.models.UpdateProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/Status.java:[12,14] duplicate class: com.azure.resourcemanager.azurestackhci.models.Status
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/fluent/models/UpdateInner.java:[26,14] duplicate class: com.azure.resourcemanager.azurestackhci.fluent.models.UpdateInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/PrecheckResult.java:[15,14] duplicate class: com.azure.resourcemanager.azurestackhci.models.PrecheckResult
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/models/AvailabilityType.java:[12,14] duplicate class: com.azure.resourcemanager.azurestackhci.models.AvailabilityType
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/implementation/UpdateImpl.java:[24,14] com.azure.resourcemanager.azurestackhci.implementation.UpdateImpl is not abstract and does not override abstract method refresh(com.azure.core.util.Context) in com.azure.resourcemanager.azurestackhci.models.Update
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/implementation/UpdateImpl.java:[244,19] refresh(com.azure.core.util.Context) in com.azure.resourcemanager.azurestackhci.implementation.UpdateImpl cannot implement refresh(com.azure.core.util.Context) in com.azure.resourcemanager.azurestackhci.models.Update
[ERROR]   return type com.azure.resourcemanager.azurestackhci.models.Update.Update is not compatible with com.azure.resourcemanager.azurestackhci.models.Update
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-azurestackhci/src/main/java/com/azure/resourcemanager/azurestackhci/implementation/UpdateImpl.java:[234,19] refresh() in com.azure.resourcemanager.azurestackhci.implementation.UpdateImpl cannot implement refresh() in com.azure.resourcemanager.azurestackhci.models.Update
[ERROR]   return type com.azure.resourcemanager.azurestackhci.models.Update.Update is not compatible with com.azure.resourcemanager.azurestackhci.models.Update
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
**stderr**
```

```
</details>

<details>
<summary>devspaces</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.6.2; node: v14.21.1]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
info    | AutoRest core version selected from configuration: 3.4.5.
   Loading AutoRest core      '/home/runner/.autorest/@autorestcore@3.4.5/nodemodules/@autorest/core/dist' (3.4.5)
INFORMATION: > Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
INFORMATION: > Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
INFORMATION: > Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentnamer)
INFORMATION: > Loading AutoRest extension '@autorest/modelerfour' (4.18.1->4.18.1)

```
**stderr**
```
ERROR: Semantic violation: Discriminator must be a required property. (components > schemas > OrchestratorSpecificConnectionDetails)
  discriminator: { propertyName: [32m'instanceType'[39m }
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/devspaces/resource-manager/Microsoft.DevSpaces/stable/2019-04-01/devspaces.json:1040:3
  Error: Semantic validation failed. There was some errors

```
</details>

<details>
<summary>education</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] -----< com.azure.resourcemanager:azure-resourcemanager-education >------
[INFO] Building Microsoft Azure SDK for Education Management 1.0.0-beta.1
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-education ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-education/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-education ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 80 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-education/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-education/src/main/java/com/azure/resourcemanager/education/fluent/models/LabProperties.java:[264,19] method currency() is already defined in class com.azure.resourcemanager.education.fluent.models.LabProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-education/src/main/java/com/azure/resourcemanager/education/fluent/models/LabProperties.java:[274,26] method withCurrency(java.lang.String) is already defined in class com.azure.resourcemanager.education.fluent.models.LabProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-education/src/main/java/com/azure/resourcemanager/education/fluent/models/LabProperties.java:[287,18] method value() is already defined in class com.azure.resourcemanager.education.fluent.models.LabProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-education/src/main/java/com/azure/resourcemanager/education/fluent/models/LabProperties.java:[297,26] method withValue(java.lang.Float) is already defined in class com.azure.resourcemanager.education.fluent.models.LabProperties
[INFO] 4 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.698 s
[INFO] Finished at: 2022-12-28T18:49:48Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-education: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-education/src/main/java/com/azure/resourcemanager/education/fluent/models/LabProperties.java:[264,19] method currency() is already defined in class com.azure.resourcemanager.education.fluent.models.LabProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-education/src/main/java/com/azure/resourcemanager/education/fluent/models/LabProperties.java:[274,26] method withCurrency(java.lang.String) is already defined in class com.azure.resourcemanager.education.fluent.models.LabProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-education/src/main/java/com/azure/resourcemanager/education/fluent/models/LabProperties.java:[287,18] method value() is already defined in class com.azure.resourcemanager.education.fluent.models.LabProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-education/src/main/java/com/azure/resourcemanager/education/fluent/models/LabProperties.java:[297,26] method withValue(java.lang.Float) is already defined in class com.azure.resourcemanager.education.fluent.models.LabProperties
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
**stderr**
```

```
</details>

<details>
<summary>intune</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.6.2; node: v14.21.1]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
info    | AutoRest core version selected from configuration: 3.4.5.
   Loading AutoRest core      '/home/runner/.autorest/@autorestcore@3.4.5/nodemodules/@autorest/core/dist' (3.4.5)
INFORMATION: > Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
INFORMATION: > Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
INFORMATION: > Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentnamer)
INFORMATION: > Loading AutoRest extension '@autorest/modelerfour' (4.18.1->4.18.1)
WARNING (PreCheck/SchemaMissingType): The schema 'Resource' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Location' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'LocationProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Error' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'LocationCollection' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'GroupsCollection' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'GroupItem' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'GroupProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ApplicationCollection' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Application' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ApplicationProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'IOSMAMPolicyCollection' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AndroidMAMPolicyCollection' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'iOSMAMPolicy' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AndroidMAMPolicy' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MAMPolicyAppIdOrGroupIdPayload' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MAMPolicyAppOrGroupIdProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MAMPolicyProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'iOSMAMPolicyProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AndroidMAMPolicyProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DeviceCollection' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Device' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DeviceProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'WipeDeviceOperationResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'WipeDeviceOperationResultProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'OperationResultCollection' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'OperationResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'OperationResultProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'operationMetadataProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'StatusesDefault' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'StatusesProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedUserCollection' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedUser' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedUserProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedEnrolledAppCollection' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedEnrolledApp' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedEnrolledAppProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'FlaggedEnrolledAppError' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.
INFORMATION (FluentNamer): Load fluent settings
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, string, remove-model : null
INFORMATION (FluentJavaSettings): Option, string, preserve-model : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, generate-samples : true
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentNamer): Transform code model
INFORMATION (FluentTransformer): Rename ungrouped operation group to 'ResourceProvider'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'GetLocationByHostName' to 'GetLocationByHostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'userName' to 'username'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'userName' to 'username'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'userName' to 'username'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'userName' to 'username'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'userName' to 'username'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (SchemaNameNormalization): Override default name, from 'hostName' to 'hostname'
INFORMATION (ErrorTypeNormalization): Rename error from 'Error' to 'ManagementError'
INFORMATION (FluentGen): Read YAML
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, string, remove-model : null
INFORMATION (FluentJavaSettings): Option, string, preserve-model : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, generate-samples : true
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentGen): Map code model to client model
INFORMATION (FluentMapper): Add Inner to response types: [Location, AndroidMamPolicy, IOsmamPolicy, FlaggedUser, OperationResult, FlaggedEnrolledApp, WipeDeviceOperationResult, Device, Application, GroupItem]

```
**stderr**
```
ERROR (FluentGen): Failed to successfully run fluentgen plugin java.lang.IllegalArgumentException: [JavaCheck/SchemaError] item name value not found among properties of client model StatusesDefault
java.lang.IllegalArgumentException: [JavaCheck/SchemaError] item name value not found among properties of client model StatusesDefault
	at com.azure.autorest.mapper.ClientMethodMapper.map(ClientMethodMapper.java:89)
	at com.azure.autorest.mapper.MethodGroupMapper.map(MethodGroupMapper.java:115)
	at com.azure.autorest.mapper.ServiceClientMapper.map(ServiceClientMapper.java:93)
	at com.azure.autorest.mapper.ClientMapper.map(ClientMapper.java:119)
	at com.azure.autorest.fluent.FluentGen.handleMap(FluentGen.java:174)
	at com.azure.autorest.fluent.FluentGen.processInternal(FluentGen.java:100)
	at com.azure.autorest.extension.base.plugin.NewPlugin.process(NewPlugin.java:206)
	at com.azure.autorest.fluent.Main.lambda$main$1(Main.java:18)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$dispatch$2(Connection.java:151)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$process$3(Connection.java:270)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)

  Error: Plugin fluentgen reported failure.

```
</details>

<details>
<summary>iotspaces</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] -----< com.azure.resourcemanager:azure-resourcemanager-iotspaces >------
[INFO] Building Microsoft Azure SDK for IoTSpaces Management 1.0.0-beta.1
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-iotspaces ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-iotspaces/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-iotspaces ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 10 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-iotspaces/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-iotspaces/src/main/java/module-info.java:[10,55] package is empty or does not exist: com.azure.resourcemanager.iotspaces.fluent.models
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-iotspaces/src/main/java/module-info.java:[11,48] package is empty or does not exist: com.azure.resourcemanager.iotspaces.models
[INFO] 2 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.953 s
[INFO] Finished at: 2022-12-28T18:57:27Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-iotspaces: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-iotspaces/src/main/java/module-info.java:[10,55] package is empty or does not exist: com.azure.resourcemanager.iotspaces.fluent.models
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-iotspaces/src/main/java/module-info.java:[11,48] package is empty or does not exist: com.azure.resourcemanager.iotspaces.models
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
**stderr**
```

```
</details>

<details>
<summary>machinelearning</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.6.2; node: v14.21.1]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
info    | AutoRest core version selected from configuration: 3.4.5.
   Loading AutoRest core      '/home/runner/.autorest/@autorestcore@3.4.5/nodemodules/@autorest/core/dist' (3.4.5)
INFORMATION: > Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
INFORMATION: > Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
INFORMATION: > Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentnamer)
INFORMATION: > Loading AutoRest extension '@autorest/modelerfour' (4.18.1->4.18.1)
[Exception] No input files provided.

Use --help to get help information.

```
**stderr**
```

```
</details>

<details>
<summary>migrateprojects</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.6.2; node: v14.21.1]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
info    | AutoRest core version selected from configuration: 3.4.5.
   Loading AutoRest core      '/home/runner/.autorest/@autorestcore@3.4.5/nodemodules/@autorest/core/dist' (3.4.5)
INFORMATION: > Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
INFORMATION: > Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
INFORMATION: > Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentnamer)
INFORMATION: > Loading AutoRest extension '@autorest/modelerfour' (4.18.1->4.18.1)
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > ODataQueryOptions`1 > properties > filter)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:509:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > ODataQueryContext > properties > defaultQuerySettings)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:518:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > ODataQueryContext > properties > model)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:522:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > ODataQueryContext > properties > elementType)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:526:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > ODataQueryContext > properties > navigationSource)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:530:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > ODataQueryContext > properties > path)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:538:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > ODataQueryContext > properties > requestContainer)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:542:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > FilterQueryOption > properties > context)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:560:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > FilterQueryOption > properties > filterClause)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:567:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmModel > properties > directValueAnnotationsManager)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:641:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmModel > properties > entityContainer)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:645:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmNavigationSource > properties > path)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:685:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmNavigationSource > properties > type)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:689:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > ODataPath > properties > edmType)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:702:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > ODataPath > properties > navigationSource)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:706:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > FilterClause > properties > expression)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:781:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > FilterClause > properties > rangeVariable)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:785:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > FilterClause > properties > itemType)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:789:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmVocabularyAnnotation > properties > term)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:827:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmVocabularyAnnotation > properties > target)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:831:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmVocabularyAnnotation > properties > value)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:835:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmNavigationPropertyBinding > properties > navigationProperty)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:883:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmNavigationPropertyBinding > properties > target)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:887:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmNavigationPropertyBinding > properties > path)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:891:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > ODataPathSegment > properties > edmType)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:948:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > SingleValueNode > properties > typeReference)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:979:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > RangeVariable > properties > typeReference)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:1032:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmTypeReference > properties > definition)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:1050:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmTerm > properties > type)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:1059:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmEntityContainerElement > properties > container)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:1148:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmNavigationProperty > properties > partner)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:1161:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmNavigationProperty > properties > referentialConstraint)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:1177:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmNavigationProperty > properties > type)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:1190:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmNavigationProperty > properties > declaringType)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:1194:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmStructuredType > properties > baseType)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:1231:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > EdmReferentialConstraintPropertyPair > properties > dependentProperty)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:1266:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > EdmReferentialConstraintPropertyPair > properties > principalProperty)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:1270:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmProperty > properties > type)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:1288:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmProperty > properties > declaringType)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:1292:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmStructuralProperty > properties > type)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:1318:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > IEdmStructuralProperty > properties > declaringType)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:1322:5

```
**stderr**
```
ERROR: Semantic violation: Discriminator must be a required property. (components > schemas > MigrateEventProperties)
  discriminator: { propertyName: [32m'instanceType'[39m }
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:468:3
ERROR: Semantic violation: Discriminator must be a required property. (components > schemas > ProjectSummary)
  discriminator: { propertyName: [32m'instanceType'[39m }
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:1762:3
ERROR: Semantic violation: Discriminator must be a required property. (components > schemas > SolutionSummary)
  discriminator: { propertyName: [32m'instanceType'[39m }
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/migrateprojects/resource-manager/Microsoft.Migrate/preview/2018-09-01-preview/migrate.json:1954:3
  Error: Semantic validation failed. There was some errors

```
</details>

<details>
<summary>orbital</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] ------< com.azure.resourcemanager:azure-resourcemanager-orbital >-------
[INFO] Building Microsoft Azure SDK for orbital Management 1.0.0-beta.1
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-orbital ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-orbital ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 117 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1563,37] cannot find symbol
  symbol:   class AvailableContactsListResult
  location: class com.azure.resourcemanager.orbital.implementation.SpacecraftsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1564,37] cannot find symbol
  symbol:   class AvailableContactsListResult
  location: class com.azure.resourcemanager.orbital.implementation.SpacecraftsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1560,35] cannot find symbol
  symbol:   class AvailableContactsListResult
  location: class com.azure.resourcemanager.orbital.implementation.SpacecraftsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1560,64] cannot find symbol
  symbol:   class AvailableContactsListResult
  location: class com.azure.resourcemanager.orbital.implementation.SpacecraftsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1572,28] cannot find symbol
  symbol:   method getT1()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1573,28] cannot find symbol
  symbol:   method getT1()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1574,28] cannot find symbol
  symbol:   method getT1()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1575,28] cannot find symbol
  symbol:   method getT2()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1576,28] cannot find symbol
  symbol:   method getT2()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1643,25] cannot find symbol
  symbol:   class AvailableContactsListResult
  location: class com.azure.resourcemanager.orbital.implementation.SpacecraftsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1644,25] cannot find symbol
  symbol:   class AvailableContactsListResult
  location: class com.azure.resourcemanager.orbital.implementation.SpacecraftsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1640,23] cannot find symbol
  symbol:   class AvailableContactsListResult
  location: class com.azure.resourcemanager.orbital.implementation.SpacecraftsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1640,52] cannot find symbol
  symbol:   class AvailableContactsListResult
  location: class com.azure.resourcemanager.orbital.implementation.SpacecraftsClientImpl
[INFO] 13 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.472 s
[INFO] Finished at: 2022-12-28T19:13:38Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-orbital: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1563,37] cannot find symbol
[ERROR]   symbol:   class AvailableContactsListResult
[ERROR]   location: class com.azure.resourcemanager.orbital.implementation.SpacecraftsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1564,37] cannot find symbol
[ERROR]   symbol:   class AvailableContactsListResult
[ERROR]   location: class com.azure.resourcemanager.orbital.implementation.SpacecraftsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1560,35] cannot find symbol
[ERROR]   symbol:   class AvailableContactsListResult
[ERROR]   location: class com.azure.resourcemanager.orbital.implementation.SpacecraftsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1560,64] cannot find symbol
[ERROR]   symbol:   class AvailableContactsListResult
[ERROR]   location: class com.azure.resourcemanager.orbital.implementation.SpacecraftsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1572,28] cannot find symbol
[ERROR]   symbol:   method getT1()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1573,28] cannot find symbol
[ERROR]   symbol:   method getT1()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1574,28] cannot find symbol
[ERROR]   symbol:   method getT1()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1575,28] cannot find symbol
[ERROR]   symbol:   method getT2()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1576,28] cannot find symbol
[ERROR]   symbol:   method getT2()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1643,25] cannot find symbol
[ERROR]   symbol:   class AvailableContactsListResult
[ERROR]   location: class com.azure.resourcemanager.orbital.implementation.SpacecraftsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1644,25] cannot find symbol
[ERROR]   symbol:   class AvailableContactsListResult
[ERROR]   location: class com.azure.resourcemanager.orbital.implementation.SpacecraftsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1640,23] cannot find symbol
[ERROR]   symbol:   class AvailableContactsListResult
[ERROR]   location: class com.azure.resourcemanager.orbital.implementation.SpacecraftsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/java/com/azure/resourcemanager/orbital/implementation/SpacecraftsClientImpl.java:[1640,52] cannot find symbol
[ERROR]   symbol:   class AvailableContactsListResult
[ERROR]   location: class com.azure.resourcemanager.orbital.implementation.SpacecraftsClientImpl
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
**stderr**
```

```
</details>

<details>
<summary>service-map</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.6.2; node: v14.21.1]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
info    | AutoRest core version selected from configuration: 3.4.5.
   Loading AutoRest core      '/home/runner/.autorest/@autorestcore@3.4.5/nodemodules/@autorest/core/dist' (3.4.5)
INFORMATION: > Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
INFORMATION: > Installing AutoRest extension '@microsoft.azure/classic-openapi-validator' (~1.1.5)
INFORMATION: > Installed AutoRest extension '@microsoft.azure/classic-openapi-validator' (~1.1.5->1.1.13)
INFORMATION: > Installing AutoRest extension '@microsoft.azure/openapi-validator' (~1.7.0)
INFORMATION: > Installed AutoRest extension '@microsoft.azure/openapi-validator' (~1.7.0->1.7.0)
INFORMATION: > Installing AutoRest extension 'oav' (~0.4.20)
INFORMATION: > Installed AutoRest extension 'oav' (~0.4.20->0.4.70)
INFORMATION: > Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
INFORMATION: > Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentnamer)
INFORMATION: > Loading AutoRest extension '@autorest/modelerfour' (4.18.1->4.18.1)
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (definitions > ProcessReference > properties > properties > properties > machine)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1686:12 ($.definitions.ProcessReference.properties.properties.properties.machine)
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (definitions > PortReference > properties > properties > properties > machine)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1709:12 ($.definitions.PortReference.properties.properties.properties.machine)
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (definitions > MachineReferenceWithHints > properties > properties > properties > osFamilyHint)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1747:12 ($.definitions.MachineReferenceWithHints.properties.properties.properties.osFamilyHint)
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > ProcessReference > properties > properties > properties > machine)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:118:7
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > PortReference > properties > properties > properties > machine)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:141:7
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > MachineReferenceWithHints > properties > properties > properties > osFamilyHint)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:179:7
WARNING (PreCheck/SchemaMissingType): The schema 'Resource' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ResourceReference' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MachineReference' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ProcessReference' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'PortReference' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MachineReferenceWithHints' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ClientGroupReference' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'CoreResource' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Machine' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Process' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Port' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ClientGroup' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ClientGroupMember' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MachineGroup' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Summary' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MachinesSummary' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Relationship' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Connection' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Acceptor' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'RelationshipProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ConnectionProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AcceptorProperties' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Ipv4NetworkInterface' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Ipv6NetworkInterface' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'NetworkConfiguration' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AgentConfiguration' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Timezone' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'OperatingSystemConfiguration' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MachineResourcesConfiguration' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'VirtualMachineConfiguration' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'HypervisorConfiguration' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'HostingConfiguration' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AzureHostingConfiguration' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AzureCloudServiceConfiguration' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AzureVmScaleSetConfiguration' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AzureServiceFabricClusterConfiguration' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ImageConfiguration' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ProcessUser' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ProcessDetails' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ProcessHostedService' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ProcessHostingConfiguration' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'AzureProcessHostingConfiguration' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SingleMachineDependencyMapRequest' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MultipleMachinesMapRequest' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MachineListMapRequest' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MachineGroupMapRequest' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.
WARNING (PreCheck/PropertyRedeclarationWarning): Schema 'MachineGroup' has a property 'etag' that is already declared the parent schema 'CoreResource' but isn't significantly different. The property has been removed from MachineGroup
WARNING (PostOperationIdContainsUrlVerb/R2066/SDKViolation): OperationId should contain the verb: 'generatemap' in:'Maps_Generate'. Consider updating the operationId
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1231:8 ($.paths["/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/features/serviceMap/generateMap"].post.operationId)
WARNING (PostOperationIdContainsUrlVerb/R2066/SDKViolation): OperationId should contain the verb: 'machinegroups' in:'MachineGroups_Create'. Consider updating the operationId
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1405:8 ($.paths["/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/features/serviceMap/machineGroups"].post.operationId)
WARNING (PreviewVersionOverOneYear/R4024/SDKViolation): The API version:2015-11-01-preview having been in a preview state over one year , please move it to GA or retire.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:6:4 ($.info.version)
WARNING (EnumInsteadOfBoolean/R3018/ARMViolation): Booleans are not descriptive and make them hard to use. Consider using string enums with allowed set of values defined. Property: live
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:63:12 ($.paths["/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/features/serviceMap/machines"].get.parameters[4].name)
WARNING (EnumInsteadOfBoolean/R3018/ARMViolation): Booleans are not descriptive and make them hard to use. Consider using string enums with allowed set of values defined. Property: live
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:332:12 ($.paths["/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/features/serviceMap/machines/{machineName}/processes"].get.parameters[5].name)
WARNING (OperationIdNounVerb/R1001/SDKViolation): Per the Noun_Verb convention for Operation Ids, the noun 'Machines' should not appear after the underscore. Note: If you have already shipped an SDK on top of this spec, fixing this warning may introduce a breaking change.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:971:8 ($.paths["/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/features/serviceMap/machines/{machineName}/machineGroups"].get.operationId)
WARNING (PutInOperationName/R1006/SDKViolation): 'PUT' operation 'MachineGroups_Update' should use method name 'Create'. Note: If you have already shipped an SDK on top of this spec, fixing this warning may introduce a breaking change.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1515:8 ($.paths["/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/features/serviceMap/machineGroups/{machineGroupName}"].put.operationId)
WARNING (EnumInsteadOfBoolean/R3018/ARMViolation): Booleans are not descriptive and make them hard to use. Consider using string enums with allowed set of values defined. Property: live
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:3140:8 ($.definitions.Liveness.properties.live)
WARNING (EnumInsteadOfBoolean/R3018/ARMViolation): Booleans are not descriptive and make them hard to use. Consider using string enums with allowed set of values defined. Property: filterProcesses
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:3206:8 ($.definitions.MultipleMachinesMapRequest.properties.filterProcesses)
INFORMATION (FluentNamer): Load fluent settings
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, string, remove-model : null
INFORMATION (FluentJavaSettings): Option, string, preserve-model : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, generate-samples : true
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentNamer): Transform code model
INFORMATION (SchemaNameNormalization): Override default name, from 'userName' to 'username'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'CoreResource'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'Relationship'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'ClientGroupMember'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'Summary'
INFORMATION (ErrorTypeNormalization): Rename error from 'ErrorResponse' to 'ManagementError'
INFORMATION (SchemaCleanup): Remove unused object schema 'Resource'
INFORMATION (SchemaCleanup): Remove unused object schema 'ManagementError'
INFORMATION (FluentGen): Read YAML
INFORMATION (FluentJavaSettings): Option, string, add-inner : null
INFORMATION (FluentJavaSettings): Option, string, remove-inner : null
INFORMATION (FluentJavaSettings): Option, string, rename-model : null
INFORMATION (FluentJavaSettings): Option, string, remove-model : null
INFORMATION (FluentJavaSettings): Option, string, preserve-model : null
INFORMATION (FluentJavaSettings): Option, string, name-for-ungrouped-operations : null
INFORMATION (FluentJavaSettings): Option, string, pom-file : null
INFORMATION (FluentJavaSettings): Option, string, package-version : null
INFORMATION (FluentJavaSettings): Option, boolean, generate-samples : true
INFORMATION (FluentJavaSettings): Option, boolean, sdk-integration : null
INFORMATION (FluentGen): Map code model to client model
INFORMATION (FluentMapper): Add Inner to response types: [Connection, ClientGroupMembersCount, Port, MachinesSummary, ClientGroup, MachineGroup, Process, Machine, MapResponse, ClientGroupMember, Liveness]
INFORMATION (FluentGen): Java template for client model
INFORMATION (FluentGen): Process for Fluent Lite, SDK integration disabled
INFORMATION (ExampleParser): Parse collection method example 'SMMachinesListByWorkspaceGet'
INFORMATION (ExampleParser): Parse collection method example 'SMMachinesGetGet'
INFORMATION (ExampleParser): Parse collection method example 'SMMachinesGetLivenessGet'
INFORMATION (ExampleParser): Parse collection method example 'SMMachinesListConnectionsGet'
INFORMATION (ExampleParser): Parse collection method example 'SMMachinesListProcessesGet'
INFORMATION (ExampleParser): Parse collection method example 'SMMachinesListPortsGet'
INFORMATION (ExampleParser): Parse collection method example 'SMMachinesListMachineGroupMembershipGet'
INFORMATION (ExampleParser): Parse collection method example 'SMMachinesProcessesGetGet'
INFORMATION (ExampleParser): Parse collection method example 'SMMachinesProcessesGetLivenessGet'
INFORMATION (ExampleParser): Parse collection method example 'SMMachinesProcessesListAcceptingPortsGet'
INFORMATION (ExampleParser): Parse collection method example 'SMMachinesProcessesListConnectionsGet'
INFORMATION (ExampleParser): Parse collection method example 'SMMachinesPortsGetGet'
INFORMATION (ExampleParser): Parse collection method example 'SMMachinesPortsGetLivenessGet'
INFORMATION (ExampleParser): Parse collection method example 'SMMachinesPortsListAcceptingProcessesGet'
INFORMATION (ExampleParser): Parse collection method example 'SMMachinesPortsListConnectionsGet'
INFORMATION (ExampleParser): Parse collection method example 'SMClientGroupsGetGet'
INFORMATION (ExampleParser): Parse collection method example 'SMClientGroupsGetMembersCountGet'
INFORMATION (ExampleParser): Parse collection method example 'SMClientGroupsListMembersGet'
INFORMATION (ExampleParser): Parse collection method example 'SMMapsGenerateMachineGroupDependencyPost'
WARNING (ExampleParser): Failed to find the subclass with discriminator value 'map:machine-group-dependency'
INFORMATION (ExampleParser): Parse collection method example 'SMMapsGenerateMachineListDependencyPost'
WARNING (ExampleParser): Failed to find the subclass with discriminator value 'map:machine-list-dependency'
INFORMATION (ExampleParser): Parse collection method example 'SMMapsGenerateSingleMachineDependencyPost'
INFORMATION (ExampleParser): Parse collection method example 'SMSummariesGetMachinesGet'
INFORMATION (ExampleParser): Parse collection method example 'SMMachineGroupsListByWorkspaceGet'
INFORMATION (ExampleParser): Parse collection method example 'SMMachineGroupsCreatePost'
WARNING (ExampleParser): Failed to find the subclass with discriminator value 'machineGroup'
WARNING (ExampleParser): Failed to find the subclass with discriminator value 'ref:machinewithhints'
INFORMATION (ExampleParser): Parse collection method example 'SMMachineGroupsGetGet'
INFORMATION (ExampleParser): Parse collection method example 'SMMachineGroupsUpdatePut'
WARNING (ExampleParser): Failed to find the subclass with discriminator value 'machineGroup'
WARNING (ExampleParser): Failed to find the subclass with discriminator value 'ref:machinewithhints'
INFORMATION (ExampleParser): Parse collection method example 'SMMachineGroupsDeleteDelete'
INFORMATION (FluentJavaSettings): Option, string, tag : package-2015-11-preview
INFORMATION (FluentJavaSettings): Option, string, base-folder : .
INFORMATION (FluentJavaSettings): Option, string, output-folder : /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-service-map
INFORMATION (FluentJavaSettings): Option, string, azure-libraries-for-java-folder : null
INFORMATION (FluentJavaSettings): List of input files : [Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json]
INFORMATION (FluentGen): Write Java
INFORMATION (JavaFormatter): Java version: 11.0.17
INFORMATION (JavaFormatter): Java formatter enabled
INFORMATION (FluentGen): Write Xml
INFORMATION (FluentGen): Write Text

```
**stderr**
```
FATAL: Failed validating: 'file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json', error encountered: TypeError: Cannot read property 'properties' of undefined
FATAL: [object Object]
ERROR (DeleteOperationResponses/R4011/ARMViolation): The delete operation is defined without a 200 or 204 error response implementation,please add it.'
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1591:8 ($.paths["/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/features/serviceMap/machineGroups/{machineGroupName}"].delete.responses)
ERROR (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: kind
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1645:8 ($.definitions.ResourceReference.properties.kind)
ERROR (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: kind
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1778:8 ($.definitions.CoreResource.properties.kind)
ERROR (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: kind
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:2142:8 ($.definitions.Relationship.properties.kind)
ERROR (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: provider
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:2754:8 ($.definitions.HostingConfiguration.properties.provider)
ERROR (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: kind
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:2761:8 ($.definitions.HostingConfiguration.properties.kind)
ERROR (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: provider
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:3022:8 ($.definitions.ProcessHostingConfiguration.properties.provider)
ERROR (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: kind
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:3029:8 ($.definitions.ProcessHostingConfiguration.properties.kind)
ERROR (XmsEnumValidation/R2018/SDKViolation): The enum types should have x-ms-enum type extension set with appropriate options. Property name: kind
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:3166:8 ($.definitions.MapRequest.properties.kind)
  Error: Plugin model-validator reported failure.

```
</details>

<details>
<summary>sql</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] --------< com.azure.resourcemanager:azure-resourcemanager-sql >---------
[INFO] Building Microsoft Azure SDK for Sql Management 1.0.0-beta.1
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-sql ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-sql/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-sql ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1512 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-sql/target/classes
[INFO] Some messages have been simplified; recompile with -Xdiags:verbose to get full output
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-sql/src/main/java/com/azure/resourcemanager/sql/implementation/SqlVulnerabilityAssessmentImpl.java:[131,65] incompatible types: com.azure.resourcemanager.sql.models.VulnerabilityAssessmentName cannot be converted to com.azure.resourcemanager.sql.models.SqlVulnerabilityAssessmentNameAutoGenerated
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-sql/src/main/java/com/azure/resourcemanager/sql/implementation/SqlVulnerabilityAssessmentImpl.java:[141,65] incompatible types: com.azure.resourcemanager.sql.models.VulnerabilityAssessmentName cannot be converted to com.azure.resourcemanager.sql.models.SqlVulnerabilityAssessmentNameAutoGenerated
[INFO] 2 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  11.518 s
[INFO] Finished at: 2022-12-28T19:34:01Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-sql: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-sql/src/main/java/com/azure/resourcemanager/sql/implementation/SqlVulnerabilityAssessmentImpl.java:[131,65] incompatible types: com.azure.resourcemanager.sql.models.VulnerabilityAssessmentName cannot be converted to com.azure.resourcemanager.sql.models.SqlVulnerabilityAssessmentNameAutoGenerated
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-sql/src/main/java/com/azure/resourcemanager/sql/implementation/SqlVulnerabilityAssessmentImpl.java:[141,65] incompatible types: com.azure.resourcemanager.sql.models.VulnerabilityAssessmentName cannot be converted to com.azure.resourcemanager.sql.models.SqlVulnerabilityAssessmentNameAutoGenerated
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
**stderr**
```

```
</details>

<details>
<summary>visualstudio</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] ----< com.azure.resourcemanager:azure-resourcemanager-visualstudio >----
[INFO] Building Microsoft Azure SDK for VisualStudio Management 1.0.0-beta.1
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-visualstudio ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-visualstudio ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 59 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[13,50] <identifier> expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[17,5] ',', '}', or ';' expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[17,9] '}' expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[37,19] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[39,5] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[41,5] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[50,19] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[52,9] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[55,13] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[58,5] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[62,12] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[64,5] class, interface, or enum expected
[INFO] 12 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  1.709 s
[INFO] Finished at: 2022-12-28T19:41:37Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-visualstudio: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[13,50] <identifier> expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[17,5] ',', '}', or ';' expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[17,9] '}' expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[37,19] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[39,5] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[41,5] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[50,19] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[52,9] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[55,13] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[58,5] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[62,12] class, interface, or enum expected
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-visualstudio/src/main/java/com/azure/resourcemanager/visualstudio/models/AccountResourceRequestOperationType.java:[64,5] class, interface, or enum expected
[ERROR] -> [Help 1]
[ERROR] 
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR] 
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```
**stderr**
```

```
</details>
