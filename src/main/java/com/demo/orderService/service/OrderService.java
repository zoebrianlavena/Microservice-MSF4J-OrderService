/*
 * Copyright 2019 WSO2.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.demo.orderService.service;

import com.demo.orderService.database.OrderBroker;
import com.demo.orderService.models.Order_;
import java.util.List;

/**
 *
 * @author Zoe Brian Lavena
 */
public class OrderService {
    
    private OrderBroker ob = new OrderBroker();
    
    public int addOrder(Order_ order){
        return ob.addOrder(order);
    }
    
    public List<Order_> getAllOrders(){
        return ob.getAllOrders();
    }
    
}
