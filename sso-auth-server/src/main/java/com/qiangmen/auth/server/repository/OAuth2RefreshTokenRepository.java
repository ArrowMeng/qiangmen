/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qiangmen.auth.server.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.qiangmen.auth.server.model.OAuth2AuthenticationRefreshToken;

public interface OAuth2RefreshTokenRepository extends MongoRepository<OAuth2AuthenticationRefreshToken, String> {

   
}