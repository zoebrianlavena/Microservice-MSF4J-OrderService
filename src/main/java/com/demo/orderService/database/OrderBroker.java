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
package com.demo.orderService.database;

import com.demo.orderService.models.Order_;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author Zoe Brian Lavena
 */
public class OrderBroker {
    
    public int addOrder(Order_ order){
        EntityManager em = DBUtil.getEmf().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        try{
            trans.begin();
            em.persist(order);
            trans.commit();
            return 1;
        } catch(Exception e){
            return 0;
        } finally {
            em.close();
        }
    }
    
    public List<Order_> getAllOrders(){
        EntityManager em = DBUtil.getEmf().createEntityManager();
        try{
            return em.createNamedQuery("Order_.findAll", Order_.class).getResultList();
        } catch(Exception e){
            return null;
        } finally {
            em.close();
        }
    }
}
