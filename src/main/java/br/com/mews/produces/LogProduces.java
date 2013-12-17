package br.com.mews.produces;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wmews
 */
public class LogProduces {

	@Produces
	Logger createLogger(InjectionPoint injectionPoint ) {
            System.out.println("----------------------------------------"+injectionPoint.getMember().getDeclaringClass().getName());
		//return LoggerFactory.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
            return LoggerFactory.getLogger("teste");
        }
}