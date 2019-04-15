package com.ten.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

public class ParseJwt {

    public static void main(String[] args) {

        Claims claims = Jwts.parser().setSigningKey("gls111")
                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2NjYiLCJzdWIiOiIxNTgxMDMxMDM1OSIsImlhdCI6MTU1NTEzNTY3M30.mySBagKIRHd6PxqpJeWfN4O6E9MAE31lueDYOns58Mw")
                .getBody();
        System.out.println("用户id:"+claims.getId());
        System.out.println("用户名:"+claims.getSubject());
        System.out.println("登陆时间:"+claims.getIssuedAt());

    }


}
