# Java Codegen Report
Generated at 2023-10-17T20:02:34.650980
## Success
<details>
<summary>RP count: 220</summary>

- EnterpriseKnowledgeGraph
- addons
- adp
- advisor
- agrifood
- alertsmanagement
- analysisservices
- apicenter
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
- azurestackhci
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
- communication
- compute
- confidentialledger
- confluent
- connectedvmware
- consumption
- containerinstance
- containerregistry
- containerstorage
- cost-management
- cpim
- customer-insights
- customerlockbox
- customproviders
- dashboard
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
- deviceprovisioningservices
- deviceupdate
- devops
- devspaces
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
- extendedlocation
- fist
- fluidrelay
- frontdoor
- graphservicesprod
- guestconfiguration
- hanaonazure
- hardwaresecuritymodules
- hdinsight
- healthbot
- healthcareapis
- help
- hybridaks
- hybridcloud
- hybridcompute
- hybridconnectivity
- hybriddatamanager
- hybridkubernetes
- hybridnetwork
- imagebuilder
- iotcentral
- iothub
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
- migrate
- mixedreality
- mobilenetwork
- monitor
- mpcnetworkfunction
- msi
- mysql
- netapp
- network
- networkanalytics
- networkcloud
- networkfunction
- newrelic
- nginx
- notificationhubs
- oep
- operationalinsights
- operationsmanagement
- paloaltonetworks
- peering
- playwrighttesting
- policyinsights
- portal
- portalservices
- postgresql
- postgresqlhsc
- powerbidedicated
- powerbiembedded
- powerbiprivatelinks
- powerplatform
- privatedns
- providerhub
- purview
- purviewpolicy
- quantum
- recommendationsservice
- recoveryservices
- recoveryservicesbackup
- recoveryservicesdatareplication
- recoveryservicessiterecovery
- redhatopenshift
- redis
- redisenterprise
- relay
- reservations
- resourceconnector
- resourcemover
- resources
- riskiq
- saas
- scheduler
- scom
- scvmm
- search
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
- sphere
- sqlvirtualmachine
- storSimple1200Series
- storage
- storageactions
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
- cosmos-db

## Failure at Build
- authorization
- databox
- developerhub
- education
- iotspaces
- managednetworkfabric
- mediaservices
- orbital
- professionalservice
- quota
- resourcegraph
- security
- sql
- storagecache
- visualstudio

## Logs
<details>
<summary>adhybridhealthservice</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.6.3; node: v14.21.3]
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
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-authorization ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-authorization ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 426 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewScheduleDefinitionProperties.java:[689,43] method principalType() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewScheduleDefinitionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewRecurrenceSettings.java:[103,44] method type() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewRecurrenceSettings
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[291,19] method id() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[300,19] method displayName() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[345,19] method principalId() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[354,42] method principalType() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[363,19] method principalName() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[372,19] method userPrincipalName() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewHistoryScheduleSettings.java:[103,44] method type() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewHistoryScheduleSettings
[INFO] 9 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.762 s
[INFO] Finished at: 2023-10-17T18:27:36Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-authorization: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewScheduleDefinitionProperties.java:[689,43] method principalType() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewScheduleDefinitionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewRecurrenceSettings.java:[103,44] method type() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewRecurrenceSettings
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[291,19] method id() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[300,19] method displayName() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[345,19] method principalId() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[354,42] method principalType() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[363,19] method principalName() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewDecisionProperties.java:[372,19] method userPrincipalName() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewDecisionProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-authorization/src/main/java/com/azure/resourcemanager/authorization/fluent/models/AccessReviewHistoryScheduleSettings.java:[103,44] method type() is already defined in class com.azure.resourcemanager.authorization.fluent.models.AccessReviewHistoryScheduleSettings
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
AutoRest code generation utility [cli version: 3.6.3; node: v14.21.3]
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
INFORMATION (FluentMapper): Add Inner to response types: [DscNodeConfiguration, Credential, SourceControlSyncJob, TestJob, AgentRegistration, Watcher, Job, Statistics, Schedule, SourceControl, JobStream, HybridRunbookWorker, DscConfiguration, DscNodeReport, JobCollectionItem, JobSchedule, HybridRunbookWorkerGroup, TypeField, PrivateEndpointConnection, SoftwareUpdateConfigurationRunListResult, Runbook, Connection, RunbookDraftUndoEditResult, SourceControlSyncJobById, ConnectionType, DeletedAutomationAccountListResult, Certificate, PrivateLinkResource, SourceControlSyncJobStream, JobStreamListResult, RunbookDraft, SoftwareUpdateConfigurationMachineRunListResult, NodeCounts, SoftwareUpdateConfigurationListResult, LinkedWorkspace, SoftwareUpdateConfiguration, SoftwareUpdateConfigurationMachineRun, SoftwareUpdateConfigurationRun, Activity, DscNode, Webhook, AutomationAccount, Usage, DscCompilationJob, Variable, Operation, KeyListResult, SourceControlSyncJobStreamById, GraphicalRunbookContent, Module]
INFORMATION (FluentMapper): Add Inner for type 'RunbookDraft': [RunbookProperties, RunbookCreateOrUpdateProperties]
INFORMATION (FluentMapper): Add Inner for type 'RunbookProperties': []
INFORMATION (FluentMapper): Add Inner for type 'RunbookCreateOrUpdateProperties': [RunbookCreateOrUpdateParameters]
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
<summary>commerce</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.6.3; node: v14.21.3]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
info    | AutoRest core version selected from configuration: 3.4.5.
   Loading AutoRest core      '/home/runner/.autorest/@autorestcore@3.4.5/nodemodules/@autorest/core/dist' (3.4.5)
INFORMATION: > Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
INFORMATION: > Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
INFORMATION: > Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentnamer)
INFORMATION: > Loading AutoRest extension '@autorest/modelerfour' (4.18.1->4.18.1)
WARNING (PreCheck/SchemaMissingType): The schema 'UsageSample' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'UsageAggregation' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'UsageAggregationListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'RateCardQueryParameters' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ResourceRateCardInfo' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MeterInfo' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'OfferTermInfo' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MonetaryCredit' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MonetaryCommitment' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'RecurringCharge' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.
WARNING (PreCheck/DuplicateSchema): Duplicate Schema named OfferTermInfo -- discriminator: {"propertyName":"Name"} => <none>,properties: {"Name":{"x-ms-enum":{"name":"OfferTermInfo","modelAsString":false},"$ref":"#/components/schemas/OfferTermInfo","description":"Name of the offer term"},"EffectiveDate":{"$ref":"#/components/schemas/schemas:45","description":"Indicates the date from which the offer term is effective."}} => <none>,required: ["Name"] => <none>,type: undefined => "string",enum: undefined => ["Recurring Charge","Monetary Commitment","Monetary Credit"],x-ms-enum: undefined => {"name":"OfferTermInfo","modelAsString":false} 
WARNING (Modeler/MissingType): The schema 'InfoField' has no type or format information whatsoever. Location:
   file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/commerce/resource-manager/Microsoft.Commerce/preview/2015-06-01-preview/commerce.json#/components/schemas/InfoField
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
WARNING (NamingConflictResolver): Name conflict of choice with object 'OfferTermInfo'
INFORMATION (NamingConflictResolver): Rename choice from 'OfferTermInfo' to 'OfferTermInfoValue'
INFORMATION (ErrorTypeNormalization): Rename error from 'ErrorObjectResponse' to 'ManagementError'
INFORMATION (ErrorTypeNormalization): Rename error from 'ManagementError' to 'ManagementError'
INFORMATION (SchemaCleanup): Remove unused object schema 'RateCardQueryParameters'
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
INFORMATION (FluentMapper): Add Inner to response types: [UsageAggregation, ResourceRateCardInfo]

```
**stderr**
```
ERROR (FluentGen): Failed to successfully run fluentgen plugin java.lang.IllegalArgumentException: [JavaCheck/SchemaError] no common parent found for client models [UsageAggregationListResult, ManagementError]
java.lang.IllegalArgumentException: [JavaCheck/SchemaError] no common parent found for client models [UsageAggregationListResult, ManagementError]
	at com.azure.autorest.mapper.ClientMethodMapper.map(ClientMethodMapper.java:81)
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
<summary>cosmos-db</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.6.3; node: v14.21.3]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
info    | AutoRest core version selected from configuration: 3.4.5.
   Loading AutoRest core      '/home/runner/.autorest/@autorestcore@3.4.5/nodemodules/@autorest/core/dist' (3.4.5)
