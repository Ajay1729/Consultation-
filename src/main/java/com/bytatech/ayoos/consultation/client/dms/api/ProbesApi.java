/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.consultation.client.dms.api;

import com.bytatech.ayoos.consultation.client.dms.model.Error;
import com.bytatech.ayoos.consultation.client.dms.model.ProbeEntry;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-01-24T12:34:56.196+05:30[Asia/Colombo]")

@Api(value = "Probes", description = "the Probes API")
public interface ProbesApi {

    @ApiOperation(value = "Check readiness and liveness of the repository", nickname = "getProbe", notes = "**Note:** this endpoint is available in Alfresco 6.0 and newer versions.  Returns a status of 200 to indicate success and 503 for failure.  The readiness probe is normally only used to check repository startup.  The liveness probe should then be used to check the repository is still responding to requests.  **Note:** No authentication is required to call this endpoint. ", response = ProbeEntry.class, tags={ "probes", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = ProbeEntry.class),
        @ApiResponse(code = 404, message = "**probeId** does not exist "),
        @ApiResponse(code = 503, message = "Service Unavailable - Probe failure status."),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/probes/{probeId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<ProbeEntry> getProbe(@ApiParam(value = "The name of the probe: * -ready- * -live- ",required=true) @PathVariable("probeId") String probeId);

}
