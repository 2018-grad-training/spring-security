package cn.thoughtworks.springsecurity.security;

import cn.thoughtworks.springsecurity.model.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

@Component
public class JwtGenerator {
    public String generate(JwtUser jwtUser) {
        Claims claims = Jwts.claims()
                .setSubject(jwtUser.getUserName());

        claims.put("userId", jwtUser.getId());


        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS256, "test")
                .compact();
    }
}