INFORMATION: > Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
INFORMATION: > Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
INFORMATION: > Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentnamer)
INFORMATION: > Loading AutoRest extension '@autorest/modelerfour' (4.18.1->4.18.1)
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountGetResults > properties > systemData)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:457:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountGetProperties > properties > databaseAccountOfferType)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1061:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountGetProperties > properties > apiProperties)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1168:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountGetProperties > properties > analyticalStorageConfiguration)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1177:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountGetProperties > properties > createMode)
  keys: [ [32m'type'[39m, [32m'default'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1187:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountGetProperties > properties > restoreParameters)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1193:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountGetProperties > properties > backupPolicy)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1198:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountGetProperties > properties > capacity)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1226:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountGetProperties > properties > keysMetadata)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1231:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountGetProperties > properties > minimalTlsVersion)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1240:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountGetProperties > properties > customerManagedKeyStatus)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1249:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountCreateUpdateProperties > properties > apiProperties)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1333:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountCreateUpdateProperties > properties > analyticalStorageConfiguration)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1342:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountCreateUpdateProperties > properties > createMode)
  keys: [ [32m'type'[39m, [32m'default'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1347:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountCreateUpdateProperties > properties > backupPolicy)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1353:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountCreateUpdateProperties > properties > restoreParameters)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1380:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountCreateUpdateProperties > properties > capacity)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1385:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountCreateUpdateProperties > properties > keysMetadata)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1390:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountCreateUpdateProperties > properties > minimalTlsVersion)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1399:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountCreateUpdateProperties > properties > customerManagedKeyStatus)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1408:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountUpdateProperties > properties > apiProperties)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1527:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountUpdateProperties > properties > analyticalStorageConfiguration)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1536:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountUpdateProperties > properties > backupPolicy)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1541:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountUpdateProperties > properties > capacity)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1568:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountUpdateProperties > properties > keysMetadata)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1573:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountUpdateProperties > properties > minimalTlsVersion)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1582:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountUpdateProperties > properties > customerManagedKeyStatus)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:1591:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > OptionsResource > properties > autoscaleSettings)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:2302:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountKeysMetadata > properties > primaryMasterKey)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:3246:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountKeysMetadata > properties > secondaryMasterKey)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:3251:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountKeysMetadata > properties > primaryReadonlyMasterKey)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:3256:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > DatabaseAccountKeysMetadata > properties > secondaryReadonlyMasterKey)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:3261:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > Usage > properties > name)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:3335:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > MetricDefinition > properties > name)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:3442:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > Metric > properties > name)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:3501:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > PercentileMetric > properties > name)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:3609:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > AnalyticalStorageConfiguration > properties > schemaType)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:3775:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > BackupPolicy > properties > type)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:3910:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > BackupPolicy > properties > migrationState)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:3915:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > BackupPolicyMigrationState > properties > status)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:3941:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > BackupPolicyMigrationState > properties > targetType)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:3946:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > PeriodicModeBackupPolicy > properties > periodicModeProperties)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:3981:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > ContinuousModeBackupPolicy > properties > continuousModeProperties)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:3998:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > PeriodicModeProperties > properties > backupStorageRedundancy)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:4022:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > ContinuousModeProperties > properties > tier)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:4033:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > LocationGetResult > properties > properties)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json:4058:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > RestorableDatabaseAccountGetResult > properties > properties)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/restorable.json:54:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > RestorableDatabaseAccountProperties > properties > apiType)
  keys: [ [32m'type'[39m, [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/restorable.json:104:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > RestorableSqlDatabaseGetResult > properties > properties)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/restorable.json:183:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > RestorableSqlDatabaseProperties > properties > resource > properties > operationType)
  keys: [ [32m'type'[39m, [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/restorable.json:219:7
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > RestorableSqlContainerGetResult > properties > properties)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/restorable.json:291:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > RestorableSqlContainerProperties > properties > resource > properties > operationType)
  keys: [ [32m'type'[39m, [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/restorable.json:327:7
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > RestorableMongodbDatabaseGetResult > properties > properties)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/restorable.json:435:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > RestorableMongodbDatabaseProperties > properties > resource > properties > operationType)
  keys: [ [32m'type'[39m, [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/restorable.json:471:7
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > RestorableMongodbCollectionGetResult > properties > properties)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/restorable.json:514:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > RestorableMongodbCollectionProperties > properties > resource > properties > operationType)
  keys: [ [32m'type'[39m, [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/restorable.json:550:7
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > RestorableGremlinDatabaseGetResult > properties > properties)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/restorable.json:639:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > RestorableGremlinDatabaseProperties > properties > resource > properties > operationType)
  keys: [ [32m'type'[39m, [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/restorable.json:675:7
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > RestorableGremlinGraphGetResult > properties > properties)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/restorable.json:718:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > RestorableGremlinGraphProperties > properties > resource > properties > operationType)
  keys: [ [32m'type'[39m, [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/restorable.json:754:7
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > RestorableTableGetResult > properties > properties)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/restorable.json:844:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > RestorableTableProperties > properties > resource > properties > operationType)
  keys: [ [32m'type'[39m, [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/restorable.json:880:7
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > BackupInformation > properties > continuousBackupInformation)
  keys: [ [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/restorable.json:969:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > ServiceResourceProperties > properties > status)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/services.json:61:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > RegionalServiceResource > properties > status)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-09-15/services.json:271:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > Resource > properties > systemData)
  keys: [ [32m'readOnly'[39m, [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v3/types.json:31:5
WARNING (PreCheck/SchemaMissingType): The schema 'DatabaseAccountsListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SqlDatabaseListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SqlContainerListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SqlStoredProcedureListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SqlUserDefinedFunctionListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SqlTriggerListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MongoDBDatabaseListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MongoDBCollectionListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'TableListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'CassandraKeyspaceListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'CassandraTableListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'GremlinDatabaseListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'GremlinGraphListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ErrorResponse' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'CloudError' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'FailoverPolicies' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'RegionForOnlineOffline' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ClientEncryptionKeyGetProperties-resource' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ThroughputSettingsGetProperties-resource' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SqlDatabaseGetProperties-resource' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SqlDatabaseGetProperties-options' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SqlContainerGetProperties-resource' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SqlContainerGetProperties-options' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SqlStoredProcedureGetProperties-resource' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SqlUserDefinedFunctionGetProperties-resource' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SqlTriggerGetProperties-resource' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MongoDBDatabaseGetProperties-resource' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MongoDBDatabaseGetProperties-options' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MongoDBCollectionGetProperties-resource' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MongoDBCollectionGetProperties-options' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'TableGetProperties-resource' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'TableGetProperties-options' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'CassandraKeyspaceGetProperties-resource' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'CassandraKeyspaceGetProperties-options' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'CassandraTableGetProperties-resource' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'CassandraTableGetProperties-options' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'GremlinDatabaseGetProperties-resource' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'GremlinDatabaseGetProperties-options' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'GremlinGraphGetProperties-resource' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'GremlinGraphGetProperties-options' with an undefined type and 'allOf'/'anyOf'/'oneOf' is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DatabaseAccountListReadOnlyKeysResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DatabaseAccountListKeysResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DatabaseAccountConnectionString' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'DatabaseAccountListConnectionStringsResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'ManagedServiceIdentity' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'OperationListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'UsagesResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Usage' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'PartitionUsagesResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'PartitionUsage' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MetricDefinitionsListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MetricDefinition' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MetricAvailability' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MetricListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'Metric' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MetricName' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'MetricValue' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'PercentileMetricListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'PercentileMetric' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'PercentileMetricValue' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'PartitionMetricListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'PartitionMetric' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'NotebookWorkspaceConnectionInfoResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SqlRoleDefinitionResource' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SqlRoleDefinitionListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
WARNING (PreCheck/SchemaMissingType): The schema 'SqlRoleAssignmentListResult' with an undefined type and declared properties is a bit ambigious. This has been auto-corrected to 'type:object'
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
INFORMATION (SchemaNameNormalization): Override default name, from 'eTag' to 'etag'
INFORMATION (SchemaNameNormalization): Override default name, from 'userName' to 'username'
WARNING (SchemaNameNormalization): Rename schema default name, from 'Components1Jq1T4ISchemasManagedserviceidentityPropertiesUserassignedidentitiesAdditionalproperties' to 'ManagedServiceIdentityUserAssignedIdentities'
INFORMATION (OperationNameNormalization): Rename operation from 'get' to 'getByResourceGroup', in operation group 'DatabaseAccounts'
INFORMATION (OperationNameNormalization): Rename operation from 'listBySubscription' to 'list', in operation group 'CassandraClusters'
INFORMATION (OperationNameNormalization): Rename operation from 'get' to 'getByResourceGroup', in operation group 'CassandraClusters'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'ProxyResource'
INFORMATION (ResourceTypeNormalization): Add parent Resource, for 'ArmResourceProperties'
INFORMATION (ResourceTypeNormalization): Add parent ProxyResource, for 'ArmProxyResource'
INFORMATION (ResourceTypeNormalization): Add parent Resource, for 'ManagedCassandraArmResourceProperties'
INFORMATION (ErrorTypeNormalization): Rename error from 'ErrorResponse' to 'ManagementError'
INFORMATION (ErrorTypeNormalization): Rename error from 'CloudError' to 'ManagementError'
INFORMATION (SchemaCleanup): Remove unused object schema 'Resource'
INFORMATION (SchemaCleanup): Remove unused object schema 'DataTransferServiceResource'
INFORMATION (SchemaCleanup): Remove unused object schema 'SqlDedicatedGatewayServiceResource'
INFORMATION (SchemaCleanup): Remove unused object schema 'GraphApiComputeServiceResource'
INFORMATION (SchemaCleanup): Remove unused object schema 'MaterializedViewsBuilderServiceResource'
INFORMATION (SchemaCleanup): Remove unused choice schema 'CreatedByType'
INFORMATION (SchemaCleanup): Remove unused choice schema 'NodeStatus'
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
INFORMATION (FluentMapper): Add Inner to response types: [MongoDBCollectionGetResults, PrivateLinkResource, RestorableGremlinGraphGetResult, LocationGetResult, RestorableMongodbDatabaseGetResult, PrivateEndpointConnection, DataCenterResource, Metric, BackupInformation, NotebookWorkspaceConnectionInfoResult, RestorableMongodbResourcesGetResult, SqlTriggerGetResults, SqlUserDefinedFunctionGetResults, CassandraTableGetResults, ClusterResource, DatabaseAccountGetResults, Usage, CassandraClusterPublicStatus, RestorableTableResourcesGetResult, CassandraKeyspaceGetResults, RestorableSqlResourcesGetResult, NotebookWorkspace, DatabaseAccountListReadOnlyKeysResult, RestorableGremlinResourcesGetResult, SqlRoleAssignmentGetResults, Operation, PartitionMetric, TableGetResults, RestorableMongodbCollectionGetResult, DatabaseAccountListKeysResult, SqlStoredProcedureGetResults, ClientEncryptionKeyGetResults, DatabaseAccountListConnectionStringsResult, RestorableTableGetResult, GremlinDatabaseGetResults, PercentileMetric, MongoUserDefinitionGetResults, SqlContainerGetResults, MongoDBDatabaseGetResults, SqlDatabaseGetResults, PartitionUsage, ThroughputSettingsGetResults, ServiceResource, RestorableGremlinDatabaseGetResult, RestorableDatabaseAccountGetResult, MetricDefinition, RestorableSqlContainerGetResult, RestorableSqlDatabaseGetResult, MongoRoleDefinitionGetResults, SqlRoleDefinitionGetResults, GremlinGraphGetResults, CommandOutput]
INFORMATION (FluentGen): Java template for client model
INFORMATION (FluentGen): Process for Fluent Lite, SDK integration disabled
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'DatabaseAccountGetResults', method reference 'createOrUpdate', body parameter 'DatabaseAccountCreateUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'DatabaseAccountGetResults' as category RESOURCEGROUP_ASPARENT
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'DatabaseAccountGetResults', method reference 'update', body parameter 'DatabaseAccountUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'DatabaseAccountGetResults', method reference 'getByResourceGroup'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'DatabaseAccountGetResults', method reference 'delete'
INFORMATION (ResourceActions): ResourceActions: Fluent model 'DatabaseAccountGetResults', action methods: [offlineRegion, listConnectionStrings, listKeys, onlineRegion, regenerateKey, failoverPriorityChange, listReadOnlyKeys]
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'SqlDatabaseGetResults', method reference 'createUpdateSqlDatabase', body parameter 'SqlDatabaseCreateUpdateParameters'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'SqlContainerGetResults', method reference 'createUpdateSqlContainer', body parameter 'SqlContainerCreateUpdateParameters'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'ClientEncryptionKeyGetResults', method reference 'createUpdateClientEncryptionKey', body parameter 'ClientEncryptionKeyCreateUpdateParameters'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'SqlStoredProcedureGetResults', method reference 'createUpdateSqlStoredProcedure', body parameter 'SqlStoredProcedureCreateUpdateParameters'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'SqlUserDefinedFunctionGetResults', method reference 'createUpdateSqlUserDefinedFunction', body parameter 'SqlUserDefinedFunctionCreateUpdateParameters'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'SqlTriggerGetResults', method reference 'createUpdateSqlTrigger', body parameter 'SqlTriggerCreateUpdateParameters'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'SqlRoleDefinitionGetResults', method reference 'createUpdateSqlRoleDefinition', body parameter 'SqlRoleDefinitionCreateUpdateParameters'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'SqlRoleAssignmentGetResults', method reference 'createUpdateSqlRoleAssignment', body parameter 'SqlRoleAssignmentCreateUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'SqlDatabaseGetResults' as category NESTED_CHILD
INFORMATION (ResourceParser): Fluent model 'SqlContainerGetResults' as category NESTED_CHILD
INFORMATION (ResourceParser): Fluent model 'ClientEncryptionKeyGetResults' as category NESTED_CHILD
INFORMATION (ResourceParser): Fluent model 'SqlStoredProcedureGetResults' as category NESTED_CHILD
INFORMATION (ResourceParser): Fluent model 'SqlUserDefinedFunctionGetResults' as category NESTED_CHILD
INFORMATION (ResourceParser): Fluent model 'SqlTriggerGetResults' as category NESTED_CHILD
INFORMATION (ResourceParser): Fluent model 'SqlRoleDefinitionGetResults' as category NESTED_CHILD
INFORMATION (ResourceParser): Fluent model 'SqlRoleAssignmentGetResults' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'SqlDatabaseGetResults', method reference 'createUpdateSqlDatabase', body parameter 'SqlDatabaseCreateUpdateParameters'
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'SqlContainerGetResults', method reference 'createUpdateSqlContainer', body parameter 'SqlContainerCreateUpdateParameters'
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'ClientEncryptionKeyGetResults', method reference 'createUpdateClientEncryptionKey', body parameter 'ClientEncryptionKeyCreateUpdateParameters'
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'SqlStoredProcedureGetResults', method reference 'createUpdateSqlStoredProcedure', body parameter 'SqlStoredProcedureCreateUpdateParameters'
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'SqlUserDefinedFunctionGetResults', method reference 'createUpdateSqlUserDefinedFunction', body parameter 'SqlUserDefinedFunctionCreateUpdateParameters'
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'SqlTriggerGetResults', method reference 'createUpdateSqlTrigger', body parameter 'SqlTriggerCreateUpdateParameters'
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'SqlRoleDefinitionGetResults', method reference 'createUpdateSqlRoleDefinition', body parameter 'SqlRoleDefinitionCreateUpdateParameters'
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'SqlRoleAssignmentGetResults', method reference 'createUpdateSqlRoleAssignment', body parameter 'SqlRoleAssignmentCreateUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'SqlDatabaseGetResults', method reference 'getSqlDatabase'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'SqlContainerGetResults', method reference 'getSqlContainer'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'ClientEncryptionKeyGetResults', method reference 'getClientEncryptionKey'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'SqlStoredProcedureGetResults', method reference 'getSqlStoredProcedure'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'SqlUserDefinedFunctionGetResults', method reference 'getSqlUserDefinedFunction'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'SqlTriggerGetResults', method reference 'getSqlTrigger'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'SqlRoleDefinitionGetResults', method reference 'getSqlRoleDefinition'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'SqlRoleAssignmentGetResults', method reference 'getSqlRoleAssignment'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'SqlDatabaseGetResults', method reference 'deleteSqlDatabase'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'SqlContainerGetResults', method reference 'deleteSqlContainer'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'SqlStoredProcedureGetResults', method reference 'deleteSqlStoredProcedure'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'SqlUserDefinedFunctionGetResults', method reference 'deleteSqlUserDefinedFunction'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'SqlTriggerGetResults', method reference 'deleteSqlTrigger'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'SqlRoleDefinitionGetResults', method reference 'deleteSqlRoleDefinition'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'SqlRoleAssignmentGetResults', method reference 'deleteSqlRoleAssignment'
INFORMATION (ResourceActions): ResourceActions: Fluent model 'SqlContainerGetResults', action methods: [retrieveContinuousBackupInformation]
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'MongoDBDatabaseGetResults', method reference 'createUpdateMongoDBDatabase', body parameter 'MongoDBDatabaseCreateUpdateParameters'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'MongoDBCollectionGetResults', method reference 'createUpdateMongoDBCollection', body parameter 'MongoDBCollectionCreateUpdateParameters'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'MongoRoleDefinitionGetResults', method reference 'createUpdateMongoRoleDefinition', body parameter 'MongoRoleDefinitionCreateUpdateParameters'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'MongoUserDefinitionGetResults', method reference 'createUpdateMongoUserDefinition', body parameter 'MongoUserDefinitionCreateUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'MongoDBDatabaseGetResults' as category NESTED_CHILD
INFORMATION (ResourceParser): Fluent model 'MongoDBCollectionGetResults' as category NESTED_CHILD
INFORMATION (ResourceParser): Fluent model 'MongoRoleDefinitionGetResults' as category NESTED_CHILD
INFORMATION (ResourceParser): Fluent model 'MongoUserDefinitionGetResults' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'MongoDBDatabaseGetResults', method reference 'createUpdateMongoDBDatabase', body parameter 'MongoDBDatabaseCreateUpdateParameters'
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'MongoDBCollectionGetResults', method reference 'createUpdateMongoDBCollection', body parameter 'MongoDBCollectionCreateUpdateParameters'
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'MongoRoleDefinitionGetResults', method reference 'createUpdateMongoRoleDefinition', body parameter 'MongoRoleDefinitionCreateUpdateParameters'
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'MongoUserDefinitionGetResults', method reference 'createUpdateMongoUserDefinition', body parameter 'MongoUserDefinitionCreateUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'MongoDBDatabaseGetResults', method reference 'getMongoDBDatabase'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'MongoDBCollectionGetResults', method reference 'getMongoDBCollection'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'MongoRoleDefinitionGetResults', method reference 'getMongoRoleDefinition'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'MongoUserDefinitionGetResults', method reference 'getMongoUserDefinition'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'MongoDBDatabaseGetResults', method reference 'deleteMongoDBDatabase'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'MongoDBCollectionGetResults', method reference 'deleteMongoDBCollection'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'MongoRoleDefinitionGetResults', method reference 'deleteMongoRoleDefinition'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'MongoUserDefinitionGetResults', method reference 'deleteMongoUserDefinition'
INFORMATION (ResourceActions): ResourceActions: Fluent model 'MongoDBCollectionGetResults', action methods: [retrieveContinuousBackupInformation]
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'TableGetResults', method reference 'createUpdateTable', body parameter 'TableCreateUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'TableGetResults' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'TableGetResults', method reference 'createUpdateTable', body parameter 'TableCreateUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'TableGetResults', method reference 'getTable'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'TableGetResults', method reference 'deleteTable'
INFORMATION (ResourceActions): ResourceActions: Fluent model 'TableGetResults', action methods: [retrieveContinuousBackupInformation]
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'CassandraKeyspaceGetResults', method reference 'createUpdateCassandraKeyspace', body parameter 'CassandraKeyspaceCreateUpdateParameters'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'CassandraTableGetResults', method reference 'createUpdateCassandraTable', body parameter 'CassandraTableCreateUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'CassandraKeyspaceGetResults' as category NESTED_CHILD
INFORMATION (ResourceParser): Fluent model 'CassandraTableGetResults' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'CassandraKeyspaceGetResults', method reference 'createUpdateCassandraKeyspace', body parameter 'CassandraKeyspaceCreateUpdateParameters'
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'CassandraTableGetResults', method reference 'createUpdateCassandraTable', body parameter 'CassandraTableCreateUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'CassandraKeyspaceGetResults', method reference 'getCassandraKeyspace'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'CassandraTableGetResults', method reference 'getCassandraTable'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'CassandraKeyspaceGetResults', method reference 'deleteCassandraKeyspace'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'CassandraTableGetResults', method reference 'deleteCassandraTable'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'GremlinDatabaseGetResults', method reference 'createUpdateGremlinDatabase', body parameter 'GremlinDatabaseCreateUpdateParameters'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'GremlinGraphGetResults', method reference 'createUpdateGremlinGraph', body parameter 'GremlinGraphCreateUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'GremlinDatabaseGetResults' as category NESTED_CHILD
INFORMATION (ResourceParser): Fluent model 'GremlinGraphGetResults' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'GremlinDatabaseGetResults', method reference 'createUpdateGremlinDatabase', body parameter 'GremlinDatabaseCreateUpdateParameters'
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'GremlinGraphGetResults', method reference 'createUpdateGremlinGraph', body parameter 'GremlinGraphCreateUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'GremlinDatabaseGetResults', method reference 'getGremlinDatabase'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'GremlinGraphGetResults', method reference 'getGremlinGraph'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'GremlinDatabaseGetResults', method reference 'deleteGremlinDatabase'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'GremlinGraphGetResults', method reference 'deleteGremlinGraph'
INFORMATION (ResourceActions): ResourceActions: Fluent model 'GremlinGraphGetResults', action methods: [retrieveContinuousBackupInformation]
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'ClusterResource', method reference 'createUpdate', body parameter 'ClusterResourceInner'
INFORMATION (ResourceParser): Fluent model 'ClusterResource' as category RESOURCEGROUP_ASPARENT
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'ClusterResource', method reference 'update', body parameter 'ClusterResourceInner'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'ClusterResource', method reference 'getByResourceGroup'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'ClusterResource', method reference 'delete'
INFORMATION (ResourceActions): ResourceActions: Fluent model 'ClusterResource', action methods: [invokeCommand, deallocate, start]
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'DataCenterResource', method reference 'createUpdate', body parameter 'DataCenterResourceInner'
INFORMATION (ResourceParser): Fluent model 'DataCenterResource' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'DataCenterResource', method reference 'update', body parameter 'DataCenterResourceInner'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'DataCenterResource', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'DataCenterResource', method reference 'delete'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'NotebookWorkspace', method reference 'createOrUpdate', body parameter 'NotebookWorkspaceCreateUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'NotebookWorkspace' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'NotebookWorkspace', method reference 'createOrUpdate', body parameter 'NotebookWorkspaceCreateUpdateParameters'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'NotebookWorkspace', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'NotebookWorkspace', method reference 'delete'
INFORMATION (ResourceActions): ResourceActions: Fluent model 'NotebookWorkspace', action methods: [start, listConnectionInfo, regenerateAuthToken]
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'PrivateEndpointConnection', method reference 'createOrUpdate', body parameter 'PrivateEndpointConnectionInner'
INFORMATION (ResourceParser): Fluent model 'PrivateEndpointConnection' as category NESTED_CHILD
INFORMATION (ResourceUpdate): ResourceUpdate: Fluent model 'PrivateEndpointConnection', method reference 'createOrUpdate', body parameter 'PrivateEndpointConnectionInner'
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'PrivateEndpointConnection', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'PrivateEndpointConnection', method reference 'delete'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'ServiceResource', method reference 'create', body parameter 'ServiceResourceCreateUpdateParameters'
INFORMATION (ResourceParser): Fluent model 'ServiceResource' as category NESTED_CHILD
INFORMATION (ResourceRefresh): ResourceRefresh: Fluent model 'ServiceResource', method reference 'get'
INFORMATION (ResourceDelete): ResourceDelete: Fluent model 'ServiceResource', method reference 'delete'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountDelete'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountFailoverPriorityChange'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountListByResourceGroup'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountListKeys'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountListConnectionStrings'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountListConnectionStringsMongo'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountOfflineRegion'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountOnlineRegion'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountListReadOnlyKeys'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountListReadOnlyKeys'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountRegenerateKey'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountCheckNameExists'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountGetMetrics'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountGetUsages'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountGetMetricDefinitions'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBRestoreDatabaseAccountCreateUpdate.json'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'DatabaseAccountGetResults', resource define method 'define'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBDatabaseAccountCreateMax'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBDatabaseAccountCreateMin'
INFORMATION (ExampleParser): Parse resource update example 'CosmosDBDatabaseAccountPatch'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBOperationsList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseGetMetrics'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseGetUsages'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseGetMetricDefinitions'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBCollectionGetMetrics'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBCollectionGetUsages'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBCollectionGetMetricDefinitions'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBRegionCollectionGetMetrics'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountRegionGetMetrics'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountRegionGetMetrics'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountRegionGetMetrics'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountRegionGetMetrics'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountRegionGetMetrics'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountRegionGetMetrics'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBCollectionGetUsages'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountRegionGetMetrics'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBDatabaseAccountRegionGetMetrics'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlDatabaseList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlDatabaseGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlDatabaseDelete'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlDatabaseThroughputGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlDatabaseThroughputUpdate'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlDatabaseMigrateToAutoscale'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlDatabaseMigrateToManualThroughput'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlContainerList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlContainerGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlContainerDelete'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlContainerThroughputGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlContainerThroughputUpdate'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlContainerMigrateToAutoscale'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlContainerMigrateToManualThroughput'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBClientEncryptionKeysList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBClientEncryptionKeyGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlStoredProcedureList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlStoredProcedureGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlStoredProcedureDelete'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlUserDefinedFunctionList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlUserDefinedFunctionGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlUserDefinedFunctionDelete'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlTriggerList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlTriggerGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlTriggerDelete'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlRoleDefinitionGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlRoleDefinitionDelete'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlRoleDefinitionList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlRoleAssignmentGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlRoleAssignmentDelete'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlRoleAssignmentList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBSqlContainerBackupInformation'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBSqlDatabaseCreateUpdate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'SqlDatabaseGetResults', resource define method 'defineUpdateSqlDatabase'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBSqlContainerCreateUpdate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'SqlContainerGetResults', resource define method 'defineUpdateSqlContainer'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBClientEncryptionKeyCreateUpdate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'ClientEncryptionKeyGetResults', resource define method 'defineUpdateClientEncryptionKey'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBSqlStoredProcedureCreateUpdate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'SqlStoredProcedureGetResults', resource define method 'defineUpdateSqlStoredProcedure'
WARNING (ExampleParser): Failed to assign sample value to required stage 'WithLocation'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBSqlUserDefinedFunctionCreateUpdate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'SqlUserDefinedFunctionGetResults', resource define method 'defineUpdateSqlUserDefinedFunction'
WARNING (ExampleParser): Failed to assign sample value to required stage 'WithLocation'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBSqlTriggerCreateUpdate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'SqlTriggerGetResults', resource define method 'defineUpdateSqlTrigger'
WARNING (ExampleParser): Failed to assign sample value to required stage 'WithLocation'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBSqlRoleDefinitionCreateUpdate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'SqlRoleDefinitionGetResults', resource define method 'defineUpdateSqlRoleDefinition'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBSqlRoleAssignmentCreateUpdate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'SqlRoleAssignmentGetResults', resource define method 'defineUpdateSqlRoleAssignment'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoDBDatabaseList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoDBDatabaseGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoDBDatabaseDelete'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoDBDatabaseThroughputGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoDBDatabaseThroughputUpdate'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoDBDatabaseMigrateToAutoscale'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoDBDatabaseMigrateToManualThroughput'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoDBCollectionList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoDBCollectionGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoDBCollectionDelete'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoDBCollectionThroughputGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoDBCollectionThroughputUpdate'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoDBCollectionMigrateToAutoscale'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoDBCollectionMigrateToManualThroughput'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoRoleDefinitionGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoDBRoleDefinitionDelete'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoDBRoleDefinitionList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoDBUserDefinitionGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoDBUserDefinitionDelete'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoDBUserDefinitionList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBMongoDBCollectionBackupInformation'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBMongoDBDatabaseCreateUpdate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'MongoDBDatabaseGetResults', resource define method 'defineUpdateMongoDBDatabase'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBMongoDBCollectionCreateUpdate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'MongoDBCollectionGetResults', resource define method 'defineUpdateMongoDBCollection'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBMongoDBRoleDefinitionCreateUpdate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'MongoRoleDefinitionGetResults', resource define method 'defineUpdateMongoRoleDefinition'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBMongoDBUserDefinitionCreateUpdate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'MongoUserDefinitionGetResults', resource define method 'defineUpdateMongoUserDefinition'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBTableList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBTableGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBTableDelete'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBTableThroughputGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBTableThroughputUpdate'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBTableMigrateToAutoscale'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBTableMigrateToManualThroughput'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBTableCollectionBackupInformation'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBTableReplace'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'TableGetResults', resource define method 'defineUpdateTable'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBCassandraKeyspaceList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBCassandraKeyspaceGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBCassandraKeyspaceDelete'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBCassandraKeyspaceThroughputGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBCassandraKeyspaceThroughputUpdate'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBCassandraKeyspaceMigrateToAutoscale'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBCassandraKeyspaceMigrateToManualThroughput'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBCassandraTableList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBCassandraTableGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBCassandraTableDelete'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBCassandraTableThroughputGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBCassandraTableThroughputUpdate'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBCassandraTableMigrateToAutoscale'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBCassandraTableMigrateToManualThroughput'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBCassandraKeyspaceCreateUpdate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'CassandraKeyspaceGetResults', resource define method 'defineUpdateCassandraKeyspace'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBCassandraTableCreateUpdate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'CassandraTableGetResults', resource define method 'defineUpdateCassandraTable'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBGremlinDatabaseList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBGremlinDatabaseGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBGremlinDatabaseDelete'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBGremlinDatabaseThroughputGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBGremlinDatabaseThroughputUpdate'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBGremlinDatabaseMigrateToAutoscale'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBGremlinDatabaseMigrateToManualThroughput'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBGremlinGraphList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBGremlinGraphGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBGremlinGraphDelete'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBGremlinGraphThroughputGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBGremlinGraphThroughputUpdate'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBGremlinGraphMigrateToAutoscale'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBGremlinGraphMigrateToManualThroughput'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBGremlinGraphBackupInformation'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBGremlinDatabaseCreateUpdate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'GremlinDatabaseGetResults', resource define method 'defineUpdateGremlinDatabase'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBGremlinGraphCreateUpdate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'GremlinGraphGetResults', resource define method 'defineUpdateGremlinGraph'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBLocationList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBLocationGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBManagedCassandraClusterListBySubscription'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBManagedCassandraClusterListByResourceGroup'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBManagedCassandraClusterGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBManagedCassandraClusterDelete'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBManagedCassandraCommand'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBManagedCassandraClusterDeallocate'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBManagedCassandraClusterStart'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBManagedCassandraStatus'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBManagedCassandraClusterCreate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'ClusterResource', resource define method 'defineUpdate'
INFORMATION (ExampleParser): Parse resource update example 'CosmosDBManagedCassandraClusterPatch'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBManagedCassandraDataCenterList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBManagedCassandraDataCenterGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBManagedCassandraDataCenterDelete'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBManagedCassandraDataCenterCreate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'DataCenterResource', resource define method 'defineUpdate'
INFORMATION (ExampleParser): Parse resource update example 'CosmosDBManagedCassandraDataCenterUpdate'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBNotebookWorkspaceList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBNotebookWorkspaceGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBNotebookWorkspaceDelete'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBNotebookWorkspaceListConnectionInfo'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBNotebookWorkspaceRegenerateAuthToken'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBNotebookWorkspaceStart'
INFORMATION (ExampleParser): Parse resource create example 'CosmosDBNotebookWorkspaceCreate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'NotebookWorkspace', resource define method 'define'
INFORMATION (ExampleParser): Parse collection method example 'Gets private endpoint connection.'
INFORMATION (ExampleParser): Parse collection method example 'Gets private endpoint connection.'
INFORMATION (ExampleParser): Parse collection method example 'Deletes a private endpoint connection with a given name.'
INFORMATION (ExampleParser): Parse resource create example 'Approve or reject a private endpoint connection with a given name.'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'PrivateEndpointConnection', resource define method 'define'
INFORMATION (ExampleParser): Parse collection method example 'Gets private endpoint connection.'
INFORMATION (ExampleParser): Parse collection method example 'Gets private endpoint connection.'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBRestorableDatabaseAccountList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBRestorableDatabaseAccountNoLocationList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBRestorableDatabaseAccountGet'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBRestorableSqlDatabaseList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBRestorableSqlContainerList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBRestorableSqlResourceList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBRestorableMongodbDatabaseList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBRestorableMongodbCollectionList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBRestorableMongodbResourceList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBRestorableGremlinDatabaseList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBRestorableGremlinGraphList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBRestorableGremlinResourceList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBRestorableTableList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBRestorableTableResourceList'
INFORMATION (ExampleParser): Parse collection method example 'CosmosDBServicesList'
INFORMATION (ExampleParser): Parse collection method example 'DataTransferServiceGet'
INFORMATION (ExampleParser): Parse collection method example 'GraphAPIComputeServiceGet'
INFORMATION (ExampleParser): Parse collection method example 'SqlDedicatedGatewayServiceGet'
INFORMATION (ExampleParser): Parse collection method example 'MaterializedViewsBuilderServiceGet'
INFORMATION (ExampleParser): Parse collection method example 'SqlDedicatedGatewayServiceDelete'
INFORMATION (ExampleParser): Parse collection method example 'MaterializedViewsBuilderServiceDelete'
INFORMATION (ExampleParser): Parse collection method example 'DataTransferServiceDelete'
INFORMATION (ExampleParser): Parse collection method example 'GraphAPIComputeServiceDelete'
INFORMATION (ExampleParser): Parse resource create example 'SqlDedicatedGatewayServiceCreate'
INFORMATION (ResourceCreate): ResourceCreate: Fluent model 'ServiceResource', resource define method 'define'
INFORMATION (ExampleParser): Parse resource create example 'DataTransferServiceCreate'
INFORMATION (ExampleParser): Parse resource create example 'MaterializedViewsBuilderServiceCreate'
INFORMATION (ExampleParser): Parse resource create example 'GraphAPIComputeServiceCreate'
INFORMATION (FluentJavaSettings): Option, string, tag : package-2023-09
INFORMATION (FluentJavaSettings): Option, string, base-folder : .
INFORMATION (FluentJavaSettings): Option, string, output-folder : /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-cosmos-db
INFORMATION (FluentJavaSettings): Option, string, azure-libraries-for-java-folder : null
INFORMATION (FluentJavaSettings): List of input files : [Microsoft.DocumentDB/stable/2023-09-15/cosmos-db.json, Microsoft.DocumentDB/stable/2023-09-15/managedCassandra.json, Microsoft.DocumentDB/stable/2023-09-15/mongorbac.json, Microsoft.DocumentDB/stable/2023-09-15/notebook.json, Microsoft.DocumentDB/stable/2023-09-15/privateEndpointConnection.json, Microsoft.DocumentDB/stable/2023-09-15/privateLinkResources.json, Microsoft.DocumentDB/stable/2023-09-15/rbac.json, Microsoft.DocumentDB/stable/2023-09-15/restorable.json, Microsoft.DocumentDB/stable/2023-09-15/services.json]
INFORMATION (FluentGen): Write Java
INFORMATION (JavaFormatter): Java version: 11.0.20
INFORMATION (JavaFormatter): Java formatter enabled

```
**stderr**
```
FATAL (FluentGen): Unhandled error: Java heap space
java.lang.OutOfMemoryError: Java heap space
	at java.base/java.util.Arrays.copyOf(Arrays.java:3745)
	at java.base/java.lang.AbstractStringBuilder.ensureCapacityInternal(AbstractStringBuilder.java:172)
	at java.base/java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:538)
	at java.base/java.lang.StringBuilder.append(StringBuilder.java:179)
	at com.azure.autorest.fluent.checker.JavaFormatter.fixOverlongStringLiteral(JavaFormatter.java:122)
	at com.azure.autorest.fluent.checker.JavaFormatter.format(JavaFormatter.java:68)
	at com.azure.autorest.fluent.FluentGen.processInternal(FluentGen.java:117)
	at com.azure.autorest.extension.base.plugin.NewPlugin.process(NewPlugin.java:206)
	at com.azure.autorest.fluent.Main.lambda$main$1(Main.java:18)
	at com.azure.autorest.fluent.Main$$Lambda$15/0x00000001000f0440.apply(Unknown Source)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$dispatch$2(Connection.java:151)
	at com.azure.autorest.extension.base.jsonrpc.Connection$$Lambda$16/0x00000001000f0840.apply(Unknown Source)
	at com.azure.autorest.extension.base.jsonrpc.Connection.lambda$process$3(Connection.java:270)
	at com.azure.autorest.extension.base.jsonrpc.Connection$$Lambda$19/0x00000001000f7840.run(Unknown Source)
	at java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:515)
	at java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
	at java.base/java.lang.Thread.run(Thread.java:829)

  Error: Plugin fluentgen reported failure.

```
</details>

<details>
<summary>databox</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] ------< com.azure.resourcemanager:azure-resourcemanager-databox >-------
[INFO] Building Microsoft Azure SDK for DataBox Management 1.0.0-beta.1
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-databox ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-databox/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-databox ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 202 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-databox/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-databox/src/main/java/com/azure/resourcemanager/databox/models/PortalDelayErrorCode.java:[25,46] variable ACTIVE_ORDER_LIMIT_BREACHED_DELAY_1 is already defined in class com.azure.resourcemanager.databox.models.PortalDelayErrorCode
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.156 s
[INFO] Finished at: 2023-10-17T18:44:36Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-databox: Compilation failure
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-databox/src/main/java/com/azure/resourcemanager/databox/models/PortalDelayErrorCode.java:[25,46] variable ACTIVE_ORDER_LIMIT_BREACHED_DELAY_1 is already defined in class com.azure.resourcemanager.databox.models.PortalDelayErrorCode
[ERROR] 
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
<summary>developerhub</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] ----< com.azure.resourcemanager:azure-resourcemanager-developerhub >----
[INFO] Building Microsoft Azure SDK for DevHub Management 1.0.0-beta.1
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-developerhub ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-developerhub/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-developerhub ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 64 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-developerhub/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-developerhub/src/main/java/com/azure/resourcemanager/developerhub/fluent/models/WorkflowProperties.java:[642,19] method namespace() is already defined in class com.azure.resourcemanager.developerhub.fluent.models.WorkflowProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-developerhub/src/main/java/com/azure/resourcemanager/developerhub/fluent/models/WorkflowProperties.java:[654,31] method withNamespace(java.lang.String) is already defined in class com.azure.resourcemanager.developerhub.fluent.models.WorkflowProperties
[INFO] 2 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.825 s
[INFO] Finished at: 2023-10-17T18:51:03Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-developerhub: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-developerhub/src/main/java/com/azure/resourcemanager/developerhub/fluent/models/WorkflowProperties.java:[642,19] method namespace() is already defined in class com.azure.resourcemanager.developerhub.fluent.models.WorkflowProperties
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-developerhub/src/main/java/com/azure/resourcemanager/developerhub/fluent/models/WorkflowProperties.java:[654,31] method withNamespace(java.lang.String) is already defined in class com.azure.resourcemanager.developerhub.fluent.models.WorkflowProperties
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
<summary>education</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] -----< com.azure.resourcemanager:azure-resourcemanager-education >------
[INFO] Building Microsoft Azure SDK for Education Management 1.0.0-beta.1
[INFO]   from pom.xml
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
[INFO] Total time:  2.865 s
[INFO] Finished at: 2023-10-17T18:55:35Z
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
<summary>eventhub</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.6.3; node: v14.21.3]
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
Process() cancelled due to failure 
ERROR: Schema violation: should NOT have fewer than 10 characters (paths > /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventHub/namespaces/{namespaceName}/failover > post > x-ms-examples > NameSpaceCreate > responses > 202 > headers > location)
  limit: 10
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/eventhub/resource-manager/Microsoft.EventHub/preview/2023-01-01-preview/namespaces-preview.json:1052:9
ERROR: Schema violation: should match pattern "^(http|https)://.*" (paths > /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventHub/namespaces/{namespaceName}/failover > post > x-ms-examples > NameSpaceCreate > responses > 202 > headers > location)
  pattern: ^(http|https)://.*
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/eventhub/resource-manager/Microsoft.EventHub/preview/2023-01-01-preview/namespaces-preview.json:1052:9
ERROR: Schema violation: should NOT have fewer than 10 characters (paths > /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventHub/namespaces/{namespaceName}/failover > post > x-ms-examples > NameSpaceCreate > responses > 202 > headers > location)
  limit: 10
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/eventhub/resource-manager/Microsoft.EventHub/preview/2023-01-01-preview/namespaces-preview.json:1052:9
ERROR: Schema violation: should match pattern "^(http|https)://.*" (paths > /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.EventHub/namespaces/{namespaceName}/failover > post > x-ms-examples > NameSpaceCreate > responses > 202 > headers > location)
  pattern: ^(http|https)://.*
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/eventhub/resource-manager/Microsoft.EventHub/preview/2023-01-01-preview/namespaces-preview.json:1052:9

```
</details>

<details>
<summary>intune</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.6.3; node: v14.21.3]
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
INFORMATION (FluentMapper): Add Inner to response types: [AndroidMamPolicy, Application, OperationResult, IOsmamPolicy, Location, FlaggedUser, Device, WipeDeviceOperationResult, GroupItem, FlaggedEnrolledApp]

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
[INFO]   from pom.xml
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
[INFO] Total time:  2.008 s
[INFO] Finished at: 2023-10-17T19:04:21Z
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
AutoRest code generation utility [cli version: 3.6.3; node: v14.21.3]
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
<summary>managednetworkfabric</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] --< com.azure.resourcemanager:azure-resourcemanager-managednetworkfabric >--
[INFO] Building Microsoft Azure SDK for Managed Network Fabric Management 1.0.0-beta.1
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-managednetworkfabric ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-managednetworkfabric/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-managednetworkfabric ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 572 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-managednetworkfabric/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-managednetworkfabric/src/main/java/com/azure/resourcemanager/managednetworkfabric/implementation/ValidateConfigurationResponseImpl.java:[24,33] cannot find symbol
  symbol:   method configurationState()
  location: class com.azure.resourcemanager.managednetworkfabric.fluent.models.ValidateConfigurationResponseInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-managednetworkfabric/src/main/java/com/azure/resourcemanager/managednetworkfabric/implementation/ValidateConfigurationResponseImpl.java:[28,33] cannot find symbol
  symbol:   method url()
  location: class com.azure.resourcemanager.managednetworkfabric.fluent.models.ValidateConfigurationResponseInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-managednetworkfabric/src/main/java/com/azure/resourcemanager/managednetworkfabric/implementation/CommonPostActionResponseForStateUpdateImpl.java:[24,33] cannot find symbol
  symbol:   method configurationState()
  location: class com.azure.resourcemanager.managednetworkfabric.fluent.models.CommonPostActionResponseForStateUpdateInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-managednetworkfabric/src/main/java/com/azure/resourcemanager/managednetworkfabric/implementation/CommonPostActionResponseForDeviceUpdateImpl.java:[26,33] cannot find symbol
  symbol:   method configurationState()
  location: class com.azure.resourcemanager.managednetworkfabric.fluent.models.CommonPostActionResponseForDeviceUpdateInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-managednetworkfabric/src/main/java/com/azure/resourcemanager/managednetworkfabric/implementation/CommonPostActionResponseForDeviceUpdateImpl.java:[30,47] cannot find symbol
  symbol:   method successfulDevices()
  location: class com.azure.resourcemanager.managednetworkfabric.fluent.models.CommonPostActionResponseForDeviceUpdateInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-managednetworkfabric/src/main/java/com/azure/resourcemanager/managednetworkfabric/implementation/CommonPostActionResponseForDeviceUpdateImpl.java:[39,47] cannot find symbol
  symbol:   method failedDevices()
  location: class com.azure.resourcemanager.managednetworkfabric.fluent.models.CommonPostActionResponseForDeviceUpdateInner
[INFO] 6 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.585 s
[INFO] Finished at: 2023-10-17T19:10:40Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-managednetworkfabric: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-managednetworkfabric/src/main/java/com/azure/resourcemanager/managednetworkfabric/implementation/ValidateConfigurationResponseImpl.java:[24,33] cannot find symbol
[ERROR]   symbol:   method configurationState()
[ERROR]   location: class com.azure.resourcemanager.managednetworkfabric.fluent.models.ValidateConfigurationResponseInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-managednetworkfabric/src/main/java/com/azure/resourcemanager/managednetworkfabric/implementation/ValidateConfigurationResponseImpl.java:[28,33] cannot find symbol
[ERROR]   symbol:   method url()
[ERROR]   location: class com.azure.resourcemanager.managednetworkfabric.fluent.models.ValidateConfigurationResponseInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-managednetworkfabric/src/main/java/com/azure/resourcemanager/managednetworkfabric/implementation/CommonPostActionResponseForStateUpdateImpl.java:[24,33] cannot find symbol
[ERROR]   symbol:   method configurationState()
[ERROR]   location: class com.azure.resourcemanager.managednetworkfabric.fluent.models.CommonPostActionResponseForStateUpdateInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-managednetworkfabric/src/main/java/com/azure/resourcemanager/managednetworkfabric/implementation/CommonPostActionResponseForDeviceUpdateImpl.java:[26,33] cannot find symbol
[ERROR]   symbol:   method configurationState()
[ERROR]   location: class com.azure.resourcemanager.managednetworkfabric.fluent.models.CommonPostActionResponseForDeviceUpdateInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-managednetworkfabric/src/main/java/com/azure/resourcemanager/managednetworkfabric/implementation/CommonPostActionResponseForDeviceUpdateImpl.java:[30,47] cannot find symbol
[ERROR]   symbol:   method successfulDevices()
[ERROR]   location: class com.azure.resourcemanager.managednetworkfabric.fluent.models.CommonPostActionResponseForDeviceUpdateInner
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-managednetworkfabric/src/main/java/com/azure/resourcemanager/managednetworkfabric/implementation/CommonPostActionResponseForDeviceUpdateImpl.java:[39,47] cannot find symbol
[ERROR]   symbol:   method failedDevices()
[ERROR]   location: class com.azure.resourcemanager.managednetworkfabric.fluent.models.CommonPostActionResponseForDeviceUpdateInner
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
<summary>mediaservices</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] ---< com.azure.resourcemanager:azure-resourcemanager-mediaservices >----
[INFO] Building Microsoft Azure SDK for MediaServices Management 1.0.0-beta.1
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-mediaservices ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-mediaservices ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 489 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2733,37] cannot find symbol
  symbol:   class LiveEventGetStatusResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2734,37] cannot find symbol
  symbol:   class LiveEventGetStatusResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2730,35] cannot find symbol
  symbol:   class LiveEventGetStatusResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2730,61] cannot find symbol
  symbol:   class LiveEventGetStatusResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2742,28] cannot find symbol
  symbol:   method getT1()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2743,28] cannot find symbol
  symbol:   method getT1()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2744,28] cannot find symbol
  symbol:   method getT1()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2745,28] cannot find symbol
  symbol:   method getT2()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2811,25] cannot find symbol
  symbol:   class LiveEventGetStatusResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2812,25] cannot find symbol
  symbol:   class LiveEventGetStatusResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2808,23] cannot find symbol
  symbol:   class LiveEventGetStatusResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2808,49] cannot find symbol
  symbol:   class LiveEventGetStatusResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2959,37] cannot find symbol
  symbol:   class LiveEventGetStreamEventsResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2960,37] cannot find symbol
  symbol:   class LiveEventGetStreamEventsResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2956,35] cannot find symbol
  symbol:   class LiveEventGetStreamEventsResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2956,67] cannot find symbol
  symbol:   class LiveEventGetStreamEventsResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2968,28] cannot find symbol
  symbol:   method getT1()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2969,28] cannot find symbol
  symbol:   method getT1()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2970,28] cannot find symbol
  symbol:   method getT1()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2971,28] cannot find symbol
  symbol:   method getT2()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3037,25] cannot find symbol
  symbol:   class LiveEventGetStreamEventsResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3038,25] cannot find symbol
  symbol:   class LiveEventGetStreamEventsResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3034,23] cannot find symbol
  symbol:   class LiveEventGetStreamEventsResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3034,55] cannot find symbol
  symbol:   class LiveEventGetStreamEventsResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3186,41] cannot find symbol
  symbol:   class LiveEventGetTrackIngestHeartbeatsResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3187,41] cannot find symbol
  symbol:   class LiveEventGetTrackIngestHeartbeatsResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3182,35] cannot find symbol
  symbol:   class LiveEventGetTrackIngestHeartbeatsResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3182,76] cannot find symbol
  symbol:   class LiveEventGetTrackIngestHeartbeatsResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3195,28] cannot find symbol
  symbol:   method getT1()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3196,28] cannot find symbol
  symbol:   method getT1()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3197,28] cannot find symbol
  symbol:   method getT1()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3198,28] cannot find symbol
  symbol:   method getT2()
  location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3264,25] cannot find symbol
  symbol:   class LiveEventGetTrackIngestHeartbeatsResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3265,25] cannot find symbol
  symbol:   class LiveEventGetTrackIngestHeartbeatsResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3261,23] cannot find symbol
  symbol:   class LiveEventGetTrackIngestHeartbeatsResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3261,64] cannot find symbol
  symbol:   class LiveEventGetTrackIngestHeartbeatsResult
  location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[INFO] 36 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.132 s
