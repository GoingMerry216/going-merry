package com.sdu.software.goingmerry.common;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sdu.software.goingmerry.model.User;
import com.sdu.software.goingmerry.service.UserService;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtTokenHelper {
	// TODO 可以通过系统设置来配置
	private byte[] secret = new byte[] { 1, 2, 3, 4, 5, 6, 7, 8 };
	private long expiration/* Seconds */ = TimeUnit.DAYS.toSeconds(1);

	@Autowired
	private UserService userService;

	public String generateToken(User user) {
		Claims claims = Jwts.claims().setSubject(user.getUserId().toString());
		// CapRole[] roles =
		// coframeServiceFactory.getCapPartyauthService().getAuths(user.getUserId());
		// String[] roleCodes = new String[0];
		// if (roles != null) {
		// roleCodes = new String[roles.length];
		// for (int i = 0, len = roles.length; i < len; i++) {
		// roleCodes[i] = roles[i].getRoleCode();
		// }
		// }
		// claims.put("scopes", roleCodes);
		// claims.put("tenantId", user.getTenantId());
		return generateToken(claims);
	}

	public String refreshToken(String token) {
		Claims claims = parseToken(token);
		return generateToken(claims);
	}

	public Claims parseToken(String token) {
		Claims claims;
		try {
			claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
		} catch (Exception e) {
			throw GoingMerryErrorCode.TOKEN_PARSE_ERROR.runtimeException(e, token, e.getMessage());
		}
		return claims;
	}

	public boolean isExpired(Claims claims) {
		Date expiration = claims.getExpiration();
		return expiration.before(new Date());
	}

	public String getUserId(Claims claims) {
		return claims.getSubject();
	}

	private String generateToken(Claims claims) {
		try {
			return Jwts.builder().setClaims(claims).setId(UUID.randomUUID().toString()).setIssuedAt(new Date())
					.setExpiration(generateExpirationDate()).signWith(SignatureAlgorithm.HS512, secret).compact();
		} catch (Exception e) {
			throw GoingMerryErrorCode.TOKEN_GENERATE_ERROR.runtimeException(e, claims.getSubject(), e.getMessage());
		}
	}

	private Date generateExpirationDate() {
		return new Date(System.currentTimeMillis() + expiration * 100000);
	}

}