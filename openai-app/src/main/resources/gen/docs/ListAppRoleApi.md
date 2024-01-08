# ListAppRoleApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRoles**](ListAppRoleApi.md#getRoles) | **GET** /role | Get All AppRoles |


<a name="getRoles"></a>
# **getRoles**
> List&lt;AppRoleDto&gt; getRoles()

Get All AppRoles

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ListAppRoleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    ListAppRoleApi apiInstance = new ListAppRoleApi(defaultClient);
    try {
      List<AppRoleDto> result = apiInstance.getRoles();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListAppRoleApi#getRoles");
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

[**List&lt;AppRoleDto&gt;**](AppRoleDto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SUCCESS |  -  |
| **404** | NOT FOUND |  -  |
| **400** | BAD REQUEST |  -  |