[INFO] Finished at: 2023-10-17T19:13:45Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-mediaservices: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2733,37] cannot find symbol
[ERROR]   symbol:   class LiveEventGetStatusResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2734,37] cannot find symbol
[ERROR]   symbol:   class LiveEventGetStatusResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2730,35] cannot find symbol
[ERROR]   symbol:   class LiveEventGetStatusResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2730,61] cannot find symbol
[ERROR]   symbol:   class LiveEventGetStatusResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2742,28] cannot find symbol
[ERROR]   symbol:   method getT1()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2743,28] cannot find symbol
[ERROR]   symbol:   method getT1()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2744,28] cannot find symbol
[ERROR]   symbol:   method getT1()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2745,28] cannot find symbol
[ERROR]   symbol:   method getT2()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2811,25] cannot find symbol
[ERROR]   symbol:   class LiveEventGetStatusResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2812,25] cannot find symbol
[ERROR]   symbol:   class LiveEventGetStatusResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2808,23] cannot find symbol
[ERROR]   symbol:   class LiveEventGetStatusResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2808,49] cannot find symbol
[ERROR]   symbol:   class LiveEventGetStatusResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2959,37] cannot find symbol
[ERROR]   symbol:   class LiveEventGetStreamEventsResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2960,37] cannot find symbol
[ERROR]   symbol:   class LiveEventGetStreamEventsResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2956,35] cannot find symbol
[ERROR]   symbol:   class LiveEventGetStreamEventsResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2956,67] cannot find symbol
[ERROR]   symbol:   class LiveEventGetStreamEventsResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2968,28] cannot find symbol
[ERROR]   symbol:   method getT1()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2969,28] cannot find symbol
[ERROR]   symbol:   method getT1()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2970,28] cannot find symbol
[ERROR]   symbol:   method getT1()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[2971,28] cannot find symbol
[ERROR]   symbol:   method getT2()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3037,25] cannot find symbol
[ERROR]   symbol:   class LiveEventGetStreamEventsResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3038,25] cannot find symbol
[ERROR]   symbol:   class LiveEventGetStreamEventsResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3034,23] cannot find symbol
[ERROR]   symbol:   class LiveEventGetStreamEventsResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3034,55] cannot find symbol
[ERROR]   symbol:   class LiveEventGetStreamEventsResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3186,41] cannot find symbol
[ERROR]   symbol:   class LiveEventGetTrackIngestHeartbeatsResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3187,41] cannot find symbol
[ERROR]   symbol:   class LiveEventGetTrackIngestHeartbeatsResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3182,35] cannot find symbol
[ERROR]   symbol:   class LiveEventGetTrackIngestHeartbeatsResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3182,76] cannot find symbol
[ERROR]   symbol:   class LiveEventGetTrackIngestHeartbeatsResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3195,28] cannot find symbol
[ERROR]   symbol:   method getT1()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3196,28] cannot find symbol
[ERROR]   symbol:   method getT1()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3197,28] cannot find symbol
[ERROR]   symbol:   method getT1()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3198,28] cannot find symbol
[ERROR]   symbol:   method getT2()
[ERROR]   location: variable res of type java.lang.Object
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3264,25] cannot find symbol
[ERROR]   symbol:   class LiveEventGetTrackIngestHeartbeatsResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3265,25] cannot find symbol
[ERROR]   symbol:   class LiveEventGetTrackIngestHeartbeatsResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3261,23] cannot find symbol
[ERROR]   symbol:   class LiveEventGetTrackIngestHeartbeatsResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-mediaservices/src/main/java/com/azure/resourcemanager/mediaservices/implementation/LiveEventsClientImpl.java:[3261,64] cannot find symbol
[ERROR]   symbol:   class LiveEventGetTrackIngestHeartbeatsResult
[ERROR]   location: class com.azure.resourcemanager.mediaservices.implementation.LiveEventsClientImpl
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
<summary>migrateprojects</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.6.3; node: v14.21.3]
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
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-orbital ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-orbital ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 118 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-orbital/target/classes
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
[INFO] Total time:  3.462 s
[INFO] Finished at: 2023-10-17T19:24:13Z
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
<summary>professionalservice</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] --< com.azure.resourcemanager:azure-resourcemanager-professionalservice >--
[INFO] Building Microsoft Azure SDK for ProfessionalService Management 1.0.0-beta.1
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-professionalservice ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-professionalservice/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-professionalservice ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 48 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-professionalservice/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-professionalservice/src/main/java/com/azure/resourcemanager/professionalservice/models/ProfessionalServiceResourceProperties.java:[244,50] method withBillingPeriod(java.lang.String) is already defined in class com.azure.resourcemanager.professionalservice.models.ProfessionalServiceResourceProperties
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.553 s
[INFO] Finished at: 2023-10-17T19:28:36Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-professionalservice: Compilation failure
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-professionalservice/src/main/java/com/azure/resourcemanager/professionalservice/models/ProfessionalServiceResourceProperties.java:[244,50] method withBillingPeriod(java.lang.String) is already defined in class com.azure.resourcemanager.professionalservice.models.ProfessionalServiceResourceProperties
[ERROR] 
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
<summary>quota</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] -------< com.azure.resourcemanager:azure-resourcemanager-quota >--------
[INFO] Building Microsoft Azure SDK for quota Management 1.0.0-beta.1
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-quota ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-quota/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-quota ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 151 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-quota/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-quota/src/main/java/com/azure/resourcemanager/quota/implementation/AzureQuotaExtensionApiBuilder.java:[57,20] variable endpoint is already defined in class com.azure.resourcemanager.quota.implementation.AzureQuotaExtensionApiBuilder
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-quota/src/main/java/com/azure/resourcemanager/quota/implementation/AzureQuotaExtensionApiBuilder.java:[65,42] method endpoint(java.lang.String) is already defined in class com.azure.resourcemanager.quota.implementation.AzureQuotaExtensionApiBuilder
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-quota/src/main/java/com/azure/resourcemanager/quota/implementation/AzureQuotaExtensionApiImpl.java:[77,26] variable endpoint is already defined in class com.azure.resourcemanager.quota.implementation.AzureQuotaExtensionApiImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-quota/src/main/java/com/azure/resourcemanager/quota/implementation/AzureQuotaExtensionApiImpl.java:[84,19] method getEndpoint() is already defined in class com.azure.resourcemanager.quota.implementation.AzureQuotaExtensionApiImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-quota/src/main/java/com/azure/resourcemanager/quota/implementation/AzureQuotaExtensionApiImpl.java:[274,16] variable endpoint is already defined in constructor AzureQuotaExtensionApiImpl(com.azure.core.http.HttpPipeline,com.azure.core.util.serializer.SerializerAdapter,java.time.Duration,com.azure.core.management.AzureEnvironment,java.util.UUID,java.lang.String,java.lang.String)
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-quota/src/main/java/com/azure/resourcemanager/quota/fluent/AzureQuotaExtensionApi.java:[32,12] method getEndpoint() is already defined in interface com.azure.resourcemanager.quota.fluent.AzureQuotaExtensionApi
[INFO] 6 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.372 s
[INFO] Finished at: 2023-10-17T19:30:04Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-quota: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-quota/src/main/java/com/azure/resourcemanager/quota/implementation/AzureQuotaExtensionApiBuilder.java:[57,20] variable endpoint is already defined in class com.azure.resourcemanager.quota.implementation.AzureQuotaExtensionApiBuilder
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-quota/src/main/java/com/azure/resourcemanager/quota/implementation/AzureQuotaExtensionApiBuilder.java:[65,42] method endpoint(java.lang.String) is already defined in class com.azure.resourcemanager.quota.implementation.AzureQuotaExtensionApiBuilder
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-quota/src/main/java/com/azure/resourcemanager/quota/implementation/AzureQuotaExtensionApiImpl.java:[77,26] variable endpoint is already defined in class com.azure.resourcemanager.quota.implementation.AzureQuotaExtensionApiImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-quota/src/main/java/com/azure/resourcemanager/quota/implementation/AzureQuotaExtensionApiImpl.java:[84,19] method getEndpoint() is already defined in class com.azure.resourcemanager.quota.implementation.AzureQuotaExtensionApiImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-quota/src/main/java/com/azure/resourcemanager/quota/implementation/AzureQuotaExtensionApiImpl.java:[274,16] variable endpoint is already defined in constructor AzureQuotaExtensionApiImpl(com.azure.core.http.HttpPipeline,com.azure.core.util.serializer.SerializerAdapter,java.time.Duration,com.azure.core.management.AzureEnvironment,java.util.UUID,java.lang.String,java.lang.String)
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-quota/src/main/java/com/azure/resourcemanager/quota/fluent/AzureQuotaExtensionApi.java:[32,12] method getEndpoint() is already defined in interface com.azure.resourcemanager.quota.fluent.AzureQuotaExtensionApi
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
<summary>resourcegraph</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] ---< com.azure.resourcemanager:azure-resourcemanager-resourcegraph >----
[INFO] Building Microsoft Azure SDK for ResourceGraph Management 1.0.0-beta.1
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-resourcegraph ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-resourcegraph/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-resourcegraph ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 70 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-resourcegraph/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-resourcegraph/src/main/java/com/azure/resourcemanager/resourcegraph/fluent/ResourceGraphClient.java:[24,12] method getEndpoint() is already defined in interface com.azure.resourcemanager.resourcegraph.fluent.ResourceGraphClient
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-resourcegraph/src/main/java/com/azure/resourcemanager/resourcegraph/implementation/ResourceGraphClientImpl.java:[56,26] variable endpoint is already defined in class com.azure.resourcemanager.resourcegraph.implementation.ResourceGraphClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-resourcegraph/src/main/java/com/azure/resourcemanager/resourcegraph/implementation/ResourceGraphClientImpl.java:[63,19] method getEndpoint() is already defined in class com.azure.resourcemanager.resourcegraph.implementation.ResourceGraphClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-resourcegraph/src/main/java/com/azure/resourcemanager/resourcegraph/implementation/ResourceGraphClientImpl.java:[155,16] variable endpoint is already defined in constructor ResourceGraphClientImpl(com.azure.core.http.HttpPipeline,com.azure.core.util.serializer.SerializerAdapter,java.time.Duration,com.azure.core.management.AzureEnvironment,java.lang.String,java.lang.String)
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-resourcegraph/src/main/java/com/azure/resourcemanager/resourcegraph/implementation/ResourceGraphClientBuilder.java:[40,20] variable endpoint is already defined in class com.azure.resourcemanager.resourcegraph.implementation.ResourceGraphClientBuilder
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-resourcegraph/src/main/java/com/azure/resourcemanager/resourcegraph/implementation/ResourceGraphClientBuilder.java:[48,39] method endpoint(java.lang.String) is already defined in class com.azure.resourcemanager.resourcegraph.implementation.ResourceGraphClientBuilder
[INFO] 6 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.483 s
[INFO] Finished at: 2023-10-17T19:35:03Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-resourcegraph: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-resourcegraph/src/main/java/com/azure/resourcemanager/resourcegraph/fluent/ResourceGraphClient.java:[24,12] method getEndpoint() is already defined in interface com.azure.resourcemanager.resourcegraph.fluent.ResourceGraphClient
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-resourcegraph/src/main/java/com/azure/resourcemanager/resourcegraph/implementation/ResourceGraphClientImpl.java:[56,26] variable endpoint is already defined in class com.azure.resourcemanager.resourcegraph.implementation.ResourceGraphClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-resourcegraph/src/main/java/com/azure/resourcemanager/resourcegraph/implementation/ResourceGraphClientImpl.java:[63,19] method getEndpoint() is already defined in class com.azure.resourcemanager.resourcegraph.implementation.ResourceGraphClientImpl
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-resourcegraph/src/main/java/com/azure/resourcemanager/resourcegraph/implementation/ResourceGraphClientImpl.java:[155,16] variable endpoint is already defined in constructor ResourceGraphClientImpl(com.azure.core.http.HttpPipeline,com.azure.core.util.serializer.SerializerAdapter,java.time.Duration,com.azure.core.management.AzureEnvironment,java.lang.String,java.lang.String)
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-resourcegraph/src/main/java/com/azure/resourcemanager/resourcegraph/implementation/ResourceGraphClientBuilder.java:[40,20] variable endpoint is already defined in class com.azure.resourcemanager.resourcegraph.implementation.ResourceGraphClientBuilder
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-resourcegraph/src/main/java/com/azure/resourcemanager/resourcegraph/implementation/ResourceGraphClientBuilder.java:[48,39] method endpoint(java.lang.String) is already defined in class com.azure.resourcemanager.resourcegraph.implementation.ResourceGraphClientBuilder
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
<summary>resourcehealth</summary>

