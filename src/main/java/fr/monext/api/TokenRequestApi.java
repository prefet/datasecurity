/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package fr.monext.api;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import fr.monext.model.DataResponse;
import fr.monext.model.TokenRequest;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-07T07:53:25.576Z")

@Api(value = "TokenRequest", description = "the TokenRequest API")
public interface TokenRequestApi {

    @ApiOperation(value = "Prend un tocken en entree et renvoi une data", nickname = "getToken", notes = "", response = DataResponse.class, tags={ "Token", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = DataResponse.class),
        @ApiResponse(code = 400, message = "mauvais format") })
    @RequestMapping(value = "/TokenRequest",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<DataResponse> getToken(@ApiParam(value = "" ,required=true )  @Valid @RequestBody TokenRequest body);

}
