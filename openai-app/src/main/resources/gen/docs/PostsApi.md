# PostsApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAppRole**](PostsApi.md#createAppRole) | **POST** /role | Create an AppRole |
| [**createAppUSer**](PostsApi.md#createAppUSer) | **POST** /user | Create an AppUser |


<a name="createAppRole"></a>
# **createAppRole**
> List&lt;AppRoleDto&gt; createAppRole(appRoleDto)

Create an AppRole

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    PostsApi apiInstance = new PostsApi(defaultClient);
    AppRoleDto appRoleDto = new AppRoleDto(); // AppRoleDto | 
    try {
      List<AppRoleDto> result = apiInstance.createAppRole(appRoleDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#createAppRole");
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

[**List&lt;AppRoleDto&gt;**](AppRoleDto.md)

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

<a name="createAppUSer"></a>
# **createAppUSer**
> List&lt;AppUserResp&gt; createAppUSer(appUserRequest)

Create an AppUser

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PostsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    PostsApi apiInstance = new PostsApi(defaultClient);
    AppUserRequest appUserRequest = new AppUserRequest(); // AppUserRequest | 
    try {
      List<AppUserResp> result = apiInstance.createAppUSer(appUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PostsApi#createAppUSer");
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
| **400** | BAD REQUEST |  -  |