**stdout**
```
AutoRest code generation utility [cli version: 3.6.3; node: v14.21.3]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
info    | AutoRest core version selected from configuration: 3.4.5.
   Loading AutoRest core      '/home/runner/.autorest/@autorestcore@3.4.5/nodemodules/@autorest/core/dist' (3.4.5)
INFORMATION: > Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
INFORMATION: > Installing AutoRest extension '@microsoft.azure/classic-openapi-validator' (~1.1.5)
INFORMATION: > Installed AutoRest extension '@microsoft.azure/classic-openapi-validator' (~1.1.5->1.1.13)
INFORMATION: > Installing AutoRest extension '@microsoft.azure/openapi-validator' (~1.7.0)
INFORMATION: > Installed AutoRest extension '@microsoft.azure/openapi-validator' (~1.7.0->1.7.0)
INFORMATION: > Loading local AutoRest extension '@autorest/java.fluent' (/home/runner/work/autorest.java/autorest.java/fluentgen)
INFORMATION: > Loading local AutoRest extension '@autorest/java.fluentnamer' (/home/runner/work/autorest.java/autorest.java/fluentnamer)
INFORMATION: > Loading AutoRest extension '@autorest/modelerfour' (4.18.1->4.18.1)
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > Resource > properties > systemData)
  keys: [ [32m'readOnly'[39m, [32m'type'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v3/types.json:31:5
WARNING: Semantic violation: Sibling values alongside $ref will be ignored. See https://github.com/Azure/autorest/blob/main/docs/openapi/howto/$ref-siblings.md for allowed values (components > schemas > Resource > properties > systemData)
  keys: [ [32m'readOnly'[39m ]
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v5/types.json:32:5
WARNING (PreCheck/CheckDuplicateSchemas): Checking for duplicate schemas, this could take a (long) while.  Run with --verbose for more detail.
WARNING (PostOperationIdContainsUrlVerb/R2066/SDKViolation): OperationId should contain the verb: 'listsecurityadvisoryimpactedresources' in:'SecurityAdvisoryImpactedResources_ListBySubscriptionIdAndEventId'. Consider updating the operationId
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2023-10-01-preview/ResourceHealth.json:506:8 ($.paths["/subscriptions/{subscriptionId}/providers/Microsoft.ResourceHealth/events/{eventTrackingId}/listSecurityAdvisoryImpactedResources"].post.operationId)
WARNING (PostOperationIdContainsUrlVerb/R2066/SDKViolation): OperationId should contain the verb: 'listsecurityadvisoryimpactedresources' in:'SecurityAdvisoryImpactedResources_ListByTenantIdAndEventId'. Consider updating the operationId
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2023-10-01-preview/ResourceHealth.json:551:8 ($.paths["/providers/Microsoft.ResourceHealth/events/{eventTrackingId}/listSecurityAdvisoryImpactedResources"].post.operationId)
WARNING (PostOperationIdContainsUrlVerb/R2066/SDKViolation): OperationId should contain the verb: 'fetcheventdetails' in:'Event_fetchDetailsBySubscriptionIdAndTrackingId'. Consider updating the operationId
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2023-10-01-preview/ResourceHealth.json:683:8 ($.paths["/subscriptions/{subscriptionId}/providers/Microsoft.ResourceHealth/events/{eventTrackingId}/fetchEventDetails"].post.operationId)
WARNING (PostOperationIdContainsUrlVerb/R2066/SDKViolation): OperationId should contain the verb: 'fetcheventdetails' in:'Event_fetchDetailsByTenantIdAndTrackingId'. Consider updating the operationId
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2023-10-01-preview/ResourceHealth.json:806:8 ($.paths["/providers/Microsoft.ResourceHealth/events/{eventTrackingId}/fetchEventDetails"].post.operationId)
WARNING (OperationIdNounConflictingModelNames/R2063/SDKViolation): OperationId has a noun that conflicts with one of the model names in definitions section. The model name will be disambiguated to 'EventsModel'. Consider using the plural form of 'Events' to avoid this. Note: If you have already shipped an SDK on top of this spec, fixing this warning may introduce a breaking change.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2023-10-01-preview/ResourceHealth.json:593:8 ($.paths["/subscriptions/{subscriptionId}/providers/Microsoft.ResourceHealth/events"].get.operationId)
WARNING (OperationIdNounConflictingModelNames/R2063/SDKViolation): OperationId has a noun that conflicts with one of the model names in definitions section. The model name will be disambiguated to 'EventModel'. Consider using the plural form of 'Event' to avoid this. Note: If you have already shipped an SDK on top of this spec, fixing this warning may introduce a breaking change.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2023-10-01-preview/ResourceHealth.json:638:8 ($.paths["/subscriptions/{subscriptionId}/providers/Microsoft.ResourceHealth/events/{eventTrackingId}"].get.operationId)
WARNING (OperationIdNounConflictingModelNames/R2063/SDKViolation): OperationId has a noun that conflicts with one of the model names in definitions section. The model name will be disambiguated to 'EventModel'. Consider using the plural form of 'Event' to avoid this. Note: If you have already shipped an SDK on top of this spec, fixing this warning may introduce a breaking change.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2023-10-01-preview/ResourceHealth.json:683:8 ($.paths["/subscriptions/{subscriptionId}/providers/Microsoft.ResourceHealth/events/{eventTrackingId}/fetchEventDetails"].post.operationId)
WARNING (OperationIdNounConflictingModelNames/R2063/SDKViolation): OperationId has a noun that conflicts with one of the model names in definitions section. The model name will be disambiguated to 'EventsModel'. Consider using the plural form of 'Events' to avoid this. Note: If you have already shipped an SDK on top of this spec, fixing this warning may introduce a breaking change.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2023-10-01-preview/ResourceHealth.json:722:8 ($.paths["/providers/Microsoft.ResourceHealth/events"].get.operationId)
WARNING (OperationIdNounConflictingModelNames/R2063/SDKViolation): OperationId has a noun that conflicts with one of the model names in definitions section. The model name will be disambiguated to 'EventModel'. Consider using the plural form of 'Event' to avoid this. Note: If you have already shipped an SDK on top of this spec, fixing this warning may introduce a breaking change.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2023-10-01-preview/ResourceHealth.json:764:8 ($.paths["/providers/Microsoft.ResourceHealth/events/{eventTrackingId}"].get.operationId)
WARNING (OperationIdNounConflictingModelNames/R2063/SDKViolation): OperationId has a noun that conflicts with one of the model names in definitions section. The model name will be disambiguated to 'EventModel'. Consider using the plural form of 'Event' to avoid this. Note: If you have already shipped an SDK on top of this spec, fixing this warning may introduce a breaking change.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2023-10-01-preview/ResourceHealth.json:806:8 ($.paths["/providers/Microsoft.ResourceHealth/events/{eventTrackingId}/fetchEventDetails"].post.operationId)
WARNING (OperationIdNounConflictingModelNames/R2063/SDKViolation): OperationId has a noun that conflicts with one of the model names in definitions section. The model name will be disambiguated to 'EventsModel'. Consider using the plural form of 'Events' to avoid this. Note: If you have already shipped an SDK on top of this spec, fixing this warning may introduce a breaking change.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2023-10-01-preview/ResourceHealth.json:842:8 ($.paths["/{resourceUri}/providers/Microsoft.ResourceHealth/events"].get.operationId)
WARNING (AvoidNestedProperties/R2001/SDKViolation): Consider using x-ms-client-flatten to provide a better end user experience
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2023-10-01-preview/ResourceHealth.json:1730:8 ($.definitions.availabilityStatus.properties.properties)
WARNING (ParameterNotDefinedInGlobalParameters/R2015/SDKViolation): Parameter "subscriptionid" is referenced but not defined in the global parameters section of Service Definition
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2023-10-01-preview/ResourceHealth.json:2304:2 ($.parameters)
WARNING (ParameterNotDefinedInGlobalParameters/R2015/SDKViolation): Parameter "api-version" is referenced but not defined in the global parameters section of Service Definition
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2023-10-01-preview/ResourceHealth.json:2304:2 ($.parameters)
WARNING (EnumInsteadOfBoolean/R3018/ARMViolation): Booleans are not descriptive and make them hard to use. Consider using string enums with allowed set of values defined. Property: published
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2023-10-01-preview/ResourceHealth.json:2243:8 ($.definitions.statusActiveEvent.properties.published)
WARNING (DescriptionAndTitleMissing/R4021/SDKViolation): 'KeyVaultProperties' model/property lacks 'description' and 'title' property. Consider adding a 'description'/'title' element. Accurate description/title is essential for maintaining reference documentation.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v3/types.json:567:2 ($.definitions.KeyVaultProperties)
WARNING (DescriptionAndTitleMissing/R4021/SDKViolation): 'identity' model/property lacks 'description' and 'title' property. Consider adding a 'description'/'title' element. Accurate description/title is essential for maintaining reference documentation.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v3/types.json:128:4 ($.definitions.ResourceModelWithAllowedPropertySet.properties.identity)
WARNING (DescriptionAndTitleMissing/R4021/SDKViolation): 'sku' model/property lacks 'description' and 'title' property. Consider adding a 'description'/'title' element. Accurate description/title is essential for maintaining reference documentation.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v3/types.json:135:4 ($.definitions.ResourceModelWithAllowedPropertySet.properties.sku)
WARNING (DescriptionAndTitleMissing/R4021/SDKViolation): 'plan' model/property lacks 'description' and 'title' property. Consider adding a 'description'/'title' element. Accurate description/title is essential for maintaining reference documentation.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v3/types.json:142:4 ($.definitions.ResourceModelWithAllowedPropertySet.properties.plan)
WARNING (EnumInsteadOfBoolean/R3018/ARMViolation): Booleans are not descriptive and make them hard to use. Consider using string enums with allowed set of values defined. Property: isDataAction
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v3/types.json:337:4 ($.definitions.Operation.properties.isDataAction)
WARNING (EnumInsteadOfBoolean/R3018/ARMViolation): Booleans are not descriptive and make them hard to use. Consider using string enums with allowed set of values defined. Property: nameAvailable
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v3/types.json:598:4 ($.definitions.CheckNameAvailabilityResponse.properties.nameAvailable)
WARNING (GuidUsage/R3017/ARMViolation): Guid used in model definition 'Identity' for property 'principalId'. Usage of Guid is not recommanded. If GUIDs are absolutely required in your service, please get sign off from the Azure API review board.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v5/types.json:204:4 ($.definitions.Identity.properties.principalId)
WARNING (DescriptionAndTitleMissing/R4021/SDKViolation): 'KeyVaultProperties' model/property lacks 'description' and 'title' property. Consider adding a 'description'/'title' element. Accurate description/title is essential for maintaining reference documentation.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v5/types.json:577:2 ($.definitions.KeyVaultProperties)
WARNING (DescriptionAndTitleMissing/R4021/SDKViolation): 'identity' model/property lacks 'description' and 'title' property. Consider adding a 'description'/'title' element. Accurate description/title is essential for maintaining reference documentation.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v5/types.json:128:4 ($.definitions.ResourceModelWithAllowedPropertySet.properties.identity)
WARNING (DescriptionAndTitleMissing/R4021/SDKViolation): 'sku' model/property lacks 'description' and 'title' property. Consider adding a 'description'/'title' element. Accurate description/title is essential for maintaining reference documentation.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v5/types.json:135:4 ($.definitions.ResourceModelWithAllowedPropertySet.properties.sku)
WARNING (DescriptionAndTitleMissing/R4021/SDKViolation): 'plan' model/property lacks 'description' and 'title' property. Consider adding a 'description'/'title' element. Accurate description/title is essential for maintaining reference documentation.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v5/types.json:142:4 ($.definitions.ResourceModelWithAllowedPropertySet.properties.plan)
WARNING (EnumInsteadOfBoolean/R3018/ARMViolation): Booleans are not descriptive and make them hard to use. Consider using string enums with allowed set of values defined. Property: isDataAction
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v5/types.json:339:4 ($.definitions.Operation.properties.isDataAction)
WARNING (EnumInsteadOfBoolean/R3018/ARMViolation): Booleans are not descriptive and make them hard to use. Consider using string enums with allowed set of values defined. Property: nameAvailable
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v5/types.json:608:4 ($.definitions.CheckNameAvailabilityResponse.properties.nameAvailable)
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
INFORMATION (NamingConflictResolver): Rename operation group from 'Events' to 'EventsOperation'
INFORMATION (NamingConflictResolver): Rename operation group from 'Event' to 'EventOperation'
WARNING (OperationNameNormalization): Conflict operation name found after attempted rename '[list]', in operation group 'AvailabilityStatuses'
INFORMATION (OperationNameNormalization): Rename operation from 'listBySubscriptionId' to 'list', in operation group 'EventsOperation'
INFORMATION (ResourceTypeNormalization): Change parent from 'Resource' to 'ProxyResource', for 'ProxyResource'
INFORMATION (ErrorTypeNormalization): Rename error from 'ErrorResponse' to 'ManagementError'
INFORMATION (SchemaCleanup): Remove unused object schema 'Resource'
INFORMATION (SchemaCleanup): Remove unused object schema 'ImpactedResourceStatus'
INFORMATION (SchemaCleanup): Remove unused choice schema 'CreatedByType'
INFORMATION (SchemaCleanup): Remove unused object schema 'ImpactedResourceStatusProperties'
INFORMATION (SchemaCleanup): Remove unused choice schema 'ReasonTypeValues'
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
INFORMATION (FluentMapper): Add Inner to response types: [OperationListResult, EmergingIssuesGetResult, AvailabilityStatus, Event, EventImpactedResource, MetadataEntity]
INFORMATION (FluentGen): Java template for client model
INFORMATION (FluentGen): Process for Fluent Lite, SDK integration disabled
INFORMATION (ExampleParser): Parse collection method example 'ListHealthBySubscriptionId'
INFORMATION (ExampleParser): Parse collection method example 'ListByResourceGroup'
INFORMATION (ExampleParser): Parse collection method example 'GetCurrentHealthByResource'
INFORMATION (ExampleParser): Parse collection method example 'GetHealthHistoryByResource'
INFORMATION (ExampleParser): Parse collection method example 'GetOperationsList'
INFORMATION (ExampleParser): Parse collection method example 'GetMetadata'
INFORMATION (ExampleParser): Parse collection method example 'GetMetadata'
INFORMATION (ExampleParser): Parse collection method example 'ListImpactedResourcesBySubscriptionId'
INFORMATION (ExampleParser): Parse collection method example 'ImpactedResourcesGet'
INFORMATION (ExampleParser): Parse collection method example 'ListEventsByTenantId'
INFORMATION (ExampleParser): Parse collection method example 'ImpactedResourcesGet'
INFORMATION (ExampleParser): Parse collection method example 'ListSecurityAdvisoryImpactedResourcesBySubscriptionId'
INFORMATION (ExampleParser): Parse collection method example 'ListSecurityAdvisoryImpactedResourcesByTenantId'
INFORMATION (ExampleParser): Parse collection method example 'ListEventsBySubscriptionId'
INFORMATION (ExampleParser): Parse collection method example 'ListEventsByTenantId'
INFORMATION (ExampleParser): Parse collection method example 'ListEventsBySingleResource'
INFORMATION (ExampleParser): Parse collection method example 'SecurityAdvisoriesEventBySubscriptionIdAndTrackingId'
INFORMATION (ExampleParser): Parse collection method example 'EventDetailsBySubscriptionIdAndTrackingId'
INFORMATION (ExampleParser): Parse collection method example 'EventByTenantIdAndTrackingId'
INFORMATION (ExampleParser): Parse collection method example 'EventDetailsByTenantIdAndTrackingId'
INFORMATION (ExampleParser): Parse collection method example 'GetChildCurrentHealthByResource'
INFORMATION (ExampleParser): Parse collection method example 'GetChildHealthHistoryByResource'
INFORMATION (ExampleParser): Parse collection method example 'GetCurrentChildHealthByResource'
INFORMATION (ExampleParser): Parse collection method example 'GetEmergingIssues'
INFORMATION (ExampleParser): Parse collection method example 'GetEmergingIssues'
INFORMATION (FluentJavaSettings): Option, string, tag : package-preview-2023-10
INFORMATION (FluentJavaSettings): Option, string, base-folder : .
INFORMATION (FluentJavaSettings): Option, string, output-folder : /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-resourcehealth
INFORMATION (FluentJavaSettings): Option, string, azure-libraries-for-java-folder : null
INFORMATION (FluentJavaSettings): List of input files : [Microsoft.ResourceHealth/preview/2023-10-01-preview/ResourceHealth.json]
INFORMATION (FluentGen): Write Java
INFORMATION (JavaFormatter): Java version: 11.0.20
INFORMATION (JavaFormatter): Java formatter enabled
INFORMATION (FluentGen): Write Xml
INFORMATION (FluentGen): Write Text
[27.89 s] Generation Complete

```
**stderr**
```
FATAL: Failed validating: 'file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/resourcehealth/resource-manager/Microsoft.ResourceHealth/preview/2023-10-01-preview/ResourceHealth.json', error encountered: TypeError: Cannot read property 'properties' of undefined
ERROR (APIVersionPattern/R3012/ARMViolation): API Version must be in the format: yyyy-MM-dd, optionally followed by -preview, -alpha, -beta, -rc, -privatepreview.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v3/types.json:4:2 ($.info.version)
ERROR (OperationsAPIImplementation/R3023/ARMViolation): Operations API must be implemented for '/providers//operations'.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v3/types.json:7:1 ($.paths)
ERROR (SecurityDefinitionsStructure/R2054/SDKViolation): Every swagger/configuration must have a security definitions section and it must adhere to the structure described in: https://github.com/Azure/azure-openapi-validator/blob/master/docs/security-definitions-structure-validation.md
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v3/types.json:1:0
ERROR (APIVersionPattern/R3012/ARMViolation): API Version must be in the format: yyyy-MM-dd, optionally followed by -preview, -alpha, -beta, -rc, -privatepreview.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v5/types.json:4:2 ($.info.version)
ERROR (OperationsAPIImplementation/R3023/ARMViolation): Operations API must be implemented for '/providers//operations'.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v5/types.json:7:1 ($.paths)
ERROR (ValidFormats/R2003/SDKViolation): 'arm-id' is not a known format.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v5/types.json:17:5 ($.definitions.Resource.properties.id.format)
ERROR (ValidFormats/R2003/SDKViolation): 'arm-id' is not a known format.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v5/types.json:431:5 ($.definitions.OperationStatusResult.properties.id.format)
ERROR (ValidFormats/R2003/SDKViolation): 'arm-id' is not a known format.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v5/types.json:436:5 ($.definitions.OperationStatusResult.properties.resourceId.format)
ERROR (SecurityDefinitionsStructure/R2054/SDKViolation): Every swagger/configuration must have a security definitions section and it must adhere to the structure described in: https://github.com/Azure/azure-openapi-validator/blob/master/docs/security-definitions-structure-validation.md
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/common-types/resource-management/v5/types.json:1:0

```
</details>

