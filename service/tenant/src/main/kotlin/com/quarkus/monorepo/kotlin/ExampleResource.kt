package com.quarkus.monorepo.kotlin

import BaseResponseDTO
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): String {

        var responseDTO = BaseResponseDTO(name = "Hello from RESTEasy Reactive");

        return responseDTO.name
    }
}