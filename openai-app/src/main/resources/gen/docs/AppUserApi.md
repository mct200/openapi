# AppUserApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAppUSer**](AppUserApi.md#createAppUSer) | **POST** /user | Create an AppUser |
| [**getUsers**](AppUserApi.md#getUsers) | **GET** /user | Get All AppUsers |
| [**updateRole**](AppUserApi.md#updateRole) | **PUT** /user/{id} | Update an AppRole |


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
import org.openapitools.client.api.AppUserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    AppUserApi apiInstance = new AppUserApi(defaultClient);
    AppUserRequest appUserRequest = new AppUserRequest(); // AppUserRequest | 
    try {
      List<AppUserResp> result = apiInstance.createAppUSer(appUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppUserApi#createAppUSer");
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

<a name="getUsers"></a>
# **getUsers**
> List&lt;AppUserResp&gt; getUsers()

Get All AppUsers

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppUserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    AppUserApi apiInstance = new AppUserApi(defaultClient);
    try {
      List<AppUserResp> result = apiInstance.getUsers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppUserApi#getUsers");
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

[**List&lt;AppUserResp&gt;**](AppUserResp.md)

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

<a name="updateRole"></a>
# **updateRole**
> List&lt;AppUserResp&gt; updateRole(appUserRequest)

Update an AppRole

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppUserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    AppUserApi apiInstance = new AppUserApi(defaultClient);
    AppUserRequest appUserRequest = new AppUserRequest(); // AppUserRequest | 
    try {
      List<AppUserResp> result = apiInstance.updateRole(appUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppUserApi#updateRole");
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

