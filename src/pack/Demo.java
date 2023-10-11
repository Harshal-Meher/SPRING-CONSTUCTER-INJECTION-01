package pack;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  
public class Demo {
	
public static void main(String[] args) {
	
	
	Resource r=new ClassPathResource("applicationContext.xml");  
    BeanFactory factory=new XmlBeanFactory(r);  
      
    Employee s=(Employee)factory.getBean("obj");  
    System.out.println(s);  
}
}
