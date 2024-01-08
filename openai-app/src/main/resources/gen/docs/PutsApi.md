# PutsApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateRole**](PutsApi.md#updateRole) | **PUT** /role/{nom} | Update an AppRole |
| [**updateRole_0**](PutsApi.md#updateRole_0) | **PUT** /user/{id} | Update an AppRole |


<a name="updateRole"></a>
# **updateRole**
> updateRole(appRoleDto)

Update an AppRole

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    PutsApi apiInstance = new PutsApi(defaultClient);
    AppRoleDto appRoleDto = new AppRoleDto(); // AppRoleDto | 
    try {
      apiInstance.updateRole(appRoleDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling PutsApi#updateRole");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appRoleDto** | [**AppRoleDto**](AppRoleDto.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SUCCESS |  -  |
| **404** | NOT FOUND |  -  |
| **400** | BAD REQUEST |  -  |

<a name="updateRole_0"></a>
# **updateRole_0**
> List&lt;AppUserResp&gt; updateRole_0(appUserRequest)

Update an AppRole

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PutsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    PutsApi apiInstance = new PutsApi(defaultClient);
    AppUserRequest appUserRequest = new AppUserRequest(); // AppUserRequest | 
    try {
      List<AppUserResp> result = apiInstance.updateRole_0(appUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PutsApi#updateRole_0");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appUserRequest** | [**AppUserRequest**](AppUserRequest.md)|  | [optional] |

### Return type

[**List&lt;AppUserResp&gt;**](AppUserResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SUCCESS |  -  |
| **404** | NOT FOUND |  -  |
| **400** | BAD REQUEST |  -  |

