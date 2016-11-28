/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qiangmen.auth.server.repository;

import java.io.Serializable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.qiangmen.auth.server.model.ClientDetail;

public interface ClientDetailRepository extends MongoRepository<ClientDetail, Serializable> {

	public ClientDetail findByClientId(String clientId);

}