<details>
<summary>security</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] ------< com.azure.resourcemanager:azure-resourcemanager-security >------
[INFO] Building Microsoft Azure SDK for Security Management 1.0.0-beta.1
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-security ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-security/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-security ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1031 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-security/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-security/src/main/java/com/azure/resourcemanager/security/fluent/models/DefenderForStorageSettingProperties.java:[218,41] method operationStatus() is already defined in class com.azure.resourcemanager.security.fluent.models.DefenderForStorageSettingProperties
[INFO] 1 error
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  6.624 s
[INFO] Finished at: 2023-10-17T19:39:03Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-security: Compilation failure
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-security/src/main/java/com/azure/resourcemanager/security/fluent/models/DefenderForStorageSettingProperties.java:[218,41] method operationStatus() is already defined in class com.azure.resourcemanager.security.fluent.models.DefenderForStorageSettingProperties
[ERROR] 
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
AutoRest code generation utility [cli version: 3.6.3; node: v14.21.3]
(C) 2018 Microsoft Corporation.
https://aka.ms/autorest
info    | AutoRest core version selected from configuration: 3.4.5.
   Loading AutoRest core      '/home/runner/.autorest/@autorestcore@3.4.5/nodemodules/@autorest/core/dist' (3.4.5)
INFORMATION: > Loading local AutoRest extension '@autorest/java' (/home/runner/work/autorest.java/autorest.java)
INFORMATION: > Loading AutoRest extension '@microsoft.azure/classic-openapi-validator' (~1.1.5->1.1.13)
INFORMATION: > Loading AutoRest extension '@microsoft.azure/openapi-validator' (~1.7.0->1.7.0)
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
WARNING (EnumInsteadOfBoolean/R3018/ARMViolation): Booleans are not descriptive and make them hard to use. Consider using string enums with allowed set of values defined. Property: live
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:63:12 ($.paths["/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/features/serviceMap/machines"].get.parameters[4].name)
WARNING (EnumInsteadOfBoolean/R3018/ARMViolation): Booleans are not descriptive and make them hard to use. Consider using string enums with allowed set of values defined. Property: live
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:332:12 ($.paths["/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/features/serviceMap/machines/{machineName}/processes"].get.parameters[5].name)
WARNING (OperationIdNounVerb/R1001/SDKViolation): Per the Noun_Verb convention for Operation Ids, the noun 'Machines' should not appear after the underscore. Note: If you have already shipped an SDK on top of this spec, fixing this warning may introduce a breaking change.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:971:8 ($.paths["/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/features/serviceMap/machines/{machineName}/machineGroups"].get.operationId)
WARNING (PutInOperationName/R1006/SDKViolation): 'PUT' operation 'MachineGroups_Update' should use method name 'Create'. Note: If you have already shipped an SDK on top of this spec, fixing this warning may introduce a breaking change.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:1515:8 ($.paths["/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/features/serviceMap/machineGroups/{machineGroupName}"].put.operationId)
WARNING (PreviewVersionOverOneYear/R4024/SDKViolation): The API version:2015-11-01-preview having been in a preview state over one year , please move it to GA or retire.
    - file:///home/runner/work/autorest.java/autorest.java/azure-rest-api-specs/specification/service-map/resource-manager/Microsoft.OperationalInsights/preview/2015-11-01-preview/arm-service-map.json:6:4 ($.info.version)
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
INFORMATION (FluentMapper): Add Inner to response types: [Liveness, Port, MapResponse, ClientGroup, MachinesSummary, ClientGroupMember, ClientGroupMembersCount, Connection, Machine, Process, MachineGroup]
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
INFORMATION (JavaFormatter): Java version: 11.0.20
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
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-sql ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-sql/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-sql ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1560 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-sql/target/classes
[INFO] Some messages have been simplified; recompile with -Xdiags:verbose to get full output
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-sql/src/main/java/com/azure/resourcemanager/sql/implementation/SqlVulnerabilityAssessmentImpl.java:[131,65] incompatible types: com.azure.resourcemanager.sql.models.VulnerabilityAssessmentName cannot be converted to com.azure.resourcemanager.sql.models.SqlVulnerabilityAssessmentName
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-sql/src/main/java/com/azure/resourcemanager/sql/implementation/SqlVulnerabilityAssessmentImpl.java:[141,65] incompatible types: com.azure.resourcemanager.sql.models.VulnerabilityAssessmentName cannot be converted to com.azure.resourcemanager.sql.models.SqlVulnerabilityAssessmentName
[INFO] 2 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  12.419 s
[INFO] Finished at: 2023-10-17T19:48:57Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-sql: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-sql/src/main/java/com/azure/resourcemanager/sql/implementation/SqlVulnerabilityAssessmentImpl.java:[131,65] incompatible types: com.azure.resourcemanager.sql.models.VulnerabilityAssessmentName cannot be converted to com.azure.resourcemanager.sql.models.SqlVulnerabilityAssessmentName
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-sql/src/main/java/com/azure/resourcemanager/sql/implementation/SqlVulnerabilityAssessmentImpl.java:[141,65] incompatible types: com.azure.resourcemanager.sql.models.VulnerabilityAssessmentName cannot be converted to com.azure.resourcemanager.sql.models.SqlVulnerabilityAssessmentName
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
<summary>storagecache</summary>

