/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.qiangmen.auth.server.repository;

import java.io.Serializable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.qiangmen.auth.server.model.OAuth2AuthenticationAccessToken;

public interface OAuth2AccessTokenRepository extends MongoRepository<OAuth2AuthenticationAccessToken, Serializable> {

}
