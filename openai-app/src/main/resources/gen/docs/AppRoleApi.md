# AppRoleApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAppRole**](AppRoleApi.md#createAppRole) | **POST** /role | Create an AppRole |
| [**deleteRole**](AppRoleApi.md#deleteRole) | **DELETE** /role/{nom} | Delete an AppRole |
| [**deleteRole_0**](AppRoleApi.md#deleteRole_0) | **DELETE** /user/{id} | Delete an AppRole |
| [**getRoles**](AppRoleApi.md#getRoles) | **GET** /role | Get All AppRoles |
| [**updateRole**](AppRoleApi.md#updateRole) | **PUT** /role/{nom} | Update an AppRole |


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
import org.openapitools.client.api.AppRoleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    AppRoleApi apiInstance = new AppRoleApi(defaultClient);
    AppRoleDto appRoleDto = new AppRoleDto(); // AppRoleDto | 
    try {
      List<AppRoleDto> result = apiInstance.createAppRole(appRoleDto);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRoleApi#createAppRole");
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
import org.openapitools.client.api.AppRoleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    AppRoleApi apiInstance = new AppRoleApi(defaultClient);
    try {
      apiInstance.deleteRole();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRoleApi#deleteRole");
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
import org.openapitools.client.api.AppRoleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    AppRoleApi apiInstance = new AppRoleApi(defaultClient);
    try {
      apiInstance.deleteRole_0();
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRoleApi#deleteRole_0");
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
import org.openapitools.client.api.AppRoleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    AppRoleApi apiInstance = new AppRoleApi(defaultClient);
    try {
      List<AppRoleDto> result = apiInstance.getRoles();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRoleApi#getRoles");
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
import org.openapitools.client.api.AppRoleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    AppRoleApi apiInstance = new AppRoleApi(defaultClient);
    AppRoleDto appRoleDto = new AppRoleDto(); // AppRoleDto | 
    try {
      apiInstance.updateRole(appRoleDto);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppRoleApi#updateRole");
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