**stdout**
```
[INFO] Scanning for projects...
[INFO] 
[INFO] ----< com.azure.resourcemanager:azure-resourcemanager-storagecache >----
[INFO] Building Microsoft Azure SDK for StorageCache Management 1.0.0-beta.1
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ azure-resourcemanager-storagecache ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-storagecache/src/main/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.8.1:compile (default-compile) @ azure-resourcemanager-storagecache ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 214 source files to /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-storagecache/target/classes
[INFO] -------------------------------------------------------------
[ERROR] COMPILATION ERROR : 
[INFO] -------------------------------------------------------------
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-storagecache/src/main/java/com/azure/resourcemanager/storagecache/implementation/ResourceProvidersClientImpl.java:[30,53] cannot find symbol
  symbol:   class ManagementErrorException
  location: package com.azure.resourcemanager.storagecache.models
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-storagecache/src/main/java/com/azure/resourcemanager/storagecache/implementation/ResourceProvidersClientImpl.java:[68,42] cannot find symbol
  symbol:   class ManagementErrorException
  location: interface com.azure.resourcemanager.storagecache.implementation.ResourceProvidersClientImpl.ResourceProvidersService
[INFO] 2 errors 
[INFO] -------------------------------------------------------------
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  3.343 s
[INFO] Finished at: 2023-10-17T19:51:05Z
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.8.1:compile (default-compile) on project azure-resourcemanager-storagecache: Compilation failure: Compilation failure: 
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-storagecache/src/main/java/com/azure/resourcemanager/storagecache/implementation/ResourceProvidersClientImpl.java:[30,53] cannot find symbol
[ERROR]   symbol:   class ManagementErrorException
[ERROR]   location: package com.azure.resourcemanager.storagecache.models
[ERROR] /home/runner/work/autorest.java/autorest.java/fluent_generated/azure-resourcemanager-storagecache/src/main/java/com/azure/resourcemanager/storagecache/implementation/ResourceProvidersClientImpl.java:[68,42] cannot find symbol
[ERROR]   symbol:   class ManagementErrorException
[ERROR]   location: interface com.azure.resourcemanager.storagecache.implementation.ResourceProvidersClientImpl.ResourceProvidersService
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
[INFO]   from pom.xml
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
[INFO] Total time:  1.718 s
[INFO] Finished at: 2023-10-17T19:57:06Z
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
