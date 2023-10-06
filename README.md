# my-azure-storage-account-github-spring-boot-sample

## Main reference

### Storage Account
* Spring
  * [Upload a file to an Azure Blob Storage](https://learn.microsoft.com/en-us/azure/developer/java/spring-framework/configure-spring-boot-starter-java-app-with-azure-storage?toc=%2Fazure%2Fstorage%2Fblobs%2Ftoc.json)
* Azure Blob Storage client library for Java
  * [Quickstart: Azure Blob Storage client library for Java](https://learn.microsoft.com/en-us/azure/storage/blobs/storage-quickstart-blobs-java)
  * [How to](https://learn.microsoft.com/en-us/azure/storage/blobs/storage-blob-java-get-started?tabs=azure-ad)
* Authentication
  * [User-assigned managed identity](https://learn.microsoft.com/en-us/azure/developer/java/sdk/identity-azure-hosted-auth#managed-identity-credential)

## Steps

### Create Storage Account and Container in Azure

* Create a rg > `shaun-storageaccount-pg-rg`
* Create a storage account > `shaun01`
* Create a container > `testcontainer`
  * Set Public access level as `private`

### Intellij

* Set override configuration properties in Intellij
  * Add 2 entries with values for `AZURE_STORAGE_ACCOUNT_NAME` and `AZURE_STORAGE_ACCOUNT_ENDPOINT`
  * Get these values from Azure Portal
* Run the application in Intellij

## Azure CLI login

* `az login`

## Invoke API from the samples in .http file

* execute http calls

## Code concepts

* blob-storage-starter package uses - `DefaultAzureCredential` auth
  * DefaultAzureCredential supports multiple authentication methods and determines which method to use at runtime. This approach enables your app to use different authentication methods in different environments (such as local and production environments) without implementing environment-specific code.
  * Ref: https://learn.microsoft.com/en-us/azure/developer/java/sdk/identity-azure-hosted-auth#default-azure-credential
* Recommended authentication method when hosting in Azure - `User-assigned managed identity`

## Shaun - Note

* This application is not able to connect to Azure Storage Account bcz of issue with authentication/authorisation
