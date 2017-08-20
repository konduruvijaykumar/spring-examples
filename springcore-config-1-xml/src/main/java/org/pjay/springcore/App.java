/**
 * 
 */
package org.pjay.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Vijay
 * 
 * https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/context/annotation/Primary.html
 * http://memorynotfound.com/handling-multiple-autowire-candidates-with-spring-primary/
 * 
 */
public class App {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-app.xml");
		Bar bar = context.getBean("bar", Bar.class);
		System.out.println("Bean is instanciated:: \n" + bar.toString());
		
		// Error: b'coz to autowire interface reference with specific bean instance, spring cannot instantiate the right bean as it finds two beans byType FooOne and FooTwo.
		// Note: Solution use Qualifier annotation with bean name you need (Ex: @Qualifier("fooTwo"))
		/**
		 * 
			WARNING: Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'bar': Unsatisfied dependency expressed through method 'setFoo' parameter 0; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'org.pjay.springcore.contract.Foo' available: expected single matching bean but found 2: fooOne,fooTwo
			Exception in thread "main" org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'bar': Unsatisfied dependency expressed through method 'setFoo' parameter 0; nested exception is org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'org.pjay.springcore.contract.Foo' available: expected single matching bean but found 2: fooOne,fooTwo
				at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredMethodElement.inject(AutowiredAnnotationBeanPostProcessor.java:667)
				at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:88)
				at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:366)
				at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1264)
				at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:553)
				at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:483)
				at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:306)
				at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:230)
				at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:302)
				at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:197)
				at org.springframework.beans.factory.support.DefaultListableBeanFactory.preInstantiateSingletons(DefaultListableBeanFactory.java:761)
				at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:867)
				at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:543)
				at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:139)
				at org.springframework.context.support.ClassPathXmlApplicationContext.<init>(ClassPathXmlApplicationContext.java:83)
				at org.pjay.springcore.App.main(App.java:19)
			Caused by: org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'org.pjay.springcore.contract.Foo' available: expected single matching bean but found 2: fooOne,fooTwo
				at org.springframework.beans.factory.config.DependencyDescriptor.resolveNotUnique(DependencyDescriptor.java:173)
				at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1116)
				at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1066)
				at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredMethodElement.inject(AutowiredAnnotationBeanPostProcessor.java:659)
				... 15 more
		 * 
		 */
		
		
		// IMP: In this example when running both java annotation configuration with xml configuration of same beans, then XML bean definition got overriden
		/**
		 * 
			INFO: Overriding bean definition for bean 'fooOne' with a different definition: replacing [Generic bean: class [org.pjay.springcore.contract.contractimpl.FooOne]; scope=singleton; abstract=false; lazyInit=false; autowireMode=0; dependencyCheck=0; autowireCandidate=true; primary=true; factoryBeanName=null; factoryMethodName=null; initMethodName=null; destroyMethodName=null; defined in file [C:\Users\vijayk\git\spring-examples\springcore-config-1-xml\target\classes\org\pjay\springcore\contract\contractimpl\FooOne.class]] with [Generic bean: class [org.pjay.springcore.contract.contractimpl.FooOne]; scope=; abstract=false; lazyInit=false; autowireMode=0; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=null; factoryMethodName=null; initMethodName=null; destroyMethodName=null; defined in class path resource [spring-app.xml]]
			Aug 20, 2017 6:27:14 PM org.springframework.beans.factory.support.DefaultListableBeanFactory registerBeanDefinition
			INFO: Overriding bean definition for bean 'fooTwo' with a different definition: replacing [Generic bean: class [org.pjay.springcore.contract.contractimpl.FooTwo]; scope=singleton; abstract=false; lazyInit=false; autowireMode=0; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=null; factoryMethodName=null; initMethodName=null; destroyMethodName=null; defined in file [C:\Users\vijayk\git\spring-examples\springcore-config-1-xml\target\classes\org\pjay\springcore\contract\contractimpl\FooTwo.class]] with [Generic bean: class [org.pjay.springcore.contract.contractimpl.FooTwo]; scope=; abstract=false; lazyInit=false; autowireMode=0; dependencyCheck=0; autowireCandidate=true; primary=false; factoryBeanName=null; factoryMethodName=null; initMethodName=null; destroyMethodName=null; defined in class path resource [spring-app.xml]]
			Aug 20, 2017 6:27:14 PM org.springframework.context.support.ClassPathXmlApplicationContext refresh
		 * 
		 */
	}

}
