package com.ten.jwt;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class CreateJwt {

    public static void main(String[] args) {

        long now = System.currentTimeMillis();
        long exp = now+1000*60;
        JwtBuilder jwtBuilder = Jwts.builder()
                .setId("666")
                .setSubject("15810310359")
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256,"gls111")
                .setExpiration(new Date(exp))
                .claim("role","admin");

        System.out.println(jwtBuilder.compact());
    }


}
