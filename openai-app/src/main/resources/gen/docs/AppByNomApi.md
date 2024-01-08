# AppByNomApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAppRoleByName**](AppByNomApi.md#getAppRoleByName) | **GET** /role/{nom} | find One By his name |


<a name="getAppRoleByName"></a>
# **getAppRoleByName**
> AppRoleDto getAppRoleByName()

find One By his name

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppByNomApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    AppByNomApi apiInstance = new AppByNomApi(defaultClient);
    try {
      AppRoleDto result = apiInstance.getAppRoleByName();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppByNomApi#getAppRoleByName");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AppRoleDto**](AppRoleDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SUCCESS |  -  |

