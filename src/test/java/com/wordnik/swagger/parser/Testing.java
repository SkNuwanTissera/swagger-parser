package com.wordnik.swagger.parser;

import com.wordnik.swagger.io.QueryParamAuthentication;
import com.wordnik.swagger.models.apideclaration.ApiDeclaration;
import com.wordnik.swagger.models.resourcelisting.ResourceListing;

public class Testing {
    public static void main(String[] args) {
        SwaggerParser swaggerParser = new SwaggerParser();
       // ResourceListing resourceListing = swaggerParser.read("http://localhost:8002/api/api-docs/", new QueryParamAuthentication("api_key", "special-key"));
        ResourceListing resourceListing = swaggerParser.read("http://petstore.swagger.wordnik.com/api/api-docs");

        System.out.println("----==== RESOURCE LISTING ===---");
        System.out.println(resourceListing.toString());

//        ApiDeclaration apiDeclaration = swaggerParser.read("http://localhost:8002/api/api-docs/", "http://localhost:8002/api/api-docs/user");
//        System.out.println("----==== API DECLARATION ===---");
//        System.out.println(apiDeclaration);
        ApiDeclaration apiDeclaration = swaggerParser.read("http://petstore.swagger.wordnik.com/api/api-docs", "/pet");
        System.out.println("----==== API DECLARATION ===---");
        System.out.println(apiDeclaration);
    }

}
