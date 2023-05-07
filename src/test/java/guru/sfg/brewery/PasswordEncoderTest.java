package guru.sfg.brewery;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.LdapShaPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.DigestUtils;

public class PasswordEncoderTest {

    static final String PASSWORD = "hicham";

    @Test
    void testBcrypt(){
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
        System.out.println(passwordEncoder.encode(PASSWORD));
        System.out.println(passwordEncoder.encode(PASSWORD));
    }

    @Test
    void testLdap(){
        PasswordEncoder passwordEncoder = new LdapShaPasswordEncoder();
        System.out.println(passwordEncoder.encode(PASSWORD ));
    }
    @Test
    void testNoOp(){
        PasswordEncoder passwordEncoder = NoOpPasswordEncoder.getInstance();
        System.out.println(passwordEncoder.encode(PASSWORD));

    }
    @Test
    void hashingExample(){
        System.out.println(DigestUtils.md5DigestAsHex(PASSWORD.getBytes()));
    }


}
