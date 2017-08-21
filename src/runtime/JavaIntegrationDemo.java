package runtime;

import groovy.lang.GroovyClassLoader;
import groovy.lang.GroovyCodeSource;
import groovy.lang.GroovyObject;

import java.io.File;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class JavaIntegrationDemo {
	
	
	ClassLoader parentLoader = getClass().getClassLoader();
    protected GroovyClassLoader loader =
        (GroovyClassLoader) AccessController.doPrivileged(new PrivilegedAction() {
            public Object run() {
                return new GroovyClassLoader(parentLoader);
            }
        });

	
	public static void main(String[] args) {
		System.out.println("Hello");
		JavaIntegrationDemo demo = new JavaIntegrationDemo();
	        GroovyObject object;
			try {
				while(true){
					object = demo.compile("resources/GroovySnippet.groovy");
					object.invokeMethod("executeThisMethod", null);
					Thread.sleep(1000L);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
	        
	}
	
	protected GroovyObject compile(String fileName) throws Exception {
        Class groovyClass = loader.parseClass(new GroovyCodeSource(new File(fileName)));
        GroovyObject object = (GroovyObject) groovyClass.newInstance();
        return object;
    }

}
