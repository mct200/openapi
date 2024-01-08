# AppUserByIdApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAppUserById**](AppUserByIdApi.md#getAppUserById) | **GET** /user/{id} | find One By id |


<a name="getAppUserById"></a>
# **getAppUserById**
> AppUserResp getAppUserById()

find One By id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AppUserByIdApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080");

    AppUserByIdApi apiInstance = new AppUserByIdApi(defaultClient);
    try {
      AppUserResp result = apiInstance.getAppUserById();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppUserByIdApi#getAppUserById");
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

[**AppUserResp**](AppUserResp.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SUCCESS |  -  |

