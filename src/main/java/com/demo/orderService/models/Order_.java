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
package com.demo.orderService.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 743953
 */
@Entity
@Table(name = "orderdb.order")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Order_.findAll", query = "SELECT o FROM Order_ o")
    , @NamedQuery(name = "Order_.findByOrderID", query = "SELECT o FROM Order_ o WHERE o.orderID = :orderID")
    , @NamedQuery(name = "Order_.findByTableNumber", query = "SELECT o FROM Order_ o WHERE o.tableNumber = :tableNumber")
    , @NamedQuery(name = "Order_.findByOrderName", query = "SELECT o FROM Order_ o WHERE o.orderName = :orderName")})
public class Order_ implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "orderID")
    private Integer orderID;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tableNumber")
    private int tableNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "orderName")
    private String orderName;

    public Order_() {
    }

    public Order_(Integer orderID) {
        this.orderID = orderID;
    }

    public Order_(Integer orderID, int tableNumber, String orderName) {
        this.orderID = orderID;
        this.tableNumber = tableNumber;
        this.orderName = orderName;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderID != null ? orderID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Order_)) {
            return false;
        }
        Order_ other = (Order_) object;
        if ((this.orderID == null && other.orderID != null) || (this.orderID != null && !this.orderID.equals(other.orderID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.demo.orderService.models.Order_[ orderID=" + orderID + " ]";
    }
    
}
