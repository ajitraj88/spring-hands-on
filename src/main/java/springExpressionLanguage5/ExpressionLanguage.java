package springExpressionLanguage5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class ExpressionLanguage {
    public static void main(String[] args) {
        /*
        SpEL supports parsing and executing expression.
         */
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("file:src/main/resources/spring-expression-language-config.xml");
        Demo demo = (Demo) applicationContext.getBean("demo");
        System.out.println(demo.toString());

        SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
        Expression expression = spelExpressionParser.parseExpression("44 + 4444"); // expression is given here without hash.
        System.out.println(expression.getValue());
    }
}
