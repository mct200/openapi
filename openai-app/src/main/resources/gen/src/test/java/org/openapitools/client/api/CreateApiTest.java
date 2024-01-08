/*
 * API des classes d'Admin App
 * Document des API l'application d'admininistration App
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.AppRoleDto;
import org.openapitools.client.model.AppUserRequest;
import org.openapitools.client.model.AppUserResp;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CreateApi
 */
@Disabled
public class CreateApiTest {

    private final CreateApi api = new CreateApi();

    /**
     * Create an AppRole
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAppRoleTest() throws ApiException {
        AppRoleDto appRoleDto = null;
        List<AppRoleDto> response = api.createAppRole(appRoleDto);
        // TODO: test validations
    }

    /**
     * Create an AppUser
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createAppUSerTest() throws ApiException {
        AppUserRequest appUserRequest = null;
        List<AppUserResp> response = api.createAppUSer(appUserRequest);
        // TODO: test validations
    }

}
