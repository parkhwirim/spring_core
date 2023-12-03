package hello.core.xml;

import hello.core.member.MemberService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class XmlAppContext {

    @Test
    void xmlAppContext() {
        ApplicationContext ac = new GenericXmlApplicationContext("appconfig.xml");
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        assertInstanceOf(MemberService.class, memberService);
    }
}
