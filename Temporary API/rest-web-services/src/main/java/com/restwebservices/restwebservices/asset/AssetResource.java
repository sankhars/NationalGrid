package com.restwebservices.restwebservices.asset;

import com.restwebservices.restwebservices.model.api.Asset;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name="assets", description="The asset API")
@RestController
@RequestMapping("/gsp/assets")
public class AssetResource {
    @Operation(summary = "Get the Asset list")
    @GetMapping("")
    public List<Asset> retrieveAllAssets(){
        return null;

    }
}
