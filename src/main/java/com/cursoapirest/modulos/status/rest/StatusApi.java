package com.cursoapirest.modulos.status.rest;


import com.cursoapirest.modulos.status.dto.StatusDTO;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.springframework.http.ResponseEntity;

public interface StatusApi {

    @APIResponses({
            @APIResponse(responseCode = "200", description = "Ok Api funcionando"),
            @APIResponse(responseCode = "404", description = "Não encontrou a Api"),
            @APIResponse(responseCode = "401", description = "Não tem permissão"),
    })
    ResponseEntity<StatusDTO> getStatus();
}