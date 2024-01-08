# DeletesApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteRole**](DeletesApi.md#deleteRole) | **DELETE** /role/{nom} | Delete an AppRole |
| [**deleteRole_0**](DeletesApi.md#deleteRole_0) | **DELETE** /user/{id} | Delete an AppRole |


<a name="deleteRole"></a>
# **deleteRole**
> deleteRole()

Delete an AppRole

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeletesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    DeletesApi apiInstance = new DeletesApi(defaultClient);
    try {
      apiInstance.deleteRole();
    } catch (ApiException e) {
      System.err.println("Exception when calling DeletesApi#deleteRole");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **404** | NOT FOUND |  -  |

<a name="deleteRole_0"></a>
# **deleteRole_0**
> deleteRole_0()

Delete an AppRole

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeletesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    DeletesApi apiInstance = new DeletesApi(defaultClient);
    try {
      apiInstance.deleteRole_0();
    } catch (ApiException e) {
      System.err.println("Exception when calling DeletesApi#deleteRole_0");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SUCCESS |  -  |
| **204** | No Content |  -  |
| **404** | NOT FOUND |  -  |

