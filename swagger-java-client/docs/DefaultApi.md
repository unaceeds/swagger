# DefaultApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**aBGet**](DefaultApi.md#aBGet) | **GET** /{a}/{b} | 
[**aBOpGet**](DefaultApi.md#aBOpGet) | **GET** /{a}/{b}/{op} | 
[**aGet**](DefaultApi.md#aGet) | **GET** /{a} | 
[**rootGet**](DefaultApi.md#rootGet) | **GET** / | 

<a name="aBGet"></a>
# **aBGet**
> aBGet(a, b)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String a = "a_example"; // String | 
String b = "b_example"; // String | 
try {
    apiInstance.aBGet(a, b);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#aBGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **a** | **String**|  |
 **b** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="aBOpGet"></a>
# **aBOpGet**
> Result aBOpGet(a, b, op)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String a = "a_example"; // String | 
String b = "b_example"; // String | 
String op = "op_example"; // String | 
try {
    Result result = apiInstance.aBOpGet(a, b, op);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#aBOpGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **a** | **String**|  |
 **b** | **String**|  |
 **op** | **String**|  |

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="aGet"></a>
# **aGet**
> aGet(a)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String a = "a_example"; // String | 
try {
    apiInstance.aGet(a);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#aGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **a** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="rootGet"></a>
# **rootGet**
> Result rootGet(a, b, op)



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String a = "a_example"; // String | 
String b = "b_example"; // String | 
String op = "op_example"; // String | 
try {
    Result result = apiInstance.rootGet(a, b, op);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#rootGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **a** | **String**|  | [optional]
 **b** | **String**|  | [optional]
 **op** | **String**|  | [optional]

### Return type

[**Result**](Result.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

