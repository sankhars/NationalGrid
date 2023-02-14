package com.restwebservices.restwebservices.licensearea;

import com.restwebservices.restwebservices.model.api.LicenseArea;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name="licenseareas", description="The license area API")
@RestController
@RequestMapping("/gsp/licenseareas")
public class LicenseAreaResource {
    @Operation(summary = "Get the License Area list")
    @GetMapping("")
    public List<LicenseArea> retrieveAllLicenseAreas(){
        return null;

    }
}
