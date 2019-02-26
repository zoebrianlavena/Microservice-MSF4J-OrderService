/*
 * Copyright (c) 2016, WSO2 Inc. (http://wso2.com) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.demo.orderService.application;

import com.demo.orderService.models.Order_;
import com.demo.orderService.service.OrderService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * This is the Microservice resource class.
 * See <a href="https://github.com/wso2/msf4j#getting-started">https://github.com/wso2/msf4j#getting-started</a>
 * for the usage of annotations.
 *
 * @since 1.0.0-SNAPSHOT
 */
@Path("/order")
public class Order {

    @GET
    @Path("/")
    public String get() {
        // TODO: Implementation for HTTP GET request
        System.out.println("GET invoked");
        return "Hello from WSO2 MSF4J";
    }
    
    @GET
    @Path("/vieworders")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Order_> viewOrders() {
        // TODO: Implementation for HTTP GET request
        OrderService os = new OrderService();
        return os.getAllOrders();
    }
    
    @POST
    @Path("/addorder/{tableNumber}/{orderName}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addOrder(@PathParam("tableNumber") String tableNumber,
                         @PathParam("orderName") String orderName){
        OrderService os = new OrderService();
        Order_ order = new Order_(0, Integer.parseInt(tableNumber), orderName);
        os.addOrder(order);
    }
}
